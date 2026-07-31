package yads;

/* loaded from: classes11.dex */
public final class ej1 {
    public final int a;
    public final fj1 b;

    public ej1(int i, fj1 fj1Var) {
        this.a = i;
        this.b = fj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej1)) {
            return false;
        }
        ej1 ej1Var = (ej1) obj;
        return this.a == ej1Var.a && this.b == ej1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.a + ", mode=" + this.b + ")";
    }
}
