package yads;

/* loaded from: classes15.dex */
public final class wx2 {
    public final long a;
    public final long b;

    public wx2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wx2.class != obj.getClass()) {
            return false;
        }
        wx2 wx2Var = (wx2) obj;
        return this.a == wx2Var.a && this.b == wx2Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
