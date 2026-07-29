package o;

import java.util.ArrayList;

/* renamed from: o.Bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045Bq extends AbstractC0048Bt {
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ AbstractC0071Cq i;

    public C0045Bq(ArrayList arrayList, AbstractC0071Cq abstractC0071Cq) {
        this.h = arrayList;
        this.i = abstractC0071Cq;
    }

    @Override // o.AbstractC0048Bt
    public final void f(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "fakeOverride");
        XG.r(interfaceC2204x9, null);
        this.h.add(interfaceC2204x9);
    }

    @Override // o.AbstractC0048Bt
    public final void x(InterfaceC2204x9 interfaceC2204x9, InterfaceC2204x9 interfaceC2204x92) {
        AbstractC0048Bt.n(interfaceC2204x92, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.i.b + ": " + interfaceC2204x9 + " vs " + interfaceC2204x92).toString());
    }
}
