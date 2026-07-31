package kotlinx.serialization.modules;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SerializersModule.kt */
/* loaded from: classes5.dex */
public abstract class SerializersModuleKt {
    private static final SerializersModule EmptySerializersModule = new SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false);

    public static final SerializersModule plus(SerializersModule serializersModule, SerializersModule other) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModuleBuilder.include(other);
        return serializersModuleBuilder.build();
    }

    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }
}
