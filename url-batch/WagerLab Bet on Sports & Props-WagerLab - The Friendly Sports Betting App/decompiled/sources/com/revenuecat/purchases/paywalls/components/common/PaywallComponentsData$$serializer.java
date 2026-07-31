package com.revenuecat.purchases.paywalls.components.common;

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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaywallComponentsData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/PaywallComponentsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PaywallComponentsData$$serializer implements GeneratedSerializer<PaywallComponentsData> {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("template_name", false);
        pluginGeneratedSerialDescriptor.addElement("asset_base_url", false);
        pluginGeneratedSerialDescriptor.addElement("components_config", false);
        pluginGeneratedSerialDescriptor.addElement("components_localizations", false);
        pluginGeneratedSerialDescriptor.addElement("default_locale", false);
        pluginGeneratedSerialDescriptor.addElement("revision", true);
        pluginGeneratedSerialDescriptor.addElement("zero_decimal_place_countries", true);
        pluginGeneratedSerialDescriptor.addElement("exit_offers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallComponentsData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = PaywallComponentsData.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, kSerializerArr[3], LocaleId$$serializer.INSTANCE, IntSerializer.INSTANCE, GoogleListSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ExitOffers$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PaywallComponentsData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        URL url;
        ExitOffers exitOffers;
        List list;
        int i;
        Map map;
        ComponentsConfig componentsConfig;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = PaywallComponentsData.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        int i5 = 0;
        ComponentsConfig componentsConfig2 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            url = (URL) beginStructure.decodeSerializableElement(descriptor2, 1, URLSerializer.INSTANCE, null);
            ComponentsConfig componentsConfig3 = (ComponentsConfig) beginStructure.decodeSerializableElement(descriptor2, 2, ComponentsConfig$$serializer.INSTANCE, null);
            Map map2 = (Map) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            LocaleId localeId = (LocaleId) beginStructure.decodeSerializableElement(descriptor2, 4, LocaleId$$serializer.INSTANCE, null);
            String m10663unboximpl = localeId != null ? localeId.m10663unboximpl() : null;
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            List list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 6, GoogleListSerializer.INSTANCE, null);
            map = map2;
            str = decodeStringElement;
            exitOffers = (ExitOffers) beginStructure.decodeNullableSerializableElement(descriptor2, 7, ExitOffers$$serializer.INSTANCE, null);
            list = list2;
            i = decodeIntElement;
            str2 = m10663unboximpl;
            componentsConfig = componentsConfig3;
            i2 = 255;
        } else {
            boolean z = true;
            int i6 = 0;
            Map map3 = null;
            str = null;
            ExitOffers exitOffers2 = null;
            List list3 = null;
            str2 = null;
            URL url2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                    case 0:
                        str = beginStructure.decodeStringElement(descriptor2, 0);
                        i5 |= 1;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        i5 |= 2;
                        url2 = (URL) beginStructure.decodeSerializableElement(descriptor2, 1, URLSerializer.INSTANCE, url2);
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        componentsConfig2 = (ComponentsConfig) beginStructure.decodeSerializableElement(descriptor2, 2, ComponentsConfig$$serializer.INSTANCE, componentsConfig2);
                        i5 |= 4;
                        i3 = 7;
                    case 3:
                        map3 = (Map) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], map3);
                        i5 |= 8;
                        i3 = 7;
                    case 4:
                        LocaleId localeId2 = (LocaleId) beginStructure.decodeSerializableElement(descriptor2, 4, LocaleId$$serializer.INSTANCE, str2 != null ? LocaleId.m10657boximpl(str2) : null);
                        str2 = localeId2 != null ? localeId2.m10663unboximpl() : null;
                        i5 |= 16;
                        i3 = 7;
                    case 5:
                        i6 = beginStructure.decodeIntElement(descriptor2, 5);
                        i5 |= 32;
                    case 6:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, i4, GoogleListSerializer.INSTANCE, list3);
                        i5 |= 64;
                    case 7:
                        exitOffers2 = (ExitOffers) beginStructure.decodeNullableSerializableElement(descriptor2, i3, ExitOffers$$serializer.INSTANCE, exitOffers2);
                        i5 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            url = url2;
            exitOffers = exitOffers2;
            list = list3;
            i = i6;
            map = map3;
            componentsConfig = componentsConfig2;
            i2 = i5;
        }
        beginStructure.endStructure(descriptor2);
        return new PaywallComponentsData(i2, str, url, componentsConfig, map, str2, i, list, exitOffers, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PaywallComponentsData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PaywallComponentsData.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
