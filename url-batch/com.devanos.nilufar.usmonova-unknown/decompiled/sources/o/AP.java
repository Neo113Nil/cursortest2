package o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class AP {
    public final ClassLoader a;
    public final C0853ce b;
    public final C0853ce c;

    public AP(ClassLoader classLoader, C0853ce c0853ce) {
        this.a = classLoader;
        this.b = c0853ce;
        this.c = new C0853ce(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0853ce c0853ce = this.c;
        c0853ce.getClass();
        boolean z = false;
        try {
            new C2286yP(c0853ce, 0).invoke();
            if (ZM.m("WindowExtensionsProvider#getWindowExtensions is not valid", new C2286yP(c0853ce, 1)) && ZM.m("WindowExtensions#getWindowLayoutComponent is not valid", new C2352zP(this, 3)) && ZM.m("FoldingFeature class is not valid", new C2352zP(this, 0))) {
                int a = AbstractC2176wl.a();
                if (a == 1) {
                    z = b();
                } else if (2 <= a && a <= Integer.MAX_VALUE && b()) {
                    if (ZM.m("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C2352zP(this, 2))) {
                        z = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return ZM.m("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C2352zP(this, 1));
    }
}
