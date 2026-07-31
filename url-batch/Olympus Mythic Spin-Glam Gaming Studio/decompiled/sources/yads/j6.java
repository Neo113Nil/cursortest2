package yads;

/* loaded from: classes5.dex */
public final class j6 {
    public final y03 a;
    public final a13 b;
    public final long c;

    public j6(y03 y03Var, a13 a13Var, long j) {
        this.a = y03Var;
        this.b = a13Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return this.a == j6Var.a && this.b == j6Var.b && this.c == j6Var.c;
    }

    public final int hashCode() {
        y03 y03Var = this.a;
        int hashCode = (y03Var == null ? 0 : y03Var.hashCode()) * 31;
        a13 a13Var = this.b;
        return Long.hashCode(this.c) + ((hashCode + (a13Var != null ? a13Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdPodSkip(transitionStrategy=" + this.a + ", visibility=" + this.b + ", delay=" + this.c + ")";
    }
}
