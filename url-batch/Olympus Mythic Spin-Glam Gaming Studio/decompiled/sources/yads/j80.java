package yads;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class j80 implements GeneratedSerializer {
    public static final j80 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        j80 j80Var = new j80();
        a = j80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", j80Var, 6);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("logo_url", true);
        pluginGeneratedSerialDescriptor.addElement("adapter_status", true);
        pluginGeneratedSerialDescriptor.addElement("adapters", false);
        pluginGeneratedSerialDescriptor.addElement("latest_adapter_version", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = m80.g;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), lazyArr[4].getValue(), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = m80.g;
        int i2 = 5;
        String str6 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String str8 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            String str9 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, stringSerializer, null);
            i = 63;
            str4 = str9;
            str3 = str8;
            str2 = decodeStringElement;
            str = str7;
        } else {
            boolean z = true;
            int i3 = 0;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            List list2 = null;
            String str13 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str6);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        str10 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i3 |= 2;
                    case 2:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str11);
                        i3 |= 4;
                    case 3:
                        str12 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i3 |= 8;
                    case 4:
                        list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list2);
                        i3 |= 16;
                    case 5:
                        str13 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, str13);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            str = str6;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            list = list2;
            str5 = str13;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new m80(i, str, str2, str3, str4, list, str5);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        m80 m80Var = (m80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = m80.g;
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || m80Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, m80Var.a);
        }
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, m80Var.b);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || m80Var.c != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, m80Var.c);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || m80Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, m80Var.d);
        }
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), m80Var.e);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || m80Var.f != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, StringSerializer.INSTANCE, m80Var.f);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
