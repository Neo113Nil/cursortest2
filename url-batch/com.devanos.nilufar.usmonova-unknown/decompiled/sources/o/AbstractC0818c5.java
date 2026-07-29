package o;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: o.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0818c5 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5) {
        Objects.requireNonNull(layoutInflaterFactory2C1213i5);
        C0753b5 c0753b5 = new C0753b5(0, layoutInflaterFactory2C1213i5);
        K0.h(obj).registerOnBackInvokedCallback(1000000, c0753b5);
        return c0753b5;
    }

    public static void c(Object obj, Object obj2) {
        K0.h(obj).unregisterOnBackInvokedCallback(K0.f(obj2));
    }
}
