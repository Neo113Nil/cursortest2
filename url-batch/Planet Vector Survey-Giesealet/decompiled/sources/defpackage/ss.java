package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ss extends av implements mu {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.l;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((sz) obj2).getClass();
                Object obj3 = ((ts) obj).d;
                pp0 pp0Var = obj3 instanceof pp0 ? (pp0) obj3 : null;
                if (pp0Var != null) {
                    ch0.h(pp0Var);
                    break;
                }
                break;
            default:
                ((c00) obj2).l((Throwable) obj);
                break;
        }
        return ky0Var;
    }
}
