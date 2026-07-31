package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;

/* loaded from: classes13.dex */
public interface VastRequestListener {
    void onVastLoadFailed(@NonNull VastRequest vastRequest, @NonNull IabError iabError);

    void onVastLoaded(@NonNull VastRequest vastRequest);
}
