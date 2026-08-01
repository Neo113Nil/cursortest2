package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class sd implements rq0 {
    public final /* synthetic */ int a;

    public /* synthetic */ sd(int i) {
        this.a = i;
    }

    @Override // defpackage.rq0
    public final xc0 a(long j, c10 c10Var, sl slVar) {
        switch (this.a) {
            case 0:
                u50 u50Var = td.a;
                float y = slVar.y(30.0f);
                return new vc0(new zi0(0.0f, -y, fr0.e(j), fr0.c(j) + y));
            case 1:
                u50 u50Var2 = td.a;
                float y2 = slVar.y(30.0f);
                return new vc0(new zi0(-y2, 0.0f, fr0.e(j) + y2, fr0.c(j)));
            default:
                return new vc0(od0.b(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
