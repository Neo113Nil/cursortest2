package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.nativead.NativeAdRequestParameters;

/* loaded from: classes10.dex */
public interface UnifiedNativeAdRequestParams extends UnifiedAdRequestParams {
    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    NativeAdRequestParameters getAdRequestParameters();
}
