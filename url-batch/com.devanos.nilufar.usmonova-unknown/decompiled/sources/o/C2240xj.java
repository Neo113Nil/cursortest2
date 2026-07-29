package o;

/* renamed from: o.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2240xj extends AbstractC1425lL {
    public final InterfaceC2289yS b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2240xj(InterfaceC1455lp interfaceC1455lp) {
        super(interfaceC1455lp);
        C1623oL c1623oL = C1623oL.n;
        this.b = c1623oL;
    }

    @Override // o.AbstractC1425lL
    public final C1491mL a(Object obj) {
        return new C1491mL(this, obj, obj == null, this.b, true);
    }
}
