package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wc0 extends xc0 {
    public final zl0 a;
    public final e5 b;

    public wc0(zl0 zl0Var) {
        e5 e5Var;
        this.a = zl0Var;
        if (ld0.m(zl0Var)) {
            e5Var = null;
        } else {
            e5Var = g5.a();
            y6.j(e5Var, zl0Var);
        }
        this.b = e5Var;
    }

    @Override // defpackage.xc0
    public final zi0 a() {
        zl0 zl0Var = this.a;
        return new zi0(zl0Var.a, zl0Var.b, zl0Var.c, zl0Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc0) {
            return this.a.equals(((wc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
