package io.bidmachine.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.RendererConfiguration;

/* loaded from: classes3.dex */
public abstract class UnifiedFullscreenAd extends UnifiedAd<UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    public void onClosed(boolean z) {
    }

    public void onFinished() {
    }

    public abstract void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable;
}
