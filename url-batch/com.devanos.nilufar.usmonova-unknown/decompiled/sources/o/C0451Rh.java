package o;

import java.util.Collection;

/* renamed from: o.Rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451Rh extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0503Th i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0451Rh(C0503Th c0503Th, int i) {
        super(0);
        this.h = i;
        this.i = c0503Th;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C2106vh c2106vh = C2106vh.m;
                WB.a.getClass();
                return this.i.i(c2106vh, C2316yt.v);
            default:
                C0503Th c0503Th = this.i;
                C1398ky c1398ky = c0503Th.g;
                C0581Wh c0581Wh = c0503Th.j;
                c1398ky.getClass();
                AbstractC0048Bt.n(c0581Wh, "classDescriptor");
                Collection d = ((AbstractC1205i0) c0581Wh.z()).d();
                AbstractC0048Bt.m(d, "classDescriptor.typeConstructor.supertypes");
                return d;
        }
    }
}
