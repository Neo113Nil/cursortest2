package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.util.VarInt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class VCDiffAddressCacheImpl extends VCDiffAddressCache {
    public VCDiffAddressCacheImpl() {
    }

    public VCDiffAddressCacheImpl(short s, short s2) {
        super(s, s2);
    }

    @Override // com.davidehrmann.vcdiff.engine.VCDiffAddressCache
    public void Init() {
        Arrays.fill(this.near_addresses_, 0);
        Arrays.fill(this.same_addresses_, 0);
        this.next_slot_ = 0;
    }

    @Override // com.davidehrmann.vcdiff.engine.VCDiffAddressCache
    public void UpdateCache(int i) {
        if (this.near_addresses_.length > 0) {
            this.near_addresses_[this.next_slot_] = i;
            this.next_slot_ = (this.next_slot_ + 1) % this.near_addresses_.length;
        }
        if (this.same_addresses_.length > 0) {
            this.same_addresses_[i % this.same_addresses_.length] = i;
        }
    }

    @Override // com.davidehrmann.vcdiff.engine.VCDiffAddressCache
    public short EncodeAddress(int i, int i2, AtomicInteger atomicInteger) {
        short s;
        if (i < 0) {
            atomicInteger.set(0);
            throw new IllegalArgumentException("EncodeAddress was passed a negative address: " + i);
        }
        if (i >= i2) {
            atomicInteger.set(0);
            throw new IllegalArgumentException(String.format("EncodeAddress was called with address (%d) < here_address (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (this.same_addresses_.length > 0) {
            int length = i % this.same_addresses_.length;
            if (this.same_addresses_[length] == i) {
                UpdateCache(i);
                atomicInteger.set(length % 256);
                return (short) (FirstSameMode() + (length / 256));
            }
        }
        int i3 = i2 - i;
        if (i3 < i) {
            s = 1;
        } else {
            i3 = i;
            s = 0;
        }
        for (int i4 = 0; i4 < this.near_addresses_.length; i4++) {
            int i5 = i - this.near_addresses_[i4];
            if (i5 >= 0 && i5 < i3) {
                s = (short) (i4 + 2);
                i3 = i5;
            }
        }
        UpdateCache(i);
        atomicInteger.set(i3);
        return s;
    }

    private static void requireValidDecodedAddress(int i, int i2) throws IOException {
        if (i < 0) {
            throw new IOException("Decoded address " + i + " is invalid");
        }
        if (i >= i2) {
            throw new IOException(String.format("Decoded address (%d) is beyond location in target file (%d)", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    @Override // com.davidehrmann.vcdiff.engine.VCDiffAddressCache
    public int DecodeAddress(int i, short s, ByteBuffer byteBuffer) throws IOException {
        int DecodeNearAddress;
        if (i < 0) {
            throw new IllegalStateException("DecodeAddress was passed a negative value for here_address: " + i);
        }
        if (byteBuffer.remaining() == 0) {
            return -2;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        if (IsSameMode(s)) {
            DecodeNearAddress = DecodeSameAddress(s, (short) (duplicate.get() & 255));
        } else {
            try {
                int i2 = VarInt.getInt(duplicate);
                if (IsSelfMode(s)) {
                    DecodeNearAddress = DecodeSelfAddress(i2);
                } else if (IsHereMode(s)) {
                    DecodeNearAddress = DecodeHereAddress(i2, i);
                } else if (IsNearMode(s)) {
                    DecodeNearAddress = DecodeNearAddress(s, i2);
                } else {
                    throw new IllegalArgumentException("Invalid mode value (" + ((int) s) + ") passed to DecodeAddress; maximum mode value = " + ((int) LastMode()));
                }
            } catch (VarInt.VarIntEndOfBufferException unused) {
                return -2;
            } catch (VarInt.VarIntParseException unused2) {
                throw new IOException("Found invalid variable-length integer as encoded address value");
            }
        }
        requireValidDecodedAddress(DecodeNearAddress, i);
        UpdateCache(DecodeNearAddress);
        byteBuffer.position(duplicate.position());
        return DecodeNearAddress;
    }
}
