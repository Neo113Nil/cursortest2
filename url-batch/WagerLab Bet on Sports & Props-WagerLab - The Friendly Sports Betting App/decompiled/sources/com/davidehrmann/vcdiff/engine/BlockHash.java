package com.davidehrmann.vcdiff.engine;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
class BlockHash {
    public static final int kBlockSize = 16;
    protected static final int kMaxMatchesToCheck = 64;
    protected static final int kMaxProbes = 16;
    protected static final RollingHash rollingHash = new RollingHash(16);
    private final int[] hash_table;
    private final int hash_table_mask;
    private int last_block_added;
    private final int[] last_block_table;
    private final int[] next_block_table;
    private final ByteBuffer source_data;
    private final int starting_offset;

    public static class Match {
        private int size = 0;
        private int source_offset = -1;
        private int target_offset = -1;

        public void ReplaceIfBetterMatch(int i, int i2, int i3) {
            if (i > this.size) {
                this.size = i;
                this.source_offset = i2;
                this.target_offset = i3;
            }
        }

        public int size() {
            return this.size;
        }

        public int source_offset() {
            return this.source_offset;
        }

        public int target_offset() {
            return this.target_offset;
        }
    }

    public BlockHash(byte[] bArr, int i, boolean z) {
        this(ByteBuffer.wrap(bArr), i, z);
    }

    public BlockHash(ByteBuffer byteBuffer, int i, boolean z) {
        this.last_block_added = -1;
        int CalcTableSize = CalcTableSize(byteBuffer.remaining());
        if (CalcTableSize == 0) {
            throw new IllegalArgumentException("Error finding table size for source size " + byteBuffer.remaining());
        }
        this.source_data = byteBuffer;
        this.starting_offset = i;
        this.hash_table_mask = CalcTableSize - 1;
        int[] iArr = new int[CalcTableSize];
        this.hash_table = iArr;
        Arrays.fill(iArr, -1);
        int[] iArr2 = new int[GetNumberOfBlocks()];
        this.next_block_table = iArr2;
        int[] iArr3 = new int[GetNumberOfBlocks()];
        this.last_block_table = iArr3;
        Arrays.fill(iArr2, -1);
        Arrays.fill(iArr3, -1);
        if (z) {
            AddAllBlocks();
        }
    }

    public static BlockHash CreateDictionaryHash(byte[] bArr) {
        return new BlockHash(bArr, 0, true);
    }

    public static BlockHash CreateTargetHash(byte[] bArr, int i) {
        return new BlockHash(bArr, i, false);
    }

    public static BlockHash CreateTargetHash(ByteBuffer byteBuffer, int i) {
        return new BlockHash(byteBuffer, i, false);
    }

    public void AddOneIndexHash(int i, int i2) {
        if (i == NextIndexToAdd()) {
            AddBlock(i2);
        }
    }

    public void AddAllBlocksThroughIndex(int i) {
        if (i > this.source_data.limit()) {
            throw new IllegalArgumentException("AddAllBlocksThroughIndex() called with index " + i + " higher than end index " + this.source_data.limit());
        }
        int i2 = this.last_block_added * 16;
        if (i <= i2) {
            throw new IllegalArgumentException("AddAllBlocksThroughIndex() called with index " + i + " <= last index added ( " + i2 + ")");
        }
        if (this.source_data.remaining() < 16) {
            return;
        }
        int limit = this.source_data.limit();
        if (i > limit - 16) {
            i = limit - 15;
        }
        ByteBuffer duplicate = this.source_data.duplicate();
        duplicate.position(NextIndexToAdd());
        while (duplicate.position() < i) {
            AddBlock((int) rollingHash.Hash(duplicate));
        }
    }

    public void FindBestMatch(int i, ByteBuffer byteBuffer, Match match) {
        int FirstMatchingBlock = FirstMatchingBlock(i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position());
        int i2 = 0;
        while (FirstMatchingBlock >= 0) {
            i2++;
            if (i2 > 64) {
                return;
            }
            int i3 = FirstMatchingBlock * 16;
            int i4 = i3 + 16;
            int position = byteBuffer.position();
            int i5 = position + 16;
            int MatchingBytesToLeft = MatchingBytesToLeft(this.source_data, i3, byteBuffer.array(), byteBuffer.arrayOffset() + position, Math.min(i3, position));
            int i6 = position - MatchingBytesToLeft;
            int min = Math.min(this.source_data.limit() - i4, byteBuffer.limit() - i5);
            match.ReplaceIfBetterMatch(MatchingBytesToLeft + 16 + MatchingBytesToRight(this.source_data, i4, byteBuffer.array(), byteBuffer.arrayOffset() + i5, min), (i3 - MatchingBytesToLeft) + this.starting_offset, i6);
            FirstMatchingBlock = NextMatchingBlock(FirstMatchingBlock, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position());
        }
    }

    public void FindBestMatch(int i, byte[] bArr, int i2, byte[] bArr2, int i3, Match match) {
        if (bArr != bArr2) {
            throw new IllegalArgumentException("target_candidate != target");
        }
        if (i2 < i3) {
            throw new IllegalArgumentException("target_candidate_start < target_start");
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2, i3, bArr2.length - i3);
        wrap.position(i2);
        FindBestMatch(i, wrap, match);
    }

    protected static int CalcTableSize(int i) {
        int i2 = 1;
        int i3 = (i / 4) + 1;
        while (i2 < i3) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is zero or negative", Integer.valueOf(i), Integer.valueOf(i2)));
            }
        }
        if (((i2 - 1) & i2) != 0) {
            throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is not a power of 2", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i <= 0 || i2 <= i3 * 2) {
            return i2;
        }
        throw new IllegalStateException(String.format("Internal error: CalcTableSize(dictionarySize = %d): resulting table_size %d is too large", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    protected int GetNumberOfBlocks() {
        return this.source_data.limit() / 16;
    }

    protected int GetHashTableIndex(int i) {
        return i & this.hash_table_mask;
    }

    protected int NextIndexToAdd() {
        return (this.last_block_added + 1) * 16;
    }

    protected void AddBlock(int i) {
        int i2 = this.last_block_added + 1;
        int limit = this.source_data.limit() / 16;
        if (i2 >= limit) {
            throw new IllegalArgumentException(String.format("BlockHash.AddBlock() called with block number %d. This is past last block %d", Integer.valueOf(i2), Integer.valueOf(limit - 1)));
        }
        if (this.next_block_table[i2] != -1) {
            throw new IllegalStateException(String.format("Internal error in BlockHash.AddBlock(): block number = %d, next block should be -1 but is %d", Integer.valueOf(i2), Integer.valueOf(this.next_block_table[i2])));
        }
        int GetHashTableIndex = GetHashTableIndex(i);
        int[] iArr = this.hash_table;
        int i3 = iArr[GetHashTableIndex];
        if (i3 < 0) {
            iArr[GetHashTableIndex] = i2;
            this.last_block_table[i2] = i2;
        } else {
            int[] iArr2 = this.last_block_table;
            int i4 = iArr2[i3];
            int[] iArr3 = this.next_block_table;
            if (iArr3[i4] != -1) {
                throw new IllegalStateException(String.format("Internal error in BlockHash.AddBlock(): first matching block = %d, last matching block = %d, next block should be -1 but is %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(this.next_block_table[i4])));
            }
            iArr3[i4] = i2;
            iArr2[i3] = i2;
        }
        this.last_block_added = i2;
    }

    protected void AddAllBlocks() {
        AddAllBlocksThroughIndex(this.source_data.limit());
    }

    protected static boolean BlockContentsMatch(byte[] bArr, int i, ByteBuffer byteBuffer, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            if (bArr[i + i3] != byteBuffer.get(i2 + i3)) {
                return false;
            }
        }
        return true;
    }

    protected static boolean BlockContentsMatch(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            if (bArr[i + i3] != bArr2[i2 + i3]) {
                return false;
            }
        }
        return true;
    }

    protected int FirstMatchingBlock(int i, byte[] bArr, int i2) {
        return SkipNonMatchingBlocks(this.hash_table[GetHashTableIndex(i)], bArr, i2);
    }

    protected int NextMatchingBlock(int i, byte[] bArr, int i2) {
        if (i >= GetNumberOfBlocks()) {
            throw new IllegalArgumentException("NextMatchingBlock called for invalid block number " + i);
        }
        return SkipNonMatchingBlocks(this.next_block_table[i], bArr, i2);
    }

    protected int SkipNonMatchingBlocks(int i, byte[] bArr, int i2) {
        int i3 = 0;
        while (i >= 0 && !BlockContentsMatch(bArr, i2, this.source_data, i * 16)) {
            i3++;
            if (i3 > 16) {
                return -1;
            }
            i = this.next_block_table[i];
        }
        return i;
    }

    protected static int MatchingBytesToLeft(ByteBuffer byteBuffer, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            i--;
            i2--;
            if (byteBuffer.get(i) != bArr[i2]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    protected static int MatchingBytesToLeft(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            i--;
            i2--;
            if (bArr[i] != bArr2[i2]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    protected static int MatchingBytesToRight(ByteBuffer byteBuffer, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && byteBuffer.get(i) == bArr[i2]) {
            i4++;
            i++;
            i2++;
        }
        return i4;
    }

    protected static int MatchingBytesToRight(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i] == bArr2[i2]) {
            i4++;
            i++;
            i2++;
        }
        return i4;
    }
}
