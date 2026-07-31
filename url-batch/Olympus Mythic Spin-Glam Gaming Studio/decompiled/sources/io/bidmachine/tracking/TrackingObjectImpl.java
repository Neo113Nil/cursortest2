package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import java.util.List;
import java.util.UUID;

/* loaded from: classes15.dex */
public abstract class TrackingObjectImpl implements TrackingObject {

    @NonNull
    private final Object trackingKey;

    public TrackingObjectImpl() {
        this(UUID.randomUUID());
    }

    @Override // io.bidmachine.tracking.TrackingObject
    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        return null;
    }

    @Override // io.bidmachine.tracking.TrackingObject
    @NonNull
    public Object getTrackingKey() {
        return this.trackingKey;
    }

    @Override // io.bidmachine.tracking.TrackingObject
    @Nullable
    public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
        return null;
    }

    public TrackingObjectImpl(@NonNull Object obj) {
        this.trackingKey = obj;
    }
}
