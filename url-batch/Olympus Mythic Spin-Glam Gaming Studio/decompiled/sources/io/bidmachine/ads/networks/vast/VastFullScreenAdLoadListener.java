package io.bidmachine.ads.networks.vast;

import io.bidmachine.iab.IabError;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestListener;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.IabUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/bidmachine/ads/networks/vast/VastFullScreenAdLoadListener;", "Lio/bidmachine/iab/vast/VastRequestListener;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "(Lio/bidmachine/unified/UnifiedFullscreenAdCallback;)V", "onVastLoadFailed", "", "vastRequest", "Lio/bidmachine/iab/vast/VastRequest;", "iabError", "Lio/bidmachine/iab/IabError;", "onVastLoaded", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VastFullScreenAdLoadListener implements VastRequestListener {

    @NotNull
    private final UnifiedFullscreenAdCallback callback;

    public VastFullScreenAdLoadListener(@NotNull UnifiedFullscreenAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // io.bidmachine.iab.vast.VastRequestListener
    public void onVastLoadFailed(@NotNull VastRequest vastRequest, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        if (iabError.getCode() == 6) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(IabUtilsKt.toBMError(iabError));
        }
    }

    @Override // io.bidmachine.iab.vast.VastRequestListener
    public void onVastLoaded(@NotNull VastRequest vastRequest) {
        Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
        this.callback.onAdLoaded();
    }
}
