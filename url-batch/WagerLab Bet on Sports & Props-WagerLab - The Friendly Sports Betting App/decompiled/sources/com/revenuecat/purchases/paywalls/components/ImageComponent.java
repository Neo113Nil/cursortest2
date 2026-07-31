package com.revenuecat.purchases.paywalls.components;

import androidx.compose.material.OutlinedTextFieldKt;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
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
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ImageComponent.kt */
@SerialName("image")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u0001:\u0002GHB¥\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a¢\u0006\u0002\u0010 J&\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÁ\u0001¢\u0006\u0002\bFR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010$\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010$\u001a\u0004\b-\u0010.R&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u00102\u0012\u0004\b/\u0010$\u001a\u0004\b0\u00101R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "seen1", "", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", ViewProps.VISIBLE, "", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", ViewProps.PADDING, "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", ViewProps.MARGIN, OutlinedTextFieldKt.BorderId, "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "overrides", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getColorOverlay$annotations", "()V", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getFitMode$annotations", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getMargin", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMaskShape$annotations", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getOverrideSourceLid-sa7TU9Q$annotations", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "Ljava/lang/String;", "getOverrides", "()Ljava/util/List;", "getPadding", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$purchases_defaultsBc8Release", "$serializer", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final class ImageComponent implements PaywallComponent {
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final List<ComponentOverride<PartialImageComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ComponentOverride.INSTANCE.serializer(PartialImageComponent$$serializer.INSTANCE))};

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, @SerialName("override_source_lid") String str, @SerialName("mask_shape") MaskShape maskShape, @SerialName("color_overlay") ColorScheme colorScheme, @SerialName("fit_mode") FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, (List<ComponentOverride<PartialImageComponent>>) list, serializationConstructorMarker);
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, list);
    }

    @SerialName("color_overlay")
    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    @SerialName("fit_mode")
    public static /* synthetic */ void getFitMode$annotations() {
    }

    @SerialName("mask_shape")
    public static /* synthetic */ void getMaskShape$annotations() {
    }

    @SerialName("override_source_lid")
    /* renamed from: getOverrideSourceLid-sa7TU9Q$annotations, reason: not valid java name */
    public static /* synthetic */ void m10635getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public boolean equals(Object obj) {
        boolean m10696equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageComponent)) {
            return false;
        }
        ImageComponent imageComponent = (ImageComponent) obj;
        if (!Intrinsics.areEqual(this.source, imageComponent.source) || !Intrinsics.areEqual(this.visible, imageComponent.visible) || !Intrinsics.areEqual(this.size, imageComponent.size)) {
            return false;
        }
        String str = this.overrideSourceLid;
        String str2 = imageComponent.overrideSourceLid;
        if (str == null) {
            if (str2 == null) {
                m10696equalsimpl0 = true;
            }
            m10696equalsimpl0 = false;
        } else {
            if (str2 != null) {
                m10696equalsimpl0 = LocalizationKey.m10696equalsimpl0(str, str2);
            }
            m10696equalsimpl0 = false;
        }
        return m10696equalsimpl0 && Intrinsics.areEqual(this.maskShape, imageComponent.maskShape) && Intrinsics.areEqual(this.colorOverlay, imageComponent.colorOverlay) && this.fitMode == imageComponent.fitMode && Intrinsics.areEqual(this.padding, imageComponent.padding) && Intrinsics.areEqual(this.margin, imageComponent.margin) && Intrinsics.areEqual(this.border, imageComponent.border) && Intrinsics.areEqual(this.shadow, imageComponent.shadow) && Intrinsics.areEqual(this.overrides, imageComponent.overrides);
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        Boolean bool = this.visible;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.size.hashCode()) * 31;
        String str = this.overrideSourceLid;
        int m10697hashCodeimpl = (hashCode2 + (str == null ? 0 : LocalizationKey.m10697hashCodeimpl(str))) * 31;
        MaskShape maskShape = this.maskShape;
        int hashCode3 = (m10697hashCodeimpl + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode4 = (((((((hashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.fitMode.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Border border = this.border;
        int hashCode5 = (hashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return ((hashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageComponent(source=");
        StringBuilder append = sb.append(this.source).append(", visible=").append(this.visible).append(", size=").append(this.size).append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        append.append((Object) (str == null ? "null" : LocalizationKey.m10698toStringimpl(str))).append(", maskShape=").append(this.maskShape).append(", colorOverlay=").append(this.colorOverlay).append(", fitMode=").append(this.fitMode).append(", padding=").append(this.padding).append(", margin=").append(this.margin).append(", border=").append(this.border).append(", shadow=").append(this.shadow).append(", overrides=");
        sb.append(this.overrides).append(')');
        return sb.toString();
    }

    /* compiled from: ImageComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ImageComponent> serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }
    }

    private ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeImageUrls;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 4) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i & 16) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 32) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 64) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 128) == 0) {
            this.padding = Padding.INSTANCE.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 256) == 0) {
            this.margin = Padding.INSTANCE.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 512) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 2048) == 0) {
            this.overrides = CollectionsKt.emptyList();
        } else {
            this.overrides = list;
        }
    }

    private ImageComponent(ThemeImageUrls source, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding margin, Border border, Shadow shadow, List<ComponentOverride<PartialImageComponent>> overrides) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(fitMode, "fitMode");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.source = source;
        this.visible = bool;
        this.size = size;
        this.overrideSourceLid = str;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode;
        this.padding = padding;
        this.margin = margin;
        this.border = border;
        this.shadow = shadow;
        this.overrides = overrides;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ImageComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ThemeImageUrls$$serializer.INSTANCE, self.source);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.visible != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.visible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            output.encodeSerializableElement(serialDesc, 2, Size$$serializer.INSTANCE, self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = self.overrideSourceLid;
            output.encodeNullableSerializableElement(serialDesc, 3, localizationKey$$serializer, str != null ? LocalizationKey.m10693boximpl(str) : null);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.maskShape != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MaskShapeDeserializer.INSTANCE, self.maskShape);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.colorOverlay != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fitMode != FitMode.FIT) {
            output.encodeSerializableElement(serialDesc, 6, FitModeDeserializer.INSTANCE, self.fitMode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.padding, Padding.INSTANCE.getZero())) {
            output.encodeSerializableElement(serialDesc, 7, Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.margin, Padding.INSTANCE.getZero())) {
            output.encodeSerializableElement(serialDesc, 8, Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.border != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, Border$$serializer.INSTANCE, self.border);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.shadow != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && Intrinsics.areEqual(self.overrides, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 11, kSerializerArr[11], self.overrides);
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(themeImageUrls, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : maskShape, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? FitMode.FIT : fitMode, (i & 128) != 0 ? Padding.INSTANCE.getZero() : padding, (i & 256) != 0 ? Padding.INSTANCE.getZero() : padding2, (i & 512) != 0 ? null : border, (i & 1024) != 0 ? null : shadow, (i & 2048) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* renamed from: getOverrideSourceLid-sa7TU9Q, reason: not valid java name and from getter */
    public final /* synthetic */ String getOverrideSourceLid() {
        return this.overrideSourceLid;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }
}
