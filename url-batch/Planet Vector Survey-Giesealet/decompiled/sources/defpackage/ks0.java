package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ks0 extends px0 {
    public final long k;

    public ks0(long j) {
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ks0) {
            return ge.c(this.k, ((ks0) obj).k);
        }
        return false;
    }

    @Override // defpackage.px0
    public final void g(float f, long j, y4 y4Var) {
        y4Var.c(1.0f);
        long j2 = this.k;
        if (f != 1.0f) {
            j2 = ge.b(j2, ge.d(j2) * f);
        }
        y4Var.e(j2);
        if (y4Var.c != null) {
            y4Var.g(null);
        }
    }

    public final int hashCode() {
        return ge.i(this.k);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) ge.j(this.k)) + ')';
    }
}
