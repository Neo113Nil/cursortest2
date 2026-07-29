package o;

/* loaded from: classes.dex */
public final class FE {
    public TC a;
    public int b;
    public YD c;
    public YD d;
    public boolean e;
    public final /* synthetic */ C1970td f;

    public FE(C1970td c1970td, TC tc, int i, YD yd, YD yd2, boolean z) {
        this.f = c1970td;
        this.a = tc;
        this.b = i;
        this.c = yd;
        this.d = yd2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        YD yd = this.c;
        int i3 = this.b;
        SC sc = (SC) yd.h[i + i3];
        SC sc2 = (SC) this.d.h[i3 + i2];
        GE ge = HE.a;
        return AbstractC0048Bt.h(sc, sc2) || sc.getClass() == sc2.getClass();
    }
}
