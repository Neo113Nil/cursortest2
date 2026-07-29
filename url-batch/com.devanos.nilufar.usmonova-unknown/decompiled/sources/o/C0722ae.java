package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: o.ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722ae implements InvocationHandler {
    public final InterfaceC0517Tv a;
    public final C1978tl b;

    public C0722ae(InterfaceC0517Tv interfaceC0517Tv, C1978tl c1978tl) {
        AbstractC0048Bt.n(interfaceC0517Tv, "clazz");
        this.a = interfaceC0517Tv;
        this.b = c1978tl;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC0048Bt.n(obj, "obj");
        AbstractC0048Bt.n(method, "method");
        boolean h = AbstractC0048Bt.h(method.getName(), "accept");
        C1978tl c1978tl = this.b;
        if (h && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            InterfaceC0517Tv interfaceC0517Tv = this.a;
            AbstractC0048Bt.n(interfaceC0517Tv, "<this>");
            if (interfaceC0517Tv.f(obj2)) {
                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                c1978tl.invoke(obj2);
                return C0782bY.a;
            }
            throw new ClassCastException("Value cannot be cast to " + interfaceC0517Tv.a());
        }
        if (AbstractC0048Bt.h(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (AbstractC0048Bt.h(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(c1978tl.hashCode());
        }
        if (AbstractC0048Bt.h(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return c1978tl.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
