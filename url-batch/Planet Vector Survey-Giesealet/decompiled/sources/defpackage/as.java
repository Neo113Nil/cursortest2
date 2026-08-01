package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class as extends fu0 implements qu {
    public /* synthetic */ int d;

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        as asVar = new as(2, kjVar);
        asVar.d = ((Number) obj).intValue();
        return asVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((as) create(Integer.valueOf(((Number) obj).intValue()), (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        rg0.u(obj);
        return Boolean.valueOf(this.d > 0);
    }
}
