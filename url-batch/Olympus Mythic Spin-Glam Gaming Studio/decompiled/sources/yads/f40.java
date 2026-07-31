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

/* loaded from: classes5.dex */
public final class f40 implements GeneratedSerializer {
    public static final f40 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        f40 f40Var = new f40();
        a = f40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        pluginGeneratedSerialDescriptor.addElement(O6.G1, true);
        pluginGeneratedSerialDescriptor.addElement(BrandSafetyEvent.ad, false);
        pluginGeneratedSerialDescriptor.addElement("bidding_parameters", false);
        pluginGeneratedSerialDescriptor.addElement("network_ad_unit_id", true);
        pluginGeneratedSerialDescriptor.addElement("network_ad_unit_id_name", true);
        b = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i40.f;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, lazyArr[2].getValue(), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = i40.f;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, stringSerializer, null);
            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            List list2 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, stringSerializer, null);
            list = list2;
            str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
            str3 = str7;
            i = 31;
            str2 = decodeStringElement;
            str = str6;
        } else {
            boolean z = true;
            int i2 = 0;
            String str8 = null;
            List list3 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str5 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, str5);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    str8 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    list3 = (List) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list3);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    str9 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, str9);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    str10 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str10);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str5;
            str2 = str8;
            list = list3;
            str3 = str9;
            str4 = str10;
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new i40(i, str, str2, list, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        i40 i40Var = (i40) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        Lazy[] lazyArr = i40.f;
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 0) || i40Var.a != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 0, StringSerializer.INSTANCE, i40Var.a);
        }
        beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 1, i40Var.b);
        beginStructure.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), i40Var.c);
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || i40Var.d != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, StringSerializer.INSTANCE, i40Var.d);
        }
        if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || i40Var.e != null) {
            beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, i40Var.e);
        }
        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
