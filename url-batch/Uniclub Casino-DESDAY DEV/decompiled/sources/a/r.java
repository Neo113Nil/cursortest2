package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1085a = new r();

    public final OnBackInvokedCallback a(W0.a aVar) {
        X0.d.e(aVar, "onBackInvoked");
        return new q(0, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        X0.d.e(obj, "dispatcher");
        X0.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        X0.d.e(obj, "dispatcher");
        X0.d.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
