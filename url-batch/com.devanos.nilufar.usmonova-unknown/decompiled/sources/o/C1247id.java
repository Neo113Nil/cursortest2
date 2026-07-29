package o;

import com.devanos.nilufar.usmonova.p7.gate.GateActivity;

/* renamed from: o.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247id extends AbstractC1927t {
    public final C2278yH p;
    public boolean q;

    public C1247id(GateActivity gateActivity) {
        super(gateActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        W2 w2 = new W2(3, this);
        addOnAttachStateChangeListener(w2);
        C1574nc c1574nc = new C1574nc(20);
        AbstractC0946e20.w(this).a.add(c1574nc);
        this.l = new V7(this, w2, c1574nc, 8);
        this.p = AbstractC2219xO.r(null);
    }

    @Override // o.AbstractC1927t
    public final void a(InterfaceC1377kd interfaceC1377kd, int i) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(420213850);
        if ((((c1575nd.e(this) ? 4 : 2) | i) & 3) == 2 && c1575nd.t()) {
            c1575nd.F();
        } else {
            InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) this.p.getValue();
            if (interfaceC2312yp == null) {
                c1575nd.I(358373017);
            } else {
                c1575nd.I(150107752);
                interfaceC2312yp.invoke(c1575nd, 0);
            }
            c1575nd.n(false);
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new C1861s(i, 1, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1247id.class.getName();
    }

    @Override // o.AbstractC1927t
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.q;
    }

    public final void setContent(InterfaceC2312yp interfaceC2312yp) {
        this.q = true;
        this.p.setValue(interfaceC2312yp);
        if (isAttachedToWindow()) {
            if (this.k == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
