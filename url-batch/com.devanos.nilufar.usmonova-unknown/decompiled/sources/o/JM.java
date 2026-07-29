package o;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class JM extends FM {
    public final Object a;

    public JM(Object obj) {
        AbstractC0048Bt.n(obj, "recordComponent");
        this.a = obj;
    }

    @Override // o.FM
    public final Member b() {
        Object obj = this.a;
        AbstractC0048Bt.n(obj, "recordComponent");
        C0385Ot c0385Ot = AbstractC0868ct.p;
        Method method = null;
        if (c0385Ot == null) {
            Class<?> cls = obj.getClass();
            try {
                c0385Ot = new C0385Ot(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0385Ot = new C0385Ot(null, null);
            }
            AbstractC0868ct.p = c0385Ot;
        }
        Method method2 = c0385Ot.b;
        if (method2 != null) {
            Object invoke = method2.invoke(obj, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final InterfaceC1526mu f() {
        Object obj = this.a;
        AbstractC0048Bt.n(obj, "recordComponent");
        C0385Ot c0385Ot = AbstractC0868ct.p;
        Class cls = null;
        if (c0385Ot == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0385Ot = new C0385Ot(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0385Ot = new C0385Ot(null, null);
            }
            AbstractC0868ct.p = c0385Ot;
        }
        Method method = c0385Ot.a;
        if (method != null) {
            Object invoke = method.invoke(obj, null);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) invoke;
        }
        if (cls != null) {
            return new C2349zM(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
