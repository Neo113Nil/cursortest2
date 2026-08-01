package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yy0 implements b11 {
    public final String a;
    public final ce0 b;

    public yy0(ty tyVar, String str) {
        this.a = str;
        this.b = ud0.o(tyVar);
    }

    @Override // defpackage.b11
    public final int a(f40 f40Var, c10 c10Var) {
        return e().a;
    }

    @Override // defpackage.b11
    public final int b(f40 f40Var) {
        return e().b;
    }

    @Override // defpackage.b11
    public final int c(f40 f40Var, c10 c10Var) {
        return e().c;
    }

    @Override // defpackage.b11
    public final int d(f40 f40Var) {
        return e().d;
    }

    public final ty e() {
        return (ty) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy0) {
            return nz.l(e(), ((yy0) obj).e());
        }
        return false;
    }

    public final void f(ty tyVar) {
        this.b.setValue(tyVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ')';
    }
}
