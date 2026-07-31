package io.bidmachine.ads.networks.gam_dynamic;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.protobuf.Waterfall;

/* loaded from: classes8.dex */
public abstract class InternalBannerAd extends InternalAd {
    @Nullable
    protected abstract View getAdView();

    public InternalBannerAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }
}
