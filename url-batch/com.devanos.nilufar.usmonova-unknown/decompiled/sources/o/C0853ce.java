package o;

import android.app.Activity;
import java.lang.reflect.Proxy;

/* renamed from: o.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853ce {
    public final ClassLoader a;

    public /* synthetic */ C0853ce(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public C0788be a(Object obj, InterfaceC0517Tv interfaceC0517Tv, Activity activity, C1978tl c1978tl) {
        AbstractC0048Bt.n(interfaceC0517Tv, "clazz");
        C0722ae c0722ae = new C0722ae(interfaceC0517Tv, c1978tl);
        Object newProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{c()}, c0722ae);
        AbstractC0048Bt.m(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, c()).invoke(obj, activity, newProxyInstance);
        return new C0788be(obj.getClass().getMethod("removeWindowLayoutInfoListener", c()), obj, newProxyInstance);
    }

    public C1590ns b(C1639ob c1639ob, C1527mv c1527mv) {
        OM p;
        AbstractC0048Bt.n(c1639ob, "classId");
        AbstractC0048Bt.n(c1527mv, "jvmMetadataVersion");
        String y = AbstractC0778bU.y(c1639ob.h().b(), '.', '$');
        if (!c1639ob.g().d()) {
            y = c1639ob.g() + '.' + y;
        }
        Class L = AbstractC1305jX.L(this.a, y);
        if (L == null || (p = AbstractC0946e20.p(L)) == null) {
            return null;
        }
        return new C1590ns(8, p);
    }

    public Class c() {
        Class<?> loadClass = this.a.loadClass("java.util.function.Consumer");
        AbstractC0048Bt.m(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
