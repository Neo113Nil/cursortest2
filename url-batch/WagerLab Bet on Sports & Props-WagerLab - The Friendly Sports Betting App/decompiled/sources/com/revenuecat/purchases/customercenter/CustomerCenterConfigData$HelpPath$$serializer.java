package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: CustomerCenterConfigData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class CustomerCenterConfigData$HelpPath$$serializer implements GeneratedSerializer<CustomerCenterConfigData.HelpPath> {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("promotional_offer", true);
        pluginGeneratedSerialDescriptor.addElement("feedback_survey", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        pluginGeneratedSerialDescriptor.addElement("open_method", true);
        pluginGeneratedSerialDescriptor.addElement("action_identifier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[2], BuiltinSerializersKt.getNullable(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CustomerCenterConfigData.HelpPath deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey;
        String str3;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer;
        String str4;
        CustomerCenterConfigData.HelpPath.OpenMethod openMethod;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        int i2 = 7;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer2 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) beginStructure.decodeNullableSerializableElement(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, null);
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey2 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) beginStructure.decodeNullableSerializableElement(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, null);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, null);
            openMethod = (CustomerCenterConfigData.HelpPath.OpenMethod) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            str = str6;
            promotionalOffer = promotionalOffer2;
            feedbackSurvey = feedbackSurvey2;
            pathType = pathType2;
            str3 = decodeStringElement2;
            str2 = decodeStringElement;
            i = 255;
        } else {
            boolean z = true;
            int i3 = 0;
            String str7 = null;
            CustomerCenterConfigData.HelpPath.OpenMethod openMethod2 = null;
            String str8 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey3 = null;
            String str9 = null;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                    case 0:
                        i3 |= 1;
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i2 = 7;
                    case 1:
                        str9 = beginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], pathType3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        promotionalOffer3 = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) beginStructure.decodeNullableSerializableElement(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        feedbackSurvey3 = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) beginStructure.decodeNullableSerializableElement(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, feedbackSurvey3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str8);
                        i3 |= 32;
                    case 6:
                        openMethod2 = (CustomerCenterConfigData.HelpPath.OpenMethod) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], openMethod2);
                        i3 |= 64;
                    case 7:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i2, StringSerializer.INSTANCE, str7);
                        i3 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer4 = promotionalOffer3;
            str = str8;
            str2 = str5;
            pathType = pathType3;
            feedbackSurvey = feedbackSurvey3;
            str3 = str9;
            promotionalOffer = promotionalOffer4;
            str4 = str7;
            openMethod = openMethod2;
            i = i3;
        }
        beginStructure.endStructure(descriptor2);
        return new CustomerCenterConfigData.HelpPath(i, str2, str3, pathType, promotionalOffer, feedbackSurvey, str, openMethod, str4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CustomerCenterConfigData.HelpPath value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
