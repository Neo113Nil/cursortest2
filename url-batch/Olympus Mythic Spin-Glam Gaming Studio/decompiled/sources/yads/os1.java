package yads;

import com.ironsource.O6;
import java.util.Map;
import kotlin.Lazy;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes14.dex */
public final class os1 implements GeneratedSerializer {
    public static final os1 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        os1 os1Var = new os1();
        a = os1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", os1Var, 2);
        pluginGeneratedSerialDescriptor.addElement(O6.G1, false);
        pluginGeneratedSerialDescriptor.addElement("network_data", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, rs1.d[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Map map;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = rs1.d;
        String str2 = null;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            map = (Map) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    map2 = (Map) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), map2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            map = map2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new rs1(i, str, map);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        rs1 rs1Var = (rs1) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = rs1.d;
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, rs1Var.b);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), rs1Var.c);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
