package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes15.dex */
final class ClassValueParametrizedCache implements ParametrizedSerializerCache {
    private final ClassValueReferences classValue;
    private final Function2 compute;

    public ClassValueParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo8251getgIAlus(KClass key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.classValue.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) obj;
        Object obj2 = mutableSoftReference.reference.get();
        if (obj2 == null) {
            obj2 = mutableSoftReference.getOrSetWithLock(new Function0() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    return new ParametrizedCacheEntry();
                }
            });
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) obj2;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        concurrentHashMap = parametrizedCacheEntry.serializers;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl((KSerializer) this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result m8022boximpl = Result.m8022boximpl(m8023constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m8022boximpl);
            obj3 = putIfAbsent == null ? m8022boximpl : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return ((Result) obj3).getValue();
    }
}
