package o;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class VF {
    public static final VF a = new VF();

    public final OnBackInvokedCallback a(InterfaceC2114vp interfaceC2114vp, InterfaceC2114vp interfaceC2114vp2, InterfaceC1455lp interfaceC1455lp, InterfaceC1455lp interfaceC1455lp2) {
        AbstractC0048Bt.n(interfaceC2114vp, "onBackStarted");
        AbstractC0048Bt.n(interfaceC2114vp2, "onBackProgressed");
        AbstractC0048Bt.n(interfaceC1455lp, "onBackInvoked");
        AbstractC0048Bt.n(interfaceC1455lp2, "onBackCancelled");
        return new UF(interfaceC2114vp, interfaceC2114vp2, interfaceC1455lp, interfaceC1455lp2);
    }
}
