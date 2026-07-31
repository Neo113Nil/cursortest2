package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class POBVastCreative implements POBXMLNodeListener {

    @Nullable
    protected String mClickThroughURL;

    @Nullable
    protected List<String> mClickTrackers;

    @Nullable
    protected List<POBVastCreativeExtension> mCreativeExtensions;

    public enum CreativeType {
        LINEAR,
        NONLINEAR,
        COMPANION
    }

    public enum POBEventTypes {
        CREATIVE_VIEW("creativeView"),
        START("start"),
        FIRST_QUARTILE("firstQuartile"),
        MID_POINT("midpoint"),
        THIRD_QUARTILE("thirdQuartile"),
        COMPLETE("complete"),
        MUTE("mute"),
        UNMUTE("unmute"),
        PAUSE("pause"),
        REWIND("rewind"),
        RESUME("resume"),
        FULL_SCREEN("fullscreen"),
        EXIT_FULL_SCREEN("exitFullscreen"),
        EXPAND(n.e),
        COLLAPSE("collapse"),
        ACCEPT_INVITATION_LINEAR("acceptInvitation"),
        CLOSE_LINEAR("closeLinear"),
        SKIP("skip"),
        PROGRESS("progress"),
        AD_EXPAND("adExpand"),
        AD_COLLAPSE("adCollapse"),
        MINIMIZE("minimize"),
        OVERLAY_VIEW_DURATION("overlayViewDuration"),
        CLOSE("close"),
        OTHER_AD_INTERACTION("otherAdInteraction"),
        LOADED(X3.i.r),
        PLAYER_EXPAND("playerExpand"),
        PLAYER_COLLAPSE("playerCollapse"),
        NOT_USED("notUsed");

        private final String b;

        POBEventTypes(String str) {
            this.b = str;
        }

        public String getValue() {
            return this.b;
        }
    }

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @Nullable
    public List<POBVastCreativeExtension> getCreativeExtensions() {
        return this.mCreativeExtensions;
    }

    @Nullable
    public POBVastCreativeExtension getPubMaticExtension() {
        List<POBVastCreativeExtension> list = this.mCreativeExtensions;
        if (list != null && !list.isEmpty()) {
            for (POBVastCreativeExtension pOBVastCreativeExtension : this.mCreativeExtensions) {
                if (pOBVastCreativeExtension != null && pOBVastCreativeExtension.isPubMaticExtension()) {
                    return pOBVastCreativeExtension;
                }
            }
        }
        return null;
    }

    @NonNull
    public List<String> getTrackingEventUrls(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents(pOBEventTypes);
        if (trackingEvents != null) {
            Iterator<POBTracking> it = trackingEvents.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUrl());
            }
        }
        return arrayList;
    }

    abstract List getTrackingEvents();

    @Nullable
    public List<POBTracking> getTrackingEvents(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents();
        if (trackingEvents != null) {
            for (POBTracking pOBTracking : trackingEvents) {
                if (pOBTracking.getEvent() != null && pOBTracking.getEvent().equalsIgnoreCase(pOBEventTypes.getValue())) {
                    arrayList.add(pOBTracking);
                }
            }
        }
        return arrayList;
    }

    public abstract CreativeType getVastCreativeType();

    public void setCreativeExtensions(@Nullable List<POBVastCreativeExtension> list) {
        this.mCreativeExtensions = list;
    }
}
