package com.revenuecat.purchases.paywalls.components;

import androidx.compose.material.OutlinedTextFieldKt;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import io.intercom.android.sdk.metrics.MetricTracker;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StackComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/StackComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class StackComponent$$serializer implements GeneratedSerializer<StackComponent> {
    public static final StackComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(StackTraceHelper.STACK_KEY, stackComponent$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("components", false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.VISIBLE, true);
        pluginGeneratedSerialDescriptor.addElement("dimension", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("spacing", true);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement(AppStateModule.APP_STATE_BACKGROUND, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.PADDING, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.MARGIN, true);
        pluginGeneratedSerialDescriptor.addElement("shape", true);
        pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, true);
        pluginGeneratedSerialDescriptor.addElement("shadow", true);
        pluginGeneratedSerialDescriptor.addElement(MetricTracker.Object.BADGE, true);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.OVERFLOW, true);
        pluginGeneratedSerialDescriptor.addElement("overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StackComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = StackComponent.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), kSerializerArr[2], Size$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ColorScheme$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BackgroundDeserializer.INSTANCE), Padding$$serializer.INSTANCE, Padding$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ShapeDeserializer.INSTANCE), BuiltinSerializersKt.getNullable(Border$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Shadow$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Badge$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StackOverflowDeserializer.INSTANCE), kSerializerArr[14]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StackComponent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Float f;
        int i;
        Badge badge;
        List list;
        Shadow shadow;
        Border border;
        List list2;
        StackComponent.Overflow overflow;
        Padding padding;
        Shape shape;
        ColorScheme colorScheme;
        Boolean bool;
        Background background;
        Size size;
        Padding padding2;
        Dimension dimension;
        List list3;
        List list4;
        Boolean bool2;
        Boolean bool3;
        List list5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = StackComponent.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            Boolean bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, null);
            Dimension dimension2 = (Dimension) beginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            Size size2 = (Size) beginStructure.decodeSerializableElement(descriptor2, 3, Size$$serializer.INSTANCE, null);
            Float f2 = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 4, FloatSerializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, 5, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) beginStructure.decodeNullableSerializableElement(descriptor2, 6, BackgroundDeserializer.INSTANCE, null);
            Padding padding3 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 7, Padding$$serializer.INSTANCE, null);
            Padding padding4 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 8, Padding$$serializer.INSTANCE, null);
            Shape shape2 = (Shape) beginStructure.decodeNullableSerializableElement(descriptor2, 9, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 10, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 11, Shadow$$serializer.INSTANCE, null);
            Badge badge2 = (Badge) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Badge$$serializer.INSTANCE, null);
            i = 32767;
            background = background2;
            dimension = dimension2;
            padding = padding4;
            colorScheme = colorScheme2;
            size = size2;
            f = f2;
            overflow = (StackComponent.Overflow) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StackOverflowDeserializer.INSTANCE, null);
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 14, kSerializerArr[14], null);
            padding2 = padding3;
            badge = badge2;
            shadow = shadow2;
            bool = bool4;
            border = border2;
            shape = shape2;
        } else {
            int i2 = 14;
            boolean z = true;
            List list6 = null;
            Dimension dimension3 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Background background3 = null;
            f = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            Badge badge3 = null;
            StackComponent.Overflow overflow2 = null;
            List list7 = null;
            int i3 = 2;
            i = 0;
            Boolean bool5 = null;
            Size size3 = null;
            while (z) {
                int i4 = i2;
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        list3 = list6;
                        list4 = list7;
                        bool2 = bool5;
                        z = false;
                        bool5 = bool2;
                        i2 = 14;
                        i3 = 2;
                        list7 = list4;
                        list6 = list3;
                    case 0:
                        list3 = list6;
                        List list8 = list7;
                        bool2 = bool5;
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], list8);
                        i |= 1;
                        bool5 = bool2;
                        i2 = 14;
                        i3 = 2;
                        list7 = list4;
                        list6 = list3;
                    case 1:
                        bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 1, BooleanSerializer.INSTANCE, bool5);
                        i |= 2;
                        list6 = list6;
                        badge3 = badge3;
                        i2 = 14;
                        i3 = 2;
                    case 2:
                        bool3 = bool5;
                        list5 = list6;
                        dimension3 = (Dimension) beginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], dimension3);
                        i |= 4;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 3:
                        bool3 = bool5;
                        list5 = list6;
                        size3 = (Size) beginStructure.decodeSerializableElement(descriptor2, 3, Size$$serializer.INSTANCE, size3);
                        i |= 8;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 4:
                        bool3 = bool5;
                        list5 = list6;
                        f = (Float) beginStructure.decodeNullableSerializableElement(descriptor2, 4, FloatSerializer.INSTANCE, f);
                        i |= 16;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 5:
                        bool3 = bool5;
                        list5 = list6;
                        colorScheme3 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i |= 32;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 6:
                        bool3 = bool5;
                        list5 = list6;
                        background3 = (Background) beginStructure.decodeNullableSerializableElement(descriptor2, 6, BackgroundDeserializer.INSTANCE, background3);
                        i |= 64;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 7:
                        bool3 = bool5;
                        list5 = list6;
                        padding6 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i |= 128;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 8:
                        bool3 = bool5;
                        list5 = list6;
                        padding5 = (Padding) beginStructure.decodeSerializableElement(descriptor2, 8, Padding$$serializer.INSTANCE, padding5);
                        i |= 256;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 9:
                        bool3 = bool5;
                        list5 = list6;
                        shape3 = (Shape) beginStructure.decodeNullableSerializableElement(descriptor2, 9, ShapeDeserializer.INSTANCE, shape3);
                        i |= 512;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 10:
                        bool3 = bool5;
                        list5 = list6;
                        border3 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 10, Border$$serializer.INSTANCE, border3);
                        i |= 1024;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 11:
                        bool3 = bool5;
                        list5 = list6;
                        shadow3 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 11, Shadow$$serializer.INSTANCE, shadow3);
                        i |= 2048;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 12:
                        bool3 = bool5;
                        badge3 = (Badge) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Badge$$serializer.INSTANCE, badge3);
                        i |= 4096;
                        list6 = list6;
                        overflow2 = overflow2;
                        bool5 = bool3;
                        i2 = 14;
                    case 13:
                        bool3 = bool5;
                        list5 = list6;
                        overflow2 = (StackComponent.Overflow) beginStructure.decodeNullableSerializableElement(descriptor2, 13, StackOverflowDeserializer.INSTANCE, overflow2);
                        i |= 8192;
                        list6 = list5;
                        bool5 = bool3;
                        i2 = 14;
                    case 14:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, i4, kSerializerArr[i4], list6);
                        i |= 16384;
                        i2 = i4;
                        bool5 = bool5;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            List list9 = list6;
            badge = badge3;
            list = list7;
            shadow = shadow3;
            border = border3;
            list2 = list9;
            overflow = overflow2;
            padding = padding5;
            shape = shape3;
            colorScheme = colorScheme3;
            bool = bool5;
            background = background3;
            size = size3;
            padding2 = padding6;
            dimension = dimension3;
        }
        int i5 = i;
        beginStructure.endStructure(descriptor2);
        return new StackComponent(i5, list, bool, dimension, size, f, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow, list2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, StackComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        StackComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
