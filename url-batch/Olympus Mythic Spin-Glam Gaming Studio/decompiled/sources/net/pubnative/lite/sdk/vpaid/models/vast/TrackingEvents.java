package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes6.dex */
public class TrackingEvents {

    @Tag("Tracking")
    private List<Tracking> trackingList;

    public List<Tracking> getTrackingList() {
        return this.trackingList;
    }
}
