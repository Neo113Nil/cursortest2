package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final class zh2 implements GeneratedSerializer {
    public static final zh2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        zh2 zh2Var = new zh2();
        a = zh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", zh2Var, 1);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DoubleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        double d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        int i = 1;
        if (beginStructure.decodeSequentially()) {
            d = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 0);
        } else {
            double d2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else {
                    if (decodeElementIndex != 0) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    d2 = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 0);
                    i2 = 1;
                }
            }
            d = d2;
            i = i2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new bi2(i, d);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeDoubleElement(pluginGeneratedSerialDescriptor, 0, ((bi2) obj).a);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
