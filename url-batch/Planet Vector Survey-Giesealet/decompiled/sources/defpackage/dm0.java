package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dm0 {
    public float a;
    public boolean b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm0)) {
            return false;
        }
        dm0 dm0Var = (dm0) obj;
        return Float.compare(this.a, dm0Var.a) == 0 && this.b == dm0Var.b;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) * 31) + (this.b ? 1231 : 1237)) * 961;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
