package io.bidmachine.displays;

import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016JR\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u001a"}, d2 = {"Lio/bidmachine/displays/NativePlacementBuilder;", "Lio/bidmachine/displays/PlacementBuilder;", "Lio/bidmachine/unified/UnifiedNativeAdRequestParams;", "()V", "createAdObjectParams", "Lio/bidmachine/models/AdObjectParams;", "ad", "Lcom/explorestack/protobuf/adcom/Ad;", "createPlacement", "Lcom/explorestack/protobuf/Message$Builder;", "contextProvider", "Lio/bidmachine/ContextProvider;", "adRequestParams", "adsType", "Lio/bidmachine/AdsType;", "networkConfigs", "", "Lio/bidmachine/NetworkConfig;", "networkAdUnits", "", "Lio/bidmachine/NetworkAdUnit;", "adPlacementConfig", "Lio/bidmachine/AdPlacementConfig;", "networksLoadingTimeOutSec", "", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NativePlacementBuilder extends PlacementBuilder<UnifiedNativeAdRequestParams> {
    public static final int AD_LABEL_ASSET_ID = 101;
    public static final int CTA_ASSET_ID = 8;
    public static final int DESC_ASSET_ID = 127;
    public static final int DISCLAIMER_ASSET_ID = 103;
    public static final int ICON_ASSET_ID = 124;
    public static final int IMAGE_ASSET_ID = 128;
    public static final int PRIVACY_SHEET_ASSET_ID = 102;
    public static final int RATING_ASSET_ID = 7;
    public static final int TITLE_ASSET_ID = 123;
    public static final int VIDEO_ASSET_ID = 4;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy TITLE_ASSET$delegate = LazyKt.lazy(g.a);

    @NotNull
    private static final Lazy DESC_ASSET$delegate = LazyKt.lazy(c.a);

    @NotNull
    private static final Lazy CTA_ASSET$delegate = LazyKt.lazy(b.a);

    @NotNull
    private static final Lazy RATING_ASSET$delegate = LazyKt.lazy(f.a);

    @NotNull
    private static final Lazy AD_LABEL_ASSET$delegate = LazyKt.lazy(a.a);

    @NotNull
    private static final Lazy PRIVACY_SHEET_ASSET$delegate = LazyKt.lazy(e.a);

    @NotNull
    private static final Lazy DISCLAIMER_ASSET$delegate = LazyKt.lazy(d.a);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\u000e\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R\u000e\u0010\u0012\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\u0006R\u000e\u0010\u0016\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001a\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010 \u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R\u000e\u0010$\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lio/bidmachine/displays/NativePlacementBuilder$Companion;", "", "()V", "AD_LABEL_ASSET", "Lcom/explorestack/protobuf/adcom/Placement$DisplayPlacement$NativeFormat$AssetFormat$Builder;", "getAD_LABEL_ASSET", "()Lcom/explorestack/protobuf/adcom/Placement$DisplayPlacement$NativeFormat$AssetFormat$Builder;", "AD_LABEL_ASSET$delegate", "Lkotlin/Lazy;", "AD_LABEL_ASSET_ID", "", "CTA_ASSET", "getCTA_ASSET", "CTA_ASSET$delegate", "CTA_ASSET_ID", "DESC_ASSET", "getDESC_ASSET", "DESC_ASSET$delegate", "DESC_ASSET_ID", "DISCLAIMER_ASSET", "getDISCLAIMER_ASSET", "DISCLAIMER_ASSET$delegate", "DISCLAIMER_ASSET_ID", "ICON_ASSET_ID", "IMAGE_ASSET_ID", "PRIVACY_SHEET_ASSET", "getPRIVACY_SHEET_ASSET", "PRIVACY_SHEET_ASSET$delegate", "PRIVACY_SHEET_ASSET_ID", "RATING_ASSET", "getRATING_ASSET", "RATING_ASSET$delegate", "RATING_ASSET_ID", "TITLE_ASSET", "getTITLE_ASSET", "TITLE_ASSET$delegate", "TITLE_ASSET_ID", "VIDEO_ASSET_ID", "createIconAsset", "Lcom/explorestack/protobuf/adcom/Placement$DisplayPlacement$NativeFormat$AssetFormat;", "adRequestParams", "Lio/bidmachine/unified/UnifiedNativeAdRequestParams;", "createImageAsset", "createVideoAsset", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getAD_LABEL_ASSET() {
            Object value = NativePlacementBuilder.AD_LABEL_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-AD_LABEL_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getCTA_ASSET() {
            Object value = NativePlacementBuilder.CTA_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-CTA_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getDESC_ASSET() {
            Object value = NativePlacementBuilder.DESC_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-DESC_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getDISCLAIMER_ASSET() {
            Object value = NativePlacementBuilder.DISCLAIMER_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-DISCLAIMER_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getPRIVACY_SHEET_ASSET() {
            Object value = NativePlacementBuilder.PRIVACY_SHEET_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-PRIVACY_SHEET_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getRATING_ASSET() {
            Object value = NativePlacementBuilder.RATING_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-RATING_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder getTITLE_ASSET() {
            Object value = NativePlacementBuilder.TITLE_ASSET$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-TITLE_ASSET>(...)");
            return (Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder) value;
        }

        @VisibleForTesting
        @NotNull
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat createIconAsset(@NotNull UnifiedNativeAdRequestParams adRequestParams) {
            Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
            Placement.DisplayPlacement.NativeFormat.AssetFormat build = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(124).setReq(adRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Icon)).setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Constants.IMAGE_MIME_TYPES).build()).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
            return build;
        }

        @VisibleForTesting
        @NotNull
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat createImageAsset(@NotNull UnifiedNativeAdRequestParams adRequestParams) {
            Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
            Placement.DisplayPlacement.NativeFormat.AssetFormat build = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(128).setReq(adRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Image)).setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Constants.IMAGE_MIME_TYPES).build()).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
            return build;
        }

        @VisibleForTesting
        @NotNull
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat createVideoAsset(@NotNull UnifiedNativeAdRequestParams adRequestParams) {
            Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
            Placement.DisplayPlacement.NativeFormat.AssetFormat build = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(4).setReq(adRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Video)).setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Constants.VIDEO_MIME_TYPES).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build()).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
            return build;
        }

        private Companion() {
        }
    }

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(101).setReq(false);
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(8).setReq(true).setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(127).setReq(true).setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(103).setReq(false);
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(102).setReq(false);
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(7).setReq(false).setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
        }
    }

    static final class g extends Lambda implements Function0 {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mo4828invoke() {
            return Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder().setId(123).setReq(true).setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
        }
    }

    public NativePlacementBuilder() {
        super(AdContentType.All);
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    @Nullable
    public AdObjectParams createAdObjectParams(@NotNull Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
        return (createHeaderBiddingAdObjectParams == null && ad.hasDisplay() && ad.getDisplay().hasNative()) ? new NativeAdObjectParams(ad) : createHeaderBiddingAdObjectParams;
    }

    @Override // io.bidmachine.displays.PlacementBuilder
    public /* bridge */ /* synthetic */ Message.Builder createPlacement(ContextProvider contextProvider, UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i) {
        return createPlacement2(contextProvider, unifiedNativeAdRequestParams, adsType, (Collection<NetworkConfig>) collection, (List<NetworkAdUnit>) list, adPlacementConfig, i);
    }

    @NotNull
    /* renamed from: createPlacement, reason: avoid collision after fix types in other method */
    public Message.Builder createPlacement2(@NotNull ContextProvider contextProvider, @NotNull UnifiedNativeAdRequestParams adRequestParams, @NotNull AdsType adsType, @NotNull Collection<NetworkConfig> networkConfigs, @NotNull List<NetworkAdUnit> networkAdUnits, @Nullable AdPlacementConfig adPlacementConfig, int networksLoadingTimeOutSec) throws Exception {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(adsType, "adsType");
        Intrinsics.checkNotNullParameter(networkConfigs, "networkConfigs");
        Intrinsics.checkNotNullParameter(networkAdUnits, "networkAdUnits");
        Placement.DisplayPlacement.NativeFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
        Companion companion = INSTANCE;
        Placement.DisplayPlacement.NativeFormat.Builder addAsset = newBuilder.addAsset(companion.getTITLE_ASSET()).addAsset(companion.getDESC_ASSET()).addAsset(companion.getCTA_ASSET()).addAsset(companion.getRATING_ASSET()).addAsset(companion.createIconAsset(adRequestParams)).addAsset(companion.createImageAsset(adRequestParams)).addAsset(companion.createVideoAsset(adRequestParams)).addAsset(companion.getAD_LABEL_ASSET()).addAsset(companion.getPRIVACY_SHEET_ASSET()).addAsset(companion.getDISCLAIMER_ASSET());
        Intrinsics.checkNotNullExpressionValue(addAsset, "newBuilder()\n           …ddAsset(DISCLAIMER_ASSET)");
        Placement.DisplayPlacement.Builder nativefmt = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Constants.IMAGE_MIME_TYPES).addAllMime(Constants.VIDEO_MIME_TYPES).setNativefmt(addAsset);
        Intrinsics.checkNotNullExpressionValue(nativefmt, "newBuilder()\n           …efmt(nativeFormatBuilder)");
        HeaderBiddingPlacement.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, adRequestParams, adsType, networkConfigs, networkAdUnits, networksLoadingTimeOutSec);
        if (adPlacementConfig == null && createHeaderBiddingPlacement != null) {
            nativefmt.addExtProto(ProtoUtilsKt.pack(createHeaderBiddingPlacement));
        } else if (adPlacementConfig != null) {
            io.bidmachine.protobuf.sdk.Placement createSdkPlacement = createSdkPlacement(adPlacementConfig, createHeaderBiddingPlacement);
            Intrinsics.checkNotNullExpressionValue(createSdkPlacement, "createSdkPlacement(\n    …acement\n                )");
            nativefmt.addExtProto(ProtoUtilsKt.pack(createSdkPlacement));
        }
        return nativefmt;
    }
}
