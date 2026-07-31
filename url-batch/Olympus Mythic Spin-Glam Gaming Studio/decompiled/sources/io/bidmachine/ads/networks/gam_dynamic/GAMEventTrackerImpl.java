package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTrackerImpl;
import io.bidmachine.tracking.SimpleTrackingObject;
import io.bidmachine.utils.BMError;

/* loaded from: classes6.dex */
class GAMEventTrackerImpl extends EventTrackerImpl implements GAMEventTracker {
    GAMEventTrackerImpl(@NonNull AdExtension.EventConfiguration eventConfiguration) {
        super(eventConfiguration);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMEventTracker
    public void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull EventData eventData, @Nullable BMError bMError) {
        trackEvent(new SimpleTrackingObject(), trackEventType, null, adsFormat.getAdsType(), bMError, eventData);
    }
}
