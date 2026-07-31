package yads;

/* loaded from: classes4.dex */
public final class v7 {
    public final int a;
    public final boolean b;

    public v7(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return this.a == v7Var.a && this.b == v7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.a + ", disabled=" + this.b + ")";
    }
}
