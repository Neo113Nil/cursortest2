package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ph implements qu {
    public final /* synthetic */ Object d;

    public ph(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        ih ihVar = (ih) obj;
        int intValue = ((Number) obj2).intValue();
        qh qhVar = (qh) ihVar;
        if (qhVar.N(intValue & 1, (intValue & 3) != 2)) {
            throw null;
        }
        qhVar.Q();
        return ky0.a;
    }
}
