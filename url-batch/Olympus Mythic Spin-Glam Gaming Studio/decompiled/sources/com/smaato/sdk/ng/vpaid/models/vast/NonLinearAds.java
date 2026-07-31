package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes5.dex */
public class NonLinearAds {

    @Tag("NonLinear")
    private List<NonLinear> nonLinearList;

    @Tag
    private TrackingEvents trackingEvents;

    public List<NonLinear> getNonLinearList() {
        return this.nonLinearList;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }
}
