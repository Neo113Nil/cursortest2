package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* compiled from: SerializersCache.kt */
/* loaded from: classes12.dex */
public abstract class SerializersCacheKt {
    private static final SerializerCache SERIALIZERS_CACHE = CachingKt.createCache(new Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            KSerializer SERIALIZERS_CACHE$lambda$0;
            SERIALIZERS_CACHE$lambda$0 = SerializersCacheKt.SERIALIZERS_CACHE$lambda$0((KClass) obj);
            return SERIALIZERS_CACHE$lambda$0;
        }
    });
    private static final SerializerCache SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new Function1() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1;
            SERIALIZERS_CACHE_NULLABLE$lambda$1 = SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1((KClass) obj);
            return SERIALIZERS_CACHE_NULLABLE$lambda$1;
        }
    });
    private static final ParametrizedSerializerCache PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
            PARAMETRIZED_SERIALIZERS_CACHE$lambda$3 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3((KClass) obj, (List) obj2);
            return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
        }
    });
    private static final ParametrizedSerializerCache PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new Function2() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
            PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5((KClass) obj, (List) obj2);
            return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(it);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        if (PlatformKt.isInterface(it)) {
            return new PolymorphicSerializer(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
        KSerializer nullable;
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(it);
        if (serializerOrNull == null) {
            serializerOrNull = PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null;
        }
        if (serializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(serializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List serializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(serializersForParameters);
        return SerializersKt.parametrizedSerializerOrNull(clazz, serializersForParameters, new Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
                PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(types);
                return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, final List types) {
        KSerializer nullable;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List serializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(serializersForParameters);
        KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(clazz, serializersForParameters, new Function0() { // from class: kotlinx.serialization.SerializersCacheKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
                PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(types);
                return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4;
            }
        });
        if (parametrizedSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(parametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer findCachedSerializer(KClass clazz, boolean z) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!z) {
            KSerializer kSerializer = SERIALIZERS_CACHE.get(clazz);
            if (kSerializer != null) {
                return kSerializer;
            }
            return null;
        }
        return SERIALIZERS_CACHE_NULLABLE.get(clazz);
    }

    public static final Object findParametrizedCachedSerializer(KClass clazz, List types, boolean z) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        if (!z) {
            return PARAMETRIZED_SERIALIZERS_CACHE.mo8251getgIAlus(clazz, types);
        }
        return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo8251getgIAlus(clazz, types);
    }
}
