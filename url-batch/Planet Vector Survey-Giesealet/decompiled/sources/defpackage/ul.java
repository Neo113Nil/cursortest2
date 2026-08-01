package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ul implements sl {
    public final float d;
    public final float e;
    public final pt f;

    public ul(float f, float f2, pt ptVar) {
        this.d = f;
        this.e = f2;
        this.f = ptVar;
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return ze0.p(4294967296L, this.f.a(f / a()));
    }

    @Override // defpackage.sl
    public final float a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        return Float.compare(this.d, ulVar.d) == 0 && Float.compare(this.e, ulVar.e) == 0 && this.f.equals(ulVar.f);
    }

    @Override // defpackage.sl
    public final float h() {
        return this.e;
    }

    public final int hashCode() {
        return this.f.hashCode() + y6.t(this.e, Float.floatToIntBits(this.d) * 31, 31);
    }

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.sl
    public final float t(long j) {
        if (gw0.a(fw0.b(j), 4294967296L)) {
            return this.f.b(fw0.c(j));
        }
        g8.s("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.f + ')';
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
