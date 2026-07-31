package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;

/* loaded from: classes5.dex */
public interface SessionTracker extends EventTracker {
    void clearTrackingEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType);

    void clearTrackingEvents(@NonNull TrackingObject trackingObject);

    void trackEventFinish(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData);

    void trackEventStart(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo);
}
