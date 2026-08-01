package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vu0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ oh0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu0(oh0 oh0Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.e = oh0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        oh0 oh0Var = this.e;
        switch (i) {
            case 0:
                return new vu0(oh0Var, kjVar, 0);
            default:
                return new vu0(oh0Var, kjVar, 1);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
            case 0:
                ((vu0) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                break;
            default:
                ((vu0) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                break;
        }
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        oh0 oh0Var = this.e;
        switch (i) {
            case 0:
                rg0.u(obj);
                oh0Var.f = true;
                oh0Var.g.d(null);
                break;
            default:
                rg0.u(obj);
                oh0Var.e = true;
                oh0Var.g.d(null);
                break;
        }
        return ky0Var;
    }
}
