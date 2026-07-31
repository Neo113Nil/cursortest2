package com.revenuecat.purchases.common.responses;

import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import expo.modules.contacts.Columns;
import java.util.Date;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SubscriptionInfoResponse.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/common/responses/SubscriptionInfoResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class SubscriptionInfoResponse$$serializer implements GeneratedSerializer<SubscriptionInfoResponse> {
    public static final SubscriptionInfoResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SubscriptionInfoResponse$$serializer subscriptionInfoResponse$$serializer = new SubscriptionInfoResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse", subscriptionInfoResponse$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("purchase_date", false);
        pluginGeneratedSerialDescriptor.addElement("original_purchase_date", true);
        pluginGeneratedSerialDescriptor.addElement("expires_date", true);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.STORE, false);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.IS_SANDBOX, false);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, true);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, true);
        pluginGeneratedSerialDescriptor.addElement("grace_period_expires_date", true);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.OWNERSHIP_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement(ProductResponseJsonKeys.PERIOD_TYPE, false);
        pluginGeneratedSerialDescriptor.addElement("refunded_at", true);
        pluginGeneratedSerialDescriptor.addElement("store_transaction_id", true);
        pluginGeneratedSerialDescriptor.addElement("auto_resume_date", true);
        pluginGeneratedSerialDescriptor.addElement(Columns.DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("price", true);
        pluginGeneratedSerialDescriptor.addElement("product_plan_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("management_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubscriptionInfoResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = SubscriptionInfoResponse.$childSerializers;
        return new KSerializer[]{ISO8601DateSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), StoreSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), kSerializerArr[8], kSerializerArr[9], BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ISO8601DateSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SubscriptionInfoResponse deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        Date date;
        PeriodType periodType;
        String str;
        SubscriptionInfoResponse.PriceResponse priceResponse;
        String str2;
        String str3;
        Date date2;
        Date date3;
        OwnershipType ownershipType;
        Date date4;
        String str4;
        Date date5;
        Date date6;
        Date date7;
        Store store;
        boolean z;
        Date date8;
        String str5;
        String str6;
        String str7;
        Date date9;
        String str8;
        Date date10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = SubscriptionInfoResponse.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            Date date11 = (Date) beginStructure.decodeSerializableElement(descriptor2, 0, ISO8601DateSerializer.INSTANCE, null);
            Date date12 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ISO8601DateSerializer.INSTANCE, null);
            Date date13 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 2, ISO8601DateSerializer.INSTANCE, null);
            store = (Store) beginStructure.decodeSerializableElement(descriptor2, 3, StoreSerializer.INSTANCE, null);
            z = beginStructure.decodeBooleanElement(descriptor2, 4);
            Date date14 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 5, ISO8601DateSerializer.INSTANCE, null);
            Date date15 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 6, ISO8601DateSerializer.INSTANCE, null);
            Date date16 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 7, ISO8601DateSerializer.INSTANCE, null);
            OwnershipType ownershipType2 = (OwnershipType) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            PeriodType periodType2 = (PeriodType) beginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            Date date17 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 10, ISO8601DateSerializer.INSTANCE, null);
            String str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, null);
            Date date18 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 12, ISO8601DateSerializer.INSTANCE, null);
            String str10 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, null);
            SubscriptionInfoResponse.PriceResponse priceResponse2 = (SubscriptionInfoResponse.PriceResponse) beginStructure.decodeNullableSerializableElement(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, null);
            i = 131071;
            str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, null);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, null);
            str2 = str9;
            date7 = date14;
            date8 = date13;
            priceResponse = priceResponse2;
            str3 = str10;
            date3 = date18;
            periodType = periodType2;
            date = date17;
            ownershipType = ownershipType2;
            date6 = date16;
            date4 = date15;
            date2 = date11;
            date5 = date12;
        } else {
            boolean z2 = false;
            int i2 = 9;
            int i3 = 8;
            boolean z3 = true;
            String str11 = null;
            String str12 = null;
            Date date19 = null;
            Date date20 = null;
            Date date21 = null;
            PeriodType periodType3 = null;
            OwnershipType ownershipType3 = null;
            Date date22 = null;
            Date date23 = null;
            Store store2 = null;
            Date date24 = null;
            Date date25 = null;
            String str13 = null;
            SubscriptionInfoResponse.PriceResponse priceResponse3 = null;
            String str14 = null;
            i = 0;
            Date date26 = null;
            while (z3) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        str5 = str12;
                        z3 = false;
                        str12 = str5;
                        i3 = 8;
                        i2 = 9;
                    case 0:
                        str6 = str11;
                        str5 = str12;
                        i |= 1;
                        date25 = (Date) beginStructure.decodeSerializableElement(descriptor2, 0, ISO8601DateSerializer.INSTANCE, date25);
                        str11 = str6;
                        str12 = str5;
                        i3 = 8;
                        i2 = 9;
                    case 1:
                        str6 = str11;
                        str5 = str12;
                        date26 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ISO8601DateSerializer.INSTANCE, date26);
                        i |= 2;
                        str11 = str6;
                        str12 = str5;
                        i3 = 8;
                        i2 = 9;
                    case 2:
                        str7 = str11;
                        date9 = date26;
                        date20 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 2, ISO8601DateSerializer.INSTANCE, date20);
                        i |= 4;
                        str11 = str7;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 3:
                        date9 = date26;
                        store2 = (Store) beginStructure.decodeSerializableElement(descriptor2, 3, StoreSerializer.INSTANCE, store2);
                        i |= 8;
                        str11 = str11;
                        str13 = str13;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 4:
                        str7 = str11;
                        date9 = date26;
                        z2 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i |= 16;
                        str11 = str7;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 5:
                        str7 = str11;
                        date9 = date26;
                        date23 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 5, ISO8601DateSerializer.INSTANCE, date23);
                        i |= 32;
                        str11 = str7;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 6:
                        str7 = str11;
                        date9 = date26;
                        date24 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 6, ISO8601DateSerializer.INSTANCE, date24);
                        i |= 64;
                        str11 = str7;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 7:
                        str7 = str11;
                        date9 = date26;
                        date22 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 7, ISO8601DateSerializer.INSTANCE, date22);
                        i |= 128;
                        str11 = str7;
                        date26 = date9;
                        i3 = 8;
                        i2 = 9;
                    case 8:
                        ownershipType3 = (OwnershipType) beginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], ownershipType3);
                        i |= 256;
                        str11 = str11;
                        date26 = date26;
                        i2 = 9;
                    case 9:
                        str8 = str11;
                        date10 = date26;
                        periodType3 = (PeriodType) beginStructure.decodeSerializableElement(descriptor2, i2, kSerializerArr[i2], periodType3);
                        i |= 512;
                        str11 = str8;
                        date26 = date10;
                    case 10:
                        str8 = str11;
                        date10 = date26;
                        date19 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 10, ISO8601DateSerializer.INSTANCE, date19);
                        i |= 1024;
                        str11 = str8;
                        date26 = date10;
                    case 11:
                        str8 = str11;
                        date10 = date26;
                        str12 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, str12);
                        i |= 2048;
                        str11 = str8;
                        date26 = date10;
                    case 12:
                        str8 = str11;
                        date10 = date26;
                        date21 = (Date) beginStructure.decodeNullableSerializableElement(descriptor2, 12, ISO8601DateSerializer.INSTANCE, date21);
                        i |= 4096;
                        str11 = str8;
                        date26 = date10;
                    case 13:
                        date10 = date26;
                        str13 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StringSerializer.INSTANCE, str13);
                        i |= 8192;
                        str11 = str11;
                        priceResponse3 = priceResponse3;
                        date26 = date10;
                    case 14:
                        date10 = date26;
                        priceResponse3 = (SubscriptionInfoResponse.PriceResponse) beginStructure.decodeNullableSerializableElement(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, priceResponse3);
                        i |= 16384;
                        str11 = str11;
                        str14 = str14;
                        date26 = date10;
                    case 15:
                        date10 = date26;
                        str8 = str11;
                        str14 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, str14);
                        i |= 32768;
                        str11 = str8;
                        date26 = date10;
                    case 16:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 16, StringSerializer.INSTANCE, str11);
                        i |= 65536;
                        date26 = date26;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            String str15 = str12;
            Date date27 = date25;
            date = date19;
            periodType = periodType3;
            str = str11;
            priceResponse = priceResponse3;
            str2 = str15;
            str3 = str13;
            date2 = date27;
            date3 = date21;
            ownershipType = ownershipType3;
            date4 = date24;
            str4 = str14;
            date5 = date26;
            date6 = date22;
            date7 = date23;
            store = store2;
            z = z2;
            date8 = date20;
        }
        beginStructure.endStructure(descriptor2);
        return new SubscriptionInfoResponse(i, date2, date5, date8, store, z, date7, date4, date6, ownershipType, periodType, date, str2, date3, str3, priceResponse, str4, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, SubscriptionInfoResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        SubscriptionInfoResponse.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
