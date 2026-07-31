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

/* loaded from: classes4.dex */
public final class tu1 implements GeneratedSerializer {
    public static final tu1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        tu1 tu1Var = new tu1();
        a = tu1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", tu1Var, 2);
        pluginGeneratedSerialDescriptor.addElement("request", false);
        pluginGeneratedSerialDescriptor.addElement("response", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yu1.a, BuiltinSerializersKt.getNullable(cv1.a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        bv1 bv1Var;
        fv1 fv1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        bv1 bv1Var2 = null;
        if (beginStructure.decodeSequentially()) {
            bv1Var = (bv1) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, yu1.a, null);
            fv1Var = (fv1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, cv1.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            fv1 fv1Var2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    bv1Var2 = (bv1) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, yu1.a, bv1Var2);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    fv1Var2 = (fv1) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, cv1.a, fv1Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            bv1Var = bv1Var2;
            fv1Var = fv1Var2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new vu1(i, bv1Var, fv1Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        vu1 vu1Var = (vu1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, yu1.a, vu1Var.a);
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, cv1.a, vu1Var.b);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
