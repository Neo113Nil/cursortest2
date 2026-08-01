package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class i4 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj = this.i;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((om) obj3).e((bu) obj2, (mm) obj4, (c10) obj);
                break;
            default:
                Float f = (Float) obj4;
                Float f2 = (Float) obj3;
                xx xxVar = (xx) obj2;
                if (!f2.equals(xxVar.d) || !f.equals(xxVar.e)) {
                    xxVar.d = f2;
                    xxVar.e = f;
                    xxVar.g = new zu0((wx) obj, dz0.a, f2, f, null);
                    xxVar.k.b.setValue(Boolean.TRUE);
                    xxVar.h = false;
                    xxVar.i = true;
                    break;
                }
                break;
        }
        return ky0Var;
    }
}
