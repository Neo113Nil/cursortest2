package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.iab.mraid.MraidViewListener;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.utils.ClickPostMethod;
import io.bidmachine.utils.IabUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidBannerAdListener;", "Lio/bidmachine/iab/mraid/MraidViewListener;", "callback", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "(Lio/bidmachine/unified/UnifiedBannerAdCallback;)V", "onCalendarEvent", "", "mraidView", "Lio/bidmachine/iab/mraid/MraidView;", "url", "", "iabClickCallback", "Lio/bidmachine/iab/utils/IabClickCallback;", "onClose", "onExpand", "onExpired", "iabError", "Lio/bidmachine/iab/IabError;", "onLoadFailed", "onLoaded", "onOpenPrivacySheet", "privacySheetParams", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "onOpenUrl", "onPlayVideo", "onShowFailed", "onShown", "onStorePicture", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class MraidBannerAdListener implements MraidViewListener {

    @NotNull
    private final UnifiedBannerAdCallback callback;

    public MraidBannerAdListener(@NotNull UnifiedBannerAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onCalendarEvent(@NotNull MraidView mraidView, @NotNull String url, @NotNull final IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        this.callback.onAdClicked();
        Context context = mraidView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mraidView.context");
        UrlHandler.openCalendar(context, url, new SafeExecutable<ProcessUrlResult>() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAdListener$onCalendarEvent$1
            @Override // io.bidmachine.util.SafeExecutable
            public void onExecute(@NotNull ProcessUrlResult input) {
                Intrinsics.checkNotNullParameter(input, "input");
                IabClickCallback.this.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onClose(@NotNull MraidView mraidView) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onExpand(@NotNull MraidView mraidView) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onExpired(@NotNull MraidView mraidView, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onLoadFailed(@NotNull MraidView mraidView, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdLoadFailed(IabUtilsKt.toBMError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onLoaded(@NotNull MraidView mraidView) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        this.callback.onAdLoaded(mraidView);
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onOpenPrivacySheet(@NotNull MraidView mraidView, @NotNull PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context findDialogContext = Utils.findDialogContext(mraidView.peekContext(), mraidView);
        Intrinsics.checkNotNullExpressionValue(findDialogContext, "findDialogContext(\n     …  mraidView\n            )");
        companion.show(findDialogContext, privacySheetParams);
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onOpenUrl(@NotNull MraidView mraidView, @NotNull String url, @NotNull IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        Context context = mraidView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mraidView.context");
        UrlHandler.openUrl(context, url, new ClickPostMethod(this.callback, iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onPlayVideo(@NotNull MraidView mraidView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onShowFailed(@NotNull MraidView mraidView, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdShowFailed(IabUtilsKt.toBMError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onShown(@NotNull MraidView mraidView) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.MraidViewListener
    public void onStorePicture(@NotNull MraidView mraidView, @NotNull String url, @NotNull final IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidView, "mraidView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        this.callback.onAdClicked();
        Context context = mraidView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mraidView.context");
        UrlHandler.storePicture(context, url, new SafeExecutable<ProcessUrlResult>() { // from class: io.bidmachine.ads.networks.mraid.MraidBannerAdListener$onStorePicture$1
            @Override // io.bidmachine.util.SafeExecutable
            public void onExecute(@NotNull ProcessUrlResult input) {
                Intrinsics.checkNotNullParameter(input, "input");
                IabClickCallback.this.clickHandled();
            }
        });
    }
}
