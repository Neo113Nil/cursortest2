package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a6 extends fu0 implements mu {
    public final /* synthetic */ b6 d;
    public final /* synthetic */ jn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(b6 b6Var, jn jnVar, kj kjVar) {
        super(1, kjVar);
        this.d = b6Var;
        this.e = jnVar;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        a6 a6Var = (a6) create((kj) obj);
        ky0 ky0Var = ky0.a;
        a6Var.invokeSuspend(ky0Var);
        return ky0Var;
    }

    @Override // defpackage.h9
    public final kj create(kj kjVar) {
        return new a6(this.d, this.e, kjVar);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        rg0.u(obj);
        b6 b6Var = this.d;
        d7 d7Var = b6Var.c;
        d7Var.f.d();
        d7Var.g = Long.MIN_VALUE;
        b6Var.d.setValue(Boolean.FALSE);
        Object a = b6.a(b6Var, this.e);
        d7Var.e.setValue(a);
        b6Var.e.setValue(a);
        return ky0.a;
    }
}
