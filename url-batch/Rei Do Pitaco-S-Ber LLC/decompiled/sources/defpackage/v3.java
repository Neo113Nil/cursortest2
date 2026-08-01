package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class v3 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, c4 c4Var) {
        Objects.requireNonNull(c4Var);
        u3 u3Var = new u3(0, c4Var);
        b0.g(obj).registerOnBackInvokedCallback(1000000, u3Var);
        return u3Var;
    }

    public static void c(Object obj, Object obj2) {
        b0.g(obj).unregisterOnBackInvokedCallback(b0.c(obj2));
    }
}
