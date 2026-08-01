package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g extends fu0 implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new g((qd) obj2, kjVar, 0);
            case 1:
                return new g((qd) obj2, kjVar, 1);
            default:
                return new g((om) obj2, kjVar, 2);
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
                ((g) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                break;
            case 1:
                ((g) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                break;
            default:
                ((g) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                break;
        }
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        kj kjVar = null;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                rg0.u(obj);
                qd qdVar = (qd) obj2;
                if (qdVar.D == null) {
                    ow owVar = new ow();
                    r60 r60Var = qdVar.t;
                    if (r60Var != null) {
                        d31.E(qdVar.V(), null, new c(r60Var, owVar, kjVar, 0), 3);
                    }
                    qdVar.D = owVar;
                    break;
                }
                break;
            case 1:
                rg0.u(obj);
                qd qdVar2 = (qd) obj2;
                ow owVar2 = qdVar2.D;
                if (owVar2 != null) {
                    pw pwVar = new pw(owVar2);
                    r60 r60Var2 = qdVar2.t;
                    if (r60Var2 != null) {
                        d31.E(qdVar2.V(), null, new c(r60Var2, pwVar, kjVar, 1), 3);
                    }
                    qdVar2.D = null;
                    break;
                }
                break;
            default:
                rg0.u(obj);
                ((om) obj2).show();
                break;
        }
        return ky0Var;
    }
}
