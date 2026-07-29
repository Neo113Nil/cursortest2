package o;

/* renamed from: o.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177wm implements U3 {
    public final int h;
    public final InterfaceC2372zj i;
    public final long j;
    public final long k = 0 * 1000000;

    public C2177wm(int i, InterfaceC2372zj interfaceC2372zj) {
        this.h = i;
        this.i = interfaceC2372zj;
        this.j = i * 1000000;
    }

    @Override // o.U3
    public YY a(C0208Hx c0208Hx) {
        return new C0950e6(this);
    }

    public final float b(long j, float f, float f2, float f3) {
        float r = AbstractC1807r8.r(j - this.k, 0L, this.j) / this.j;
        if (r < 0.0f) {
            r = 0.0f;
        }
        if (r > 1.0f) {
            r = 1.0f;
        }
        float a = this.i.a(r);
        C0208Hx c0208Hx = VY.a;
        return (f2 * a) + ((1 - a) * f);
    }
}
