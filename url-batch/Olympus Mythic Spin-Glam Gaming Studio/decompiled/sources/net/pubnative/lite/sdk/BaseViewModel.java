package net.pubnative.lite.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.analytics.ReportingController;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.vpaid.helpers.EventTracker;

/* loaded from: classes9.dex */
public class BaseViewModel {
    protected final ReportingController mReportingController = HyBid.getReportingController();

    protected void invokeOnContentInfoClick(IntegrationType integrationType, Ad ad, String str) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("content_info_click");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(integrationType));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnCustomCTAClick(String str, Ad ad, String str2) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        reportingEvent.setAdFormat(str2);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnCustomCTAShow(Ad ad, String str) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("custom_cta_show");
        reportingEvent.setAdFormat(str);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnEndCardClosed(Boolean bool) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (bool.booleanValue()) {
            reportingEvent.setEventType("default_endcard_closed");
            reportingEvent.setCustomString("end_card_type", "default");
        } else {
            reportingEvent.setEventType("custom_endcard_closed");
            reportingEvent.setCustomString("end_card_type", "custom");
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeOnEndCardSkipped(Boolean bool) {
        if (this.mReportingController == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (bool.booleanValue()) {
            reportingEvent.setEventType("default_endcard_skipped");
            reportingEvent.setCustomString("end_card_type", "default");
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    protected void postTrackerEvents(Context context, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            EventTracker.post(context, it.next(), null, true);
        }
    }
}
