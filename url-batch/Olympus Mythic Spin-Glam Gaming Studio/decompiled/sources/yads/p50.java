package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final class p50 implements GeneratedSerializer {
    public static final p50 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        p50 p50Var = new p50();
        a = p50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", p50Var, 4);
        pluginGeneratedSerialDescriptor.addElement("app_id", false);
        pluginGeneratedSerialDescriptor.addElement("app_version", false);
        pluginGeneratedSerialDescriptor.addElement("system", false);
        pluginGeneratedSerialDescriptor.addElement("api_level", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
            str3 = decodeStringElement3;
            str4 = decodeStringElement2;
            i = 15;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    i2 |= 8;
                }
            }
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i = i2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new r50(i, str, str4, str3, str2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        r50 r50Var = (r50) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, r50Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, r50Var.b);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, r50Var.c);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, r50Var.d);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
