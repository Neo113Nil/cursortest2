package com.unity3d.player;

import com.adjust.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class ReflectionHelper {
    protected static boolean LOG;
    protected static final boolean LOGV = false;
    private static M[] a = new M[4096];
    private static long b;
    private static long c;
    private static boolean d;

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0075, code lost:
    
        if (r12.asSubclass(r11) != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        float f;
        float f2;
        float f3 = 0.1f;
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        if (clsArr != null) {
            int length = clsArr.length;
            int i2 = 0;
            f = 1.0f;
            while (i < length) {
                Class cls2 = clsArr[i];
                int i3 = i2 + 1;
                Class cls3 = clsArr2[i2];
                if (cls2.equals(cls3)) {
                    f2 = 1.0f;
                } else {
                    if (!cls2.isPrimitive() && !cls3.isPrimitive()) {
                        try {
                            if (cls2.asSubclass(cls3) != null) {
                                f2 = 0.5f;
                            }
                        } catch (ClassCastException unused) {
                        }
                        try {
                            if (cls3.asSubclass(cls2) != null) {
                                f2 = 0.1f;
                            }
                        } catch (ClassCastException unused2) {
                        }
                    }
                    f2 = 0.0f;
                }
                f *= f2;
                i++;
                i2 = i3;
            }
        } else {
            f = 1.0f;
        }
        Class cls4 = clsArr2[clsArr2.length - 1];
        if (cls.equals(cls4)) {
            f3 = 1.0f;
        } else {
            if (!cls.isPrimitive() && !cls4.isPrimitive()) {
                try {
                    if (cls.asSubclass(cls4) != null) {
                        f3 = 0.5f;
                    }
                } catch (ClassCastException unused3) {
                }
            }
            f3 = 0.0f;
        }
        return f * f3;
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                if (charAt == 'L') {
                    int indexOf = str.indexOf(59, iArr[0]);
                    if (indexOf == -1) {
                        return null;
                    }
                    String substring = str.substring(iArr[0], indexOf);
                    iArr[0] = indexOf + 1;
                    try {
                        return Class.forName(substring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == 'I') {
                    return Integer.TYPE;
                }
                if (charAt == 'F') {
                    return Float.TYPE;
                }
                if (charAt == 'V') {
                    return Void.TYPE;
                }
                if (charAt == 'B') {
                    return Byte.TYPE;
                }
                if (charAt == 'C') {
                    return Character.TYPE;
                }
                if (charAt == 'S') {
                    return Short.TYPE;
                }
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'D') {
                    return Double.TYPE;
                }
                if (charAt == '[') {
                    return Array.newInstance((Class<?>) a(str, iArr), 0).getClass();
                }
                AbstractC5179z.Log(5, "! parseType; " + charAt + " is not known!");
                return null;
            }
        }
        return null;
    }

    private static synchronized boolean a(M m) {
        int i;
        synchronized (ReflectionHelper.class) {
            M[] mArr = a;
            i = m.d;
            M m2 = mArr[i & 4095];
            if (!m.equals(m2)) {
                return false;
            }
            m.e = m2.e;
            return true;
        }
    }

    private static Class[] a(String str) {
        Class a2;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (a2 = a(str, iArr)) != null) {
            arrayList.add(a2);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i] = (Class) it.next();
            i++;
        }
        return clsArr;
    }

    protected static synchronized boolean beginProxyCall(long j) {
        synchronized (ReflectionHelper.class) {
            if (j != b) {
                return false;
            }
            c++;
            return true;
        }
    }

    protected static Object createInvocationError(long j, boolean z) {
        return new N(j, z);
    }

    protected static synchronized void endProxyCall() {
        synchronized (ReflectionHelper.class) {
            long j = c - 1;
            c = j;
            if (0 == j && d) {
                ReflectionHelper.class.notifyAll();
            }
        }
    }

    protected static synchronized void endUnityLaunch() {
        synchronized (ReflectionHelper.class) {
            try {
                b++;
                d = true;
                while (c > 0) {
                    ReflectionHelper.class.wait();
                }
            } catch (InterruptedException unused) {
                AbstractC5179z.Log(6, "Interrupted while waiting for all proxies to exit.");
            }
            d = false;
        }
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        int i;
        Constructor<?> constructor;
        M m = new M(cls, "", str);
        if (a(m)) {
            constructor = (Constructor) m.e;
        } else {
            Class[] a2 = a(str);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor2 = null;
            float f = 0.0f;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Constructor<?> constructor3 = constructors[i2];
                float a3 = a(Void.TYPE, constructor3.getParameterTypes(), a2);
                if (a3 > f) {
                    if (a3 == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = a3;
                }
                i2++;
            }
            synchronized (ReflectionHelper.class) {
                m.e = constructor2;
                M[] mArr = a;
                i = m.d;
                mArr[i & 4095] = m;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z) {
        int i;
        Field field;
        M m = new M(cls, str, str2);
        if (a(m)) {
            field = (Field) m.e;
        } else {
            Class[] a2 = a(str2);
            float f = 0.0f;
            Field field2 = null;
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i2];
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float a3 = a(field3.getType(), null, a2);
                        if (a3 > f) {
                            field2 = field3;
                            if (a3 == 1.0f) {
                                f = a3;
                                break;
                            }
                            f = a3;
                        } else {
                            continue;
                        }
                    }
                    i2++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                m.e = field2;
                M[] mArr = a;
                i = m.d;
                mArr[i & 4095] = m;
            }
            field = field2;
        }
        if (field == null) {
            throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", z ? "static" : "non-static", str, str2, cls.getName()));
        }
        return field;
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            return "boolean".equals(name) ? "Z" : "byte".equals(name) ? "B" : "char".equals(name) ? "C" : "double".equals(name) ? "D" : "float".equals(name) ? "F" : com.safedk.android.analytics.brandsafety.m.w.equals(name) ? "I" : Constants.LONG.equals(name) ? "J" : "short".equals(name) ? "S" : name;
        }
        if (type.isArray()) {
            return type.getName().replace('.', '/');
        }
        return "L" + type.getName().replace('.', '/') + ";";
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z) {
        int i;
        Method method;
        M m = new M(cls, str, str2);
        if (a(m)) {
            method = (Method) m.e;
        } else {
            Class[] a2 = a(str2);
            Method method2 = null;
            float f = 0.0f;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i2];
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float a3 = a(method3.getReturnType(), method3.getParameterTypes(), a2);
                        if (a3 <= f) {
                            continue;
                        } else {
                            if (a3 == 1.0f) {
                                method2 = method3;
                                f = a3;
                                break;
                            }
                            method2 = method3;
                            f = a3;
                        }
                    }
                    i2++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                m.e = method2;
                M[] mArr = a;
                i = m.d;
                mArr[i & 4095] = m;
            }
            method = method2;
        }
        if (method == null) {
            throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", z ? "static" : "non-static", str, str2, cls.getName()));
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyJNIFreeGCHandle(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new L(unityPlayer, j));
    }
}
