package o;

import java.lang.reflect.InvocationTargetException;

/* renamed from: o.Qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432Qo {
    public static final GR b = new GR(0);
    public final /* synthetic */ AbstractC0588Wo a;

    public C0432Qo(AbstractC0588Wo abstractC0588Wo) {
        this.a = abstractC0588Wo;
    }

    public static Class b(ClassLoader classLoader, String str) {
        GR gr = b;
        GR gr2 = (GR) gr.get(classLoader);
        if (gr2 == null) {
            gr2 = new GR(0);
            gr.put(classLoader, gr2);
        }
        Class cls = (Class) gr2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gr2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final AbstractComponentCallbacksC0069Co a(String str) {
        try {
            return (AbstractComponentCallbacksC0069Co) c(this.a.v.s.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0057Cc(AbstractC1888sN.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
