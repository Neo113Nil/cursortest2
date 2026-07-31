package yads;

/* loaded from: classes5.dex */
public final class f7 {
    public final int a;
    public final boolean b;

    public f7(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return this.a == f7Var.a && this.b == f7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.a + ", disabled=" + this.b + ")";
    }
}
