package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.zP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2352zP extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AP i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2352zP(AP ap, int i) {
        super(0);
        this.h = i;
        this.i = ap;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        boolean z;
        Class cls;
        boolean z2;
        boolean z3;
        switch (this.h) {
            case 0:
                Class<?> loadClass = this.i.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                AbstractC0048Bt.m(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                AbstractC0048Bt.m(method, "getBoundsMethod");
                VM vm = UM.a;
                if (ZM.e(method, vm.b(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    AbstractC0048Bt.m(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (ZM.e(method2, vm.b(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        AbstractC0048Bt.m(method3, "getStateMethod");
                        if (ZM.e(method3, vm.b(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                AP ap = this.i;
                try {
                    cls = ap.b.c();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = ap.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                AbstractC0048Bt.m(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                AbstractC0048Bt.m(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    AbstractC0048Bt.m(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = this.i.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                AbstractC0048Bt.m(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                AbstractC0048Bt.m(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    AbstractC0048Bt.m(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                        return Boolean.valueOf(z3);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                AP ap2 = this.i;
                Class<?> loadClass4 = ap2.c.a.loadClass("androidx.window.extensions.WindowExtensions");
                AbstractC0048Bt.m(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = ap2.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                AbstractC0048Bt.m(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                AbstractC0048Bt.m(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
