package com.revenuecat.purchases.paywalls.components;

import androidx.compose.material.OutlinedTextFieldKt;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: VideoComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/VideoComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/VideoComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class VideoComponent$$serializer implements GeneratedSerializer<VideoComponent> {
    public static final VideoComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoComponent$$serializer videoComponent$$serializer = new VideoComponent$$serializer();
        INSTANCE = videoComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("video", videoComponent$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("source", false);
        pluginGeneratedSerialDescriptor.addElement("fallback_source", false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.VISIBLE, false);
        pluginGeneratedSerialDescriptor.addElement("show_controls", false);
        pluginGeneratedSerialDescriptor.addElement("auto_play", false);
        pluginGeneratedSerialDescriptor.addElement("loop", false);
        pluginGeneratedSerialDescriptor.addElement("mute_audio", false);
        pluginGeneratedSerialDescriptor.addElement("size", false);
        pluginGeneratedSerialDescriptor.addElement("fit_mode", false);
        pluginGeneratedSerialDescriptor.addElement("mask_shape", false);
        pluginGeneratedSerialDescriptor.addElement("color_overlay", false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.PADDING, false);
        pluginGeneratedSerialDescriptor.addElement(ViewProps.MARGIN, false);
        pluginGeneratedSerialDescriptor.addElement(OutlinedTextFieldKt.BorderId, false);
        pluginGeneratedSerialDescriptor.addElement("shadow", false);
        pluginGeneratedSerialDescriptor.addElement("overrides", false);
        pluginGeneratedSerialDescriptor.addElement("override_source_lid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = VideoComponent.$childSerializers;
        return new KSerializer[]{ThemeVideoUrls$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(ThemeImageUrls$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, Size$$serializer.INSTANCE, FitModeDeserializer.INSTANCE, BuiltinSerializersKt.getNullable(MaskShapeDeserializer.INSTANCE), BuiltinSerializersKt.getNullable(ColorScheme$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Padding$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Padding$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Border$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Shadow$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[15]), BuiltinSerializersKt.getNullable(LocalizationKey$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public VideoComponent deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Padding padding;
        List list;
        Shadow shadow;
        Border border;
        Padding padding2;
        FitMode fitMode;
        Size size;
        MaskShape maskShape;
        int i;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        ThemeImageUrls themeImageUrls;
        ColorScheme colorScheme;
        ThemeVideoUrls themeVideoUrls;
        Boolean bool;
        boolean z5;
        char c;
        int i2;
        boolean z6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = VideoComponent.$childSerializers;
        int i3 = 10;
        char c2 = '\t';
        char c3 = '\b';
        Padding padding3 = null;
        if (beginStructure.decodeSequentially()) {
            ThemeVideoUrls themeVideoUrls2 = (ThemeVideoUrls) beginStructure.decodeSerializableElement(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, null);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 3);
            boolean decodeBooleanElement2 = beginStructure.decodeBooleanElement(descriptor2, 4);
            boolean decodeBooleanElement3 = beginStructure.decodeBooleanElement(descriptor2, 5);
            boolean decodeBooleanElement4 = beginStructure.decodeBooleanElement(descriptor2, 6);
            Size size2 = (Size) beginStructure.decodeSerializableElement(descriptor2, 7, Size$$serializer.INSTANCE, null);
            FitMode fitMode2 = (FitMode) beginStructure.decodeSerializableElement(descriptor2, 8, FitModeDeserializer.INSTANCE, null);
            MaskShape maskShape2 = (MaskShape) beginStructure.decodeNullableSerializableElement(descriptor2, 9, MaskShapeDeserializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, 10, ColorScheme$$serializer.INSTANCE, null);
            Padding padding4 = (Padding) beginStructure.decodeNullableSerializableElement(descriptor2, 11, Padding$$serializer.INSTANCE, null);
            Padding padding5 = (Padding) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Padding$$serializer.INSTANCE, null);
            Border border2 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 13, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 14, Shadow$$serializer.INSTANCE, null);
            List list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 15, kSerializerArr[15], null);
            LocalizationKey localizationKey = (LocalizationKey) beginStructure.decodeNullableSerializableElement(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, null);
            bool = bool2;
            str = localizationKey != null ? localizationKey.m10699unboximpl() : null;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            fitMode = fitMode2;
            shadow = shadow2;
            border = border2;
            list = list2;
            padding2 = padding5;
            padding = padding4;
            themeImageUrls = themeImageUrls2;
            z = decodeBooleanElement;
            size = size2;
            z2 = decodeBooleanElement4;
            z3 = decodeBooleanElement3;
            z4 = decodeBooleanElement2;
            i = 131071;
            themeVideoUrls = themeVideoUrls2;
        } else {
            boolean z7 = true;
            int i4 = 0;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            Padding padding6 = null;
            List list3 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            FitMode fitMode3 = null;
            Size size3 = null;
            ColorScheme colorScheme3 = null;
            MaskShape maskShape3 = null;
            ThemeVideoUrls themeVideoUrls3 = null;
            Boolean bool3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            String str2 = null;
            while (z7) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i4 = i4;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 0:
                        themeVideoUrls3 = (ThemeVideoUrls) beginStructure.decodeSerializableElement(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls3);
                        i4 |= 1;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) beginStructure.decodeNullableSerializableElement(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i4 |= 2;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 2:
                        bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 2, BooleanSerializer.INSTANCE, bool3);
                        i4 |= 4;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 3:
                        z8 = beginStructure.decodeBooleanElement(descriptor2, 3);
                        i4 |= 8;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 4:
                        z11 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i4 |= 16;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 5:
                        z10 = beginStructure.decodeBooleanElement(descriptor2, 5);
                        i4 |= 32;
                        i3 = 10;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 6:
                        c = 7;
                        z9 = beginStructure.decodeBooleanElement(descriptor2, 6);
                        i4 |= 64;
                        i3 = 10;
                        c2 = '\t';
                        z7 = z7;
                        c3 = '\b';
                    case 7:
                        c = 7;
                        size3 = (Size) beginStructure.decodeSerializableElement(descriptor2, 7, Size$$serializer.INSTANCE, size3);
                        i4 |= 128;
                        i3 = 10;
                        c2 = '\t';
                        z7 = z7;
                        c3 = '\b';
                    case 8:
                        fitMode3 = (FitMode) beginStructure.decodeSerializableElement(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode3);
                        i4 |= 256;
                        c3 = '\b';
                        i3 = 10;
                        c2 = '\t';
                    case 9:
                        maskShape3 = (MaskShape) beginStructure.decodeNullableSerializableElement(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i4 |= 512;
                        c2 = '\t';
                        i3 = 10;
                        z6 = z7;
                        z7 = z6;
                        c3 = '\b';
                    case 10:
                        colorScheme3 = (ColorScheme) beginStructure.decodeNullableSerializableElement(descriptor2, i3, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i4 |= 1024;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 11:
                        padding6 = (Padding) beginStructure.decodeNullableSerializableElement(descriptor2, 11, Padding$$serializer.INSTANCE, padding6);
                        i4 |= 2048;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 12:
                        padding3 = (Padding) beginStructure.decodeNullableSerializableElement(descriptor2, 12, Padding$$serializer.INSTANCE, padding3);
                        i4 |= 4096;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 13:
                        border3 = (Border) beginStructure.decodeNullableSerializableElement(descriptor2, 13, Border$$serializer.INSTANCE, border3);
                        i4 |= 8192;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 14:
                        shadow3 = (Shadow) beginStructure.decodeNullableSerializableElement(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow3);
                        i4 |= 16384;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 15:
                        list3 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 15, kSerializerArr[15], list3);
                        i2 = 32768;
                        i4 |= i2;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    case 16:
                        LocalizationKey localizationKey2 = (LocalizationKey) beginStructure.decodeNullableSerializableElement(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, str2 != null ? LocalizationKey.m10693boximpl(str2) : null);
                        str2 = localizationKey2 != null ? localizationKey2.m10699unboximpl() : null;
                        i2 = 65536;
                        i4 |= i2;
                        z5 = z7;
                        c2 = '\t';
                        z6 = z5;
                        z7 = z6;
                        c3 = '\b';
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            ThemeVideoUrls themeVideoUrls4 = themeVideoUrls3;
            Boolean bool4 = bool3;
            ThemeImageUrls themeImageUrls4 = themeImageUrls3;
            padding = padding6;
            list = list3;
            shadow = shadow3;
            border = border3;
            padding2 = padding3;
            fitMode = fitMode3;
            size = size3;
            maskShape = maskShape3;
            i = i4;
            z = z8;
            str = str2;
            z2 = z9;
            z3 = z10;
            z4 = z11;
            themeImageUrls = themeImageUrls4;
            colorScheme = colorScheme3;
            themeVideoUrls = themeVideoUrls4;
            bool = bool4;
        }
        beginStructure.endStructure(descriptor2);
        return new VideoComponent(i, themeVideoUrls, themeImageUrls, bool, z, z4, z3, z2, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, str, null, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, VideoComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        VideoComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
