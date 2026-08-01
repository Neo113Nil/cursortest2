package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class s {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, y yVar) {
        Objects.requireNonNull(yVar);
        a.p pVar = new a.p(1, yVar);
        L.d.e(obj).registerOnBackInvokedCallback(1000000, pVar);
        return pVar;
    }

    public static void c(Object obj, Object obj2) {
        L.d.e(obj).unregisterOnBackInvokedCallback(L.d.b(obj2));
    }
}
