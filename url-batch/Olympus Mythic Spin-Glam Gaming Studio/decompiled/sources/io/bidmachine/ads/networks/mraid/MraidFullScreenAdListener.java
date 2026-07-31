package io.bidmachine.ads.networks.mraid;

import android.content.Context;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidInterstitialListener;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.internal.C6022q;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.SafeExecutable;
import io.bidmachine.utils.ClickPostMethod;
import io.bidmachine.utils.IabUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001bJ'\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'¨\u0006("}, d2 = {"Lio/bidmachine/ads/networks/mraid/MraidFullScreenAdListener;", "Lio/bidmachine/iab/mraid/MraidInterstitialListener;", "Landroid/content/Context;", "applicationContext", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/internal/q;", "mraidOMSDKAdMeasurer", "<init>", "(Landroid/content/Context;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;Lio/bidmachine/internal/q;)V", "Lio/bidmachine/iab/mraid/MraidInterstitial;", "mraidInterstitial", "", "onLoaded", "(Lio/bidmachine/iab/mraid/MraidInterstitial;)V", "Lio/bidmachine/iab/IabError;", "iabError", "onLoadFailed", "(Lio/bidmachine/iab/mraid/MraidInterstitial;Lio/bidmachine/iab/IabError;)V", "onShown", "onShowFailed", "onExpired", "", "url", "Lio/bidmachine/iab/utils/IabClickCallback;", "iabClickCallback", "onOpenUrl", "(Lio/bidmachine/iab/mraid/MraidInterstitial;Ljava/lang/String;Lio/bidmachine/iab/utils/IabClickCallback;)V", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "onOpenPrivacySheet", "(Lio/bidmachine/iab/mraid/MraidInterstitial;Lio/bidmachine/rendering/model/PrivacySheetParams;)V", "onCalendarEvent", "onStorePicture", "onPlayVideo", "(Lio/bidmachine/iab/mraid/MraidInterstitial;Ljava/lang/String;)V", "onClose", "Landroid/content/Context;", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "Lio/bidmachine/internal/q;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class MraidFullScreenAdListener implements MraidInterstitialListener {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final UnifiedFullscreenAdCallback callback;

    @Nullable
    private final C6022q mraidOMSDKAdMeasurer;

    public MraidFullScreenAdListener(@NotNull Context applicationContext, @NotNull UnifiedFullscreenAdCallback callback, @Nullable C6022q c6022q) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.applicationContext = applicationContext;
        this.callback = callback;
        this.mraidOMSDKAdMeasurer = c6022q;
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onCalendarEvent(@NotNull MraidInterstitial mraidInterstitial, @NotNull String url, @NotNull final IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        this.callback.onAdClicked();
        UrlHandler.openCalendar(this.applicationContext, url, new SafeExecutable<ProcessUrlResult>() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAdListener$onCalendarEvent$1
            @Override // io.bidmachine.util.SafeExecutable
            public void onExecute(@NotNull ProcessUrlResult input) {
                Intrinsics.checkNotNullParameter(input, "input");
                IabClickCallback.this.clickHandled();
            }
        });
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onClose(@NotNull MraidInterstitial mraidInterstitial) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        if (mraidInterstitial.isShown()) {
            C6022q c6022q = this.mraidOMSDKAdMeasurer;
            if (c6022q != null) {
                c6022q.a();
            }
            if (mraidInterstitial.isCompleted()) {
                this.callback.onAdFinished();
            }
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onExpired(@NotNull MraidInterstitial mraidInterstitial, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onLoadFailed(@NotNull MraidInterstitial mraidInterstitial, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdLoadFailed(IabUtilsKt.toBMError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onLoaded(@NotNull MraidInterstitial mraidInterstitial) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        this.callback.onAdLoaded();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onOpenPrivacySheet(@NotNull MraidInterstitial mraidInterstitial, @NotNull PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context peekContext = mraidInterstitial.peekContext();
        if (peekContext == null) {
            peekContext = this.applicationContext;
        }
        Context findDialogContext = Utils.findDialogContext(peekContext);
        Intrinsics.checkNotNullExpressionValue(findDialogContext, "findDialogContext(mraidI…() ?: applicationContext)");
        companion.show(findDialogContext, privacySheetParams);
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onOpenUrl(@NotNull MraidInterstitial mraidInterstitial, @NotNull String url, @NotNull IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        UrlHandler.openUrl(this.applicationContext, url, new ClickPostMethod(this.callback, iabClickCallback));
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onPlayVideo(@NotNull MraidInterstitial mraidInterstitial, @NotNull String url) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onShowFailed(@NotNull MraidInterstitial mraidInterstitial, @NotNull IabError iabError) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(iabError, "iabError");
        this.callback.onAdShowFailed(IabUtilsKt.toBMError(iabError));
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onShown(@NotNull MraidInterstitial mraidInterstitial) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.iab.mraid.MraidInterstitialListener
    public void onStorePicture(@NotNull MraidInterstitial mraidInterstitial, @NotNull String url, @NotNull final IabClickCallback iabClickCallback) {
        Intrinsics.checkNotNullParameter(mraidInterstitial, "mraidInterstitial");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(iabClickCallback, "iabClickCallback");
        this.callback.onAdClicked();
        UrlHandler.storePicture(this.applicationContext, url, new SafeExecutable<ProcessUrlResult>() { // from class: io.bidmachine.ads.networks.mraid.MraidFullScreenAdListener$onStorePicture$1
            @Override // io.bidmachine.util.SafeExecutable
            public void onExecute(@NotNull ProcessUrlResult input) {
                Intrinsics.checkNotNullParameter(input, "input");
                IabClickCallback.this.clickHandled();
            }
        });
    }
}
