package com.revenuecat.purchases.paywalls.events;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.hermes.intl.Constants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PaywallPostReceiptData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallPostReceiptData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PaywallPostReceiptData$$serializer implements GeneratedSerializer<PaywallPostReceiptData> {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(SDKAnalyticsEvents.PARAMETER_SESSION_ID, false);
        pluginGeneratedSerialDescriptor.addElement("revision", false);
        pluginGeneratedSerialDescriptor.addElement("display_mode", false);
        pluginGeneratedSerialDescriptor.addElement("dark_mode", false);
        pluginGeneratedSerialDescriptor.addElement(Constants.LOCALE, false);
        pluginGeneratedSerialDescriptor.addElement("offering_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PaywallPostReceiptData deserialize(Decoder decoder) {
        String str;
        boolean z;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 2);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 3);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 4);
            str3 = beginStructure.decodeStringElement(descriptor2, 5);
            z = decodeBooleanElement;
            str4 = decodeStringElement2;
            str2 = decodeStringElement;
            i2 = decodeIntElement;
            i = 63;
        } else {
            str = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            boolean z2 = true;
            boolean z3 = false;
            int i3 = 0;
            int i4 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str = beginStructure.decodeStringElement(descriptor2, 0);
                        i4 |= 1;
                        continue;
                    case 1:
                        i3 = beginStructure.decodeIntElement(descriptor2, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        str7 = beginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        str6 = beginStructure.decodeStringElement(descriptor2, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        str5 = beginStructure.decodeStringElement(descriptor2, 5);
                        i4 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            int i5 = i4;
            z = z3;
            i = i5;
            int i6 = i3;
            str2 = str7;
            i2 = i6;
            str3 = str5;
            str4 = str6;
        }
        beginStructure.endStructure(descriptor2);
        return new PaywallPostReceiptData(i, str, i2, str2, z, str4, str3, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PaywallPostReceiptData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PaywallPostReceiptData.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
