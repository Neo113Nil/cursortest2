package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

/* loaded from: classes6.dex */
public abstract class SerializersKt {
    public static final KSerializer parametrizedSerializerOrNull(KClass kClass, List list, Function0 function0) {
        return SerializersKt__SerializersKt.parametrizedSerializerOrNull(kClass, list, function0);
    }

    public static final KSerializer serializer(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.serializer(serializersModule, kType);
    }

    public static final KSerializer serializerOrNull(KClass kClass) {
        return SerializersKt__SerializersKt.serializerOrNull(kClass);
    }

    public static final KSerializer serializerOrNull(SerializersModule serializersModule, KType kType) {
        return SerializersKt__SerializersKt.serializerOrNull(serializersModule, kType);
    }

    public static final List serializersForParameters(SerializersModule serializersModule, List list, boolean z) {
        return SerializersKt__SerializersKt.serializersForParameters(serializersModule, list, z);
    }
}
