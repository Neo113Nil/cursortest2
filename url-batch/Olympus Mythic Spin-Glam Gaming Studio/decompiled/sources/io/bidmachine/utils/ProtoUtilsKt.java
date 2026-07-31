package io.bidmachine.utils;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.Placement;
import com.ironsource.mediationsdk.j;
import io.bidmachine.BannerAdSize;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.GeometryMetric;
import io.bidmachine.protobuf.sdk.LifecycleMetric;
import io.bidmachine.protobuf.sdk.Measurement;
import io.bidmachine.protobuf.sdk.MetricRequirement;
import io.bidmachine.protobuf.sdk.OverlapMetric;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.bidmachine.protobuf.sdk.ViewabilityRule;
import io.bidmachine.protobuf.sdk.VisibilityMetric;
import io.bidmachine.util.ColorUtils;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.viewabilitytracker.metric.Metric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityLifecycleMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric;
import io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityMeasurement;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0000\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b*\u00020\u00152\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0018H\u0000\u001a\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0006*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0002\u0010\u001b\u001a\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0002\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\u001fH\u0000¢\u0006\u0002\u0010 \u001a\u001b\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0002\u0010#\u001a\u001b\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0002\u0010$\u001a\u0013\u0010%\u001a\u0004\u0018\u00010\"*\u00020\u001fH\u0000¢\u0006\u0002\u0010&\u001a\u0016\u0010'\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000\u001a\u0016\u0010'\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000\u001a\u000e\u0010(\u001a\u0004\u0018\u00010\u0003*\u00020\u001fH\u0000\u001a\u0016\u0010)\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000\u001a\u0016\u0010)\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000\u001a\u000e\u0010*\u001a\u0004\u0018\u00010\b*\u00020\u001fH\u0000\u001a\u0016\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000\u001a\u0016\u0010+\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000\u001a\u000e\u0010,\u001a\u0004\u0018\u00010\u0004*\u00020\u001fH\u0000\u001a\u0016\u0010-\u001a\u0004\u0018\u00010\u001f*\u00020\u00042\u0006\u0010\u001c\u001a\u00020\bH\u0000\u001a\u0014\u0010.\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0014H\u0000\u001a\u0014\u0010.\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0014H\u0000\u001a\f\u0010/\u001a\u00020\u0006*\u000200H\u0002\u001a\f\u00101\u001a\u00020\u0006*\u00020\u000bH\u0002\u001a.\u00102\u001a\u00020\u0003\"\u0004\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H3042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u0002H3\u0012\u0006\u0012\u0004\u0018\u00010\u001f06H\u0000\u001a\f\u00107\u001a\u000208*\u000209H\u0000\u001a\f\u00107\u001a\u000208*\u00020:H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0004H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0006H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0000\u001a\u001c\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0000\u001a\u000e\u0010<\u001a\u0004\u0018\u00010=*\u00020>H\u0000\u001a\u0014\u0010?\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0002\b\u0003\u0018\u000104H\u0000\u001a\u000e\u0010@\u001a\u0004\u0018\u00010A*\u00020BH\u0000\u001a\f\u0010C\u001a\u00020D*\u00020\u0006H\u0000\u001a\f\u0010E\u001a\u00020F*\u00020\u0006H\u0000\u001a\f\u0010G\u001a\u00020H*\u00020\bH\u0000\u001a\f\u0010I\u001a\u00020J*\u00020\bH\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0003H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0001H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0004H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0005H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0006H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\u0007H\u0000\u001a\f\u0010K\u001a\u00020\u001f*\u00020\bH\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0003H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0001H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0004H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0005H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0006H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\u0007H\u0000\u001a\f\u0010L\u001a\u00020M*\u00020\bH\u0000\u001a\u0018\u0010N\u001a\u0004\u0018\u00010\u0005*\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010OH\u0000\u001a\u0010\u0010P\u001a\u0004\u0018\u00010M*\u0004\u0018\u00010QH\u0000\u001a\u0010\u0010R\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010QH\u0000\u001a\f\u0010S\u001a\u00020T*\u00020UH\u0000\u001a\u000e\u0010V\u001a\u0004\u0018\u00010W*\u00020XH\u0000\u001a\f\u0010Y\u001a\u00020Z*\u00020[H\u0000\u001a\u000e\u0010\\\u001a\u0004\u0018\u00010]*\u00020^H\u0000\u001a\u000e\u0010_\u001a\u0004\u0018\u00010`*\u00020aH\u0000\u001a\u000e\u0010b\u001a\u0004\u0018\u00010c*\u00020dH\u0000¨\u0006e"}, d2 = {"addValue", "Lcom/explorestack/protobuf/ListValue$Builder;", "value", "Lcom/explorestack/protobuf/ListValue;", "Lcom/explorestack/protobuf/Struct;", "Lcom/explorestack/protobuf/Struct$Builder;", "", "", "", "checkBannerPlacement", "Lio/bidmachine/utils/BMError;", "Lcom/explorestack/protobuf/adcom/Placement;", j.h, "Lio/bidmachine/BannerAdSize;", "checkInterstitialPlacement", "checkNativePlacement", "checkRewardedPlacement", "encodeToStringBase64Safely", "Lcom/explorestack/protobuf/MessageLite;", "flags", "", "Lcom/explorestack/protobuf/MessageLite$Builder;", "findFirstAdExtension", "Lio/bidmachine/protobuf/AdExtension;", "Lcom/explorestack/protobuf/adcom/Ad;", "getBoolean", "index", "(Lcom/explorestack/protobuf/ListValue;I)Ljava/lang/Boolean;", "key", "(Lcom/explorestack/protobuf/Struct;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithCheck", "Lcom/explorestack/protobuf/Value;", "(Lcom/explorestack/protobuf/Value;)Ljava/lang/Boolean;", "getDouble", "", "(Lcom/explorestack/protobuf/ListValue;I)Ljava/lang/Double;", "(Lcom/explorestack/protobuf/Struct;Ljava/lang/String;)Ljava/lang/Double;", "getDoubleWithCheck", "(Lcom/explorestack/protobuf/Value;)Ljava/lang/Double;", "getListValue", "getListValueWithCheck", "getString", "getStringWithCheck", "getStruct", "getStructWithCheck", "getValue", "has", "isInterstitialPlacement", "Lcom/explorestack/protobuf/adcom/Placement$DisplayPlacement;", "isRewardedPlacement", "mapNotNullToProtoListValue", "T", "", "transform", "Lkotlin/Function1;", "pack", "Lcom/explorestack/protobuf/Any;", "Lcom/explorestack/protobuf/Message;", "Lcom/explorestack/protobuf/Message$Builder;", "putField", "toIabElementStyle", "Lio/bidmachine/iab/utils/IabElementStyle;", "Lio/bidmachine/protobuf/AdExtension$ControlAsset;", "toListValueBuilderOrNull", "toMetricOrNull", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "Lio/bidmachine/protobuf/sdk/MetricRequirement;", "toProtoBooleanValue", "Lcom/explorestack/protobuf/BoolValue;", "toProtoBooleanValueBuilder", "Lcom/explorestack/protobuf/BoolValue$Builder;", "toProtoStringValue", "Lcom/explorestack/protobuf/StringValue;", "toProtoStringValueBuilder", "Lcom/explorestack/protobuf/StringValue$Builder;", "toProtoValue", "toProtoValueBuilder", "Lcom/explorestack/protobuf/Value$Builder;", "toStructBuilderOrNull", "", "toValueBuilderOrNull", "", "toValueOrNull", "toViewabilityGeometryMetric", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityGeometryMetric;", "Lio/bidmachine/protobuf/sdk/GeometryMetric;", "toViewabilityLifecycleMetricOrNull", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityLifecycleMetric;", "Lio/bidmachine/protobuf/sdk/LifecycleMetric;", "toViewabilityMeasurement", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityMeasurement;", "Lio/bidmachine/protobuf/sdk/Measurement;", "toViewabilityOverlapMetricOrNull", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric;", "Lio/bidmachine/protobuf/sdk/OverlapMetric;", "toViewabilityTrackerParams", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "Lio/bidmachine/protobuf/sdk/ViewabilityConfiguration;", "toViewabilityVisibilityMetricOrNull", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric;", "Lio/bidmachine/protobuf/sdk/VisibilityMetric;", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class ProtoUtilsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VisibilityMetric.VisibilityScope.values().length];
            try {
                iArr[VisibilityMetric.VisibilityScope.PARENT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilityMetric.VisibilityScope.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisibilityMetric.VisibilityScope.SAFE_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LifecycleMetric.LifecycleState.values().length];
            try {
                iArr2[LifecycleMetric.LifecycleState.HAS_WINDOW_FOCUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OverlapMetric.OverlapScope.values().length];
            try {
                iArr3[OverlapMetric.OverlapScope.VIEW_SIBLINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OverlapMetric.OverlapScope.ALL_VIEWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OverlapMetric.OverlapScope.WINDOWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @Nullable
    public static final BMError checkBannerPlacement(@NotNull Placement placement, @NotNull BannerAdSize bannerAdSize) {
        Intrinsics.checkNotNullParameter(placement, "<this>");
        Intrinsics.checkNotNullParameter(bannerAdSize, "bannerAdSize");
        Placement.DisplayPlacement display = placement.getDisplay();
        Intrinsics.checkNotNullExpressionValue(display, "display");
        if (display == Placement.DisplayPlacement.getDefaultInstance()) {
            return BMError.incorrectContent("DisplayPlacement must not be a default instance");
        }
        if (isInterstitialPlacement(display)) {
            return BMError.incorrectContent("It's is not banner placement. 'Instl' parameter in placement - true");
        }
        int w = display.getW();
        int h = display.getH();
        if (bannerAdSize.isSuitable(w, h)) {
            return null;
        }
        return BMError.incorrectContent("Incorrect DisplayPlacement size. Current size - " + bannerAdSize.getWidth() + 'x' + bannerAdSize.getHeight() + ", placement size - " + w + 'x' + h);
    }

    @Nullable
    public static final BMError checkInterstitialPlacement(@NotNull Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "<this>");
        if (isRewardedPlacement(placement)) {
            return BMError.incorrectContent("Rewarded placement used for interstitial placement");
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        Intrinsics.checkNotNullExpressionValue(display, "display");
        if ((display == Placement.DisplayPlacement.getDefaultInstance() || !isInterstitialPlacement(display)) && placement.getVideo() == Placement.VideoPlacement.getDefaultInstance()) {
            return BMError.incorrectContent("DisplayPlacement must have 'Instl' parameter - true. Or VideoPlacement must not be a default instance");
        }
        return null;
    }

    @Nullable
    public static final BMError checkNativePlacement(@NotNull Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "<this>");
        if (placement.getDisplay().getNativefmt().getAssetCount() <= 0) {
            return BMError.incorrectContent("Native assets not found");
        }
        return null;
    }

    @Nullable
    public static final BMError checkRewardedPlacement(@NotNull Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "<this>");
        if (isRewardedPlacement(placement)) {
            return null;
        }
        return BMError.incorrectContent("It's is not rewarded placement. 'Reward' parameter in placement must be true");
    }

    @Nullable
    public static final String encodeToStringBase64Safely(@NotNull MessageLite messageLite, int i) {
        Intrinsics.checkNotNullParameter(messageLite, "<this>");
        try {
            byte[] byteArray = messageLite.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray()");
            return UtilsKt.encodeToStringBase64(byteArray, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64Safely$default(MessageLite messageLite, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return encodeToStringBase64Safely(messageLite, i);
    }

    @Nullable
    public static final AdExtension findFirstAdExtension(@NotNull Ad ad) {
        Any extProto;
        Intrinsics.checkNotNullParameter(ad, "<this>");
        int extProtoCount = ad.getExtProtoCount();
        for (int i = 0; i < extProtoCount; i++) {
            try {
                extProto = ad.getExtProto(i);
                Intrinsics.checkNotNullExpressionValue(extProto, "getExtProto(i)");
            } catch (Throwable th) {
                Logger.w(th);
            }
            if (extProto.is(AdExtension.class)) {
                return (AdExtension) extProto.unpack(AdExtension.class);
            }
            continue;
        }
        return null;
    }

    @Nullable
    public static final Boolean getBoolean(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return getBooleanWithCheck(value);
        }
        return null;
    }

    @Nullable
    public static final Boolean getBooleanWithCheck(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value.hasBoolValue()) {
            return Boolean.valueOf(value.getBoolValue());
        }
        return null;
    }

    @Nullable
    public static final Double getDouble(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return getDoubleWithCheck(value);
        }
        return null;
    }

    @Nullable
    public static final Double getDoubleWithCheck(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value.hasNumberValue()) {
            return Double.valueOf(value.getNumberValue());
        }
        return null;
    }

    @Nullable
    public static final ListValue getListValue(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return getListValueWithCheck(value);
        }
        return null;
    }

    @Nullable
    public static final ListValue getListValueWithCheck(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value.hasListValue()) {
            return value.getListValue();
        }
        return null;
    }

    @Nullable
    public static final String getString(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return getStringWithCheck(value);
        }
        return null;
    }

    @Nullable
    public static final String getStringWithCheck(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value.hasStringValue()) {
            return value.getStringValue();
        }
        return null;
    }

    @Nullable
    public static final Struct getStruct(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return getStructWithCheck(value);
        }
        return null;
    }

    @Nullable
    public static final Struct getStructWithCheck(@NotNull Value value) {
        Intrinsics.checkNotNullParameter(value, "<this>");
        if (value.hasStructValue()) {
            return value.getStructValue();
        }
        return null;
    }

    @Nullable
    public static final Value getValue(@NotNull Struct struct, @NotNull String key) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return struct.getFieldsMap().get(key);
    }

    public static final boolean has(@NotNull ListValue listValue, int i) {
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        return i >= 0 && i < listValue.getValuesCount();
    }

    private static final boolean isInterstitialPlacement(Placement.DisplayPlacement displayPlacement) {
        return displayPlacement.getInstl();
    }

    private static final boolean isRewardedPlacement(Placement placement) {
        return placement.getReward();
    }

    @NotNull
    public static final <T> ListValue mapNotNullToProtoListValue(@NotNull List<? extends T> list, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ListValue.Builder newBuilder = ListValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Value value = (Value) transform.invoke(it.next());
            if (value != null) {
                newBuilder.addValues(value);
            }
        }
        ListValue build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "listValueBuilder.build()");
        return build;
    }

    @NotNull
    public static final Any pack(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "<this>");
        Any pack = Any.pack(message);
        Intrinsics.checkNotNullExpressionValue(pack, "pack(this)");
        return pack;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @Nullable
    public static final IabElementStyle toIabElementStyle(@NotNull AdExtension.ControlAsset controlAsset) {
        Intrinsics.checkNotNullParameter(controlAsset, "<this>");
        try {
            IabElementStyle iabElementStyle = new IabElementStyle();
            iabElementStyle.setMargin(controlAsset.getMargin());
            iabElementStyle.setPadding(controlAsset.getPadding());
            iabElementStyle.setContent(controlAsset.getContent());
            iabElementStyle.setFillColor(ColorUtils.parseColorARGBSafely(controlAsset.getFill()));
            iabElementStyle.setFontStyle(Integer.valueOf(controlAsset.getFontStyle()));
            iabElementStyle.setWidth(Integer.valueOf(controlAsset.getWidth()));
            iabElementStyle.setHeight(Integer.valueOf(controlAsset.getHeight()));
            iabElementStyle.setHideAfter(Float.valueOf(controlAsset.getHideafter()));
            iabElementStyle.setHorizontalPosition(Utils.parseHorizontalPosition(controlAsset.getX()));
            iabElementStyle.setVerticalPosition(Utils.parseVerticalPosition(controlAsset.getY()));
            iabElementStyle.setOpacity(Float.valueOf(controlAsset.getOpacity()));
            iabElementStyle.setOutlined(Boolean.valueOf(controlAsset.getOutlined()));
            iabElementStyle.setStrokeColor(ColorUtils.parseColorARGBSafely(controlAsset.getStroke()));
            iabElementStyle.setStrokeWidth(Float.valueOf(controlAsset.getStrokeWidth()));
            iabElementStyle.setStyle(controlAsset.getStyle());
            iabElementStyle.setVisible(Boolean.valueOf(controlAsset.getVisible()));
            return iabElementStyle;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final ListValue.Builder toListValueBuilderOrNull(@Nullable List<?> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListValue.Builder newBuilder = ListValue.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Value.Builder valueBuilderOrNull = toValueBuilderOrNull(it.next());
            if (valueBuilderOrNull != null) {
                newBuilder.addValues(valueBuilderOrNull);
            }
        }
        return newBuilder;
    }

    @Nullable
    public static final Metric toMetricOrNull(@NotNull final MetricRequirement metricRequirement) {
        Intrinsics.checkNotNullParameter(metricRequirement, "<this>");
        if (metricRequirement.hasGeometry()) {
            GeometryMetric geometry = metricRequirement.getGeometry();
            Intrinsics.checkNotNullExpressionValue(geometry, "geometry");
            return toViewabilityGeometryMetric(geometry);
        }
        if (metricRequirement.hasVisibility()) {
            VisibilityMetric visibility = metricRequirement.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "visibility");
            return toViewabilityVisibilityMetricOrNull(visibility);
        }
        if (metricRequirement.hasLifecycle()) {
            LifecycleMetric lifecycle = metricRequirement.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
            return toViewabilityLifecycleMetricOrNull(lifecycle);
        }
        if (!metricRequirement.hasOverlap()) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.ProtoUtilsKt$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String metricOrNull$lambda$22;
                    metricOrNull$lambda$22 = ProtoUtilsKt.toMetricOrNull$lambda$22(MetricRequirement.this);
                    return metricOrNull$lambda$22;
                }
            });
            return null;
        }
        OverlapMetric overlap = metricRequirement.getOverlap();
        Intrinsics.checkNotNullExpressionValue(overlap, "overlap");
        return toViewabilityOverlapMetricOrNull(overlap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toMetricOrNull$lambda$22(MetricRequirement this_toMetricOrNull) {
        Intrinsics.checkNotNullParameter(this_toMetricOrNull, "$this_toMetricOrNull");
        return "Unsupported Metric - " + this_toMetricOrNull.getMetricCase().name() + ", it must be GeometryMetric or VisibilityMetric or LifecycleMetric or OverlapMetric";
    }

    @NotNull
    public static final BoolValue toProtoBooleanValue(boolean z) {
        BoolValue build = toProtoBooleanValueBuilder(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoBooleanValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final BoolValue.Builder toProtoBooleanValueBuilder(boolean z) {
        BoolValue.Builder value = BoolValue.newBuilder().setValue(z);
        Intrinsics.checkNotNullExpressionValue(value, "newBuilder().setValue(this)");
        return value;
    }

    @NotNull
    public static final StringValue toProtoStringValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringValue build = toProtoStringValueBuilder(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoStringValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final StringValue.Builder toProtoStringValueBuilder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringValue.Builder value = StringValue.newBuilder().setValue(str);
        Intrinsics.checkNotNullExpressionValue(value, "newBuilder().setValue(this)");
        return value;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Value build = toProtoValueBuilder(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Value.Builder stringValue = Value.newBuilder().setStringValue(str);
        Intrinsics.checkNotNullExpressionValue(stringValue, "newBuilder()\n        .setStringValue(this)");
        return stringValue;
    }

    @Nullable
    public static final Struct.Builder toStructBuilderOrNull(@Nullable Map<?, ?> map) {
        Value.Builder valueBuilderOrNull;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Struct.Builder newBuilder = Struct.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key != null) {
                String obj = key.toString();
                if (obj.length() != 0 && (valueBuilderOrNull = toValueBuilderOrNull(entry.getValue())) != null) {
                    newBuilder.putFields(obj, valueBuilderOrNull.build());
                }
            }
        }
        return newBuilder;
    }

    @Nullable
    public static final Value.Builder toValueBuilderOrNull(@Nullable Object obj) {
        Struct.Builder structBuilderOrNull;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return ((Value) obj).toBuilder();
        }
        if (obj instanceof Value.Builder) {
            return (Value.Builder) obj;
        }
        if (obj instanceof String) {
            return toProtoValueBuilder((String) obj);
        }
        if (obj instanceof Number) {
            return toProtoValueBuilder((Number) obj);
        }
        if (obj instanceof Boolean) {
            return toProtoValueBuilder(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            ListValue.Builder listValueBuilderOrNull = toListValueBuilderOrNull((List) obj);
            if (listValueBuilderOrNull != null) {
                return toProtoValueBuilder(listValueBuilderOrNull);
            }
            return null;
        }
        if (!(obj instanceof Map) || (structBuilderOrNull = toStructBuilderOrNull((Map) obj)) == null) {
            return null;
        }
        return toProtoValueBuilder(structBuilderOrNull);
    }

    @Nullable
    public static final Value toValueOrNull(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Value.Builder) {
            return ((Value.Builder) obj).build();
        }
        Value.Builder valueBuilderOrNull = toValueBuilderOrNull(obj);
        if (valueBuilderOrNull != null) {
            return valueBuilderOrNull.build();
        }
        return null;
    }

    @NotNull
    public static final ViewabilityGeometryMetric toViewabilityGeometryMetric(@NotNull GeometryMetric geometryMetric) {
        Intrinsics.checkNotNullParameter(geometryMetric, "<this>");
        return new ViewabilityGeometryMetric(geometryMetric.getVisible(), geometryMetric.hasMinAlpha() ? Float.valueOf((float) geometryMetric.getMinAlpha()) : null, geometryMetric.hasMinWidth() ? Float.valueOf(geometryMetric.getMinWidth()) : null, geometryMetric.hasMinHeight() ? Float.valueOf(geometryMetric.getMinHeight()) : null);
    }

    @Nullable
    public static final ViewabilityLifecycleMetric toViewabilityLifecycleMetricOrNull(@NotNull LifecycleMetric lifecycleMetric) {
        ArrayList arrayList;
        ViewabilityLifecycleMetric.State state;
        Intrinsics.checkNotNullParameter(lifecycleMetric, "<this>");
        List<LifecycleMetric.LifecycleState> requiredStatesList = lifecycleMetric.getRequiredStatesList();
        boolean z = true;
        if (requiredStatesList != null) {
            arrayList = new ArrayList();
            for (final LifecycleMetric.LifecycleState lifecycleState : requiredStatesList) {
                if ((lifecycleState == null ? -1 : WhenMappings.$EnumSwitchMapping$1[lifecycleState.ordinal()]) == 1) {
                    state = ViewabilityLifecycleMetric.State.HAS_WINDOW_FOCUS;
                } else {
                    Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.ProtoUtilsKt$$ExternalSyntheticLambda3
                        @Override // io.bidmachine.utils.lazy.LazyValue
                        public final Object get() {
                            String viewabilityLifecycleMetricOrNull$lambda$25$lambda$24;
                            viewabilityLifecycleMetricOrNull$lambda$25$lambda$24 = ProtoUtilsKt.toViewabilityLifecycleMetricOrNull$lambda$25$lambda$24(LifecycleMetric.LifecycleState.this);
                            return viewabilityLifecycleMetricOrNull$lambda$25$lambda$24;
                        }
                    });
                    state = null;
                }
                if (state != null) {
                    arrayList.add(state);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        }
        if (z) {
            return null;
        }
        return new ViewabilityLifecycleMetric(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toViewabilityLifecycleMetricOrNull$lambda$25$lambda$24(LifecycleMetric.LifecycleState lifecycleState) {
        return "Unsupported LifecycleState - " + lifecycleState.name();
    }

    @NotNull
    public static final ViewabilityMeasurement toViewabilityMeasurement(@NotNull Measurement measurement) {
        Intrinsics.checkNotNullParameter(measurement, "<this>");
        return new ViewabilityMeasurement(measurement.getCount(), measurement.getIntervalMs(), measurement.hasFailureTimeoutMs() ? Long.valueOf(measurement.getFailureTimeoutMs()) : null);
    }

    @Nullable
    public static final ViewabilityOverlapMetric toViewabilityOverlapMetricOrNull(@NotNull OverlapMetric overlapMetric) {
        ViewabilityOverlapMetric.Scope scope;
        Intrinsics.checkNotNullParameter(overlapMetric, "<this>");
        final OverlapMetric.OverlapScope scope2 = overlapMetric.getScope();
        Intrinsics.checkNotNullExpressionValue(scope2, "scope");
        int i = WhenMappings.$EnumSwitchMapping$2[scope2.ordinal()];
        if (i == 1) {
            scope = ViewabilityOverlapMetric.Scope.VIEW_SIBLINGS;
        } else if (i == 2) {
            scope = ViewabilityOverlapMetric.Scope.ALL_VIEWS;
        } else {
            if (i != 3) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.ProtoUtilsKt$$ExternalSyntheticLambda2
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String viewabilityOverlapMetricOrNull$lambda$26;
                        viewabilityOverlapMetricOrNull$lambda$26 = ProtoUtilsKt.toViewabilityOverlapMetricOrNull$lambda$26(OverlapMetric.OverlapScope.this);
                        return viewabilityOverlapMetricOrNull$lambda$26;
                    }
                });
                return null;
            }
            scope = ViewabilityOverlapMetric.Scope.WINDOWS;
        }
        return new ViewabilityOverlapMetric(scope, (float) overlapMetric.getMaxOverlapPercentage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toViewabilityOverlapMetricOrNull$lambda$26(OverlapMetric.OverlapScope overlapScope) {
        Intrinsics.checkNotNullParameter(overlapScope, "$overlapScope");
        return "Unsupported OverlapScope - " + overlapScope.name();
    }

    @Nullable
    public static final ViewabilityTrackerParams toViewabilityTrackerParams(@NotNull ViewabilityConfiguration viewabilityConfiguration) {
        Intrinsics.checkNotNullParameter(viewabilityConfiguration, "<this>");
        if (viewabilityConfiguration == ViewabilityConfiguration.getDefaultInstance()) {
            return null;
        }
        List<ViewabilityRule> rulesList = viewabilityConfiguration.getRulesList();
        Intrinsics.checkNotNullExpressionValue(rulesList, "rulesList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rulesList, 10));
        for (ViewabilityRule viewabilityRule : rulesList) {
            ActionEvent actionEvent = new ActionEvent(viewabilityRule.getEvent(), viewabilityRule.getBillable());
            Measurement measurement = viewabilityRule.getMeasurement();
            Intrinsics.checkNotNullExpressionValue(measurement, "rule.measurement");
            ViewabilityMeasurement viewabilityMeasurement = toViewabilityMeasurement(measurement);
            List<MetricRequirement> requiredMetricsList = viewabilityRule.getRequiredMetricsList();
            Intrinsics.checkNotNullExpressionValue(requiredMetricsList, "rule.requiredMetricsList");
            List<MetricRequirement> sortedWith = CollectionsKt.sortedWith(requiredMetricsList, new Comparator() { // from class: io.bidmachine.utils.ProtoUtilsKt$toViewabilityTrackerParams$lambda$20$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((MetricRequirement) t).getMeasurementIndex()), Integer.valueOf(((MetricRequirement) t2).getMeasurementIndex()));
                }
            });
            ArrayList arrayList2 = new ArrayList();
            for (MetricRequirement metricRequirement : sortedWith) {
                Intrinsics.checkNotNullExpressionValue(metricRequirement, "metricRequirement");
                Metric metricOrNull = toMetricOrNull(metricRequirement);
                if (metricOrNull != null) {
                    arrayList2.add(metricOrNull);
                }
            }
            arrayList.add(new io.bidmachine.util.viewabilitytracker.model.ViewabilityRule(actionEvent, viewabilityMeasurement, arrayList2));
        }
        return new ViewabilityTrackerParams(arrayList);
    }

    @Nullable
    public static final ViewabilityVisibilityMetric toViewabilityVisibilityMetricOrNull(@NotNull VisibilityMetric visibilityMetric) {
        ViewabilityVisibilityMetric.Scope scope;
        Intrinsics.checkNotNullParameter(visibilityMetric, "<this>");
        final VisibilityMetric.VisibilityScope scope2 = visibilityMetric.getScope();
        Intrinsics.checkNotNullExpressionValue(scope2, "scope");
        int i = WhenMappings.$EnumSwitchMapping$0[scope2.ordinal()];
        if (i == 1) {
            scope = ViewabilityVisibilityMetric.Scope.PARENT_VIEW;
        } else if (i == 2) {
            scope = ViewabilityVisibilityMetric.Scope.SCREEN;
        } else {
            if (i != 3) {
                Logger.e((LazyValue<String>) new LazyValue() { // from class: io.bidmachine.utils.ProtoUtilsKt$$ExternalSyntheticLambda0
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String viewabilityVisibilityMetricOrNull$lambda$23;
                        viewabilityVisibilityMetricOrNull$lambda$23 = ProtoUtilsKt.toViewabilityVisibilityMetricOrNull$lambda$23(VisibilityMetric.VisibilityScope.this);
                        return viewabilityVisibilityMetricOrNull$lambda$23;
                    }
                });
                return null;
            }
            scope = ViewabilityVisibilityMetric.Scope.SAFE_AREA;
        }
        return new ViewabilityVisibilityMetric(scope, (float) visibilityMetric.getMinVisiblePercentage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toViewabilityVisibilityMetricOrNull$lambda$23(VisibilityMetric.VisibilityScope visibilityScope) {
        Intrinsics.checkNotNullParameter(visibilityScope, "$visibilityScope");
        return "Unsupported VisibilityScope - " + visibilityScope.name();
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.addValues(toProtoValue(z));
        return builder;
    }

    @Nullable
    public static final String encodeToStringBase64Safely(@NotNull MessageLite.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        try {
            MessageLite build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build()");
            return encodeToStringBase64Safely(build, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64Safely$default(MessageLite.Builder builder, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return encodeToStringBase64Safely(builder, i);
    }

    @Nullable
    public static final Boolean getBoolean(@NotNull ListValue listValue, int i) {
        Value values;
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        if (has(listValue, i) && (values = listValue.getValues(i)) != null) {
            return getBooleanWithCheck(values);
        }
        return null;
    }

    @Nullable
    public static final Double getDouble(@NotNull ListValue listValue, int i) {
        Value values;
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        if (has(listValue, i) && (values = listValue.getValues(i)) != null) {
            return getDoubleWithCheck(values);
        }
        return null;
    }

    @Nullable
    public static final ListValue getListValue(@NotNull ListValue listValue, int i) {
        Value values;
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        if (has(listValue, i) && (values = listValue.getValues(i)) != null) {
            return getListValueWithCheck(values);
        }
        return null;
    }

    @Nullable
    public static final String getString(@NotNull ListValue listValue, int i) {
        Value values;
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        if (has(listValue, i) && (values = listValue.getValues(i)) != null) {
            return getStringWithCheck(values);
        }
        return null;
    }

    @Nullable
    public static final Struct getStruct(@NotNull ListValue listValue, int i) {
        Value values;
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        if (has(listValue, i) && (values = listValue.getValues(i)) != null) {
            return getStructWithCheck(values);
        }
        return null;
    }

    public static final boolean has(@NotNull ListValue.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return i >= 0 && i < builder.getValuesCount();
    }

    @NotNull
    public static final Any pack(@NotNull Message.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Message build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build()");
        return pack(build);
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        builder.putFields(key, toProtoValue(z));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(boolean z) {
        Value build = toProtoValueBuilder(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Value build = toProtoValueBuilder(number).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(boolean z) {
        Value.Builder boolValue = Value.newBuilder().setBoolValue(z);
        Intrinsics.checkNotNullExpressionValue(boolValue, "newBuilder()\n        .setBoolValue(this)");
        return boolValue;
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull Struct.Builder value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull Struct value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Struct struct) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Value build = toProtoValueBuilder(struct).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull Struct value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull Struct.Builder value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Struct.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Value build = toProtoValueBuilder(builder).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        Value.Builder newBuilder = Value.newBuilder();
        Double doubleOrDefault$default = UtilsKt.toDoubleOrDefault$default(number, null, 1, null);
        Value.Builder numberValue = newBuilder.setNumberValue(doubleOrDefault$default != null ? doubleOrDefault$default.doubleValue() : number.doubleValue());
        Intrinsics.checkNotNullExpressionValue(numberValue, "newBuilder()\n        .se…rDefault() ?: toDouble())");
        return numberValue;
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull ListValue.Builder value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull ListValue value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull ListValue listValue) {
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        Value build = toProtoValueBuilder(listValue).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final ListValue.Builder addValue(@NotNull ListValue.Builder builder, @NotNull ListValue value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String key, @NotNull ListValue.Builder value) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull ListValue.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Value build = toProtoValueBuilder(builder).build();
        Intrinsics.checkNotNullExpressionValue(build, "toProtoValueBuilder().build()");
        return build;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull Struct struct) {
        Intrinsics.checkNotNullParameter(struct, "<this>");
        Value.Builder structValue = Value.newBuilder().setStructValue(struct);
        Intrinsics.checkNotNullExpressionValue(structValue, "newBuilder()\n        .setStructValue(this)");
        return structValue;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull Struct.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Value.Builder structValue = Value.newBuilder().setStructValue(builder);
        Intrinsics.checkNotNullExpressionValue(structValue, "newBuilder()\n        .setStructValue(this)");
        return structValue;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull ListValue listValue) {
        Intrinsics.checkNotNullParameter(listValue, "<this>");
        Value.Builder listValue2 = Value.newBuilder().setListValue(listValue);
        Intrinsics.checkNotNullExpressionValue(listValue2, "newBuilder()\n        .setListValue(this)");
        return listValue2;
    }

    @NotNull
    public static final Value.Builder toProtoValueBuilder(@NotNull ListValue.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Value.Builder listValue = Value.newBuilder().setListValue(builder);
        Intrinsics.checkNotNullExpressionValue(listValue, "newBuilder()\n        .setListValue(this)");
        return listValue;
    }
}
