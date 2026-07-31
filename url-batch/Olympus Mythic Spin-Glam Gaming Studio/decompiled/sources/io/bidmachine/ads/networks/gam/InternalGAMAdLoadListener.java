package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.utils.BMError;

/* loaded from: classes10.dex */
interface InternalGAMAdLoadListener<GAMAdType extends InternalGAMAd> {
    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull GAMAdType gamadtype);
}
