package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;

/* loaded from: classes11.dex */
public class VerveCTAButton {

    @Tag
    private HTMLResource htmlResource;

    @Tag
    private TrackingEvents trackingEvents;

    public HTMLResource getHtmlResource() {
        return this.htmlResource;
    }

    public TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }
}
