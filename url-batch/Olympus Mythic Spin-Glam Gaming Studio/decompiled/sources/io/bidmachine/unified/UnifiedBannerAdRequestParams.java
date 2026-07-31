package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.banner.BannerAdRequestParameters;

/* loaded from: classes6.dex */
public interface UnifiedBannerAdRequestParams extends UnifiedAdRequestParams {
    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    BannerAdRequestParameters getAdRequestParameters();
}
