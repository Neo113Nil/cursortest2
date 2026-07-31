package yads;

/* loaded from: classes4.dex */
public final class ya {
    public final long a;
    public final long b;

    public ya(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        return this.a == yaVar.a && this.b == yaVar.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
