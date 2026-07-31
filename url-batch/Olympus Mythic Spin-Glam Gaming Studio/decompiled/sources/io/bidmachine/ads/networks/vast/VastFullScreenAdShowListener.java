package io.bidmachine.ads.networks.vast;

import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.vast.VastActivityListener;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.activity.VastActivity;
import io.bidmachine.internal.C6022q;
import io.bidmachine.internal.P;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.ClickPostMethod;
import io.bidmachine.utils.IabUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J)\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006#"}, d2 = {"Lio/bidmachine/ads/networks/vast/VastFullScreenAdShowListener;", "Lio/bidmachine/iab/vast/VastActivityListener;", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/internal/P;", "vastOMSDKAdMeasurer", "Lio/bidmachine/internal/q;", "postBannerAdMeasurer", "<init>", "(Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/internal/P;Lio/bidmachine/internal/q;)V", "Lio/bidmachine/iab/vast/activity/VastActivity;", "vastActivity", "Lio/bidmachine/iab/vast/VastRequest;", "vastRequest", "", "onVastShown", "(Lio/bidmachine/iab/vast/activity/VastActivity;Lio/bidmachine/iab/vast/VastRequest;)V", "Lio/bidmachine/iab/IabError;", "iabError", "onVastShowFailed", "(Lio/bidmachine/iab/vast/VastRequest;Lio/bidmachine/iab/IabError;)V", "Lio/bidmachine/iab/utils/IabClickCallback;", "iabClickCallback", "", "url", "onVastClick", "(Lio/bidmachine/iab/vast/activity/VastActivity;Lio/bidmachine/iab/vast/VastRequest;Lio/bidmachine/iab/utils/IabClickCallback;Ljava/lang/String;)V", "onVastComplete", "", "finished", "onVastDismiss", "(Lio/bidmachine/iab/vast/activity/VastActivity;Lio/bidmachine/iab/vast/VastRequest;Z)V", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "Lio/bidmachine/internal/P;", "Lio/bidmachine/internal/q;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class VastFullScreenAdShowListener implements VastActivityListener {

    @NotNull
    private final UnifiedFullscreenAdCallback callback;

    @Nullable
    private final C6022q postBannerAdMeasurer;

    @Nullable
    private final P vastOMSDKAdMeasurer;

    public VastFullScreenAdShowListener(@NotNull UnifiedFullscreenAdCallback callback, @Nullable P p, @Nullable C6022q c6022q) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.vastOMSDKAdMeasurer = p;
        this.postBannerAdMeasurer = c6022q;
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastClick(@NotNull VastActivity vastActivity, @NotNull VastRequest vastRequest, @NotNull IabClickCallback iabClickCallback, @NotNull String url) {
        Intrinsics.checkNotNullParameter(vastActivity, "vastActivity");
        Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        Intrinsics.checkNotNullParameter(url, "url");
        UrlHandler.openUrl(vastActivity, url, new ClickPostMethod(this.callback, iabClickCallback));
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastComplete(@NotNull VastActivity vastActivity, @NotNull VastRequest vastRequest) {
        Intrinsics.checkNotNullParameter(vastActivity, "vastActivity");
        Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
        P p = this.vastOMSDKAdMeasurer;
        if (p != null) {
            p.a();
        }
        this.callback.onAdFinished();
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastDismiss(@NotNull VastActivity vastActivity, @Nullable VastRequest vastRequest, boolean finished) {
        Intrinsics.checkNotNullParameter(vastActivity, "vastActivity");
        C6022q c6022q = this.postBannerAdMeasurer;
        if (c6022q != null) {
            c6022q.a();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastShowFailed(@Nullable VastRequest vastRequest, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdShowFailed(IabUtilsKt.toBMError(iabError));
    }

    @Override // io.bidmachine.iab.vast.VastActivityListener
    public void onVastShown(@NotNull VastActivity vastActivity, @NotNull VastRequest vastRequest) {
        Intrinsics.checkNotNullParameter(vastActivity, "vastActivity");
        Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
        this.callback.onAdShown();
    }
}
