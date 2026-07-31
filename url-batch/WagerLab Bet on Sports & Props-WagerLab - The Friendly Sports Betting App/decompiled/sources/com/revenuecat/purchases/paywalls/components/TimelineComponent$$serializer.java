package com.revenuecat.purchases.paywalls.components;

import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TimelineComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class TimelineComponent$$serializer implements GeneratedSerializer<TimelineComponent> {
    public static final TimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TimelineComponent$$serializer timelineComponent$$serializer = new TimelineComponent$$serializer();
        INSTANCE = timelineComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("timeline", timelineComponent$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("item_spacing", false);
        pluginGeneratedSerialDescriptor.addElement("text_spacing", false);
        pluginGeneratedSerialDescriptor.addElement("column_gutter", false);
        pluginGeneratedSerialDescriptor.addElement("icon_alignment", false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.VISIBLE, true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.PADDING, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.MARGIN, true);
        pluginGeneratedSerialDescriptor.addElement("items", true);
        pluginGeneratedSerialDescriptor.addElement("overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TimelineComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TimelineComponent.$childSerializers;
        return new KSerializer[]{IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, TimelineIconAlignmentDeserializer.INSTANCE, BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), Size$$serializer.INSTANCE, Padding$$serializer.INSTANCE, Padding$$serializer.INSTANCE, kSerializerArr[8], kSerializerArr[9]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public TimelineComponent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        int i2;
        Boolean bool;
        TimelineComponent.IconAlignment iconAlignment;
        Padding padding;
        Size size;
        int i3;
        Padding padding2;
        int i4;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = TimelineComponent.$childSerializers;
        int i5 = 9;
        if (beginStructure.decodeSequentially()) {
            i = beginStructure.decodeIntElement(descriptor2, 0);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 1);
            i3 = beginStructure.decodeIntElement(descriptor2, 2);
            TimelineComponent.IconAlignment iconAlignment2 = (TimelineComponent.IconAlignment) beginStructure.decodeSerializableElement(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, null);
            Boolean bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, null);
            Size size2 = (Size) beginStructure.decodeSerializableElement(descriptor2, 5, Size$$serializer.INSTANCE, null);
            Padding padding3 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 6, Padding$$serializer.INSTANCE, null);
            Padding padding4 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 7, Padding$$serializer.INSTANCE, null);
            List list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            padding2 = padding4;
            padding = padding3;
            list = list3;
            bool = bool2;
            i4 = decodeIntElement;
            size = size2;
            i2 = 1023;
            iconAlignment = iconAlignment2;
        } else {
            boolean z = true;
            i = 0;
            int i6 = 0;
            int i7 = 0;
            List list4 = null;
            List list5 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Size size3 = null;
            Boolean bool3 = null;
            int i8 = 0;
            TimelineComponent.IconAlignment iconAlignment3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 9;
                    case 0:
                        i6 |= 1;
                        i = beginStructure.decodeIntElement(descriptor2, 0);
                        i5 = 9;
                    case 1:
                        i7 = beginStructure.decodeIntElement(descriptor2, 1);
                        i6 |= 2;
                        i5 = 9;
                    case 2:
                        i8 = beginStructure.decodeIntElement(descriptor2, 2);
                        i6 |= 4;
                        i5 = 9;
                    case 3:
                        iconAlignment3 = (TimelineComponent.IconAlignment) beginStructure.decodeSerializableElement(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment3);
                        i6 |= 8;
                        i5 = 9;
                    case 4:
                        bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 4, BooleanSerializer.INSTANCE, bool3);
                        i6 |= 16;
                        i5 = 9;
                    case 5:
                        size3 = (Size) beginStructure.decodeSerializableElement(descriptor2, 5, Size$$serializer.INSTANCE, size3);
                        i6 |= 32;
                        i5 = 9;
                    case 6:
                        padding5 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i6 |= 64;
                        i5 = 9;
                    case 7:
                        padding6 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i6 |= 128;
                        i5 = 9;
                    case 8:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], list5);
                        i6 |= 256;
                    case 9:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], list4);
                        i6 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            int i9 = i6;
            list = list5;
            i2 = i9;
            bool = bool3;
            iconAlignment = iconAlignment3;
            padding = padding5;
            size = size3;
            i3 = i8;
            padding2 = padding6;
            i4 = i7;
            list2 = list4;
        }
        beginStructure.endStructure(descriptor2);
        return new TimelineComponent(i2, i, i4, i3, iconAlignment, bool, size, padding, padding2, list, list2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, TimelineComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        TimelineComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
