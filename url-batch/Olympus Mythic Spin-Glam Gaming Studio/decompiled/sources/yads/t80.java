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

/* loaded from: classes.dex */
public final class t80 implements GeneratedSerializer {
    public static final t80 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        t80 t80Var = new t80();
        a = t80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", t80Var, 6);
        pluginGeneratedSerialDescriptor.addElement("app_data", false);
        pluginGeneratedSerialDescriptor.addElement("sdk_data", false);
        pluginGeneratedSerialDescriptor.addElement("adapters_data", false);
        pluginGeneratedSerialDescriptor.addElement("consents_data", false);
        pluginGeneratedSerialDescriptor.addElement("sdk_logs", false);
        pluginGeneratedSerialDescriptor.addElement("network_logs", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = y80.g;
        return new KSerializer[]{p50.a, d90.a, lazyArr[2].getValue(), w50.a, lazyArr[4].getValue(), lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        r50 r50Var;
        g90 g90Var;
        List list;
        y50 y50Var;
        List list2;
        List list3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = y80.g;
        int i2 = 3;
        r50 r50Var2 = null;
        if (beginStructure.decodeSequentially()) {
            r50 r50Var3 = (r50) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, p50.a, null);
            g90 g90Var2 = (g90) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d90.a, null);
            List list4 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            y50 y50Var2 = (y50) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, w50.a, null);
            List list5 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            list3 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            r50Var = r50Var3;
            y50Var = y50Var2;
            i = 63;
            list2 = list5;
            list = list4;
            g90Var = g90Var2;
        } else {
            boolean z = true;
            int i3 = 0;
            g90 g90Var3 = null;
            List list6 = null;
            y50 y50Var3 = null;
            List list7 = null;
            List list8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        r50Var2 = (r50) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 0, p50.a, r50Var2);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        g90Var3 = (g90) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d90.a, g90Var3);
                        i3 |= 2;
                    case 2:
                        list6 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list6);
                        i3 |= 4;
                    case 3:
                        y50Var3 = (y50) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, i2, w50.a, y50Var3);
                        i3 |= 8;
                    case 4:
                        list7 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list7);
                        i3 |= 16;
                    case 5:
                        list8 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list8);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            r50Var = r50Var2;
            g90Var = g90Var3;
            list = list6;
            y50Var = y50Var3;
            list2 = list7;
            list3 = list8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new y80(i, r50Var, g90Var, list, y50Var, list2, list3);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        y80 y80Var = (y80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = y80.g;
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 0, p50.a, y80Var.a);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, d90.a, y80Var.b);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), y80Var.c);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 3, w50.a, y80Var.d);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), y80Var.e);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), y80Var.f);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
