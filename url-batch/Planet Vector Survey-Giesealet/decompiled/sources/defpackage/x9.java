package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x9 extends v00 implements mu {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ px0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ ut0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(boolean z, ks0 ks0Var, long j, float f, float f2, long j2, long j3, ut0 ut0Var) {
        super(1);
        this.e = z;
        this.f = ks0Var;
        this.g = j;
        this.h = f;
        this.i = f2;
        this.j = j2;
        this.k = j3;
        this.l = ut0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        r10 r10Var = (r10) obj;
        r10Var.b();
        nc ncVar = r10Var.d;
        if (this.e) {
            y6.r(r10Var, this.f, 0L, 0L, this.g, null, 246);
        } else {
            long j = this.g;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.h;
            if (intBitsToFloat < f) {
                float f2 = this.i;
                float e = fr0.e(ncVar.e.r());
                float f3 = this.i;
                float f4 = e - f3;
                float c = fr0.c(ncVar.e.r()) - f3;
                px0 px0Var = this.f;
                long j2 = this.g;
                t7 t7Var = ncVar.e;
                long r = t7Var.r();
                t7Var.p().i();
                try {
                    ((t7) ((p01) t7Var.e).e).p().d(f2, f2, f4, c, 0);
                    y6.r(r10Var, px0Var, 0L, 0L, j2, null, 246);
                } finally {
                    t7Var.p().g();
                    t7Var.B(r);
                }
            } else {
                y6.r(r10Var, this.f, this.j, this.k, a50.M(j, f), this.l, 208);
            }
        }
        return ky0.a;
    }
}
