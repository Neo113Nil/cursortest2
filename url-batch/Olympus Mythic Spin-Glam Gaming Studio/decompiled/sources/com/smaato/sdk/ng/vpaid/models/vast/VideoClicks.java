package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes6.dex */
public class VideoClicks {

    @Tag
    private ClickThrough clickThrough;

    @Tag("ClickTracking")
    private List<ClickTracking> clickTrackingList;

    @Tag("CustomClick")
    private List<CustomClick> customClickList;

    public ClickThrough getClickThrough() {
        return this.clickThrough;
    }

    public List<ClickTracking> getClickTrackingList() {
        return this.clickTrackingList;
    }

    public List<CustomClick> getCustomClickList() {
        return this.customClickList;
    }
}
