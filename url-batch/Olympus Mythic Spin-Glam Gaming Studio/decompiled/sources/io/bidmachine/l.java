package io.bidmachine;

import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTracker;
import io.bidmachine.tracking.SessionTrackerImpl;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;

/* loaded from: classes5.dex */
class l extends SessionTrackerImpl {
    private final j a;

    l(EventTracker eventTracker) {
        super(eventTracker);
        this.a = new j();
    }

    @Override // io.bidmachine.tracking.SessionTrackerImpl, io.bidmachine.tracking.EventTracker
    public void trackEvent(TrackingObject trackingObject, TrackEventType trackEventType, TrackEventInfo trackEventInfo, AdsType adsType, BMError bMError, EventData eventData) {
        super.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
        this.a.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }
}
