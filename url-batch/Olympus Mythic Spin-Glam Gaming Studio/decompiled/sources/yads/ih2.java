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

/* loaded from: classes13.dex */
public final class ih2 implements GeneratedSerializer {
    public static final ih2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ih2 ih2Var = new ih2();
        a = ih2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationNetworkWinner", ih2Var, 2);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("network_ad_unit", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            i = 3;
        } else {
            str = null;
            String str3 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str3 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                }
            }
            str2 = str3;
            i = i2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new kh2(i, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        kh2 kh2Var = (kh2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, kh2Var.a);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, kh2Var.b);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
