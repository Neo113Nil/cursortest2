package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.MyTracker;
import io.bidmachine.AdFormat;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.INativeRequestBuilder;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.protobuf.ResponsePayload;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class NativeRequest extends AdRequest<NativeRequest, NativeAdRequestParameters, UnifiedNativeAdRequestParams> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<NativeRequest> {
    }

    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, NativeRequest, NativeAdRequestParameters> implements INativeRequestBuilder<Builder> {
        @Deprecated(since = MyTracker.VERSION)
        public Builder() {
            this(AdPlacementConfig.nativeBuilder().build());
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
        public NativeAdRequestParameters createAdRequestParameters() {
            return new NativeAdRequestParameters(this.adPlacementConfig);
        }

        @Override // io.bidmachine.models.INativeRequestBuilder
        @Deprecated(since = MyTracker.VERSION)
        public Builder setMediaAssetTypes(@NonNull MediaAssetType... mediaAssetTypeArr) {
            if (mediaAssetTypeArr.length == 0) {
                return this;
            }
            this.adPlacementConfig = this.adPlacementConfig.newBuilder(AdFormat.createNative(Arrays.asList(mediaAssetTypeArr))).build();
            return this;
        }

        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, io.bidmachine.models.RequestBuilder
        @NonNull
        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(@Nullable List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
        @NonNull
        public NativeRequest build(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
            return new NativeRequest(nativeAdRequestParameters);
        }
    }

    private static class b extends UnifiedAdRequestParamsImpl implements UnifiedNativeAdRequestParams {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        public /* bridge */ /* synthetic */ NativeAdRequestParameters getAdRequestParameters() {
            return (NativeAdRequestParameters) super.getAdRequestParameters();
        }

        private b(NativeAdRequestParameters nativeAdRequestParameters, TargetingInfo targetingInfo, DataRestrictions dataRestrictions) {
            super(nativeAdRequestParameters, targetingInfo, dataRestrictions);
        }
    }

    public boolean containsAssetType(@NonNull MediaAssetType mediaAssetType) {
        return getAdRequestParameters().containsAssetType(mediaAssetType);
    }

    @Override // io.bidmachine.AdRequest
    protected void processBidPayload(@NonNull ResponsePayload responsePayload) {
        getAdRequestParameters().setValidateAssets(false);
        super.processBidPayload(responsePayload);
    }

    private NativeRequest(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
        super(nativeAdRequestParameters);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedNativeAdRequestParams createUnifiedAdRequestParams(@NonNull NativeAdRequestParameters nativeAdRequestParameters, @NonNull TargetingInfo targetingInfo, @NonNull DataRestrictions dataRestrictions) {
        return new b(nativeAdRequestParameters, targetingInfo, dataRestrictions);
    }
}
