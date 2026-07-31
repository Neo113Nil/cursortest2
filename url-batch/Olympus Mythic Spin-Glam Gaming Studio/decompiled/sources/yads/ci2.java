package yads;

import com.pubmatic.sdk.openwrap.core.POBConstants;
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

/* loaded from: classes3.dex */
public final class ci2 implements GeneratedSerializer {
    public static final ci2 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        ci2 ci2Var = new ci2();
        a = ci2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.core.configuration.model.PreloadBlock", ci2Var, 2);
        pluginGeneratedSerialDescriptor.addElement("adUnitId", false);
        pluginGeneratedSerialDescriptor.addElement(POBConstants.KEY_FORMAT, false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, fi2.c[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        ii2 ii2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = fi2.c;
        String str2 = null;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            ii2Var = (ii2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            ii2 ii2Var2 = null;
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
                    ii2Var2 = (ii2) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), ii2Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            ii2Var = ii2Var2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new fi2(i, str, ii2Var);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        fi2 fi2Var = (fi2) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = fi2.c;
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, fi2Var.a);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), fi2Var.b);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
