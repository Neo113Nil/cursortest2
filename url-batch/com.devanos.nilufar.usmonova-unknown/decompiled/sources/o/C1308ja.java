package o;

import java.util.List;

/* renamed from: o.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1308ja extends JR implements InterfaceC1638oa {
    public final AbstractC1701pX i;
    public final C1506ma j;
    public final boolean k;
    public final OW l;

    public C1308ja(AbstractC1701pX abstractC1701pX, C1506ma c1506ma, boolean z, OW ow) {
        AbstractC0048Bt.n(abstractC1701pX, "typeProjection");
        AbstractC0048Bt.n(ow, "attributes");
        this.i = abstractC1701pX;
        this.j = c1506ma;
        this.k = z;
        this.l = ow;
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
        return this.k;
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return new C1308ja(this.i.d(c1398ky), this.j, this.k, this.l);
    }

    @Override // o.JR, o.AbstractC2097vY
    public final AbstractC2097vY F0(boolean z) {
        if (z == this.k) {
            return this;
        }
        return new C1308ja(this.i, this.j, z, this.l);
    }

    @Override // o.AbstractC2097vY
    /* renamed from: G0 */
    public final AbstractC2097vY D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return new C1308ja(this.i.d(c1398ky), this.j, this.k, this.l);
    }

    @Override // o.JR
    /* renamed from: I0 */
    public final JR F0(boolean z) {
        if (z == this.k) {
            return this;
        }
        return new C1308ja(this.i, this.j, z, this.l);
    }

    @Override // o.JR
    /* renamed from: J0 */
    public final JR H0(OW ow) {
        AbstractC0048Bt.n(ow, "newAttributes");
        return new C1308ja(this.i, this.j, this.k, ow);
    }

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return C0273Kk.a(1, true, new String[0]);
    }

    @Override // o.JR
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.i);
        sb.append(')');
        sb.append(this.k ? "?" : "");
        return sb.toString();
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return C1318jk.h;
    }
}
