package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bs0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qu g;
    public final /* synthetic */ f70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs0(qu quVar, f70 f70Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.g = quVar;
        this.h = f70Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        switch (this.d) {
            case 0:
                bs0 bs0Var = new bs0(this.g, this.h, kjVar, 0);
                bs0Var.f = obj;
                return bs0Var;
            default:
                bs0 bs0Var2 = new bs0(this.g, this.h, kjVar, 1);
                bs0Var2.f = obj;
                return bs0Var2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
        }
        return ((bs0) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        f70 f70Var = this.h;
        qu quVar = this.g;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    vh0 vh0Var = new vh0(f70Var, ((bk) this.f).f());
                    this.e = 1;
                    if (quVar.invoke(vh0Var, this) == ckVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    vh0 vh0Var2 = new vh0(f70Var, ((bk) this.f).f());
                    this.e = 1;
                    if (quVar.invoke(vh0Var2, this) == ckVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                    break;
                }
                break;
        }
        return ckVar;
    }
}
