package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;

/* loaded from: classes6.dex */
public class POBLinear extends POBVastCreative {
    private double a;
    private List b;
    private String c;
    private List d;
    private List e;
    private String f;
    private double g = -1.0d;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f = pOBNodeBuilder.getNodeValue("../UniversalAdId");
        String nodeValue = pOBNodeBuilder.getNodeValue("Duration");
        if (nodeValue != null) {
            this.a = POBUtils.getSeconds(nodeValue);
        }
        this.b = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("VideoClicks/ClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("VideoClicks/ClickTracking");
        this.c = pOBNodeBuilder.getNodeValue("VideoClicks/CustomClick");
        this.d = pOBNodeBuilder.getObjectList("MediaFiles/MediaFile", POBMediaFile.class);
        this.e = pOBNodeBuilder.getObjectList("Icons/Icon", POBIcon.class);
        String attributeValue = pOBNodeBuilder.getAttributeValue(VastAttributes.SKIP_OFFSET);
        if (attributeValue == null) {
            this.g = -1.0d;
            return;
        }
        double convertToSeconds = POBUtils.convertToSeconds(nodeValue, attributeValue);
        this.g = convertToSeconds;
        this.g = Math.max(0.0d, convertToSeconds);
    }

    @Nullable
    public String getCustomClick() {
        return this.c;
    }

    public double getDuration() {
        return this.a;
    }

    @Nullable
    public List<POBIcon> getIconList() {
        return this.e;
    }

    @Nullable
    public List<POBMediaFile> getMediaFiles() {
        return this.d;
    }

    public double getSkipOffset() {
        return this.g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.b;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.LINEAR;
    }
}
