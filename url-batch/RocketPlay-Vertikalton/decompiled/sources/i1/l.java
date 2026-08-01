package i1;

import h1.InterfaceC0173a;
import h1.p;

/* loaded from: classes.dex */
public abstract class l {
    public static void a(Object obj) {
        if (obj == null || b(2, obj)) {
            return;
        }
        c(obj, "kotlin.jvm.functions.Function2");
        throw null;
    }

    public static boolean b(int i, Object obj) {
        if (obj instanceof V0.a) {
            return (obj instanceof e ? ((e) obj).f() : obj instanceof InterfaceC0173a ? 0 : obj instanceof h1.l ? 1 : obj instanceof p ? 2 : obj instanceof k0.b ? 4 : -1) == i;
        }
        return false;
    }

    public static void c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        f.g(classCastException, l.class.getName());
        throw classCastException;
    }
}
