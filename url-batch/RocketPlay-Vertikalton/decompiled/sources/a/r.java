package a;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1609a = new r();

    public final OnBackInvokedCallback a(InterfaceC0173a interfaceC0173a) {
        i1.f.e(interfaceC0173a, "onBackInvoked");
        return new q(0, interfaceC0173a);
    }

    public final void b(Object obj, int i, Object obj2) {
        i1.f.e(obj, "dispatcher");
        i1.f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        i1.f.e(obj, "dispatcher");
        i1.f.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
