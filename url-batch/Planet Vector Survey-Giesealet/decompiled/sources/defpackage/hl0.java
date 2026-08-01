package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hl0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ il0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(il0 il0Var, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = il0Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        il0 il0Var = this.f;
        switch (i) {
            case 0:
                hl0 hl0Var = new hl0(il0Var, kjVar, 0);
                hl0Var.e = obj;
                return hl0Var;
            default:
                hl0 hl0Var2 = new hl0(il0Var, kjVar, 1);
                hl0Var2.e = obj;
                return hl0Var2;
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
        return ((hl0) create(bkVar, kjVar)).invokeSuspend(ky0Var);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        il0 il0Var = this.f;
        kj kjVar = null;
        int i2 = 3;
        switch (i) {
            case 0:
                rg0.u(obj);
                bk bkVar = (bk) this.e;
                d31.E(bkVar, null, new gl0(il0Var, kjVar, 0), 3);
                d31.E(bkVar, null, new gl0(il0Var, kjVar, 1), 3);
                return d31.E(bkVar, null, new gl0(il0Var, kjVar, 2), 3);
            default:
                rg0.u(obj);
                return d31.E((bk) this.e, null, new gl0(il0Var, kjVar, i2), 3);
        }
    }
}
