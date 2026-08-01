package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ei0 extends ac implements n00 {
    public final boolean j;

    public ei0(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ei0) {
            ei0 ei0Var = (ei0) obj;
            return e().equals(ei0Var.e()) && this.g.equals(ei0Var.g) && this.h.equals(ei0Var.h) && nz.l(this.e, ei0Var.e);
        }
        if (obj instanceof n00) {
            return obj.equals(g());
        }
        return false;
    }

    public final i00 g() {
        if (this.j) {
            return this;
        }
        i00 i00Var = this.d;
        if (i00Var != null) {
            return i00Var;
        }
        i00 d = d();
        this.d = d;
        return d;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + (e().hashCode() * 31)) * 31);
    }

    public final String toString() {
        i00 g = g();
        if (g != this) {
            return g.toString();
        }
        return "property " + this.g + " (Kotlin reflection is not available)";
    }
}
