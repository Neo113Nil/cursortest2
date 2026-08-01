package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ qd f;
    public final /* synthetic */ qh0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(qd qdVar, qh0 qh0Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = qdVar;
        this.g = qh0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        qh0 qh0Var = this.g;
        qd qdVar = this.f;
        switch (i) {
            case 0:
                return new f(qdVar, qh0Var, kjVar, 0);
            default:
                return new f(qdVar, qh0Var, kjVar, 1);
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
        return ((f) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        qh0 qh0Var = this.g;
        qd qdVar = this.f;
        ck ckVar = ck.d;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    r60 r60Var = qdVar.t;
                    if (r60Var != null) {
                        this.e = 1;
                        if (r60Var.a(qh0Var, this) == ckVar) {
                            break;
                        }
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
                    r60 r60Var2 = qdVar.t;
                    if (r60Var2 != null) {
                        rh0 rh0Var = new rh0(qh0Var);
                        this.e = 1;
                        if (r60Var2.a(rh0Var, this) == ckVar) {
                            break;
                        }
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
