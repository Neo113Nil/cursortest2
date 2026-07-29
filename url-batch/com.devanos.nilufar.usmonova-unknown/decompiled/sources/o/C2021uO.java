package o;

/* renamed from: o.uO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2021uO implements InterfaceC0504Ti {
    public final /* synthetic */ int h;
    public final /* synthetic */ C2285yO i;

    public /* synthetic */ C2021uO(C2285yO c2285yO, int i) {
        this.h = i;
        this.i = c2285yO;
    }

    @Override // o.InterfaceC0504Ti
    public final double b(double d) {
        switch (this.h) {
            case 0:
                return AbstractC1807r8.p(this.i.k.b(d), r10.e, r10.f);
            default:
                return this.i.m.b(AbstractC1807r8.p(d, r0.e, r0.f));
        }
    }
}
