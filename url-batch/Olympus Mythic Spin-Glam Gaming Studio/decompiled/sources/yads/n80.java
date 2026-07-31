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
public final class n80 implements GeneratedSerializer {
    public static final n80 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        n80 n80Var = new n80();
        a = n80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", n80Var, 7);
        pluginGeneratedSerialDescriptor.addElement("page_id", true);
        pluginGeneratedSerialDescriptor.addElement("latest_sdk_version", true);
        pluginGeneratedSerialDescriptor.addElement("app_ads_txt_url", true);
        pluginGeneratedSerialDescriptor.addElement("app_status", true);
        pluginGeneratedSerialDescriptor.addElement("alerts", true);
        pluginGeneratedSerialDescriptor.addElement("ad_units", true);
        pluginGeneratedSerialDescriptor.addElement("mediation_networks", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = s80.h;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[4].getValue()), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[5].getValue()), lazyArr[6].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        List list2;
        String str;
        String str2;
        String str3;
        String str4;
        List list3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = s80.h;
        int i2 = 3;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, stringSerializer, null);
            String str8 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
            String str9 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            List list4 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            List list5 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            list = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str4 = str9;
            list3 = list4;
            str3 = str8;
            i = 127;
            list2 = list5;
            str2 = str7;
            str = str6;
        } else {
            boolean z = true;
            int i3 = 0;
            List list6 = null;
            List list7 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            List list8 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str5);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, str10);
                        i3 |= 2;
                        i2 = 3;
                    case 2:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str11);
                        i3 |= 4;
                        i2 = 3;
                    case 3:
                        str12 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, str12);
                        i3 |= 8;
                    case 4:
                        list8 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), list8);
                        i3 |= 16;
                    case 5:
                        list7 = (List) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list7);
                        i3 |= 32;
                    case 6:
                        list6 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list6);
                        i3 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            list = list6;
            list2 = list7;
            str = str5;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            list3 = list8;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new s80(i, str, str2, str3, str4, list3, list2, list);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        s80 s80Var = (s80) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = s80.h;
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || s80Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, s80Var.a);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || s80Var.b != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, StringSerializer.INSTANCE, s80Var.b);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || s80Var.c != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, s80Var.c);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || s80Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, s80Var.d);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || s80Var.e != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), s80Var.e);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5) || s80Var.f != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), s80Var.f);
        }
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), s80Var.g);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
