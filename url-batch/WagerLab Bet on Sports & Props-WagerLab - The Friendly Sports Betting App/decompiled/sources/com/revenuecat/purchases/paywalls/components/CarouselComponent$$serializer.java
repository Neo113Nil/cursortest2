package com.revenuecat.purchases.paywalls.components;

import androidx.compose.material.OutlinedTextFieldKt;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CarouselComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class CarouselComponent$$serializer implements GeneratedSerializer<CarouselComponent> {
    public static final CarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CarouselComponent$$serializer carouselComponent$$serializer = new CarouselComponent$$serializer();
        INSTANCE = carouselComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("carousel", carouselComponent$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("pages", false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.VISIBLE, true);
        pluginGeneratedSerialDescriptor.addElement("initial_page_index", true);
        pluginGeneratedSerialDescriptor.addElement("page_alignment", false);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("page_peek", true);
        pluginGeneratedSerialDescriptor.addElement("page_spacing", true);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement(AppStateModule.APP_STATE_BACKGROUND, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.PADDING, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.MARGIN, true);
        pluginGeneratedSerialDescriptor.addElement("shape", true);
        pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, true);
        pluginGeneratedSerialDescriptor.addElement("shadow", true);
        pluginGeneratedSerialDescriptor.addElement("page_control", true);
        pluginGeneratedSerialDescriptor.addElement("loop", true);
        pluginGeneratedSerialDescriptor.addElement("auto_advance", true);
        pluginGeneratedSerialDescriptor.addElement("overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CarouselComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = CarouselComponent.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), VerticalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ColorScheme$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BackgroundDeserializer.INSTANCE), Padding$$serializer.INSTANCE, Padding$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ShapeDeserializer.INSTANCE), BuiltinSerializersKt.getNullable(Border$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Shadow$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CarouselComponent$PageControl$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE), kSerializerArr[17]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public CarouselComponent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Size size;
        int i;
        Shape shape;
        CarouselComponent.AutoAdvancePages autoAdvancePages;
        Boolean bool;
        CarouselComponent.PageControl pageControl;
        Border border;
        List list;
        Background background;
        ColorScheme colorScheme;
        Float f;
        Boolean bool2;
        Shadow shadow;
        VerticalAlignment verticalAlignment;
        Integer num;
        Padding padding;
        Padding padding2;
        List list2;
        Integer num2;
        Boolean bool3;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        List list3;
        Boolean bool4;
        List list4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = CarouselComponent.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            List list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            Boolean bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, null);
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, null);
            VerticalAlignment verticalAlignment2 = (VerticalAlignment) beginStructure.decodeSerializableElement(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, null);
            Size size2 = (Size) beginStructure.decodeSerializableElement(descriptor2, 4, Size$$serializer.INSTANCE, null);
            Integer num4 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 5, IntSerializer.INSTANCE, null);
            Float f2 = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 6, FloatSerializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, 7, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) beginStructure.decodeNullableSerializableElement(descriptor2, 8, BackgroundDeserializer.INSTANCE, null);
            Padding padding3 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 9, Padding$$serializer.INSTANCE, null);
            Padding padding4 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 10, Padding$$serializer.INSTANCE, null);
            shape = (Shape) beginStructure.decodeNullableSerializableElement(descriptor2, 11, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 13, Shadow$$serializer.INSTANCE, null);
            CarouselComponent.PageControl pageControl2 = (CarouselComponent.PageControl) beginStructure.decodeNullableSerializableElement(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, null);
            Boolean bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 15, BooleanSerializer.INSTANCE, null);
            i = 262143;
            autoAdvancePages = (CarouselComponent.AutoAdvancePages) beginStructure.decodeNullableSerializableElement(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, null);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 17, kSerializerArr[17], null);
            padding2 = padding3;
            num2 = num4;
            bool = bool6;
            pageControl = pageControl2;
            shadow = shadow2;
            border = border2;
            verticalAlignment = verticalAlignment2;
            list2 = list5;
            padding = padding4;
            colorScheme = colorScheme2;
            f = f2;
            background = background2;
            size = size2;
            num = num3;
            bool2 = bool5;
        } else {
            int i2 = 17;
            int i3 = 0;
            int i4 = 1;
            List list6 = null;
            Integer num5 = null;
            VerticalAlignment verticalAlignment3 = null;
            Integer num6 = null;
            Shape shape2 = null;
            Padding padding5 = null;
            Background background3 = null;
            ColorScheme colorScheme3 = null;
            Float f3 = null;
            size = null;
            Padding padding6 = null;
            Border border3 = null;
            Shadow shadow3 = null;
            CarouselComponent.PageControl pageControl3 = null;
            Boolean bool7 = null;
            CarouselComponent.AutoAdvancePages autoAdvancePages3 = null;
            List list7 = null;
            i = 0;
            Boolean bool8 = null;
            while (i4 != 0) {
                int i5 = i2;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        autoAdvancePages2 = autoAdvancePages3;
                        list3 = list6;
                        i4 = i3;
                        bool8 = bool8;
                        i2 = 17;
                        i3 = i4;
                        list6 = list3;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 0:
                        autoAdvancePages2 = autoAdvancePages3;
                        list3 = list6;
                        Boolean bool9 = bool8;
                        KSerializer kSerializer = kSerializerArr[i3];
                        int i6 = i3;
                        list7 = (List) beginStructure.decodeSerializableElement(descriptor2, i6, kSerializer, list7);
                        i |= 1;
                        bool8 = bool9;
                        i2 = 17;
                        i3 = i6;
                        list6 = list3;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 1:
                        autoAdvancePages2 = autoAdvancePages3;
                        i |= 2;
                        bool8 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, bool8);
                        border3 = border3;
                        list6 = list6;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 2:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        num6 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 2, IntSerializer.INSTANCE, num6);
                        i |= 4;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 3:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        verticalAlignment3 = (VerticalAlignment) beginStructure.decodeSerializableElement(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment3);
                        i |= 8;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 4:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        size = (Size) beginStructure.decodeSerializableElement(descriptor2, 4, Size$$serializer.INSTANCE, size);
                        i |= 16;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 5:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        num5 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 5, IntSerializer.INSTANCE, num5);
                        i |= 32;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 6:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        f3 = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 6, FloatSerializer.INSTANCE, f3);
                        i |= 64;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 7:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        colorScheme3 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, 7, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i |= 128;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 8:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        background3 = (Background) beginStructure.decodeNullableSerializableElement(descriptor2, 8, BackgroundDeserializer.INSTANCE, background3);
                        i |= 256;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 9:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        padding6 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 9, Padding$$serializer.INSTANCE, padding6);
                        i |= 512;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 10:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        padding5 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 10, Padding$$serializer.INSTANCE, padding5);
                        i |= 1024;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 11:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        shape2 = (Shape) beginStructure.decodeNullableSerializableElement(descriptor2, 11, ShapeDeserializer.INSTANCE, shape2);
                        i |= 2048;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 12:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        border3 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Border$$serializer.INSTANCE, border3);
                        i |= 4096;
                        shadow3 = shadow3;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 13:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        shadow3 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 13, Shadow$$serializer.INSTANCE, shadow3);
                        i |= 8192;
                        pageControl3 = pageControl3;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 14:
                        bool4 = bool8;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        pageControl3 = (CarouselComponent.PageControl) beginStructure.decodeNullableSerializableElement(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl3);
                        i |= 16384;
                        bool7 = bool7;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 15:
                        bool4 = bool8;
                        CarouselComponent.AutoAdvancePages autoAdvancePages4 = autoAdvancePages3;
                        list4 = list6;
                        autoAdvancePages2 = autoAdvancePages4;
                        bool7 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 15, BooleanSerializer.INSTANCE, bool7);
                        i |= 32768;
                        list6 = list4;
                        bool8 = bool4;
                        i2 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                    case 16:
                        bool3 = bool8;
                        i |= 65536;
                        list6 = list6;
                        i2 = 17;
                        autoAdvancePages3 = (CarouselComponent.AutoAdvancePages) beginStructure.decodeNullableSerializableElement(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages3);
                        bool8 = bool3;
                    case 17:
                        bool3 = bool8;
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], list6);
                        i |= 131072;
                        i2 = i5;
                        bool8 = bool3;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            shape = shape2;
            autoAdvancePages = autoAdvancePages3;
            bool = bool7;
            pageControl = pageControl3;
            border = border3;
            list = list6;
            background = background3;
            colorScheme = colorScheme3;
            f = f3;
            bool2 = bool8;
            shadow = shadow3;
            verticalAlignment = verticalAlignment3;
            num = num6;
            padding = padding5;
            padding2 = padding6;
            list2 = list7;
            num2 = num5;
        }
        beginStructure.endStructure(descriptor2);
        return new CarouselComponent(i, list2, bool2, num, verticalAlignment, size, num2, f, colorScheme, background, padding2, padding, shape, border, shadow, pageControl, bool, autoAdvancePages, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, CarouselComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        CarouselComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
