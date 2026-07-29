package o;

import java.lang.reflect.Type;

/* renamed from: o.nx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595nx extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C1661ox i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1595nx(C1661ox c1661ox, int i) {
        super(0);
        this.h = i;
        this.i = c1661ox;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                RM rm = this.i.i;
                Type type = rm != null ? (Type) rm.invoke() : null;
                AbstractC0048Bt.k(type);
                return AbstractC1492mM.c(type);
            default:
                C1661ox c1661ox = this.i;
                return c1661ox.e(c1661ox.h);
        }
    }
}
