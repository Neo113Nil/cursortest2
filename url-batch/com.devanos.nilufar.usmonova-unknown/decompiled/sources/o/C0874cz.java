package o;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.cz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874cz extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1005ez i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0874cz(AbstractC1005ez abstractC1005ez, int i) {
        super(0);
        this.h = i;
        this.i = abstractC1005ez;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C2106vh c2106vh = C2106vh.m;
                WB.a.getClass();
                C2316yt c2316yt = C2316yt.v;
                AbstractC0048Bt.n(c2106vh, "kindFilter");
                List list = c2106vh.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean a = c2106vh.a(C2106vh.l);
                AbstractC1005ez abstractC1005ez = this.i;
                DE de = DE.k;
                if (a) {
                    for (C0827cE c0827cE : abstractC1005ez.h(c2106vh, c2316yt)) {
                        c2316yt.invoke(c0827cE);
                        AbstractC1052fg.e(linkedHashSet, abstractC1005ez.g(c0827cE, de));
                    }
                }
                if (c2106vh.a(C2106vh.i) && !list.contains(C1842rh.a)) {
                    for (C0827cE c0827cE2 : abstractC1005ez.i(c2106vh, c2316yt)) {
                        c2316yt.invoke(c0827cE2);
                        linkedHashSet.addAll(abstractC1005ez.a(c0827cE2, de));
                    }
                }
                if (c2106vh.a(C2106vh.j) && !list.contains(C1842rh.a)) {
                    for (C0827cE c0827cE3 : abstractC1005ez.o(c2106vh)) {
                        c2316yt.invoke(c0827cE3);
                        linkedHashSet.addAll(abstractC1005ez.c(c0827cE3, de));
                    }
                }
                return AbstractC0720ac.J0(linkedHashSet);
            case 1:
                return this.i.h(C2106vh.f234o, null);
            case 2:
                return this.i.k();
            case 3:
                return this.i.i(C2106vh.p, null);
            case 4:
                return this.i.o(C2106vh.q);
            default:
                ((C1198hu) this.i.b.i).h.getClass();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0874cz(AbstractC1005ez abstractC1005ez, DM dm, C1132gu c1132gu) {
        super(0);
        this.h = 5;
        this.i = abstractC1005ez;
    }
}
