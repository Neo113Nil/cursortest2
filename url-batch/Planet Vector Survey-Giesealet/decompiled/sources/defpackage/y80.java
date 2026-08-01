package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class y80 extends v00 implements qu {
    public final /* synthetic */ int e;
    public final /* synthetic */ s80 f;
    public final /* synthetic */ p80 g;
    public final /* synthetic */ u50 h;
    public final /* synthetic */ o9 i;
    public final /* synthetic */ mu j;
    public final /* synthetic */ mu k;
    public final /* synthetic */ mu l;
    public final /* synthetic */ mu m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y80(s80 s80Var, p80 p80Var, u50 u50Var, o9 o9Var, mu muVar, mu muVar2, mu muVar3, mu muVar4, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = s80Var;
        this.g = p80Var;
        this.h = u50Var;
        this.i = o9Var;
        this.j = muVar;
        this.k = muVar2;
        this.l = muVar3;
        this.m = muVar4;
        this.n = i;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        int i2 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int v = yc0.v(i2 | 1);
                x40.g(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ih) obj, v);
                break;
            case 1:
                ((Number) obj2).intValue();
                int v2 = yc0.v(i2 | 1);
                x40.g(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ih) obj, v2);
                break;
            default:
                ((Number) obj2).intValue();
                int v3 = yc0.v(i2 | 1);
                x40.g(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ih) obj, v3);
                break;
        }
        return ky0Var;
    }
}
