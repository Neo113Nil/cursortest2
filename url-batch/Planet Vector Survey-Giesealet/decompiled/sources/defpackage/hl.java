package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hl extends fu0 implements qu {
    public int d;
    public final /* synthetic */ jl e;
    public final /* synthetic */ int f;
    public final /* synthetic */ u6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(jl jlVar, int i, u6 u6Var, kj kjVar) {
        super(2, kjVar);
        this.e = jlVar;
        this.f = i;
        this.g = u6Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        return new hl(this.e, this.f, this.g, kjVar);
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((hl) create((bk) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i == 0) {
            rg0.u(obj);
            jl jlVar = this.e;
            r70 r70Var = jlVar.c;
            il ilVar = jlVar.b;
            u6 u6Var = new u6(jlVar, this.g, (kj) null, 4);
            this.d = 1;
            r70Var.getClass();
            Object v = x40.v(new q70(this.f, r70Var, u6Var, ilVar, null), this);
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
