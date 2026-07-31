package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes3.dex */
public class TrackingEvents {

    @Tag("Tracking")
    private List<Tracking> trackingList;

    public List<Tracking> getTrackingList() {
        return this.trackingList;
    }
}
