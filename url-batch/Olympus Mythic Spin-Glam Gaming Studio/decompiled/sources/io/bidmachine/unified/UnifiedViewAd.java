package io.bidmachine.unified;

import androidx.annotation.Nullable;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedAdRequestParams;

/* loaded from: classes4.dex */
public abstract class UnifiedViewAd<UnifiedAdCallbackType extends UnifiedAdCallback, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends UnifiedAd<UnifiedAdCallbackType, UnifiedAdRequestParamsType> {
    public void prepareToShow(@Nullable RendererConfiguration rendererConfiguration) throws Throwable {
    }
}
