package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e30 extends g30 {
    public final String a;
    public final uv0 b;

    public e30(String str, uv0 uv0Var) {
        this.a = str;
        this.b = uv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return this.a.equals(e30Var.a) && nz.l(this.b, e30Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uv0 uv0Var = this.b;
        return (hashCode + (uv0Var != null ? uv0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }
}
