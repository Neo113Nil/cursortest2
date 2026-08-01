package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ig implements qu {
    public static final ig e = new ig(0);
    public static final ig f = new ig(1);
    public static final ig g = new ig(2);
    public final /* synthetic */ int d;

    public /* synthetic */ ig(int i) {
        this.d = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                int intValue = ((Number) obj2).intValue();
                qh qhVar = (qh) ihVar;
                if (!qhVar.N(intValue & 1, (intValue & 3) != 2)) {
                    qhVar.Q();
                }
                return ky0Var;
            case 1:
                ih ihVar2 = (ih) obj;
                int intValue2 = ((Number) obj2).intValue();
                qh qhVar2 = (qh) ihVar2;
                if (!qhVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qhVar2.Q();
                }
                return ky0Var;
            default:
                long j = ((ge) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(d31.I(j));
        }
    }
}
