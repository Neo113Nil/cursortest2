package yads;

import com.ironsource.O6;
import com.safedk.android.analytics.events.BrandSafetyEvent;
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

/* loaded from: classes4.dex */
public final class v40 implements GeneratedSerializer {
    public static final v40 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        v40 v40Var = new v40();
        a = v40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", v40Var, 6);
        pluginGeneratedSerialDescriptor.addElement(O6.G1, true);
        pluginGeneratedSerialDescriptor.addElement(BrandSafetyEvent.ad, false);
        pluginGeneratedSerialDescriptor.addElement("waterfall_parameters", false);
        pluginGeneratedSerialDescriptor.addElement("network_ad_unit_id_name", true);
        pluginGeneratedSerialDescriptor.addElement("currency", false);
        pluginGeneratedSerialDescriptor.addElement("cpm_floors", false);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = z40.g;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, lazyArr[2].getValue(), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(va0.a), lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        String str3;
        xa0 xa0Var;
        List list2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = z40.g;
        int i2 = 3;
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            List list3 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            xa0 xa0Var2 = (xa0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, va0.a, null);
            list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str3 = str6;
            xa0Var = xa0Var2;
            i = 63;
            list = list3;
            str2 = decodeStringElement;
            str = str5;
        } else {
            boolean z = true;
            int i3 = 0;
            String str7 = null;
            List list4 = null;
            String str8 = null;
            xa0 xa0Var3 = null;
            List list5 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str4);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        str7 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                        i3 |= 2;
                    case 2:
                        list4 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list4);
                        i3 |= 4;
                    case 3:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        i3 |= 8;
                    case 4:
                        xa0Var3 = (xa0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, va0.a, xa0Var3);
                        i3 |= 16;
                    case 5:
                        list5 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list5);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            str = str4;
            str2 = str7;
            list = list4;
            str3 = str8;
            xa0Var = xa0Var3;
            list2 = list5;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new z40(i, str, str2, list, str3, xa0Var, list2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        z40 z40Var = (z40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = z40.g;
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || z40Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, z40Var.a);
        }
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, z40Var.b);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), z40Var.c);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || z40Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, z40Var.d);
        }
        beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, va0.a, z40Var.e);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), z40Var.f);
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
