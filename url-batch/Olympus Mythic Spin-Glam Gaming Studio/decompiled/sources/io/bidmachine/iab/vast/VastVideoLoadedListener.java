package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.vast.processor.VastAd;

/* loaded from: classes4.dex */
public interface VastVideoLoadedListener {
    void onError(@NonNull VastRequest vastRequest, @NonNull IabError iabError);

    void onSuccess(@NonNull VastRequest vastRequest, @NonNull VastAd vastAd);
}
