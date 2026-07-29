package o;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

/* renamed from: o.Hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187Hc {
    public static final C0187Hc a = new C0187Hc();

    public final OnBackInvokedDispatcher a(Activity activity) {
        AbstractC0048Bt.n(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC0048Bt.m(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
