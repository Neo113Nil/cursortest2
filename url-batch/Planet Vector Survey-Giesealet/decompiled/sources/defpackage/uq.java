package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uq implements b11 {
    public final b11 a;
    public final b11 b;

    public uq(b11 b11Var, b11 b11Var2) {
        this.a = b11Var;
        this.b = b11Var2;
    }

    @Override // defpackage.b11
    public final int a(f40 f40Var, c10 c10Var) {
        int a = this.a.a(f40Var, c10Var) - this.b.a(f40Var, c10Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.b11
    public final int b(f40 f40Var) {
        int b = this.a.b(f40Var) - this.b.b(f40Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.b11
    public final int c(f40 f40Var, c10 c10Var) {
        int c = this.a.c(f40Var, c10Var) - this.b.c(f40Var, c10Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.b11
    public final int d(f40 f40Var) {
        int d = this.a.d(f40Var) - this.b.d(f40Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return nz.l(uqVar.a, this.a) && nz.l(uqVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
