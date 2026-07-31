package io.bidmachine.internal;

/* loaded from: classes12.dex */
public final class I {
    private final long a;
    private final long b;
    private final boolean c;

    public I(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i = (I) obj;
        return this.a == i.a && this.b == i.b && this.c == i.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "StartupMetrics(startTime=" + this.a + ", duration=" + this.b + ", isFinished=" + this.c + ')';
    }
}
