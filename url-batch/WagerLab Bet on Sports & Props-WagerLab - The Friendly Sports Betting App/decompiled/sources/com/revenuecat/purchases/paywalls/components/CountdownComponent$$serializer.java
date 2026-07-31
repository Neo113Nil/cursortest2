package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.CountdownComponent;
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

/* compiled from: CountdownComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/CountdownComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CountdownComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class CountdownComponent$$serializer implements GeneratedSerializer<CountdownComponent> {
    public static final CountdownComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CountdownComponent$$serializer countdownComponent$$serializer = new CountdownComponent$$serializer();
        INSTANCE = countdownComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("countdown", countdownComponent$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("style", false);
        pluginGeneratedSerialDescriptor.addElement("count_from", true);
        pluginGeneratedSerialDescriptor.addElement("countdown_stack", false);
        pluginGeneratedSerialDescriptor.addElement("end_stack", true);
        pluginGeneratedSerialDescriptor.addElement("fallback", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CountdownComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = CountdownComponent.$childSerializers;
        return new KSerializer[]{CountdownComponent$CountdownStyle$$serializer.INSTANCE, kSerializerArr[1], StackComponent$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(StackComponent$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StackComponent$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CountdownComponent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        CountdownComponent.CountdownStyle countdownStyle;
        CountdownComponent.CountFrom countFrom;
        StackComponent stackComponent;
        StackComponent stackComponent2;
        StackComponent stackComponent3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = CountdownComponent.$childSerializers;
        CountdownComponent.CountdownStyle countdownStyle2 = null;
        if (beginStructure.decodeSequentially()) {
            CountdownComponent.CountdownStyle countdownStyle3 = (CountdownComponent.CountdownStyle) beginStructure.decodeSerializableElement(descriptor2, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, null);
            CountdownComponent.CountFrom countFrom2 = (CountdownComponent.CountFrom) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            StackComponent stackComponent4 = (StackComponent) beginStructure.decodeSerializableElement(descriptor2, 2, StackComponent$$serializer.INSTANCE, null);
            countFrom = countFrom2;
            countdownStyle = countdownStyle3;
            stackComponent2 = (StackComponent) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StackComponent$$serializer.INSTANCE, null);
            stackComponent3 = (StackComponent) beginStructure.decodeNullableSerializableElement(descriptor2, 4, StackComponent$$serializer.INSTANCE, null);
            stackComponent = stackComponent4;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            CountdownComponent.CountFrom countFrom3 = null;
            StackComponent stackComponent5 = null;
            StackComponent stackComponent6 = null;
            StackComponent stackComponent7 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    countdownStyle2 = (CountdownComponent.CountdownStyle) beginStructure.decodeSerializableElement(descriptor2, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, countdownStyle2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    countFrom3 = (CountdownComponent.CountFrom) beginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], countFrom3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    stackComponent5 = (StackComponent) beginStructure.decodeSerializableElement(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent5);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    stackComponent6 = (StackComponent) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StackComponent$$serializer.INSTANCE, stackComponent6);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    stackComponent7 = (StackComponent) beginStructure.decodeNullableSerializableElement(descriptor2, 4, StackComponent$$serializer.INSTANCE, stackComponent7);
                    i2 |= 16;
                }
            }
            i = i2;
            countdownStyle = countdownStyle2;
            countFrom = countFrom3;
            stackComponent = stackComponent5;
            stackComponent2 = stackComponent6;
            stackComponent3 = stackComponent7;
        }
        beginStructure.endStructure(descriptor2);
        return new CountdownComponent(i, countdownStyle, countFrom, stackComponent, stackComponent2, stackComponent3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CountdownComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CountdownComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
