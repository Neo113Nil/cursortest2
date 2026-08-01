package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ti0 extends fu0 implements qu {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti0(int i, kj kjVar, int i2) {
        super(i, kjVar);
        this.d = i2;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        switch (this.d) {
            case 0:
                ti0 ti0Var = new ti0(2, kjVar, 0);
                ti0Var.e = obj;
                return ti0Var;
            default:
                ti0 ti0Var2 = new ti0(2, kjVar, 1);
                ti0Var2.e = obj;
                return ti0Var2;
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                return ((ti0) create((si0) obj, (kj) obj2)).invokeSuspend(ky0Var);
            default:
                return ((ti0) create((br0) obj, (kj) obj2)).invokeSuspend(ky0Var);
        }
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case 0:
                rg0.u(obj);
                return Boolean.valueOf(((si0) this.e) == si0.d);
            default:
                rg0.u(obj);
                return Boolean.valueOf(((br0) this.e) != br0.d);
        }
    }
}
