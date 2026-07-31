package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final class nv1 implements GeneratedSerializer {
    public static final nv1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        nv1 nv1Var = new nv1();
        a = nv1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", nv1Var, 4);
        pluginGeneratedSerialDescriptor.addElement("timestamp", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("tag", false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i;
        long j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String decodeStringElement2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            str = decodeStringElement;
            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
            str3 = decodeStringElement2;
            i = 15;
            j = decodeLongElement;
        } else {
            String str4 = null;
            boolean z = true;
            int i2 = 0;
            long j2 = 0;
            String str5 = null;
            String str6 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    str6 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str5 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 3);
                    i2 |= 8;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i = i2;
            j = j2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new pv1(i, j, str, str3, str2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        pv1 pv1Var = (pv1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeLongElement(pluginGeneratedSerialDescriptor, 0, pv1Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, pv1Var.b);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 2, pv1Var.c);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 3, pv1Var.d);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
