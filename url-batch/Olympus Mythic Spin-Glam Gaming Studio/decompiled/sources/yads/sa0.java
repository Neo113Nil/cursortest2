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
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final class sa0 implements GeneratedSerializer {
    public static final sa0 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        sa0 sa0Var = new sa0();
        a = sa0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", sa0Var, 2);
        pluginGeneratedSerialDescriptor.addElement("network_ad_unit_id", false);
        pluginGeneratedSerialDescriptor.addElement("min_cpm", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, DoubleSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        double d;
        int i;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            d = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 1);
            i = 3;
        } else {
            str = null;
            double d2 = 0.0d;
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
                    d2 = beginStructure.decodeDoubleElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                }
            }
            d = d2;
            i = i2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new ua0(i, str, d);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ua0 ua0Var = (ua0) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, ua0Var.a);
        beginStructure.encodeDoubleElement(pluginGeneratedSerialDescriptor, 1, ua0Var.b);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
