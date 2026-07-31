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

/* loaded from: classes3.dex */
public final class c40 implements GeneratedSerializer {
    public static final c40 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        c40 c40Var = new c40();
        a = c40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("ad_type", false);
        pluginGeneratedSerialDescriptor.addElement("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.addElement("mediation", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(l40.a);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, nullable};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        p40 p40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            str = decodeStringElement;
            p40Var = (p40) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, l40.a, null);
            str3 = decodeStringElement3;
            str2 = decodeStringElement2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str5 = null;
            String str6 = null;
            p40 p40Var2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    p40Var2 = (p40) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, l40.a, p40Var2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str4;
            str2 = str5;
            str3 = str6;
            p40Var = p40Var2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new e40(i, str, str2, str3, p40Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        e40 e40Var = (e40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, e40Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, e40Var.b);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, e40Var.c);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || e40Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, l40.a, e40Var.d);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
