package o;

import java.lang.reflect.Method;

/* renamed from: o.jI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1290jI {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC0048Bt.k(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (AbstractC0048Bt.h(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC0048Bt.m(parameterTypes, "getParameterTypes(...)");
                if (AbstractC0048Bt.h(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !AbstractC0048Bt.h(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
