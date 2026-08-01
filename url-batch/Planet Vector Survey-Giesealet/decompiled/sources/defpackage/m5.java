package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class m5 extends fu0 implements qu {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(int i, kj kjVar, int i2) {
        super(i, kjVar);
        this.d = i2;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        switch (this.d) {
            case 0:
                return new m5(2, kjVar, 0);
            case 1:
                return new m5(2, kjVar, 1);
            default:
                return new m5(2, kjVar, 2);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((m5) create((or) obj, (kj) obj2)).invokeSuspend(ky0Var);
                break;
            default:
                ((m5) create((ah0) obj, (kj) obj2)).invokeSuspend(ky0Var);
                break;
        }
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                rg0.u(obj);
                break;
            case 1:
                rg0.u(obj);
                break;
            default:
                rg0.u(obj);
                break;
        }
        return ky0Var;
    }
}
