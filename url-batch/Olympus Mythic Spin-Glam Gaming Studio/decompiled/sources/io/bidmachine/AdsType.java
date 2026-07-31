package io.bidmachine;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.DisplayPlacementBuilder;
import io.bidmachine.displays.NativePlacementBuilder;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Banner' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class AdsType {
    public static final AdsType Banner;
    public static final AdsType Interstitial;
    public static final AdsType Rewarded;

    @NonNull
    private final ApiRequest.ApiAuctionDataBinder binder;

    @NonNull
    private final String name;

    @NonNull
    private final PlacementBuilder[] placementBuilders;

    @NonNull
    private final Executor placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));
    public static final AdsType Native = new AdsType("Native", 3, "native", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new NativePlacementBuilder()});
    private static final /* synthetic */ AdsType[] $VALUES = $values();

    class b implements Runnable {
        final /* synthetic */ PlacementBuilder a;
        final /* synthetic */ ContextProvider b;
        final /* synthetic */ UnifiedAdRequestParams c;
        final /* synthetic */ Collection d;
        final /* synthetic */ List e;
        final /* synthetic */ AdPlacementConfig f;
        final /* synthetic */ int g;
        final /* synthetic */ List h;
        final /* synthetic */ CountDownLatch i;

        b(PlacementBuilder placementBuilder, ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i, List list2, CountDownLatch countDownLatch) {
            this.a = placementBuilder;
            this.b = contextProvider;
            this.c = unifiedAdRequestParams;
            this.d = collection;
            this.e = list;
            this.f = adPlacementConfig;
            this.g = i;
            this.h = list2;
            this.i = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Message.Builder createPlacement = this.a.createPlacement(this.b, this.c, AdsType.this, this.d, this.e, this.f, this.g);
                synchronized (this.h) {
                    this.h.add(createPlacement);
                }
                this.i.countDown();
            } catch (Exception e) {
                Logger.w(e);
                this.i.countDown();
            }
        }
    }

    private static /* synthetic */ AdsType[] $values() {
        return new AdsType[]{Banner, Interstitial, Rewarded, Native};
    }

    static {
        final boolean z = false;
        final boolean z2 = true;
        Banner = new AdsType("Banner", 0, "banner", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(z) { // from class: io.bidmachine.AdsType.a
            @Override // io.bidmachine.displays.DisplayPlacementBuilder
            public Size getSize(ContextProvider contextProvider, UnifiedBannerAdRequestParams unifiedBannerAdRequestParams) {
                return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerAdSize().toSize();
            }
        }});
        Interstitial = new AdsType("Interstitial", 1, "interstitial", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new PlacementBuilder<UnifiedAdRequestParamsType>(z2) { // from class: io.bidmachine.displays.VideoPlacementBuilder
            private final boolean canSkip;

            {
                super(AdContentType.Video);
                this.canSkip = z2;
            }

            @Override // io.bidmachine.displays.PlacementBuilder
            @Nullable
            public AdObjectParams createAdObjectParams(@NonNull Ad ad) {
                if (!ad.hasVideo()) {
                    return null;
                }
                AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
                if (createHeaderBiddingAdObjectParams != null) {
                    return createHeaderBiddingAdObjectParams;
                }
                Ad.Video video = ad.getVideo();
                c cVar = new c(ad);
                cVar.setCreativeAdm(video.getAdm());
                return cVar;
            }

            @Override // io.bidmachine.displays.PlacementBuilder
            @NonNull
            public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i) throws Exception {
                Size size = getSize(contextProvider, unifiedadrequestparamstype);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.canSkip).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(size.getWidth()).setH(size.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Constants.VIDEO_MIME_TYPES).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i);
                if (adPlacementConfig == null && createHeaderBiddingPlacement != null) {
                    linearValue.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
                } else if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, createHeaderBiddingPlacement)));
                }
                return linearValue;
            }

            public Size getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype) {
                return Utils.getScreenSize(contextProvider.getContext());
            }
        }});
        Rewarded = new AdsType("Rewarded", 2, "rewarded", new ApiRequest.ApiAuctionDataBinder(), new PlacementBuilder[]{new DisplayPlacementBuilder(true), new PlacementBuilder<UnifiedAdRequestParamsType>(z) { // from class: io.bidmachine.displays.VideoPlacementBuilder
            private final boolean canSkip;

            {
                super(AdContentType.Video);
                this.canSkip = z;
            }

            @Override // io.bidmachine.displays.PlacementBuilder
            @Nullable
            public AdObjectParams createAdObjectParams(@NonNull Ad ad) {
                if (!ad.hasVideo()) {
                    return null;
                }
                AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
                if (createHeaderBiddingAdObjectParams != null) {
                    return createHeaderBiddingAdObjectParams;
                }
                Ad.Video video = ad.getVideo();
                c cVar = new c(ad);
                cVar.setCreativeAdm(video.getAdm());
                return cVar;
            }

            @Override // io.bidmachine.displays.PlacementBuilder
            @NonNull
            public Message.Builder createPlacement(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype, @NonNull AdsType adsType, @NonNull Collection<NetworkConfig> collection, @NonNull List<NetworkAdUnit> list, @Nullable AdPlacementConfig adPlacementConfig, int i) throws Exception {
                Size size = getSize(contextProvider, unifiedadrequestparamstype);
                Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.canSkip).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(size.getWidth()).setH(size.getHeight()).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Constants.VIDEO_MIME_TYPES).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
                HeaderBiddingPlacement.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i);
                if (adPlacementConfig == null && createHeaderBiddingPlacement != null) {
                    linearValue.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
                } else if (adPlacementConfig != null) {
                    linearValue.addExtProto(Any.pack(createSdkPlacement(adPlacementConfig, createHeaderBiddingPlacement)));
                }
                return linearValue;
            }

            public Size getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype) {
                return Utils.getScreenSize(contextProvider.getContext());
            }
        }});
    }

    private AdsType(@NonNull String str, @NonNull int i, @NonNull String str2, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, PlacementBuilder[] placementBuilderArr) {
        this.name = str2;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = placementBuilderArr;
    }

    public static AdsType valueOf(String str) {
        return (AdsType) Enum.valueOf(AdsType.class, str);
    }

    public static AdsType[] values() {
        return (AdsType[]) $VALUES.clone();
    }

    void collectPlacements(@NonNull ContextProvider contextProvider, @NonNull AdRequest adRequest, @NonNull UnifiedAdRequestParams unifiedAdRequestParams, @NonNull Collection<NetworkConfig> collection, @NonNull List<Message.Builder> list, @NonNull List<NetworkAdUnit> list2, @Nullable AdPlacementConfig adPlacementConfig, int i) {
        PlacementBuilder[] placementBuilderArr;
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        PlacementBuilder[] placementBuilderArr2 = adsType.placementBuilders;
        int length = placementBuilderArr2.length;
        int i2 = 0;
        while (i2 < length) {
            PlacementBuilder placementBuilder = placementBuilderArr2[i2];
            if (adRequest.isPlacementBuilderMatch(placementBuilder)) {
                placementBuilderArr = placementBuilderArr2;
                adsType.placementCreateExecutor.execute(new b(placementBuilder, contextProvider, unifiedAdRequestParams, collection, list2, adPlacementConfig, i, list, countDownLatch));
            } else {
                placementBuilderArr = placementBuilderArr2;
                countDownLatch.countDown();
            }
            i2++;
            adsType = this;
            placementBuilderArr2 = placementBuilderArr;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            Logger.w(e);
        }
    }

    @Nullable
    AdObjectParams createAdObjectParams(@NonNull String str, @NonNull Ad ad) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            AdObjectParams createAdObjectParams = placementBuilder.createAdObjectParams(ad);
            if (createAdObjectParams != null) {
                createAdObjectParams.getData().put(UnifiedMediationParams.KEY_BID_ID, str);
                return createAdObjectParams;
            }
        }
        return null;
    }

    @Nullable
    NetworkAdapter findNetworkAdapter(@NonNull Ad ad) {
        HeaderBiddingAd obtainHeaderBiddingAd = obtainHeaderBiddingAd(ad);
        NetworkAdapter adapter = obtainHeaderBiddingAd != null ? NetworkRegistry.getAdapter(obtainHeaderBiddingAd.getBidder()) : null;
        return adapter == null ? this == Native ? NetworkRegistry.getAdapter(NastAdapter.KEY) : ad.hasDisplay() ? NetworkRegistry.getAdapter("mraid") : ad.hasVideo() ? NetworkRegistry.getAdapter("vast") : adapter : adapter;
    }

    @NonNull
    ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    @Nullable
    HeaderBiddingAd obtainHeaderBiddingAd(@NonNull Ad ad) {
        for (PlacementBuilder placementBuilder : this.placementBuilders) {
            HeaderBiddingAd obtainHeaderBiddingAd = placementBuilder.obtainHeaderBiddingAd(ad);
            if (obtainHeaderBiddingAd != null) {
                return obtainHeaderBiddingAd;
            }
        }
        return null;
    }
}
