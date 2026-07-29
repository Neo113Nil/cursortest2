package o;

/* renamed from: o.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572na extends AbstractC1964tX {
    public final /* synthetic */ int b;
    public final AbstractC1964tX c;

    public /* synthetic */ C1572na(AbstractC1964tX abstractC1964tX, int i) {
        this.b = i;
        this.c = abstractC1964tX;
    }

    @Override // o.AbstractC1964tX
    public boolean a() {
        switch (this.b) {
            case 0:
                return this.c.a();
            default:
                return super.a();
        }
    }

    @Override // o.AbstractC1964tX
    public boolean b() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // o.AbstractC1964tX
    public final InterfaceC1738q4 c(InterfaceC1738q4 interfaceC1738q4) {
        switch (this.b) {
            case 0:
                AbstractC0048Bt.n(interfaceC1738q4, "annotations");
                break;
            default:
                AbstractC0048Bt.n(interfaceC1738q4, "annotations");
                break;
        }
        return this.c.c(interfaceC1738q4);
    }

    @Override // o.AbstractC1964tX
    public final AbstractC1701pX d(AbstractC1004ey abstractC1004ey) {
        switch (this.b) {
            case 0:
                AbstractC1701pX d = this.c.d(abstractC1004ey);
                if (d == null) {
                    return null;
                }
                InterfaceC2364zb c = abstractC1004ey.B0().c();
                return EB.l(d, c instanceof InterfaceC1437lX ? (InterfaceC1437lX) c : null);
            default:
                return this.c.d(abstractC1004ey);
        }
    }

    @Override // o.AbstractC1964tX
    public final boolean e() {
        switch (this.b) {
        }
        return this.c.e();
    }

    @Override // o.AbstractC1964tX
    public final AbstractC1004ey f(int i, AbstractC1004ey abstractC1004ey) {
        switch (this.b) {
            case 0:
                AbstractC0048Bt.n(abstractC1004ey, "topLevelType");
                AbstractC1888sN.p(i, "position");
                break;
            default:
                AbstractC0048Bt.n(abstractC1004ey, "topLevelType");
                AbstractC1888sN.p(i, "position");
                break;
        }
        return this.c.f(i, abstractC1004ey);
    }
}
