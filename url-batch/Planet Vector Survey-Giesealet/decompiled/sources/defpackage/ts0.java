package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ts0 implements er {
    public final float a;
    public final Object b;

    public ts0(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.c7
    public final jz0 a(j3 j3Var) {
        Object obj = this.b;
        return new p01(this.a, obj == null ? null : (i7) ((mu) j3Var.e).c(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ts0)) {
            return false;
        }
        ts0 ts0Var = (ts0) obj;
        return ts0Var.a == this.a && nz.l(ts0Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return Float.floatToIntBits(this.a) + y6.t(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
