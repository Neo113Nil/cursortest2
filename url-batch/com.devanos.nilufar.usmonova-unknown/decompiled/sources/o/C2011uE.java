package o;

import java.util.List;

/* renamed from: o.uE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2011uE extends JR implements InterfaceC1638oa {
    public final int i;
    public final C2077vE j;
    public final AbstractC2097vY k;
    public final OW l;
    public final boolean m;
    public final boolean n;

    public C2011uE(int i, C2077vE c2077vE, AbstractC2097vY abstractC2097vY, OW ow, boolean z, boolean z2) {
        AbstractC1888sN.p(i, "captureStatus");
        AbstractC0048Bt.n(c2077vE, "constructor");
        AbstractC0048Bt.n(ow, "attributes");
        this.i = i;
        this.j = c2077vE;
        this.k = abstractC2097vY;
        this.l = ow;
        this.m = z;
        this.n = z2;
    }

    @Override // o.AbstractC1004ey
    public final OW A0() {
        return this.l;
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return this.j;
    }

    @Override // o.AbstractC1004ey
    public final boolean C0() {
        return this.m;
    }

    @Override // o.JR, o.AbstractC2097vY
    public final AbstractC2097vY F0(boolean z) {
        return new C2011uE(this.i, this.j, this.k, this.l, z, 32);
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        return new C2011uE(this.i, this.j, this.k, this.l, z, 32);
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new C2011uE(this.i, this.j, this.k, ow, this.m, this.n);
    }

    @Override // o.AbstractC2097vY
    /* renamed from: K0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C2011uE D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        C2077vE c2077vE = this.j;
        c2077vE.getClass();
        AbstractC1701pX d = c2077vE.a.d(c1398ky);
        K2 k2 = c2077vE.b != null ? new K2(c2077vE, 19, c1398ky) : null;
        C2077vE c2077vE2 = c2077vE.c;
        if (c2077vE2 == null) {
            c2077vE2 = c2077vE;
        }
        C2077vE c2077vE3 = new C2077vE(d, k2, c2077vE2, c2077vE.d);
        AbstractC2097vY abstractC2097vY = this.k;
        return new C2011uE(this.i, c2077vE3, abstractC2097vY != null ? abstractC2097vY : null, this.l, this.m, 32);
    }

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return C0273Kk.a(1, true, new String[0]);
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return C1318jk.h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2011uE(int i, C2077vE c2077vE, AbstractC2097vY abstractC2097vY, OW ow, boolean z, int i2) {
        this(i, c2077vE, abstractC2097vY, ow, (i2 & 16) != 0 ? false : z, false);
        if ((i2 & 8) != 0) {
            OW.i.getClass();
            ow = OW.j;
        }
    }
}
