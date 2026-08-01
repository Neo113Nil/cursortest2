package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v3 extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, qu quVar, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = quVar;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj;
                int intValue = ((Number) obj2).intValue();
                qh qhVar = (qh) ihVar;
                if (!qhVar.N(intValue & 1, (intValue & 3) != 2)) {
                    qhVar.Q();
                    break;
                } else {
                    hi.a((f3) obj5, (s5) obj4, (qu) obj3, qhVar, 0);
                    break;
                }
            case 1:
                ((Number) obj2).intValue();
                x40.e((bu) obj5, (mm) obj4, (eg) obj3, (ih) obj, yc0.v(385));
                break;
            case 2:
                ((Number) obj2).intValue();
                hi.a((dd0) obj5, (s5) obj4, (qu) obj3, (ih) obj, yc0.v(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                nz.f((y70) obj5, (wm0) obj4, (eg) obj3, (ih) obj, yc0.v(385));
                break;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                d31.E((bk) obj5, null, new v80(floatValue, (jp0) obj4, (y70) obj3, (kj) null), 3);
                break;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                dj0 dj0Var = (dj0) obj5;
                zo0 zo0Var = (zo0) obj4;
                long g = zo0Var.g(zo0Var.c(floatValue2 - dj0Var.d));
                zo0 zo0Var2 = ((xo0) obj3).a;
                dj0Var.d += zo0Var.c(zo0Var.f(zo0.a(zo0Var2, zo0Var2.h, g, 1)));
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
