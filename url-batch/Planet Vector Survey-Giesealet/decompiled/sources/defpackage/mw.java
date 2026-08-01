package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mw extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ nw[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw(nw[] nwVarArr, int i) {
        super(2);
        this.e = i;
        this.f = nwVarArr;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        nw[] nwVarArr = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(ud0.d((xf0) obj, true, nwVarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(ud0.d((xf0) obj, false, nwVarArr, ((Number) obj2).floatValue()));
        }
    }
}
