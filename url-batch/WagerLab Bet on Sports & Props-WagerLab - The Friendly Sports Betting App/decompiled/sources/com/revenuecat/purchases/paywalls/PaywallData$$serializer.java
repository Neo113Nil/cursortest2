package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaywallData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PaywallData$$serializer implements GeneratedSerializer<PaywallData> {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("template_name", false);
        pluginGeneratedSerialDescriptor.addElement("config", false);
        pluginGeneratedSerialDescriptor.addElement("asset_base_url", false);
        pluginGeneratedSerialDescriptor.addElement("revision", true);
        pluginGeneratedSerialDescriptor.addElement("localized_strings", false);
        pluginGeneratedSerialDescriptor.addElement("localized_strings_by_tier", true);
        pluginGeneratedSerialDescriptor.addElement("zero_decimal_place_countries", true);
        pluginGeneratedSerialDescriptor.addElement("default_locale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = PaywallData.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, IntSerializer.INSTANCE, kSerializerArr[4], kSerializerArr[5], GoogleListSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PaywallData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        List list;
        Map map;
        Map map2;
        int i;
        String str2;
        PaywallData.Configuration configuration;
        URL url;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = PaywallData.$childSerializers;
        int i4 = 7;
        int i5 = 6;
        int i6 = 4;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            PaywallData.Configuration configuration2 = (PaywallData.Configuration) beginStructure.decodeSerializableElement(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, null);
            URL url2 = (URL) beginStructure.decodeSerializableElement(descriptor2, 2, URLSerializer.INSTANCE, null);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 3);
            Map map3 = (Map) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            Map map4 = (Map) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, GoogleListSerializer.INSTANCE, null);
            map = map4;
            str2 = decodeStringElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            list = list2;
            i2 = decodeIntElement;
            url = url2;
            i = 255;
            map2 = map3;
            configuration = configuration2;
        } else {
            boolean z = true;
            int i7 = 0;
            String str3 = null;
            List list3 = null;
            Map map5 = null;
            String str4 = null;
            PaywallData.Configuration configuration3 = null;
            URL url3 = null;
            int i8 = 0;
            Map map6 = null;
            while (z) {
                int i9 = i6;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 7;
                        i6 = 4;
                    case 0:
                        str4 = beginStructure.decodeStringElement(descriptor2, 0);
                        i8 |= 1;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 1:
                        configuration3 = (PaywallData.Configuration) beginStructure.decodeSerializableElement(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, configuration3);
                        i8 |= 2;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 2:
                        url3 = (URL) beginStructure.decodeSerializableElement(descriptor2, 2, URLSerializer.INSTANCE, url3);
                        i8 |= 4;
                        i4 = 7;
                        i5 = 6;
                        i6 = 4;
                    case 3:
                        i3 = i9;
                        i7 = beginStructure.decodeIntElement(descriptor2, 3);
                        i8 |= 8;
                        i6 = i3;
                        i4 = 7;
                    case 4:
                        i3 = i9;
                        map6 = (Map) beginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i9], map6);
                        i8 |= 16;
                        i6 = i3;
                        i4 = 7;
                    case 5:
                        map5 = (Map) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], map5);
                        i8 |= 32;
                        i6 = i9;
                    case 6:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, i5, GoogleListSerializer.INSTANCE, list3);
                        i8 |= 64;
                        i6 = i9;
                    case 7:
                        str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i4, StringSerializer.INSTANCE, str3);
                        i8 |= 128;
                        i6 = i9;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str3;
            list = list3;
            map = map5;
            map2 = map6;
            i = i8;
            str2 = str4;
            configuration = configuration3;
            url = url3;
            i2 = i7;
        }
        beginStructure.endStructure(descriptor2);
        return new PaywallData(i, str2, configuration, url, i2, map2, map, list, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PaywallData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PaywallData.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
