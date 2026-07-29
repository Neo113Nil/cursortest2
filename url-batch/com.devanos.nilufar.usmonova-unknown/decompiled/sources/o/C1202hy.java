package o;

import java.util.List;

/* renamed from: o.hy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202hy extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ SW i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202hy(List list, WB wb, OW ow, SW sw, boolean z) {
        super(1);
        this.i = sw;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n((C1398ky) obj, "refiner");
                this.i.c();
                break;
            default:
                AbstractC0048Bt.n((C1398ky) obj, "kotlinTypeRefiner");
                this.i.c();
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202hy(List list, OW ow, SW sw, boolean z) {
        super(1);
        this.i = sw;
    }
}
