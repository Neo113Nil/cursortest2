package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTracker;
import io.bidmachine.utils.BMError;

/* loaded from: classes13.dex */
interface GAMEventTracker extends EventTracker {
    void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull EventData eventData, @Nullable BMError bMError);
}
