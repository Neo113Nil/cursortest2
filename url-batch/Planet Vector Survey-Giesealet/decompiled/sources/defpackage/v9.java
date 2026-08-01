package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v9 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9(Object obj, long j, long j2, Object obj2, int i) {
        super(1);
        this.e = i;
        this.h = obj;
        this.f = j;
        this.g = j2;
        this.i = obj2;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                r10 r10Var = (r10) obj;
                r10Var.b();
                y6.p(r10Var, (px0) obj3, this.f, this.g, 0.0f, (nz) obj2, 104);
                break;
            default:
                xf0 xf0Var = (xf0) obj;
                yf0 yf0Var = (yf0) obj3;
                long j = this.f;
                long j2 = this.g;
                xf0Var.getClass();
                xf0.b(xf0Var, yf0Var);
                yf0Var.M(bz.c(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), yf0Var.h), 0.0f, (y5) obj2);
                break;
        }
        return ky0Var;
    }
}
