package X;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final o.k f788b = new o.k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f789a;

    public C(I i) {
        this.f789a = i;
    }

    public static Class b(ClassLoader classLoader, String str) {
        o.k kVar = f788b;
        o.k kVar2 = (o.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new o.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new P0.e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new P0.e("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public final AbstractComponentCallbacksC0049q a(String str) {
        try {
            return (AbstractComponentCallbacksC0049q) c(this.f789a.f824t.f995f.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new P0.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new P0.e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new P0.e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new P0.e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }
}
