package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class za0 extends nz {
    public final z8 o;
    public final o20 p;

    public za0(z8 z8Var, o20 o20Var) {
        z8Var.getClass();
        this.o = z8Var;
        this.p = o20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        return nz.l(this.o, za0Var.o) && nz.l(this.p, za0Var.p);
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode() * 31;
        o20 o20Var = this.p;
        return hashCode + (o20Var == null ? 0 : o20Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.o + ", owner=" + this.p + ')';
    }
}
