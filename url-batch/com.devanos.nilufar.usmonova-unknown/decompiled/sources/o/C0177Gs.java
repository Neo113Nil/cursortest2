package o;

/* renamed from: o.Gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177Gs {
    public final YD a = new YD(new C0099Ds[16]);
    public final C2278yH b = AbstractC2219xO.r(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final C2278yH d = AbstractC2219xO.r(Boolean.TRUE);

    public final void a(InterfaceC1377kd interfaceC1377kd, int i) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-318043801);
        if ((((c1575nd.e(this) ? 4 : 2) | i) & 3) == 2 && c1575nd.t()) {
            c1575nd.F();
        } else {
            Object C = c1575nd.C();
            C1623oL c1623oL = C1311jd.a;
            if (C == c1623oL) {
                C = AbstractC2219xO.r(null);
                c1575nd.P(C);
            }
            TD td = (TD) C;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                c1575nd.I(1719915818);
                boolean e = c1575nd.e(this);
                Object C2 = c1575nd.C();
                if (e || C2 == c1623oL) {
                    C2 = new C0151Fs(td, this, null);
                    c1575nd.P(C2);
                }
                PX.g(this, c1575nd, (InterfaceC2312yp) C2);
                c1575nd.n(false);
            } else {
                c1575nd.I(1721436120);
                c1575nd.n(false);
            }
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new C1861s(i, 2, this);
        }
    }
}
