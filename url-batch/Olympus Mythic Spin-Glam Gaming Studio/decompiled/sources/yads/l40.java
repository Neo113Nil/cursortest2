package yads;

import java.util.List;
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

/* loaded from: classes15.dex */
public final class l40 implements GeneratedSerializer {
    public static final l40 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        l40 l40Var = new l40();
        a = l40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", l40Var, 2);
        pluginGeneratedSerialDescriptor.addElement(com.ironsource.mediationsdk.d.h, false);
        pluginGeneratedSerialDescriptor.addElement("bidding", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = p40.c;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        List list2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = p40.c;
        List list3 = null;
        if (beginStructure.decodeSequentially()) {
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list4 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    list3 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                    i2 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    list4 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list4);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list3;
            list2 = list4;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new p40(i, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        p40 p40Var = (p40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = p40.c;
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), p40Var.a);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), p40Var.b);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
