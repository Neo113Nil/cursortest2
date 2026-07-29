package o;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1743q9 {
    public static final C2002u5 a;
    public static final C2002u5 b;

    static {
        I2 i2 = I2.p;
        int i = AbstractC1545n9.a;
        a = new C2002u5(i2);
        b = new C2002u5(I2.q);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o.ny, o.vp] */
    public static final C0740aw a(Class cls) {
        Object putIfAbsent;
        AbstractC0048Bt.n(cls, "jClass");
        C2002u5 c2002u5 = a;
        c2002u5.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2002u5.j;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = ((AbstractC1596ny) c2002u5.i).invoke(cls)))) != null) {
            obj = putIfAbsent;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C0740aw) obj;
    }
}
