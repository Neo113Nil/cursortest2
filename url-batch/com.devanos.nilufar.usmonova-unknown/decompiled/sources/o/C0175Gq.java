package o;

/* renamed from: o.Gq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175Gq extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ InterfaceC2114vp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0175Gq(InterfaceC2114vp interfaceC2114vp, int i) {
        super(1);
        this.h = i;
        this.i = interfaceC2114vp;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        int i;
        switch (this.h) {
            case 0:
                C1959tS c1959tS = (C1959tS) obj;
                synchronized (AbstractC2025uS.b) {
                    i = AbstractC2025uS.d;
                    AbstractC2025uS.d = i + 1;
                }
                return new FL(i, c1959tS, this.i);
            default:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                InterfaceC2114vp interfaceC2114vp = this.i;
                AbstractC0048Bt.m(abstractC1004ey, "it");
                return interfaceC2114vp.invoke(abstractC1004ey).toString();
        }
    }
}
