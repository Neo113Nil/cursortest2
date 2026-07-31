package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
abstract class VCDiffAddressCache {
    static final int RESULT_END_OF_DATA = -2;
    public static final short VCD_FIRST_NEAR_MODE = 2;
    public static final short VCD_HERE_MODE = 1;
    public static final short VCD_MAX_MODES = 256;
    public static final short VCD_SELF_MODE = 0;
    static final short kDefaultNearCacheSize = 4;
    static final short kDefaultSameCacheSize = 3;
    final int[] near_addresses_;
    int next_slot_;
    final int[] same_addresses_;

    static int DecodeHereAddress(int i, int i2) {
        return i2 - i;
    }

    static int DecodeSelfAddress(int i) {
        return i;
    }

    static byte DefaultLastMode() {
        return (byte) 8;
    }

    static boolean IsHereMode(short s) {
        return s == 1;
    }

    static boolean IsSelfMode(short s) {
        return s == 0;
    }

    public abstract int DecodeAddress(int i, short s, ByteBuffer byteBuffer) throws IOException;

    public abstract short EncodeAddress(int i, int i2, AtomicInteger atomicInteger);

    public abstract void Init();

    public abstract void UpdateCache(int i);

    protected VCDiffAddressCache() {
        this((short) 4, (short) 3);
    }

    protected VCDiffAddressCache(short s, short s2) {
        if (s > 254 || s < 0) {
            throw new IllegalArgumentException("Near cache size " + ((int) s) + " is invalid");
        }
        if (s2 > 254 || s2 < 0) {
            throw new IllegalArgumentException("Same cache size " + ((int) s2) + " is invalid");
        }
        if (s + s2 > 254) {
            throw new IllegalArgumentException("Using near cache size " + ((int) s) + " and same cache size " + ((int) s2) + " would exceed maximum number of COPY modes (256");
        }
        this.near_addresses_ = new int[s];
        this.same_addresses_ = new int[s2 * 256];
    }

    public short FirstSameMode() {
        return (short) (this.near_addresses_.length + 2);
    }

    public short LastMode() {
        return (byte) ((FirstSameMode() + (this.same_addresses_.length / 256)) - 1);
    }

    boolean IsNearMode(short s) {
        return s >= 2 && s < FirstSameMode();
    }

    boolean IsSameMode(short s) {
        return s >= FirstSameMode() && s <= LastMode();
    }

    int DecodeNearAddress(short s, int i) {
        return this.near_addresses_[s - 2] + i;
    }

    public final int DecodeSameAddress(short s, short s2) {
        return this.same_addresses_[((s - FirstSameMode()) * 256) + s2];
    }

    public final boolean WriteAddressAsVarintForMode(short s) {
        return !IsSameMode(s);
    }
}
