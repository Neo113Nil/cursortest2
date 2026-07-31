package com.inmobi.media;

/* loaded from: classes12.dex */
public final class Ok {
    public final long a;
    public final long b;
    public final long c;

    public Ok(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ok)) {
            return false;
        }
        Ok ok = (Ok) obj;
        return this.a == ok.a && this.b == ok.b && this.c == ok.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.a + ", readTimeoutInSec=" + this.b + ", callTimeoutInSec=" + this.c + ")";
    }
}
