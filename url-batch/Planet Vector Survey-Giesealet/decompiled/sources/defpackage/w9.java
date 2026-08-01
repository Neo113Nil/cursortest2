package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w9 extends v00 implements mu {
    public final /* synthetic */ zi0 e;
    public final /* synthetic */ gj0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ q9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(zi0 zi0Var, gj0 gj0Var, long j, q9 q9Var) {
        super(1);
        this.e = zi0Var;
        this.f = gj0Var;
        this.g = j;
        this.h = q9Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        r10 r10Var = (r10) obj;
        r10Var.b();
        zi0 zi0Var = this.e;
        float f = zi0Var.a;
        float f2 = zi0Var.b;
        gj0 gj0Var = this.f;
        long j = this.g;
        q9 q9Var = this.h;
        nc ncVar = r10Var.d;
        ((p01) ncVar.e.e).v(f, f2);
        try {
            y6.n(r10Var, (x4) gj0Var.d, j, 0L, 0.0f, q9Var, 0, 890);
            ((p01) ncVar.e.e).v(-f, -f2);
            return ky0.a;
        } catch (Throwable th) {
            ((p01) ncVar.e.e).v(-f, -f2);
            throw th;
        }
    }
}
