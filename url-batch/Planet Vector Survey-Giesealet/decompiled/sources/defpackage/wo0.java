package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wo0 extends fu0 implements qu {
    public zo0 d;
    public fj0 e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ zo0 i;
    public final /* synthetic */ fj0 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(zo0 zo0Var, fj0 fj0Var, long j, kj kjVar) {
        super(2, kjVar);
        this.i = zo0Var;
        this.j = fj0Var;
        this.k = j;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        wo0 wo0Var = new wo0(this.i, this.j, this.k, kjVar);
        wo0Var.h = obj;
        return wo0Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((wo0) create((xo0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        zo0 zo0Var;
        fj0 fj0Var;
        zo0 zo0Var2;
        long j;
        int i = this.g;
        sc0 sc0Var = sc0.e;
        if (i == 0) {
            rg0.u(obj);
            xo0 xo0Var = (xo0) this.h;
            zo0Var = this.i;
            vo0 vo0Var = new vo0(zo0Var, xo0Var);
            j3 j3Var = zo0Var.c;
            fj0Var = this.j;
            long j2 = fj0Var.d;
            sc0 sc0Var2 = zo0Var.d;
            long j3 = this.k;
            float c = zo0Var.c(sc0Var2 == sc0Var ? mz0.b(j3) : mz0.c(j3));
            this.h = zo0Var;
            this.d = zo0Var;
            this.e = fj0Var;
            this.f = j2;
            this.g = 1;
            j3Var.getClass();
            obj = d31.K((qm) j3Var.f, new xk(c, j3Var, vo0Var, null), this);
            ck ckVar = ck.d;
            if (obj == ckVar) {
                return ckVar;
            }
            zo0Var2 = zo0Var;
            j = j2;
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f;
            fj0Var = this.e;
            zo0Var = this.d;
            zo0Var2 = (zo0) this.h;
            rg0.u(obj);
        }
        float c2 = zo0Var2.c(((Number) obj).floatValue());
        fj0Var.d = zo0Var.d == sc0Var ? mz0.a(j, c2, 0.0f, 2) : mz0.a(j, 0.0f, c2, 1);
        return ky0.a;
    }
}
