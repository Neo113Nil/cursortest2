package yads;

import com.ironsource.O6;
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

/* loaded from: classes8.dex */
public final class ah2 implements GeneratedSerializer {
    public static final ah2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ah2 ah2Var = new ah2();
        a = ah2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", ah2Var, 5);
        pluginGeneratedSerialDescriptor.addElement(O6.G1, false);
        pluginGeneratedSerialDescriptor.addElement("network_winner", false);
        pluginGeneratedSerialDescriptor.addElement("revenue", false);
        pluginGeneratedSerialDescriptor.addElement("result", false);
        pluginGeneratedSerialDescriptor.addElement("network_ad_info", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(ih2.a), BuiltinSerializersKt.getNullable(zh2.a), sh2.a, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        kh2 kh2Var;
        bi2 bi2Var;
        vh2 vh2Var;
        String str2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        String str3 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            kh2 kh2Var2 = (kh2) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, ih2.a, null);
            bi2 bi2Var2 = (bi2) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, zh2.a, null);
            str = decodeStringElement;
            vh2Var = (vh2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, sh2.a, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, null);
            bi2Var = bi2Var2;
            kh2Var = kh2Var2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            kh2 kh2Var3 = null;
            bi2 bi2Var3 = null;
            vh2 vh2Var2 = null;
            String str4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    kh2Var3 = (kh2) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, ih2.a, kh2Var3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    bi2Var3 = (bi2) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, zh2.a, bi2Var3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    vh2Var2 = (vh2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, sh2.a, vh2Var2);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str4);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str3;
            kh2Var = kh2Var3;
            bi2Var = bi2Var3;
            vh2Var = vh2Var2;
            str2 = str4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new ch2(i, str, kh2Var, bi2Var, vh2Var, str2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ch2 ch2Var = (ch2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, ch2Var.a);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, ih2.a, ch2Var.b);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, zh2.a, ch2Var.c);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, sh2.a, ch2Var.d);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, ch2Var.e);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
