package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequest;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.displays.PlacementBuilder;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;

/* loaded from: classes.dex */
public abstract class FullScreenAdRequest<SelfType extends FullScreenAdRequest<SelfType>> extends AdRequest<SelfType, FullScreenAdRequestParameters, UnifiedFullscreenAdRequestParams> {

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class FullScreenRequestBuilder<SelfType extends FullScreenRequestBuilder<SelfType, ReturnType>, ReturnType extends FullScreenAdRequest<ReturnType>> extends AdRequest.AdRequestBuilderImpl<SelfType, ReturnType, FullScreenAdRequestParameters> {
        protected FullScreenRequestBuilder(@NonNull AdPlacementConfig adPlacementConfig) {
            super(adPlacementConfig);
        }

        protected SelfType setAdContentType(@NonNull AdContentType adContentType) {
            return this;
        }
    }

    private static class b extends UnifiedAdRequestParamsImpl implements UnifiedFullscreenAdRequestParams {
        @Override // io.bidmachine.UnifiedAdRequestParamsImpl, io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
        public /* bridge */ /* synthetic */ FullScreenAdRequestParameters getAdRequestParameters() {
            return (FullScreenAdRequestParameters) super.getAdRequestParameters();
        }

        private b(FullScreenAdRequestParameters fullScreenAdRequestParameters, TargetingInfo targetingInfo, DataRestrictions dataRestrictions) {
            super(fullScreenAdRequestParameters, targetingInfo, dataRestrictions);
        }
    }

    protected FullScreenAdRequest(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    @NonNull
    public AdContentType getAdContentType() {
        return getAdRequestParameters().getAdContentType();
    }

    @Override // io.bidmachine.AdRequest
    boolean isPlacementBuilderMatch(@NonNull PlacementBuilder placementBuilder) {
        return super.isPlacementBuilderMatch(placementBuilder) && getAdRequestParameters().isContentTypeMatch(placementBuilder.getAdContentType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdRequest
    @NonNull
    public UnifiedFullscreenAdRequestParams createUnifiedAdRequestParams(@NonNull FullScreenAdRequestParameters fullScreenAdRequestParameters, @NonNull TargetingInfo targetingInfo, @NonNull DataRestrictions dataRestrictions) {
        return new b(fullScreenAdRequestParameters, targetingInfo, dataRestrictions);
    }
}
