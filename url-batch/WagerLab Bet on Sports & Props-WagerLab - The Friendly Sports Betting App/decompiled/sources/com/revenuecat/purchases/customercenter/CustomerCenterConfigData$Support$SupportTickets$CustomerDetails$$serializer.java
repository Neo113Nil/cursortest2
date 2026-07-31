package com.revenuecat.purchases.customercenter;

import com.facebook.appevents.UserDataStore;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CustomerCenterConfigData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer implements GeneratedSerializer<CustomerCenterConfigData.Support.SupportTickets.CustomerDetails> {
    public static final CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer = new CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerDetails", customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("active_entitlements", true);
        pluginGeneratedSerialDescriptor.addElement("app_user_id", true);
        pluginGeneratedSerialDescriptor.addElement("att_consent", true);
        pluginGeneratedSerialDescriptor.addElement(UserDataStore.COUNTRY, true);
        pluginGeneratedSerialDescriptor.addElement("device_version", true);
        pluginGeneratedSerialDescriptor.addElement("email", true);
        pluginGeneratedSerialDescriptor.addElement("facebook_anon_id", true);
        pluginGeneratedSerialDescriptor.addElement("idfa", true);
        pluginGeneratedSerialDescriptor.addElement("idfv", true);
        pluginGeneratedSerialDescriptor.addElement("ip", true);
        pluginGeneratedSerialDescriptor.addElement("last_opened", true);
        pluginGeneratedSerialDescriptor.addElement("last_seen_app_version", true);
        pluginGeneratedSerialDescriptor.addElement("total_spent", true);
        pluginGeneratedSerialDescriptor.addElement("user_since", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CustomerCenterConfigData.Support.SupportTickets.CustomerDetails deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i2 = 0;
        if (beginStructure.decodeSequentially()) {
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 0);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 1);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 2);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(descriptor2, 3);
            boolean decodeBooleanElement5 = beginStructure.decodeBooleanElement(descriptor2, 4);
            boolean decodeBooleanElement6 = beginStructure.decodeBooleanElement(descriptor2, 5);
            boolean decodeBooleanElement7 = beginStructure.decodeBooleanElement(descriptor2, 6);
            boolean decodeBooleanElement8 = beginStructure.decodeBooleanElement(descriptor2, 7);
            boolean decodeBooleanElement9 = beginStructure.decodeBooleanElement(descriptor2, 8);
            boolean decodeBooleanElement10 = beginStructure.decodeBooleanElement(descriptor2, 9);
            boolean decodeBooleanElement11 = beginStructure.decodeBooleanElement(descriptor2, 10);
            boolean decodeBooleanElement12 = beginStructure.decodeBooleanElement(descriptor2, 11);
            z12 = decodeBooleanElement;
            z14 = decodeBooleanElement2;
            z10 = beginStructure.decodeBooleanElement(descriptor2, 12);
            z13 = decodeBooleanElement12;
            z2 = decodeBooleanElement11;
            z4 = decodeBooleanElement10;
            z6 = decodeBooleanElement8;
            z8 = decodeBooleanElement7;
            z9 = decodeBooleanElement6;
            z5 = decodeBooleanElement4;
            z = decodeBooleanElement9;
            z7 = decodeBooleanElement5;
            z3 = decodeBooleanElement3;
            z11 = beginStructure.decodeBooleanElement(descriptor2, 13);
            i = 16383;
        } else {
            int i3 = 13;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            z = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = true;
            while (z28) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z28 = false;
                        i3 = 13;
                    case 0:
                        z15 = beginStructure.decodeBooleanElement(descriptor2, 0);
                        i2 |= 1;
                        i3 = 13;
                    case 1:
                        z16 = beginStructure.decodeBooleanElement(descriptor2, 1);
                        i2 |= 2;
                    case 2:
                        z26 = beginStructure.decodeBooleanElement(descriptor2, 2);
                        i2 |= 4;
                    case 3:
                        z24 = beginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 |= 8;
                    case 4:
                        z25 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i2 |= 16;
                    case 5:
                        z23 = beginStructure.decodeBooleanElement(descriptor2, 5);
                        i2 |= 32;
                    case 6:
                        z22 = beginStructure.decodeBooleanElement(descriptor2, 6);
                        i2 |= 64;
                    case 7:
                        z21 = beginStructure.decodeBooleanElement(descriptor2, 7);
                        i2 |= 128;
                    case 8:
                        z = beginStructure.decodeBooleanElement(descriptor2, 8);
                        i2 |= 256;
                    case 9:
                        z20 = beginStructure.decodeBooleanElement(descriptor2, 9);
                        i2 |= 512;
                    case 10:
                        z19 = beginStructure.decodeBooleanElement(descriptor2, 10);
                        i2 |= 1024;
                    case 11:
                        z18 = beginStructure.decodeBooleanElement(descriptor2, 11);
                        i2 |= 2048;
                    case 12:
                        z17 = beginStructure.decodeBooleanElement(descriptor2, 12);
                        i2 |= 4096;
                    case 13:
                        z27 = beginStructure.decodeBooleanElement(descriptor2, i3);
                        i2 |= 8192;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            boolean z29 = z26;
            z2 = z19;
            z3 = z29;
            boolean z30 = z25;
            z4 = z20;
            z5 = z24;
            z6 = z21;
            z7 = z30;
            boolean z31 = z23;
            z8 = z22;
            z9 = z31;
            z10 = z17;
            z11 = z27;
            z12 = z15;
            z13 = z18;
            z14 = z16;
            i = i2;
        }
        beginStructure.endStructure(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(i, z12, z14, z3, z5, z7, z9, z8, z6, z, z4, z2, z13, z10, z11, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CustomerCenterConfigData.Support.SupportTickets.CustomerDetails value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
