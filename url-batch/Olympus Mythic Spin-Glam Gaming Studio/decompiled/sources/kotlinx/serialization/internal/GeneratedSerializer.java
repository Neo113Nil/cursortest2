package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;

/* compiled from: PluginHelperInterfaces.kt */
/* loaded from: classes4.dex */
public interface GeneratedSerializer extends KSerializer {
    KSerializer[] childSerializers();

    /* compiled from: PluginHelperInterfaces.kt */
    public static final class DefaultImpls {
        public static KSerializer[] typeParametersSerializers(GeneratedSerializer generatedSerializer) {
            return GeneratedSerializer.super.typeParametersSerializers();
        }
    }

    default KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
