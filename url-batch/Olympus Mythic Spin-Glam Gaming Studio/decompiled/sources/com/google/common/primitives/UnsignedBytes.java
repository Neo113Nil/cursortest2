package com.google.common.primitives;

import com.google.common.base.Preconditions;
import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes6.dex */
public abstract class UnsignedBytes {
    public static int toInt(byte b) {
        return b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static byte checkedCast(long j) {
        Preconditions.checkArgument((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }
}
