package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes5.dex */
public final class j50 implements GeneratedSerializer {
    public static final j50 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        j50 j50Var = new j50();
        a = j50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", j50Var, 3);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("message", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
            str3 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str4);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str5);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str6);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new l50(i, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        l50 l50Var = (l50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || l50Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, l50Var.a);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || l50Var.b != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, l50Var.b);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || l50Var.c != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, l50Var.c);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
