package o;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class TF {
    public static final TF a = new TF();

    public final OnBackInvokedCallback a(InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(interfaceC1455lp, "onBackInvoked");
        return new C0753b5(2, interfaceC1455lp);
    }

    public final void b(Object obj, int i, Object obj2) {
        AbstractC0048Bt.n(obj, "dispatcher");
        AbstractC0048Bt.n(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        AbstractC0048Bt.n(obj, "dispatcher");
        AbstractC0048Bt.n(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
