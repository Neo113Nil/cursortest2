package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gp0 extends fu0 implements mu {
    public int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ jp0 g;
    public final /* synthetic */ cx0 h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp0(Object obj, Object obj2, jp0 jp0Var, cx0 cx0Var, float f, kj kjVar) {
        super(1, kjVar);
        this.e = obj;
        this.f = obj2;
        this.g = jp0Var;
        this.h = cx0Var;
        this.i = f;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        return ((gp0) create((kj) obj)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final kj create(kj kjVar) {
        return new gp0(this.e, this.f, this.g, this.h, this.i, kjVar);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            rg0.u(obj);
            fp0 fp0Var = new fp0(this.e, this.f, this.g, this.h, this.i, null);
            this.d = 1;
            Object v = x40.v(fp0Var, this);
            ck ckVar = ck.d;
            if (v == ckVar) {
                return ckVar;
            }
        } else {
            if (i != 1) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rg0.u(obj);
        }
        return ky0.a;
    }
}
