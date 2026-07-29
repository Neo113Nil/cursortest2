package o;

/* renamed from: o.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371zi extends AbstractC1964tX {
    public final AbstractC1964tX b;
    public final AbstractC1964tX c;

    public C2371zi(AbstractC1964tX abstractC1964tX, AbstractC1964tX abstractC1964tX2) {
        this.b = abstractC1964tX;
        this.c = abstractC1964tX2;
    }

    @Override // o.AbstractC1964tX
    public final boolean a() {
        return this.b.a() || this.c.a();
    }

    @Override // o.AbstractC1964tX
    public final boolean b() {
        return this.b.b() || this.c.b();
    }

    @Override // o.AbstractC1964tX
    public final InterfaceC1738q4 c(InterfaceC1738q4 interfaceC1738q4) {
        AbstractC0048Bt.n(interfaceC1738q4, "annotations");
        return this.c.c(this.b.c(interfaceC1738q4));
    }

    @Override // o.AbstractC1964tX
    public final AbstractC1701pX d(AbstractC1004ey abstractC1004ey) {
        AbstractC1701pX d = this.b.d(abstractC1004ey);
        return d == null ? this.c.d(abstractC1004ey) : d;
    }

    @Override // o.AbstractC1964tX
    public final AbstractC1004ey f(int i, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "topLevelType");
        AbstractC1888sN.p(i, "position");
        return this.c.f(i, this.b.f(i, abstractC1004ey));
    }
}
