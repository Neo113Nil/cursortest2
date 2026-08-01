package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class aw0 {
    public final String a;
    public String b;
    public boolean c = false;
    public vd0 d = null;

    public aw0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw0)) {
            return false;
        }
        aw0 aw0Var = (aw0) obj;
        return nz.l(this.a, aw0Var.a) && nz.l(this.b, aw0Var.b) && this.c == aw0Var.c && nz.l(this.d, aw0Var.d);
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        vd0 vd0Var = this.d;
        return hashCode + (vd0Var == null ? 0 : vd0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
