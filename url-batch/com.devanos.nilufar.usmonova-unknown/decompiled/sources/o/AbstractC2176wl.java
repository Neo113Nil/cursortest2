package o;

import androidx.window.extensions.WindowExtensionsProvider;

/* renamed from: o.wl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2176wl {
    static {
        UM.a.b(AbstractC2176wl.class).g();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
