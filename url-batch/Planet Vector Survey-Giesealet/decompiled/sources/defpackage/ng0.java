package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ng0 {
    public final lg0 a;

    public ng0(lg0 lg0Var) {
        this.a = lg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ng0) {
            return nz.l(this.a, ((ng0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        lg0 lg0Var = this.a;
        if (lg0Var != null) {
            return lg0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ')';
    }
}
