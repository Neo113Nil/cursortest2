package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y21 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ a31 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y21(a31 a31Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = a31Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        a31 a31Var = this.f;
        switch (i) {
            case 0:
                return new y21(a31Var, kjVar, 0);
            default:
                return new y21(a31Var, kjVar, 1);
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
        return ((y21) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        a31 a31Var = this.f;
        ck ckVar = ck.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    rg0.u(obj);
                    f3 f3Var = a31Var.d;
                    this.e = 1;
                    Object d = f3Var.v.d(this);
                    if (d != ckVar) {
                        d = ky0Var;
                    }
                    if (d == ckVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                }
                break;
            default:
                int i3 = this.e;
                if (i3 == 0) {
                    rg0.u(obj);
                    f3 f3Var2 = a31Var.d;
                    this.e = 1;
                    Object h = f3Var2.w.h(this);
                    if (h != ckVar) {
                        h = ky0Var;
                    }
                    if (h == ckVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rg0.u(obj);
                }
                break;
        }
        return ckVar;
    }
}
