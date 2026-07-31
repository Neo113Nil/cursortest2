package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Caching.kt */
/* loaded from: classes15.dex */
public abstract class CachingKt {
    private static final boolean useClassValue;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        useClassValue = z;
    }

    public static final SerializerCache createCache(Function1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueCache(factory) : new ConcurrentHashMapCache(factory);
    }

    public static final ParametrizedSerializerCache createParametrizedCache(Function2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueParametrizedCache(factory) : new ConcurrentHashMapParametrizedCache(factory);
    }
}
