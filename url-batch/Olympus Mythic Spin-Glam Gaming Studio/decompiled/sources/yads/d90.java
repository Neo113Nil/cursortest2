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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes4.dex */
public final class d90 implements GeneratedSerializer {
    public static final d90 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        d90 d90Var = new d90();
        a = d90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", d90Var, 3);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("is_integrated", false);
        pluginGeneratedSerialDescriptor.addElement("integration_messages", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, g90.d[2].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean z;
        String str;
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = g90.d;
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z2 = true;
            int i2 = 0;
            String str2 = null;
            List list2 = null;
            boolean z3 = false;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z2 = false;
                } else if (decodeElementIndex == 0) {
                    str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    z3 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                    i2 |= 4;
                }
            }
            i = i2;
            z = z3;
            str = str2;
            list = list2;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new g90(i, str, z, list);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        g90 g90Var = (g90) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = g90.d;
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, g90Var.a);
        beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 1, g90Var.b);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), g90Var.c);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
