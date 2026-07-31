package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Primitives.kt */
/* loaded from: classes5.dex */
public abstract class PrimitivesKt {
    private static final Map BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();

    public static final SerialDescriptor PrimitiveDescriptorSafe(String serialName, PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        checkNameIsNotAPrimitive(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }

    public static final void checkNameIsNotAPrimitive(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        for (KSerializer kSerializer : BUILTIN_SERIALIZERS.values()) {
            if (Intrinsics.areEqual(serialName, kSerializer.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final KSerializer builtinSerializerOrNull(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (KSerializer) BUILTIN_SERIALIZERS.get(kClass);
    }
}
