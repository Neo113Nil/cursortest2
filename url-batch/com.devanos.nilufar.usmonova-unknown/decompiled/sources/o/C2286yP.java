package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.yP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2286yP extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0853ce i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2286yP(C0853ce c0853ce, int i) {
        super(0);
        this.h = i;
        this.i = c0853ce;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                Class<?> loadClass = this.i.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                AbstractC0048Bt.m(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                C0853ce c0853ce = this.i;
                Class<?> loadClass2 = c0853ce.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                AbstractC0048Bt.m(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass3 = c0853ce.a.loadClass("androidx.window.extensions.WindowExtensions");
                AbstractC0048Bt.m(loadClass3, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                AbstractC0048Bt.m(declaredMethod, "getWindowExtensionsMethod");
                return Boolean.valueOf(declaredMethod.getReturnType().equals(loadClass3) && Modifier.isPublic(declaredMethod.getModifiers()));
        }
    }
}
