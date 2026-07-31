package io.bidmachine.ads.networks.gam_dynamic;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* loaded from: classes4.dex */
public abstract class InternalFullscreenAd extends InternalAd {
    @UiThread
    protected abstract void showAd(@NonNull Activity activity, @NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) throws Throwable;

    public InternalFullscreenAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    public final void show(@NonNull final Activity activity, @NonNull final InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        Utils.onUiThread(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InternalFullscreenAd.this.lambda$show$0(activity, internalFullscreenAdPresentListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        try {
            setStatus(InternalAd.Status.Showing);
            showAd(activity, internalFullscreenAdPresentListener);
        } catch (Throwable th) {
            Logger.w(th);
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.throwable("Exception showing InternalAd object", th));
        }
    }
}
