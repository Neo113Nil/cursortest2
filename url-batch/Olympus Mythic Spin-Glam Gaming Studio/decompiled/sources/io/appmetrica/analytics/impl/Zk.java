package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Zk {
    public final long a;
    public final int b;
    public final long c;
    public final boolean d;

    public Zk(long j, int i, long j2, boolean z) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zk)) {
            return false;
        }
        Zk zk = (Zk) obj;
        return this.a == zk.a && this.b == zk.b && this.c == zk.c && this.d == zk.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((Long.hashCode(this.c) + (((Long.hashCode(this.a) * 31) + this.b) * 31)) * 31);
    }
}
