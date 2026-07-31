package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes11.dex */
public abstract class TokenBase {
    protected final long mHigh;
    protected final long mLow;

    protected TokenBase(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    @CalledByNative
    private long getHighForSerialization() {
        return this.mHigh;
    }

    @CalledByNative
    private long getLowForSerialization() {
        return this.mLow;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBase)) {
            return false;
        }
        TokenBase tokenBase = (TokenBase) obj;
        return tokenBase.mHigh == this.mHigh && tokenBase.mLow == this.mLow;
    }

    public int hashCode() {
        long j = this.mLow;
        long j2 = this.mHigh;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
