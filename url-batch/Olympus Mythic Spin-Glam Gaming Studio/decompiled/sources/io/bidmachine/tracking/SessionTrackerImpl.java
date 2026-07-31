package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class SessionTrackerImpl implements SessionTracker {

    @NonNull
    private final EventTracker eventTracker;

    @NonNull
    @VisibleForTesting
    final Map<Object, Map<TrackEventType, TrackEventInfo>> trackEventInfoHolders = new ConcurrentHashMap();

    public SessionTrackerImpl(@NonNull EventTracker eventTracker) {
        this.eventTracker = eventTracker;
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void clearTrackingEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType) {
        Map<TrackEventType, TrackEventInfo> map = this.trackEventInfoHolders.get(trackingObject.getTrackingKey());
        if (map != null) {
            map.remove(trackEventType);
        }
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void clearTrackingEvents(@NonNull TrackingObject trackingObject) {
        this.trackEventInfoHolders.remove(trackingObject.getTrackingKey());
    }

    @Override // io.bidmachine.tracking.EventTracker
    public void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        this.eventTracker.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void trackEventFinish(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        TrackEventInfo trackEventInfo;
        Map<TrackEventType, TrackEventInfo> map = this.trackEventInfoHolders.get(trackingObject.getTrackingKey());
        if (map == null || !map.containsKey(trackEventType)) {
            trackEventInfo = null;
        } else {
            trackEventInfo = map.get(trackEventType);
            if (trackEventInfo != null) {
                trackEventInfo.setFinishTimeMs(System.currentTimeMillis());
            }
            map.remove(trackEventType);
            if (map.isEmpty()) {
                clearTrackingEvents(trackingObject);
            }
        }
        trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void trackEventStart(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo) {
        Object trackingKey = trackingObject.getTrackingKey();
        Map<TrackEventType, TrackEventInfo> map = this.trackEventInfoHolders.get(trackingKey);
        if (map == null) {
            map = new EnumMap<>(TrackEventType.class);
            this.trackEventInfoHolders.put(trackingKey, map);
        }
        if (map.containsKey(trackEventType)) {
            return;
        }
        if (trackEventInfo == null) {
            trackEventInfo = new TrackEventInfo();
        }
        map.put(trackEventType, trackEventInfo);
    }
}
