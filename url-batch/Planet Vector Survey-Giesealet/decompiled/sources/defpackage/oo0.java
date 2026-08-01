package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oo0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo0(long j, kj kjVar, int i) {
        super(2, kjVar);
        this.d = i;
        this.f = j;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        switch (this.d) {
            case 0:
                oo0 oo0Var = new oo0(this.f, kjVar, 0);
                oo0Var.e = obj;
                return oo0Var;
            default:
                oo0 oo0Var2 = new oo0(this.f, kjVar, 1);
                oo0Var2.e = obj;
                return oo0Var2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        xo0 xo0Var = (xo0) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
            case 0:
                ((oo0) create(xo0Var, kjVar)).invokeSuspend(ky0Var);
                break;
            default:
                ((oo0) create(xo0Var, kjVar)).invokeSuspend(ky0Var);
                break;
        }
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        long j = this.f;
        switch (i) {
            case 0:
                rg0.u(obj);
                zo0 zo0Var = ((xo0) this.e).a;
                zo0.a(zo0Var, zo0Var.h, j, 1);
                break;
            default:
                rg0.u(obj);
                zo0 zo0Var2 = ((xo0) this.e).a;
                zo0.a(zo0Var2, zo0Var2.h, j, 1);
                break;
        }
        return ky0Var;
    }
}
