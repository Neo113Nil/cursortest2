package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xw extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw(String str, int i) {
        super(1);
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        String str = this.f;
        switch (i) {
            case 0:
                np0 np0Var = (np0) obj;
                n00[] n00VarArr = xp0.a;
                np0Var.d(vp0.a, px0.H(str));
                xp0.a(np0Var, 5);
                break;
            default:
                n00[] n00VarArr2 = xp0.a;
                ((np0) obj).d(vp0.a, px0.H(str));
                break;
        }
        return ky0Var;
    }
}
