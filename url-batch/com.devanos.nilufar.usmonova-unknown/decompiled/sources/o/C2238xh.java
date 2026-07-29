package o;

/* renamed from: o.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238xh extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C2304yh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2238xh(C2304yh c2304yh, int i) {
        super(1);
        this.h = i;
        this.i = c2304yh;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                AbstractC1701pX abstractC1701pX = (AbstractC1701pX) obj;
                AbstractC0048Bt.n(abstractC1701pX, "it");
                if (abstractC1701pX.c()) {
                    return "*";
                }
                AbstractC1004ey b = abstractC1701pX.b();
                AbstractC0048Bt.m(b, "it.type");
                String Y = this.i.Y(b);
                if (abstractC1701pX.a() == 1) {
                    return Y;
                }
                return AbstractC2188wx.o(abstractC1701pX.a()) + ' ' + Y;
            case 1:
                AbstractC0551Vd abstractC0551Vd = (AbstractC0551Vd) obj;
                AbstractC0048Bt.n(abstractC0551Vd, "it");
                return this.i.B(abstractC0551Vd);
            default:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                AbstractC0048Bt.m(abstractC1004ey, "it");
                return this.i.Y(abstractC1004ey);
        }
    }
}
