package io.bidmachine;

import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.AbstractC6010e;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003:\u0001!B/\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lio/bidmachine/FullScreenAdObject;", "Lio/bidmachine/FullScreenAdRequest;", "AdRequestType", "Lio/bidmachine/AdObjectImpl;", "Lio/bidmachine/models/AdObjectParams;", "Lio/bidmachine/unified/UnifiedFullscreenAd;", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "Lio/bidmachine/unified/UnifiedFullscreenAdRequestParams;", "Lio/bidmachine/ContextProvider;", "contextProvider", "Lio/bidmachine/AdProcessCallback;", "adProcessCallback", "adRequest", "adObjectParams", "unifiedAd", "<init>", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/AdProcessCallback;Lio/bidmachine/FullScreenAdRequest;Lio/bidmachine/models/AdObjectParams;Lio/bidmachine/unified/UnifiedFullscreenAd;)V", "createUnifiedCallback", "(Lio/bidmachine/AdProcessCallback;)Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "Lio/bidmachine/RendererConfiguration;", "rendererConfiguration", "", "show", "(Lio/bidmachine/ContextProvider;Lio/bidmachine/RendererConfiguration;)V", "onShowFailed", "()V", "", "finished", "onClosed", "(Z)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedFullscreenAd, UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {

    @NotNull
    private final AtomicBoolean isShowing;

    private static final class a extends AbstractC6010e implements UnifiedFullscreenAdCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdClosed() {
            a().processClosed();
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdFinished() {
            a().processFinished();
        }

        @Override // io.bidmachine.unified.UnifiedFullscreenAdCallback
        public void onAdLoaded() {
            a().processLoadSuccess();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenAdObject(@NotNull ContextProvider contextProvider, @NotNull AdProcessCallback adProcessCallback, @NotNull AdRequestType adRequest, @NotNull AdObjectParams adObjectParams, @NotNull UnifiedFullscreenAd unifiedAd) {
        super(contextProvider, adProcessCallback, adRequest, adObjectParams, unifiedAd);
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObjectParams, "adObjectParams");
        Intrinsics.checkNotNullParameter(unifiedAd, "unifiedAd");
        this.isShowing = new AtomicBoolean(false);
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onClosed(boolean finished) {
        this.isShowing.set(false);
        super.onClosed(finished);
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    public final void show(@NotNull ContextProvider contextProvider, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        if (this.isShowing.get()) {
            Logger.d("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        getUnifiedAd().show(contextProvider, getUnifiedAdCallback(), rendererConfiguration);
        getAdProcessCallback().processFillAd();
    }

    @Override // io.bidmachine.models.AdObject
    @NotNull
    public UnifiedFullscreenAdCallback createUnifiedCallback(@NotNull AdProcessCallback adProcessCallback) {
        Intrinsics.checkNotNullParameter(adProcessCallback, "adProcessCallback");
        return new a(adProcessCallback);
    }
}
