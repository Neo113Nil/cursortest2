package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x5 implements b11 {
    public final int a;
    public final String b;
    public final ce0 c = ud0.o(oy.e);
    public final ce0 d = ud0.o(Boolean.TRUE);

    public x5(String str, int i) {
        this.a = i;
        this.b = str;
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

    public final oy e() {
        return (oy) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x5) {
            return this.a == ((x5) obj).a;
        }
        return false;
    }

    public final void f(d21 d21Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(d21Var.a.f(i2));
            this.d.setValue(Boolean.valueOf(d21Var.a.p(i2)));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + '(' + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ')';
    }
}
