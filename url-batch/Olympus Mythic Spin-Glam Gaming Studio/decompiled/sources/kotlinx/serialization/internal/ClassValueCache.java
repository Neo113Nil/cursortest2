package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes12.dex */
final class ClassValueCache implements SerializerCache {
    private final ClassValueReferences classValue;
    private final Function1 compute;

    public ClassValueCache(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences();
    }

    public final Function1 getCompute() {
        return this.compute;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(final KClass key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.classValue.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object obj2 = mutableSoftReference.reference.get();
        if (obj2 == null) {
            obj2 = mutableSoftReference.getOrSetWithLock(new Function0() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return new CacheEntry((KSerializer) ClassValueCache.this.getCompute().invoke(key));
                }
            });
        }
        return ((CacheEntry) obj2).serializer;
    }
}
