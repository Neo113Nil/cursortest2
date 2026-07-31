package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* compiled from: Caching.kt */
/* loaded from: classes6.dex */
final class ConcurrentHashMapParametrizedCache implements ParametrizedSerializerCache {
    private final ConcurrentHashMap cache;
    private final Function2 compute;

    public ConcurrentHashMapParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo8251getgIAlus(KClass key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m8023constructorimpl;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.cache;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap2.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (obj = new ParametrizedCacheEntry()))) != null) {
            obj = putIfAbsent;
        }
        ParametrizedCacheEntry parametrizedCacheEntry = (ParametrizedCacheEntry) obj;
        List list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        concurrentHashMap = parametrizedCacheEntry.serializers;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl((KSerializer) this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Result m8022boximpl = Result.m8022boximpl(m8023constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, m8022boximpl);
            obj2 = putIfAbsent2 == null ? m8022boximpl : putIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).getValue();
    }
}
