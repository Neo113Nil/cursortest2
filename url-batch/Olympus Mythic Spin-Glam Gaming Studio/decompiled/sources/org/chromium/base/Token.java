package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes12.dex */
public final class Token extends TokenBase {
    @CalledByNative
    public Token(long j, long j2) {
        super(j, j2);
    }

    public String toString() {
        return String.format("%016X%016X", Long.valueOf(this.mHigh), Long.valueOf(this.mLow));
    }
}
