package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.utils.BMError;

/* loaded from: classes3.dex */
interface InternalAdLoadListener<InternalAdType extends InternalAd> {
    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalAdType internaladtype);
}
