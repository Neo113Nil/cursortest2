package io.bidmachine.ads.networks.adaptiverendering;

import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.ProtocolStringList;
import com.ironsource.C4643f8;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.AbstractC6013h;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingFeature;
import io.bidmachine.protobuf.rendering.WatermarkAlgorithm;
import io.bidmachine.protobuf.rendering.WatermarkConfiguration;
import io.bidmachine.protobuf.rendering.WatermarkLocation;
import io.bidmachine.protobuf.rendering.WatermarkPayloadType;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationFunctionType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BackgroundSource;
import io.bidmachine.rendering.model.Base64ResourceSource;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmType;
import io.bidmachine.rendering.model.BrokenCreativeDetectorParams;
import io.bidmachine.rendering.model.CacheType;
import io.bidmachine.rendering.model.Color;
import io.bidmachine.rendering.model.ColorBackgroundSource;
import io.bidmachine.rendering.model.ColorPlaceholderSource;
import io.bidmachine.rendering.model.ColorSource;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.EventParams;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.rendering.model.Gradient;
import io.bidmachine.rendering.model.GradientColorSource;
import io.bidmachine.rendering.model.GradientDirection;
import io.bidmachine.rendering.model.GradientType;
import io.bidmachine.rendering.model.HorizontalGravity;
import io.bidmachine.rendering.model.HtmlResourceSource;
import io.bidmachine.rendering.model.Image;
import io.bidmachine.rendering.model.ImageBackgroundSource;
import io.bidmachine.rendering.model.ImagePlaceholderSource;
import io.bidmachine.rendering.model.MeasurerParams;
import io.bidmachine.rendering.model.MethodParams;
import io.bidmachine.rendering.model.NamePlaceholderSource;
import io.bidmachine.rendering.model.OneColorSource;
import io.bidmachine.rendering.model.Padding;
import io.bidmachine.rendering.model.Placeholder;
import io.bidmachine.rendering.model.PlaceholderSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.ScaleType;
import io.bidmachine.rendering.model.ScriptConfig;
import io.bidmachine.rendering.model.SideBindParams;
import io.bidmachine.rendering.model.SideType;
import io.bidmachine.rendering.model.StopDetectorAfter;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.model.WatermarkParams;
import io.bidmachine.rendering.model.XmlResourceSource;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.util.ColorUtils;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import io.bidmachine.util.visibilitytracking.VisibilityParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtilsKt;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J$\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0007J\u0014\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0018\u0010)\u001a\u0004\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001fH\u0002J\u0014\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0014\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0007J\u0014\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0014\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J \u0010A\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001f2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u001fH\u0007J\u0014\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0014\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010LH\u0002J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001f2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u001fH\u0007J\u001c\u0010Q\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010SH\u0002J\u0010\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006X"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingParams;", "Lio/bidmachine/unified/UnifiedParams;", "unifiedMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "(Lio/bidmachine/unified/UnifiedMediationParams;)V", "adParams", "Lio/bidmachine/rendering/model/AdParams;", "getAdParams", "()Lio/bidmachine/rendering/model/AdParams;", "createAdElementParams", "Lio/bidmachine/rendering/model/AdElementParams;", "viewComponent", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent;", "measurerFactory", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "createAdParams", "rendering", "Lio/bidmachine/protobuf/rendering/Rendering;", C4643f8.s, "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "watermarkParams", "Lio/bidmachine/rendering/model/WatermarkParams;", "createAdPhaseParams", "Lio/bidmachine/rendering/model/AdPhaseParams;", "phase", "Lio/bidmachine/protobuf/rendering/Rendering$Phase;", "createAnimationMap", "", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "adaptiveAnimationList", "", "Lio/bidmachine/protobuf/rendering/Rendering$AdaptiveAnimation;", "createAppearanceParams", "Lio/bidmachine/rendering/model/AppearanceParams;", "appearance", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Appearance;", "createBackground", "Lio/bidmachine/rendering/model/Background;", M2.g, "Lio/bidmachine/protobuf/rendering/Rendering$Background;", "createBrokenCreativeDetectorParams", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "featureList", "Lio/bidmachine/protobuf/rendering/RenderingFeature;", "createColor", "Lio/bidmachine/rendering/model/Color;", "color", "Lio/bidmachine/protobuf/rendering/Rendering$Color;", "createElementLayoutParams", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "layout", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Layout;", "createEventParams", "Lio/bidmachine/rendering/model/EventParams;", "event", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$Event;", "createGradient", "Lio/bidmachine/rendering/model/Gradient;", "gradient", "Lio/bidmachine/protobuf/rendering/Rendering$Color$Gradient;", "createImage", "Lio/bidmachine/rendering/model/Image;", "image", "Lio/bidmachine/protobuf/rendering/Rendering$Image;", "createMeasurerParamsList", "Lio/bidmachine/rendering/model/MeasurerParams;", "measurerList", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$Measurer;", "createPlaceholder", "Lio/bidmachine/rendering/model/Placeholder;", "placeholder", "Lio/bidmachine/protobuf/rendering/Rendering$Placeholder;", "createResource", "Lio/bidmachine/rendering/model/Resource;", "resource", "Lio/bidmachine/protobuf/rendering/Rendering$Resource;", "createScriptConfigs", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptsList", "Lio/bidmachine/protobuf/rendering/Rendering$Phase$ViewComponent$ScriptConfig;", "createWatermarkParams", "watermarkConfiguration", "Lio/bidmachine/protobuf/rendering/WatermarkConfiguration;", "isValid", "", "callback", "Lio/bidmachine/unified/UnifiedAdCallback;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class AdaptiveRenderingParams extends UnifiedParams {

    @Nullable
    private final AdParams adParams;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WatermarkAlgorithm.values().length];
            try {
                iArr2[WatermarkAlgorithm.WM_ALGO_RGB_STRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WatermarkPayloadType.values().length];
            try {
                iArr3[WatermarkPayloadType.WM_PAYLOAD_BID_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[WatermarkLocation.values().length];
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.values().length];
            try {
                iArr5[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.INJECT_TIMING_AT_DOCUMENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.INJECT_TIMING_AT_DOCUMENT_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveRenderingParams(@NotNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        AdParams adParams;
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Object objectOrNull = unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION);
        if (!(objectOrNull instanceof Rendering) || objectOrNull == Rendering.getDefaultInstance()) {
            adParams = null;
        } else {
            Rendering rendering = (Rendering) objectOrNull;
            adParams = createAdParams(rendering, VisibilityParams.INSTANCE.getDefault(), createWatermarkParams(unifiedMediationParams, rendering.getWatermarkConfiguration()));
        }
        this.adParams = adParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createAdParams$lambda$0() {
        return "Can't create ViewabilityTrackerParams";
    }

    private final Map<AnimationEventType, AnimationParams> createAnimationMap(List<Rendering.AdaptiveAnimation> adaptiveAnimationList) {
        AnimationParams animationParams;
        HashMap hashMap = new HashMap();
        for (Rendering.AdaptiveAnimation adaptiveAnimation : adaptiveAnimationList) {
            AnimationEventType animationEventType = AnimationEventType.INSTANCE.get(adaptiveAnimation.getEvent());
            if (animationEventType != null) {
                Rendering.AdaptiveAnimation.Style style = adaptiveAnimation.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "it.style");
                if (style.hasFade()) {
                    Rendering.AdaptiveAnimation.FadeAnimationOption fade = style.getFade();
                    Intrinsics.checkNotNullExpressionValue(fade, "style.fade");
                    Rendering.AdaptiveAnimation.Timing timing = fade.getTiming();
                    Intrinsics.checkNotNullExpressionValue(timing, "fadeAnimationOption.timing");
                    animationParams = new AnimationParams(animationEventType, AnimationStyleType.Fade, AnimationFunctionType.INSTANCE.get(timing.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing), null);
                } else if (style.hasSlide()) {
                    Rendering.AdaptiveAnimation.SlideAnimationOption slide = style.getSlide();
                    Intrinsics.checkNotNullExpressionValue(slide, "style.slide");
                    Rendering.AdaptiveAnimation.Timing timing2 = slide.getTiming();
                    Intrinsics.checkNotNullExpressionValue(timing2, "slideAnimationOption.timing");
                    animationParams = new AnimationParams(animationEventType, AnimationStyleType.Slide, AnimationFunctionType.INSTANCE.get(timing2.getFunction()), AdaptiveRenderingParamsKt.getDurationMs(timing2), AnimationDirectionType.INSTANCE.get(slide.getDirection()));
                }
                hashMap.put(animationEventType, animationParams);
            }
        }
        return hashMap;
    }

    private final Background createBackground(Rendering.Background background) {
        BackgroundSource backgroundSource = null;
        if (background == null || background == Rendering.Background.getDefaultInstance()) {
            return null;
        }
        if (background.hasColor()) {
            Color createColor = createColor(background.getColor());
            if (createColor != null) {
                backgroundSource = new ColorBackgroundSource(createColor);
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda1
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createBackground$lambda$18;
                        createBackground$lambda$18 = AdaptiveRenderingParams.createBackground$lambda$18();
                        return createBackground$lambda$18;
                    }
                });
            }
        } else if (background.hasImage()) {
            Image createImage = createImage(background.getImage());
            if (createImage != null) {
                backgroundSource = new ImageBackgroundSource(createImage);
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda2
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createBackground$lambda$19;
                        createBackground$lambda$19 = AdaptiveRenderingParams.createBackground$lambda$19();
                        return createBackground$lambda$19;
                    }
                });
            }
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda3
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createBackground$lambda$20;
                    createBackground$lambda$20 = AdaptiveRenderingParams.createBackground$lambda$20();
                    return createBackground$lambda$20;
                }
            });
        }
        return new Background((float) background.getOpacity(), backgroundSource, createPlaceholder(background.getPlaceholder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$18() {
        return "BackgroundSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$19() {
        return "BackgroundSource don't found. Can't create Image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBackground$lambda$20() {
        return "BackgroundSource don't found. Set one of: color, gradient";
    }

    private final BrokenCreativeDetectorParams createBrokenCreativeDetectorParams(List<RenderingFeature> featureList) {
        Object obj;
        RenderingFeature.BrokenCreativeDetector brokenCreativeDetector;
        if (featureList.isEmpty()) {
            return null;
        }
        Iterator<T> it = featureList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            RenderingFeature renderingFeature = (RenderingFeature) obj;
            if (renderingFeature.hasBrokenCreativeDetector() && renderingFeature.getBrokenCreativeDetector().hasConfiguration()) {
                break;
            }
        }
        RenderingFeature renderingFeature2 = (RenderingFeature) obj;
        RenderingFeature.BrokenCreativeDetector.Configuration configuration = (renderingFeature2 == null || (brokenCreativeDetector = renderingFeature2.getBrokenCreativeDetector()) == null) ? null : brokenCreativeDetector.getConfiguration();
        if (configuration == null) {
            return null;
        }
        List<RenderingFeature.BrokenCreativeDetector.Algorithm> algorithmsList = configuration.getAlgorithmsList();
        Intrinsics.checkNotNullExpressionValue(algorithmsList, "brokenCreativeDetectorConfiguration.algorithmsList");
        ArrayList arrayList = new ArrayList();
        for (RenderingFeature.BrokenCreativeDetector.Algorithm algorithm : algorithmsList) {
            BrokenCreativeAlgorithmType brokenCreativeAlgorithmType = BrokenCreativeAlgorithmType.INSTANCE.get(algorithm.getName());
            BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams = brokenCreativeAlgorithmType == null ? null : new BrokenCreativeAlgorithmParams(brokenCreativeAlgorithmType, (float) algorithm.getThreshold(), (float) algorithm.getWeight());
            if (brokenCreativeAlgorithmParams != null) {
                arrayList.add(brokenCreativeAlgorithmParams);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda14
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createBrokenCreativeDetectorParams$lambda$40;
                    createBrokenCreativeDetectorParams$lambda$40 = AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$40();
                    return createBrokenCreativeDetectorParams$lambda$40;
                }
            });
            return null;
        }
        if (arrayList.size() != algorithmsList.size()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda15
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createBrokenCreativeDetectorParams$lambda$41;
                    createBrokenCreativeDetectorParams$lambda$41 = AdaptiveRenderingParams.createBrokenCreativeDetectorParams$lambda$41();
                    return createBrokenCreativeDetectorParams$lambda$41;
                }
            });
        }
        long timeout = (long) configuration.getTimeout();
        double downscaleFactor = configuration.getDownscaleFactor();
        boolean errorOnly = configuration.getErrorOnly();
        boolean allowDuplicate = configuration.getAllowDuplicate();
        StopDetectorAfter stopDetectorAfter = StopDetectorAfter.INSTANCE.get(configuration.getStopAfter());
        if (stopDetectorAfter == null) {
            stopDetectorAfter = StopDetectorAfter.AnyCreative;
        }
        return new BrokenCreativeDetectorParams(timeout, downscaleFactor, errorOnly, allowDuplicate, stopDetectorAfter, configuration.getWeightThreshold(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$40() {
        return "BrokenCreativeDetector algorithms is empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrokenCreativeDetectorParams$lambda$41() {
        return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
    }

    private final Color createColor(Rendering.Color color) {
        Pair pair;
        if (color == null || color == Rendering.Color.getDefaultInstance()) {
            return null;
        }
        if (color.hasContextColor()) {
            Integer parseColorRGBASafely = ColorUtils.parseColorRGBASafely(color.getContextColor());
            if (parseColorRGBASafely == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda16
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createColor$lambda$21;
                        createColor$lambda$21 = AdaptiveRenderingParams.createColor$lambda$21();
                        return createColor$lambda$21;
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new OneColorSource(parseColorRGBASafely.intValue()), Boolean.TRUE);
        } else if (color.hasContextGradient()) {
            Gradient createGradient = createGradient(color.getContextGradient());
            if (createGradient == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda17
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createColor$lambda$22;
                        createColor$lambda$22 = AdaptiveRenderingParams.createColor$lambda$22();
                        return createColor$lambda$22;
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new GradientColorSource(createGradient), Boolean.TRUE);
        } else if (color.hasColor()) {
            Integer parseColorRGBASafely2 = ColorUtils.parseColorRGBASafely(color.getColor());
            if (parseColorRGBASafely2 == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda18
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createColor$lambda$23;
                        createColor$lambda$23 = AdaptiveRenderingParams.createColor$lambda$23();
                        return createColor$lambda$23;
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new OneColorSource(parseColorRGBASafely2.intValue()), Boolean.FALSE);
        } else if (color.hasGradient()) {
            Gradient createGradient2 = createGradient(color.getGradient());
            if (createGradient2 == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda19
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createColor$lambda$24;
                        createColor$lambda$24 = AdaptiveRenderingParams.createColor$lambda$24();
                        return createColor$lambda$24;
                    }
                });
                return null;
            }
            pair = TuplesKt.to(new GradientColorSource(createGradient2), Boolean.FALSE);
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda20
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createColor$lambda$25;
                    createColor$lambda$25 = AdaptiveRenderingParams.createColor$lambda$25();
                    return createColor$lambda$25;
                }
            });
            pair = TuplesKt.to(null, Boolean.FALSE);
        }
        ColorSource colorSource = (ColorSource) pair.component1();
        boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
        if (colorSource == null) {
            return null;
        }
        return new Color(colorSource, booleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$21() {
        return "ColorSource don't found. Can't parse context color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$22() {
        return "ColorSource don't found. Can't create context gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$23() {
        return "ColorSource don't found. Can't parse color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$24() {
        return "ColorSource don't found. Can't create Gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createColor$lambda$25() {
        return "ColorSource don't found. Set one of: color, gradient, context_color, context_gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createElementLayoutParams$lambda$17$lambda$16(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported SourceAnchor - " + anchor;
    }

    private final Gradient createGradient(Rendering.Color.Gradient gradient) {
        if (gradient == null || gradient == Rendering.Color.Gradient.getDefaultInstance()) {
            return null;
        }
        final String type = gradient.getType();
        Intrinsics.checkNotNullExpressionValue(type, "gradient.type");
        GradientType gradientType = GradientType.INSTANCE.get(type);
        if (gradientType == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda5
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createGradient$lambda$26;
                    createGradient$lambda$26 = AdaptiveRenderingParams.createGradient$lambda$26(type);
                    return createGradient$lambda$26;
                }
            });
            return null;
        }
        final String direction = gradient.getDirection();
        Intrinsics.checkNotNullExpressionValue(direction, "gradient.direction");
        GradientDirection gradientDirection = GradientDirection.INSTANCE.get(direction);
        if (gradientDirection == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda6
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createGradient$lambda$27;
                    createGradient$lambda$27 = AdaptiveRenderingParams.createGradient$lambda$27(direction);
                    return createGradient$lambda$27;
                }
            });
            return null;
        }
        ProtocolStringList colorsList = gradient.getColorsList();
        Intrinsics.checkNotNullExpressionValue(colorsList, "gradient.colorsList");
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = colorsList.iterator();
        while (it.hasNext()) {
            Integer parseColorRGBASafely = ColorUtils.parseColorRGBASafely((String) it.next());
            if (parseColorRGBASafely != null) {
                arrayList.add(parseColorRGBASafely);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda7
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createGradient$lambda$29;
                    createGradient$lambda$29 = AdaptiveRenderingParams.createGradient$lambda$29();
                    return createGradient$lambda$29;
                }
            });
            return null;
        }
        if (arrayList.size() != colorsList.size()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda8
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createGradient$lambda$30;
                    createGradient$lambda$30 = AdaptiveRenderingParams.createGradient$lambda$30();
                    return createGradient$lambda$30;
                }
            });
        }
        return new Gradient(gradientType, gradientDirection, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$26(String type) {
        Intrinsics.checkNotNullParameter(type, "$type");
        return "Incorrect gradient type parameter - " + type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$27(String direction) {
        Intrinsics.checkNotNullParameter(direction, "$direction");
        return "Incorrect gradient direction parameter - " + direction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$29() {
        return "Failed to parse all colors. Check if colors are specified correctly.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createGradient$lambda$30() {
        return "Not all colors were parsed, check if the colors are specified correctly";
    }

    private final Image createImage(Rendering.Image image) {
        Resource createResource;
        if (image == null || image == Rendering.Image.getDefaultInstance() || (createResource = createResource(image.getResource())) == null) {
            return null;
        }
        ScaleType scaleType = AdaptiveRenderingParamsKt.toScaleType(image.getScale());
        if (scaleType == null) {
            scaleType = ScaleType.None;
        }
        return new Image(scaleType, createResource);
    }

    private final Placeholder createPlaceholder(Rendering.Placeholder placeholder) {
        PlaceholderSource placeholderSource;
        if (placeholder == null || placeholder == Rendering.Placeholder.getDefaultInstance()) {
            return null;
        }
        if (placeholder.hasName()) {
            String name = placeholder.getName();
            Intrinsics.checkNotNullExpressionValue(name, "placeholder.name");
            placeholderSource = new NamePlaceholderSource(name);
        } else if (placeholder.hasColor()) {
            Color createColor = createColor(placeholder.getColor());
            if (createColor == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda11
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createPlaceholder$lambda$33;
                        createPlaceholder$lambda$33 = AdaptiveRenderingParams.createPlaceholder$lambda$33();
                        return createPlaceholder$lambda$33;
                    }
                });
                return null;
            }
            placeholderSource = new ColorPlaceholderSource(createColor);
        } else if (placeholder.hasImage()) {
            Image createImage = createImage(placeholder.getImage());
            if (createImage == null) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda12
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createPlaceholder$lambda$34;
                        createPlaceholder$lambda$34 = AdaptiveRenderingParams.createPlaceholder$lambda$34();
                        return createPlaceholder$lambda$34;
                    }
                });
                return null;
            }
            placeholderSource = new ImagePlaceholderSource(createImage);
        } else {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda13
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createPlaceholder$lambda$35;
                    createPlaceholder$lambda$35 = AdaptiveRenderingParams.createPlaceholder$lambda$35();
                    return createPlaceholder$lambda$35;
                }
            });
            placeholderSource = null;
        }
        if (placeholderSource == null) {
            return null;
        }
        return new Placeholder(placeholderSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createPlaceholder$lambda$33() {
        return "PlaceholderSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createPlaceholder$lambda$34() {
        return "PlaceholderSource don't found. Can't create Image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createPlaceholder$lambda$35() {
        return "PlaceholderSource don't found. Set one of: name, color, gradient";
    }

    private final Resource createResource(Rendering.Resource resource) {
        ResourceSource resourceSource;
        if (resource == null || resource == Rendering.Resource.getDefaultInstance()) {
            return null;
        }
        if (resource.hasBase64()) {
            String base64 = resource.getBase64();
            Intrinsics.checkNotNullExpressionValue(base64, "resource.base64");
            resourceSource = new Base64ResourceSource(base64);
        } else if (resource.hasUrls()) {
            ProtocolStringList urlsList = resource.getUrls().getUrlsList();
            Intrinsics.checkNotNullExpressionValue(urlsList, "resource.urls.urlsList");
            resourceSource = new UrlResourceSource(urlsList);
        } else if (resource.hasUrl()) {
            String url = resource.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "resource.url");
            resourceSource = new UrlResourceSource(url);
        } else {
            if (resource.hasPayload()) {
                Rendering.Resource.Payload payload = resource.getPayload();
                Intrinsics.checkNotNullExpressionValue(payload, "resource.payload");
                if (payload.hasHtml()) {
                    String html = payload.getHtml();
                    Intrinsics.checkNotNullExpressionValue(html, "payload.html");
                    resourceSource = new HtmlResourceSource(html);
                } else if (payload.hasXml()) {
                    String xml = payload.getXml();
                    Intrinsics.checkNotNullExpressionValue(xml, "payload.xml");
                    resourceSource = new XmlResourceSource(xml);
                } else {
                    Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda9
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String createResource$lambda$31;
                            createResource$lambda$31 = AdaptiveRenderingParams.createResource$lambda$31();
                            return createResource$lambda$31;
                        }
                    });
                }
            } else {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda10
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String createResource$lambda$32;
                        createResource$lambda$32 = AdaptiveRenderingParams.createResource$lambda$32();
                        return createResource$lambda$32;
                    }
                });
            }
            resourceSource = null;
        }
        if (resourceSource == null) {
            return null;
        }
        return new Resource(resourceSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$31() {
        return "ResourceSource don't found. Set one of: html, xml";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createResource$lambda$32() {
        return "ResourceSource don't found. Set one of: base64, url, payload";
    }

    private final WatermarkParams createWatermarkParams(UnifiedMediationParams unifiedMediationParams, WatermarkConfiguration watermarkConfiguration) {
        WatermarkParams.Location location;
        if (watermarkConfiguration == null) {
            return null;
        }
        WatermarkAlgorithm algorithm = watermarkConfiguration.getAlgorithm();
        if ((algorithm == null ? -1 : WhenMappings.$EnumSwitchMapping$1[algorithm.ordinal()]) != 1) {
            return null;
        }
        WatermarkParams.Algorithm algorithm2 = WatermarkParams.Algorithm.RGB_STRIP;
        WatermarkPayloadType payloadType = watermarkConfiguration.getPayloadType();
        String stringOrNull = (payloadType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[payloadType.ordinal()]) == 1 ? unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_BID_ID) : unifiedMediationParams.getStringOrNull("creativeId");
        if (stringOrNull == null) {
            stringOrNull = "";
        }
        Integer parseColorRGBASafely = ColorUtils.parseColorRGBASafely(watermarkConfiguration.getBaseColorRgb());
        int intValue = parseColorRGBASafely != null ? parseColorRGBASafely.intValue() : -16777216;
        WatermarkLocation location2 = watermarkConfiguration.getLocation();
        switch (location2 != null ? WhenMappings.$EnumSwitchMapping$3[location2.ordinal()] : -1) {
            case 1:
                location = WatermarkParams.Location.TOP_LEFT;
                break;
            case 2:
                location = WatermarkParams.Location.TOP_CENTER;
                break;
            case 3:
                location = WatermarkParams.Location.TOP_RIGHT;
                break;
            case 4:
                location = WatermarkParams.Location.BOTTOM_LEFT;
                break;
            case 5:
                location = WatermarkParams.Location.BOTTOM_CENTER;
                break;
            case 6:
                location = WatermarkParams.Location.BOTTOM_RIGHT;
                break;
            default:
                location = WatermarkParams.Location.BOTTOM_LEFT;
                break;
        }
        return new WatermarkParams(algorithm2, stringOrNull, intValue, location);
    }

    @VisibleForTesting
    @Nullable
    public final AdElementParams createAdElementParams(@Nullable Rendering.Phase.ViewComponent viewComponent, @Nullable MeasurerFactory measurerFactory) {
        AdElementType adElementType;
        if (viewComponent == null || viewComponent == Rendering.Phase.ViewComponent.getDefaultInstance() || (adElementType = AdaptiveRenderingParamsKt.toAdElementType(viewComponent.getType())) == null) {
            return null;
        }
        String it = viewComponent.getText();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        String str = it.length() > 0 ? it : null;
        String name = viewComponent.getName();
        Intrinsics.checkNotNullExpressionValue(name, "viewComponent.name");
        Resource createResource = createResource(viewComponent.getResource());
        String source = viewComponent.getSource();
        String placeholder = viewComponent.getPlaceholder();
        ElementLayoutParams createElementLayoutParams = createElementLayoutParams(viewComponent.getLayout());
        AppearanceParams createAppearanceParams = createAppearanceParams(viewComponent.getAppearance());
        Map<String, String> customParamsMap = viewComponent.getCustomParamsMap();
        Intrinsics.checkNotNullExpressionValue(customParamsMap, "viewComponent.customParamsMap");
        List<Rendering.AdaptiveAnimation> animationsList = viewComponent.getAppearance().getAnimationsList();
        Intrinsics.checkNotNullExpressionValue(animationsList, "viewComponent.appearance.animationsList");
        Map<AnimationEventType, AnimationParams> createAnimationMap = createAnimationMap(animationsList);
        List<MeasurerParams> createMeasurerParamsList = createMeasurerParamsList(viewComponent.getMeasurersList());
        List<RenderingFeature> featuresList = viewComponent.getFeaturesList();
        Intrinsics.checkNotNullExpressionValue(featuresList, "viewComponent.featuresList");
        BrokenCreativeDetectorParams createBrokenCreativeDetectorParams = createBrokenCreativeDetectorParams(featuresList);
        List<Rendering.Phase.ViewComponent.ScriptConfig> scriptsList = viewComponent.getScriptsList();
        Intrinsics.checkNotNullExpressionValue(scriptsList, "viewComponent.scriptsList");
        return new AdElementParams(adElementType, name, createResource, source, placeholder, str, createElementLayoutParams, createAppearanceParams, customParamsMap, createAnimationMap, measurerFactory, createMeasurerParamsList, createBrokenCreativeDetectorParams, createScriptConfigs(scriptsList));
    }

    @VisibleForTesting
    @Nullable
    public final AdParams createAdParams(@NotNull Rendering rendering, @NotNull VisibilityParams visibilityParams, @Nullable WatermarkParams watermarkParams) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        ViewabilityConfiguration viewabilityConfiguration = rendering.getViewabilityConfiguration();
        Intrinsics.checkNotNullExpressionValue(viewabilityConfiguration, "rendering.viewabilityConfiguration");
        ViewabilityTrackerParams viewabilityTrackerParams = ProtoUtilsKt.toViewabilityTrackerParams(viewabilityConfiguration);
        if (viewabilityTrackerParams == null) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String createAdParams$lambda$0;
                    createAdParams$lambda$0 = AdaptiveRenderingParams.createAdParams$lambda$0();
                    return createAdParams$lambda$0;
                }
            });
            return null;
        }
        AdMeasurerFactory adMeasurerFactory = new AdMeasurerFactory();
        AdParams.Builder customParams = new AdParams.Builder(viewabilityTrackerParams).setOrientation(AdaptiveRenderingParamsKt.toOrientation(rendering.getOrientation())).setBackground(createBackground(rendering.getBackground())).setVisibilityParams(visibilityParams).setWatermarkParams(watermarkParams).setCustomParams(rendering.getCustomParamsMap());
        CacheType cacheType = AdaptiveRenderingParamsKt.toCacheType(rendering.getCacheType());
        if (cacheType != null) {
            customParams.setCacheType(cacheType);
        }
        List<Rendering.Phase> phasesList = rendering.getPhasesList();
        Intrinsics.checkNotNullExpressionValue(phasesList, "rendering.phasesList");
        List<Rendering.Phase> mutableList = CollectionsKt.toMutableList((Collection) phasesList);
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new Comparator() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$createAdParams$lambda$3$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((Rendering.Phase) t).getSequence()), Integer.valueOf(((Rendering.Phase) t2).getSequence()));
                }
            });
        }
        for (Rendering.Phase phase : mutableList) {
            AdPhaseParams createAdPhaseParams = createAdPhaseParams(phase, adMeasurerFactory);
            if (createAdPhaseParams != null) {
                if (phase.getSequence() == -1) {
                    customParams.setPlaceholderParams(createAdPhaseParams);
                } else {
                    customParams.addAdPhaseParams(createAdPhaseParams);
                }
            }
        }
        return customParams.build();
    }

    @VisibleForTesting
    @Nullable
    public final AdPhaseParams createAdPhaseParams(@Nullable Rendering.Phase phase, @Nullable MeasurerFactory measurerFactory) {
        if (phase == null || phase == Rendering.Phase.getDefaultInstance()) {
            return null;
        }
        AdPhaseParams.Builder background = new AdPhaseParams.Builder(phase.getSequence()).setBackground(createBackground(phase.getBackground()));
        List<Rendering.AdaptiveAnimation> animationsList = phase.getAnimationsList();
        Intrinsics.checkNotNullExpressionValue(animationsList, "phase.animationsList");
        AdPhaseParams.Builder animationParams = background.setAnimationParams(MapsKt.toMutableMap(createAnimationMap(animationsList)));
        ProtocolStringList stateGroupsList = phase.getStateGroupsList();
        Intrinsics.checkNotNullExpressionValue(stateGroupsList, "phase.stateGroupsList");
        AdPhaseParams.Builder customParams = animationParams.setStateGroups(CollectionsKt.toMutableList((Collection) stateGroupsList)).setCustomParams(phase.getCustomParamsMap());
        Integer parseColorRGBASafely = ColorUtils.parseColorRGBASafely(phase.getBackgroundColor());
        if (parseColorRGBASafely != null) {
            customParams.setBackgroundColor(parseColorRGBASafely.intValue());
        }
        List<Rendering.Phase.ViewComponent> adsList = phase.getAdsList();
        Intrinsics.checkNotNullExpressionValue(adsList, "phase.adsList");
        Iterator<T> it = adsList.iterator();
        while (it.hasNext()) {
            AdElementParams createAdElementParams = createAdElementParams((Rendering.Phase.ViewComponent) it.next(), measurerFactory);
            if (createAdElementParams != null) {
                customParams.addAdsElementParams(createAdElementParams);
            }
        }
        List<Rendering.Phase.ViewComponent> controlsList = phase.getControlsList();
        Intrinsics.checkNotNullExpressionValue(controlsList, "phase.controlsList");
        Iterator<T> it2 = controlsList.iterator();
        while (it2.hasNext()) {
            AdElementParams createAdElementParams2 = createAdElementParams((Rendering.Phase.ViewComponent) it2.next(), measurerFactory);
            if (createAdElementParams2 != null) {
                customParams.addControlsElementParams(createAdElementParams2);
            }
        }
        List<Rendering.Phase.Event> eventsList = phase.getEventsList();
        Intrinsics.checkNotNullExpressionValue(eventsList, "phase.eventsList");
        Iterator<T> it3 = eventsList.iterator();
        while (it3.hasNext()) {
            EventParams createEventParams = createEventParams((Rendering.Phase.Event) it3.next());
            if (createEventParams != null) {
                customParams.addEventParams(createEventParams);
            }
        }
        List<Rendering.Phase.MethodComponent> methodsList = phase.getMethodsList();
        Intrinsics.checkNotNullExpressionValue(methodsList, "phase.methodsList");
        Iterator<T> it4 = methodsList.iterator();
        while (it4.hasNext()) {
            String name = ((Rendering.Phase.MethodComponent) it4.next()).getName();
            Intrinsics.checkNotNullExpressionValue(name, "methodComponent.name");
            customParams.addMethodParams(new MethodParams(name));
        }
        return customParams.build();
    }

    @VisibleForTesting
    @NotNull
    public final AppearanceParams createAppearanceParams(@Nullable Rendering.Phase.ViewComponent.Appearance appearance) {
        if (appearance == null || appearance == Rendering.Phase.ViewComponent.Appearance.getDefaultInstance()) {
            return new AppearanceParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        Background createBackground = createBackground(appearance.getBackground());
        Integer parseColorRGBASafely = ColorUtils.parseColorRGBASafely(appearance.getBackgroundColor());
        Boolean valueOf = Boolean.valueOf(appearance.getVisible());
        Boolean valueOf2 = Boolean.valueOf(appearance.getClickable());
        Float valueOf3 = Float.valueOf((float) appearance.getOpacity());
        Float valueOf4 = Float.valueOf((float) appearance.getFontSize());
        FontStyleType fontStyleType = FontStyleType.INSTANCE.get(appearance.getFontStyle());
        Boolean valueOf5 = Boolean.valueOf(appearance.getOutlined());
        Float valueOf6 = Float.valueOf((float) appearance.getStrokeWidth());
        Integer parseColorRGBASafely2 = ColorUtils.parseColorRGBASafely(appearance.getStrokeColor());
        Integer parseColorRGBASafely3 = ColorUtils.parseColorRGBASafely(appearance.getFillColor());
        Integer parseColorRGBASafely4 = ColorUtils.parseColorRGBASafely(appearance.getShadowColor());
        Padding parse = Padding.INSTANCE.parse(appearance.getPadding());
        Float valueOf7 = Float.valueOf((float) appearance.getCornerRadius());
        Integer valueOf8 = Integer.valueOf(appearance.getTextNumberOfLines());
        Float valueOf9 = Float.valueOf((float) appearance.getTextLineSpacing());
        HorizontalGravity horizontalGravity = HorizontalGravity.INSTANCE.get(appearance.getTextAlignment());
        if (horizontalGravity == null) {
            horizontalGravity = HorizontalGravity.Center;
        }
        return new AppearanceParams(createBackground, parseColorRGBASafely, valueOf, valueOf2, valueOf3, valueOf4, fontStyleType, valueOf5, valueOf6, parseColorRGBASafely2, parseColorRGBASafely3, parseColorRGBASafely4, parse, valueOf7, valueOf8, valueOf9, horizontalGravity);
    }

    @VisibleForTesting
    @NotNull
    public final ElementLayoutParams createElementLayoutParams(@Nullable Rendering.Phase.ViewComponent.Layout layout) {
        ElementLayoutParams.Builder builder = new ElementLayoutParams.Builder();
        if (layout == null) {
            return builder.build();
        }
        List<Rendering.Phase.ViewComponent.Layout.Constraint> constraintsList = layout.getConstraintsList();
        Intrinsics.checkNotNullExpressionValue(constraintsList, "layout.constraintsList");
        for (Rendering.Phase.ViewComponent.Layout.Constraint constraint : constraintsList) {
            final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor sourceAnchor = constraint.getSourceAnchor();
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor targetAnchor = constraint.getTargetAnchor();
            String target = constraint.getTarget();
            Intrinsics.checkNotNullExpressionValue(target, "constraint.target");
            float value = (float) constraint.getValue();
            switch (sourceAnchor == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceAnchor.ordinal()]) {
                case 1:
                    builder.setWidth(value);
                    builder.setWidthPercent((float) constraint.getMultiplier());
                    break;
                case 2:
                    builder.setHeight(value);
                    builder.setHeightPercent((float) constraint.getMultiplier());
                    break;
                case 3:
                    SideType sideType = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType != null) {
                        builder.setLeftSideBindParams(new SideBindParams(sideType, target));
                    }
                    builder.setMarginLeft(value);
                    break;
                case 4:
                    SideType sideType2 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType2 != null) {
                        builder.setTopSideBindParams(new SideBindParams(sideType2, target));
                    }
                    builder.setMarginTop(value);
                    break;
                case 5:
                    SideType sideType3 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType3 != null) {
                        builder.setRightSideBindParams(new SideBindParams(sideType3, target));
                    }
                    builder.setMarginRight(value);
                    break;
                case 6:
                    SideType sideType4 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType4 != null) {
                        builder.setBottomSideBindParams(new SideBindParams(sideType4, target));
                    }
                    builder.setMarginBottom(value);
                    break;
                case 7:
                    SideType sideType5 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType5 != null) {
                        builder.setCenterXSideBindParams(new SideBindParams(sideType5, target));
                    }
                    builder.setTranslationX(value);
                    break;
                case 8:
                    SideType sideType6 = AdaptiveRenderingParamsKt.toSideType(targetAnchor);
                    if (sideType6 != null) {
                        builder.setCenterYSideBindParams(new SideBindParams(sideType6, target));
                    }
                    builder.setTranslationY(value);
                    break;
                default:
                    Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams$$ExternalSyntheticLambda4
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String createElementLayoutParams$lambda$17$lambda$16;
                            createElementLayoutParams$lambda$17$lambda$16 = AdaptiveRenderingParams.createElementLayoutParams$lambda$17$lambda$16(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.this);
                            return createElementLayoutParams$lambda$17$lambda$16;
                        }
                    });
                    break;
            }
        }
        return builder.build();
    }

    @VisibleForTesting
    @Nullable
    public final EventParams createEventParams(@Nullable Rendering.Phase.Event event) {
        EventType eventType;
        if (event == null || event == Rendering.Phase.Event.getDefaultInstance() || (eventType = AdaptiveRenderingParamsKt.toEventType(event.getName())) == null) {
            return null;
        }
        String source = event.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "event.source");
        List<Rendering.Phase.Event.Task> tasksList = event.getTasksList();
        Intrinsics.checkNotNullExpressionValue(tasksList, "event.tasksList");
        return new EventParams(eventType, source, AbstractC6013h.b(tasksList));
    }

    @VisibleForTesting
    @Nullable
    public final List<MeasurerParams> createMeasurerParamsList(@Nullable List<Rendering.Phase.ViewComponent.Measurer> measurerList) {
        if (measurerList == null || measurerList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(measurerList, 10));
        for (Rendering.Phase.ViewComponent.Measurer measurer : measurerList) {
            String name = measurer.getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.name");
            arrayList.add(new MeasurerParams(name, measurer.getParametersMap()));
        }
        return arrayList;
    }

    @VisibleForTesting
    @NotNull
    public final List<ScriptConfig> createScriptConfigs(@NotNull List<Rendering.Phase.ViewComponent.ScriptConfig> scriptsList) {
        Intrinsics.checkNotNullParameter(scriptsList, "scriptsList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(scriptsList, 10));
        for (Rendering.Phase.ViewComponent.ScriptConfig scriptConfig : scriptsList) {
            String scriptId = scriptConfig.getScriptId();
            int priority = scriptConfig.getPriority();
            String source = scriptConfig.getSource();
            boolean forMainFrameOnly = scriptConfig.getForMainFrameOnly();
            Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming injectTiming = scriptConfig.getInjectTiming();
            int i = injectTiming == null ? -1 : WhenMappings.$EnumSwitchMapping$4[injectTiming.ordinal()];
            ScriptConfig.Type type = i != 1 ? i != 2 ? null : ScriptConfig.Type.DocumentEnd : ScriptConfig.Type.DocumentStart;
            Intrinsics.checkNotNullExpressionValue(scriptId, "scriptId");
            Intrinsics.checkNotNullExpressionValue(source, "source");
            arrayList.add(new ScriptConfig(scriptId, priority, type, forMainFrameOnly, source, null, 32, null));
        }
        return arrayList;
    }

    @Nullable
    public final AdParams getAdParams() {
        return this.adParams;
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NotNull UnifiedAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.adParams != null) {
            return true;
        }
        BMError notFound = BMError.notFound(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION);
        Intrinsics.checkNotNullExpressionValue(notFound, "notFound(UnifiedMediatio…_RENDERING_CONFIGURATION)");
        callback.onAdLoadFailed(notFound);
        return false;
    }
}
