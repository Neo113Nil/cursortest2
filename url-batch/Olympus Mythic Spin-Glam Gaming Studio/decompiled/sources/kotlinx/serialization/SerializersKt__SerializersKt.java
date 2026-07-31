package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Serializers.kt */
/* loaded from: classes13.dex */
abstract /* synthetic */ class SerializersKt__SerializersKt {
    public static final KSerializer serializer(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    public static final KSerializer serializerOrNull(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final KSerializer serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KType kType, boolean z) {
        KSerializer kSerializer;
        KSerializer kSerializer2;
        PolymorphicSerializer polymorphicSerializer;
        KClass kclass = Platform_commonKt.kclass(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(Platform_commonKt.typeOrThrow((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!PlatformKt.isInterface(kclass) || SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null) == null) {
                kSerializer = SerializersCacheKt.findCachedSerializer(kclass, isMarkedNullable);
            }
            kSerializer = null;
        } else {
            if (!serializersModule.getHasInterfaceContextualSerializers$kotlinx_serialization_core()) {
                Object findParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(kclass, arrayList, isMarkedNullable);
                if (Result.m8028isFailureimpl(findParametrizedCachedSerializer)) {
                    findParametrizedCachedSerializer = null;
                }
                kSerializer = (KSerializer) findParametrizedCachedSerializer;
            }
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            kSerializer2 = SerializersKt.serializerOrNull(kclass);
            if (kSerializer2 == null && (kSerializer2 = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null)) == null) {
                if (PlatformKt.isInterface(kclass)) {
                    polymorphicSerializer = new PolymorphicSerializer(kclass);
                    kSerializer2 = polymorphicSerializer;
                }
                kSerializer2 = null;
            }
            if (kSerializer2 == null) {
                return nullable$SerializersKt__SerializersKt(kSerializer2, isMarkedNullable);
            }
            return null;
        }
        List serializersForParameters = SerializersKt.serializersForParameters(serializersModule, arrayList, z);
        if (serializersForParameters == null) {
            return null;
        }
        KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, serializersForParameters, new Function0() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
                serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt = SerializersKt__SerializersKt.serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(arrayList);
                return serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt;
            }
        });
        if (parametrizedSerializerOrNull == null) {
            kSerializer2 = serializersModule.getContextual(kclass, serializersForParameters);
            if (kSerializer2 == null) {
                if (PlatformKt.isInterface(kclass)) {
                    polymorphicSerializer = new PolymorphicSerializer(kclass);
                    kSerializer2 = polymorphicSerializer;
                }
                kSerializer2 = null;
            }
        } else {
            kSerializer2 = parametrizedSerializerOrNull;
        }
        if (kSerializer2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final List serializersForParameters(SerializersModule serializersModule, List typeArguments, boolean z) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            List list = typeArguments;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (KType) it.next()));
            }
        } else {
            List list2 = typeArguments;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                KSerializer serializerOrNull = SerializersKt.serializerOrNull(serializersModule, (KType) it2.next());
                if (serializerOrNull == null) {
                    return null;
                }
                arrayList.add(serializerOrNull);
            }
        }
        return arrayList;
    }

    public static final KSerializer serializerOrNull(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer compiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return compiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : compiledSerializerImpl;
    }

    public static final KSerializer parametrizedSerializerOrNull(KClass kClass, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer builtinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers, elementClassifierIfArray);
        return builtinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers) : builtinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    private static final KSerializer compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass kClass, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass kClass, List list, Function0 function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) list.get(0), (KSerializer) list.get(1), (KSerializer) list.get(2));
        }
        if (!PlatformKt.isReferenceArray(kClass)) {
            return null;
        }
        Object mo4828invoke = function0.mo4828invoke();
        Intrinsics.checkNotNull(mo4828invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) mo4828invoke, (KSerializer) list.get(0));
    }

    private static final KSerializer nullable$SerializersKt__SerializersKt(KSerializer kSerializer, boolean z) {
        if (z) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }
}
