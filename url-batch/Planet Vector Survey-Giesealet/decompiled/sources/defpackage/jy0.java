package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jy0 implements b11 {
    public final b11 a;
    public final b11 b;

    public jy0(b11 b11Var, b11 b11Var2) {
        this.a = b11Var;
        this.b = b11Var2;
    }

    @Override // defpackage.b11
    public final int a(f40 f40Var, c10 c10Var) {
        return Math.max(this.a.a(f40Var, c10Var), this.b.a(f40Var, c10Var));
    }

    @Override // defpackage.b11
    public final int b(f40 f40Var) {
        return Math.max(this.a.b(f40Var), this.b.b(f40Var));
    }

    @Override // defpackage.b11
    public final int c(f40 f40Var, c10 c10Var) {
        return Math.max(this.a.c(f40Var, c10Var), this.b.c(f40Var, c10Var));
    }

    @Override // defpackage.b11
    public final int d(f40 f40Var) {
        return Math.max(this.a.d(f40Var), this.b.d(f40Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy0)) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return nz.l(jy0Var.a, this.a) && nz.l(jy0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
