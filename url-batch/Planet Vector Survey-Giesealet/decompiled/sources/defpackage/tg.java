package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tg extends fu0 implements ru {
    public final /* synthetic */ cj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(cj0 cj0Var, kj kjVar) {
        super(3, kjVar);
        this.d = cj0Var;
    }

    @Override // defpackage.ru
    public final Object b(Object obj, Object obj2, Object obj3) {
        tg tgVar = new tg(this.d, (kj) obj3);
        ky0 ky0Var = ky0.a;
        tgVar.invokeSuspend(ky0Var);
        return ky0Var;
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        rg0.u(obj);
        this.d.d = true;
        return ky0.a;
    }
}
