package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.VCDiffStreamingDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes3.dex */
public class VCDiffStreamingDecoderImpl implements VCDiffStreamingDecoder {
    public static final int DEFAULT_MAXIMUM_TARGET_FILE_SIZE = 67108864;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffStreamingDecoderImpl.class);
    public static final int TARGET_SIZE_LIMIT = Integer.MAX_VALUE;
    public static final int UNLIMITED_BYTES = -3;
    private VCDiffAddressCache addrCache;
    private VCDiffCodeTableData custom_code_table_;
    private VCDiffStreamingDecoderImpl custom_code_table_decoder_;
    private int decodedTargetOutputPosition;
    private ByteBuffer dictionary;
    private int plannedTargetFileSize;
    private boolean startDecodingWasCalled;
    private long totalOfTargetWindowSizes;
    private byte vcdiffVersionCode;
    private ByteBuffer unparsedBytes = ByteBuffer.allocate(0);
    private final DecoratedByteArrayOutputStream decodedTarget = new DecoratedByteArrayOutputStream(512);
    private final ByteArrayOutputStream custom_code_table_string_ = new ByteArrayOutputStream(1024);
    private long maximumTargetFileSize = 67108864;
    private int maximumTargetWindowSize = 67108864;
    private boolean allowVcdTarget = true;
    private VCDiffDeltaFileWindow deltaWindow = new VCDiffDeltaFileWindow(this);

    public VCDiffStreamingDecoderImpl() {
        reset();
    }

    public void reset() {
        this.startDecodingWasCalled = false;
        this.dictionary = null;
        this.vcdiffVersionCode = (byte) 0;
        this.plannedTargetFileSize = -3;
        this.totalOfTargetWindowSizes = 0L;
        this.addrCache = null;
        this.custom_code_table_ = null;
        this.custom_code_table_decoder_ = null;
        this.deltaWindow.Reset();
        this.decodedTargetOutputPosition = 0;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void startDecoding(byte[] bArr) {
        startDecoding(ByteBuffer.wrap(bArr));
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void startDecoding(ByteBuffer byteBuffer) {
        if (this.startDecodingWasCalled) {
            throw new IllegalStateException("startDecoding() called twice without finishDecoding()");
        }
        this.unparsedBytes = ByteBuffer.allocate(0);
        this.decodedTarget.reset();
        reset();
        this.dictionary = byteBuffer;
        this.startDecodingWasCalled = true;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void decodeChunk(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        decodeChunk(ByteBuffer.wrap(bArr, i, i2), outputStream);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void decodeChunk(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        if (!this.startDecodingWasCalled) {
            reset();
            throw new IOException("decodeChunk() called without startDecoding()");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.unparsedBytes.remaining() + byteBuffer.remaining());
        allocate.put(this.unparsedBytes);
        allocate.put(byteBuffer);
        allocate.flip();
        this.unparsedBytes = allocate.duplicate();
        try {
            int readDeltaFileHeader = readDeltaFileHeader(allocate);
            if (readDeltaFileHeader == 0) {
                readDeltaFileHeader = readCustomCodeTable(allocate);
            }
            if (readDeltaFileHeader == 0) {
                while (allocate.hasRemaining() && this.deltaWindow.DecodeWindow(allocate) == 0 && !reachedPlannedTargetFileSize()) {
                    if (!allowVcdTarget()) {
                        flushDecodedTarget(outputStream);
                    }
                }
            }
            this.unparsedBytes = allocate;
            appendNewOutputText(outputStream);
        } catch (IOException e) {
            reset();
            throw e;
        }
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void decodeChunk(byte[] bArr, OutputStream outputStream) throws IOException {
        decodeChunk(ByteBuffer.wrap(bArr), outputStream);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void finishDecoding() throws IOException {
        try {
            if (!this.startDecodingWasCalled) {
                throw new IOException("finishDecoding() called before startDecoding(), or called after decodeChunk() returned false");
            }
            if (!isDecodingComplete()) {
                throw new IOException("finishDecoding() called before parsing entire delta file window");
            }
        } finally {
            reset();
        }
    }

    public boolean allowInterleaved() {
        return this.vcdiffVersionCode == 83;
    }

    public boolean allowChecksum() {
        return this.vcdiffVersionCode == 83;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public boolean setMaximumTargetFileSize(long j) {
        this.maximumTargetFileSize = j;
        return true;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public boolean setMaximumTargetWindowSize(int i) {
        this.maximumTargetWindowSize = i;
        return true;
    }

    public boolean hasPlannedTargetFileSize() {
        return this.plannedTargetFileSize != -3;
    }

    public void setPlannedTargetFileSize(int i) {
        this.plannedTargetFileSize = i;
    }

    public void addToTotalTargetWindowSize(int i) {
        this.totalOfTargetWindowSizes += i;
    }

    public boolean reachedPlannedTargetFileSize() {
        if (!hasPlannedTargetFileSize()) {
            return false;
        }
        long j = this.totalOfTargetWindowSizes;
        int i = this.plannedTargetFileSize;
        if (j <= i) {
            return j == ((long) i);
        }
        throw new IllegalStateException(String.format("Internal error: Decoded data size %d exceeds planned target file size %d", Long.valueOf(this.totalOfTargetWindowSizes), Integer.valueOf(this.plannedTargetFileSize)));
    }

    public void targetWindowWouldExceedSizeLimits(int i) throws IOException {
        if (i > this.maximumTargetWindowSize) {
            throw new IOException(String.format("Length of target window (%d) exceeds limit of %d bytes", Integer.valueOf(i), Integer.valueOf(this.maximumTargetWindowSize)));
        }
        if (hasPlannedTargetFileSize() && i > this.plannedTargetFileSize - this.totalOfTargetWindowSizes) {
            throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed planned size of %d bytes", Integer.valueOf(i), Long.valueOf(this.totalOfTargetWindowSizes), Integer.valueOf(this.plannedTargetFileSize)));
        }
        if (i > this.maximumTargetFileSize - this.totalOfTargetWindowSizes) {
            throw new IOException(String.format("Length of target window (%d bytes) plus previous windows (%d bytes) would exceed maximum target file size of %d bytes", Integer.valueOf(i), Long.valueOf(this.totalOfTargetWindowSizes), Long.valueOf(this.maximumTargetFileSize)));
        }
    }

    private int getUnconsumedDataSize() {
        return this.unparsedBytes.remaining();
    }

    private boolean isDecodingComplete() {
        boolean hasRemaining;
        if (!FoundFileHeader()) {
            hasRemaining = this.unparsedBytes.hasRemaining();
        } else {
            if (this.custom_code_table_decoder_ != null || this.deltaWindow.FoundWindowHeader()) {
                return false;
            }
            if (reachedPlannedTargetFileSize()) {
                return true;
            }
            hasRemaining = this.unparsedBytes.hasRemaining();
        }
        return !hasRemaining;
    }

    public ByteBuffer dictionary_ptr() {
        return this.dictionary;
    }

    VCDiffAddressCache addrCache() {
        return this.addrCache;
    }

    DecoratedByteArrayOutputStream decodedTarget() {
        return this.decodedTarget;
    }

    public boolean allowVcdTarget() {
        return this.allowVcdTarget;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingDecoder
    public void setAllowVcdTarget(boolean z) {
        if (this.startDecodingWasCalled) {
            throw new IllegalStateException("setAllowVcdTarget() called after startDecoding()");
        }
        this.allowVcdTarget = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readDeltaFileHeader(ByteBuffer byteBuffer) throws IOException {
        boolean z;
        if (FoundFileHeader()) {
            return 0;
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.put((ByteBuffer) byteBuffer.slice().limit(Math.min(5, byteBuffer.remaining())));
        allocate.rewind();
        DeltaFileHeader deltaFileHeader = new DeltaFileHeader(allocate);
        if (remaining != 0) {
            if (remaining != 1) {
                if (remaining != 2) {
                    if (remaining != 3) {
                        byte b = deltaFileHeader.header4;
                        this.vcdiffVersionCode = b;
                        if (b != 0 && b != 83) {
                            throw new IOException("Unrecognized VCDIFF format version");
                        }
                    }
                    if (deltaFileHeader.header3 != -60) {
                        z = true;
                        if (deltaFileHeader.header2 != -61) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (deltaFileHeader.header2 != -61) {
                }
            } else {
                z = false;
            }
            if (deltaFileHeader.header1 != -42) {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IOException("Did not find VCDIFF header bytes; input is not a VCDIFF delta file");
        }
        if (remaining < 5) {
            return -2;
        }
        int i = deltaFileHeader.hdr_indicator & 252;
        if (i != 0) {
            throw new IOException(String.format("Unrecognized hdr_indicator flags: %02x", Integer.valueOf(i)));
        }
        if ((deltaFileHeader.hdr_indicator & 1) != 0) {
            throw new IOException("Secondary compression is not supported");
        }
        if ((deltaFileHeader.hdr_indicator & 2) != 0) {
            int InitCustomCodeTable = InitCustomCodeTable(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position() + 5, byteBuffer.remaining() - 5);
            if (InitCustomCodeTable == -2) {
                return -2;
            }
            byteBuffer.position(byteBuffer.position() + 5 + InitCustomCodeTable);
        } else {
            this.addrCache = new VCDiffAddressCacheImpl();
            byteBuffer.position(byteBuffer.position() + 5);
        }
        return 0;
    }

    private boolean FoundFileHeader() {
        return this.addrCache != null;
    }

    private int InitCustomCodeTable(byte[] bArr, int i, int i2) throws IOException {
        VCDiffHeaderParser vCDiffHeaderParser = new VCDiffHeaderParser(ByteBuffer.wrap(bArr, i, i2).slice());
        Integer parseInt32 = vCDiffHeaderParser.parseInt32("size of near cache");
        if (parseInt32 == null) {
            LOGGER.warn("Failed to parse size of near cache");
            return vCDiffHeaderParser.getResult();
        }
        Integer parseInt322 = vCDiffHeaderParser.parseInt32("size of same cache");
        if (parseInt322 == null) {
            LOGGER.warn("Failed to parse size of same cache");
            return vCDiffHeaderParser.getResult();
        }
        this.custom_code_table_ = new VCDiffCodeTableData();
        this.custom_code_table_string_.reset();
        this.addrCache = new VCDiffAddressCacheImpl(parseInt32.shortValue(), parseInt322.shortValue());
        this.custom_code_table_decoder_ = new VCDiffStreamingDecoderImpl();
        byte[] bytes = VCDiffCodeTableData.kDefaultCodeTableData.getBytes();
        this.custom_code_table_decoder_.startDecoding(bytes);
        this.custom_code_table_decoder_.setPlannedTargetFileSize(bytes.length);
        return vCDiffHeaderParser.unparsedData().position();
    }

    private int readCustomCodeTable(ByteBuffer byteBuffer) throws IOException {
        VCDiffStreamingDecoderImpl vCDiffStreamingDecoderImpl = this.custom_code_table_decoder_;
        if (vCDiffStreamingDecoderImpl == null) {
            return 0;
        }
        if (this.custom_code_table_ == null) {
            throw new IllegalStateException("Internal error: custom_code_table_decoder_ is set, but custom_code_table_ is null");
        }
        try {
            vCDiffStreamingDecoderImpl.decodeChunk(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), this.custom_code_table_string_);
            if (this.custom_code_table_string_.size() < VCDiffCodeTableData.SERIALIZED_BYTE_SIZE) {
                byteBuffer.position(byteBuffer.limit());
                return -2;
            }
            this.custom_code_table_decoder_.finishDecoding();
            if (this.custom_code_table_string_.size() != VCDiffCodeTableData.SERIALIZED_BYTE_SIZE) {
                throw new IOException(String.format("Decoded custom code table size (%d) does not match size of a code table (%d)", Integer.valueOf(this.custom_code_table_string_.size()), Integer.valueOf(VCDiffCodeTableData.SERIALIZED_BYTE_SIZE)));
            }
            this.custom_code_table_ = new VCDiffCodeTableData(this.custom_code_table_string_.toByteArray());
            this.custom_code_table_string_.reset();
            byteBuffer.position(byteBuffer.limit() - this.custom_code_table_decoder_.getUnconsumedDataSize());
            this.custom_code_table_decoder_ = null;
            this.deltaWindow.useCodeTable(this.custom_code_table_, this.addrCache.LastMode());
            return 0;
        } catch (IOException e) {
            IOException iOException = new IOException("Failed to write to custom_code_table_string_");
            iOException.initCause(e);
            throw iOException;
        }
    }

    private void appendNewOutputText(OutputStream outputStream) throws IOException {
        ByteBuffer byteBuffer = this.decodedTarget.toByteBuffer();
        byteBuffer.position(this.decodedTargetOutputPosition);
        while (byteBuffer.hasRemaining()) {
            outputStream.write(byteBuffer.get());
        }
        this.decodedTargetOutputPosition = byteBuffer.limit();
    }

    private void flushDecodedTarget(OutputStream outputStream) throws IOException {
        outputStream.write(this.decodedTarget.getBuffer(), this.decodedTargetOutputPosition, this.decodedTarget.size() - this.decodedTargetOutputPosition);
        this.decodedTarget.reset();
        this.deltaWindow.setTargetWindowStartPos(0);
        this.decodedTargetOutputPosition = 0;
    }

    protected static class DecoratedByteArrayOutputStream extends ByteArrayOutputStream {
        public DecoratedByteArrayOutputStream() {
        }

        public DecoratedByteArrayOutputStream(int i) {
            super(i);
        }

        public synchronized ByteBuffer toByteBuffer() {
            return ByteBuffer.wrap(this.buf, 0, this.count).asReadOnlyBuffer();
        }

        public byte[] getBuffer() {
            return this.buf;
        }
    }
}
