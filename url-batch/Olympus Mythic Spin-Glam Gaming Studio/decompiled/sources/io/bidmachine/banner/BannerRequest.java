package io.bidmachine.banner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.MyTracker;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.BannerAdSize;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.IBannerRequestBuilder;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import java.util.List;

/* loaded from: classes14.dex */
public final class BannerRequest extends AdRequest<BannerRequest, BannerAdRequestParameters, UnifiedBannerAdRequestParams> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<BannerRequest> {
    }

    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, BannerRequest, BannerAdRequestParameters> implements IBannerRequestBuilder<Builder> {
        @Deprecated(since = MyTracker.VERSION)
        public Builder() {
            super(AdPlacementConfig.bannerBuilder().build());
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setBidPayload(@Nullable String str) {
            return super.setBidPayload(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated(since = MyTracker.VERSION)
        public /* bridge */ /* synthetic */ RequestBuilder setCustomParams(@Nullable CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setListener(@Nullable AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setLoadingTimeOut(@Nullable Integer num) {
            return super.setLoadingTimeOut(num);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable String str) {
            return super.setNetworks(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated(since = MyTracker.VERSION)
        public /* bridge */ /* synthetic */ RequestBuilder setPlacementId(@Nullable String str) {
            return super.setPlacementId(str);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setPriceFloorParams(@Nullable PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        @Deprecated
        public /* bridge */ /* synthetic */ RequestBuilder setSessionAdParams(@Nullable SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setTargetingParams(@Nullable TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public Builder(@NonNull AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public BannerAdRequestParameters createAdRequestParameters() {
            return new BannerAdRequestParameters(this.adPlacementConfig);
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.models.IBannerRequestBuilder
        @Deprecated(since = MyTracker.VERSION)
        public Builder setSize(@NonNull BannerSize bannerSize) {
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createBanner(BannerSize.toBannerAdSize(bannerSize))).build();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public BannerRequest build(@NonNull BannerAdRequestParameters bannerAdRequestParameters) {
            return new BannerRequest(bannerAdRequestParameters);
        }
    }

    private static class b extends UnifiedAdRequestParamsImpl implements UnifiedBannerAdRequestParams {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        public /* bridge */ /* synthetic */ BannerAdRequestParameters getAdRequestParameters() {
            return (BannerAdRequestParameters) super.getAdRequestParameters();
        }

        private b(BannerAdRequestParameters bannerAdRequestParameters, TargetingInfo targetingInfo, DataRestrictions dataRestrictions) {
            super(bannerAdRequestParameters, targetingInfo, dataRestrictions);
        }
    }

    @NonNull
    public BannerAdSize getBannerAdSize() {
        return getAdRequestParameters().getBannerAdSize();
    }

    @Deprecated(since = MyTracker.VERSION)
    public BannerSize getSize() {
        return BannerSize.fromBannerAdSize(getBannerAdSize());
    }

    private BannerRequest(@NonNull BannerAdRequestParameters bannerAdRequestParameters) {
        super(bannerAdRequestParameters);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedBannerAdRequestParams createUnifiedAdRequestParams(@NonNull BannerAdRequestParameters bannerAdRequestParameters, @NonNull TargetingInfo targetingInfo, @NonNull DataRestrictions dataRestrictions) {
        return new b(bannerAdRequestParameters, targetingInfo, dataRestrictions);
    }
}
