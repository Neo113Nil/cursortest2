package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nk {
    public static final e20 b = new e20(0);
    public final /* synthetic */ sk a;

    public nk(sk skVar) {
        this.a = skVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        e20 e20Var = b;
        e20 e20Var2 = (e20) e20Var.get(classLoader);
        if (e20Var2 == null) {
            e20Var2 = new e20(0);
            e20Var.put(classLoader, e20Var2);
        }
        Class cls = (Class) e20Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        e20Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            l8.i(str, ": make sure class is a valid subclass of Fragment", e);
            return null;
        } catch (ClassNotFoundException e2) {
            l8.i(str, ": make sure class name exists", e2);
            return null;
        }
    }

    public final dk a(String str) {
        try {
            return (dk) c(this.a.t.v.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            l8.i(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (InstantiationException e2) {
            l8.i(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            l8.i(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            l8.i(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }
}
