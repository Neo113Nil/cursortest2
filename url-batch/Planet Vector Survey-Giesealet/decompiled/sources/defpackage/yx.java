package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yx extends fu0 implements qu {
    public /* synthetic */ float d;

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        yx yxVar = new yx(2, kjVar);
        yxVar.d = ((Number) obj).floatValue();
        return yxVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((yx) create(Float.valueOf(((Number) obj).floatValue()), (kj) obj2)).invokeSuspend(ky0.a);
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        rg0.u(obj);
        return Boolean.valueOf(this.d > 0.0f);
    }
}
