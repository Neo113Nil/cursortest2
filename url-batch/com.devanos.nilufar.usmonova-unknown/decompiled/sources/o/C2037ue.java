package o;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: o.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2037ue {
    public static final C2037ue a = new C2037ue();

    public final C1142h10 a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        AbstractC0048Bt.n(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        AbstractC0048Bt.m(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return C1142h10.c(windowInsets, null);
    }
}
