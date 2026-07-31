package com.smaato.sdk.ng;

import android.content.Context;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class BaseViewModel {
    protected final ReportingController a = NextGen.getReportingController();

    protected void a(IntegrationType integrationType, Ad ad, String str) {
        if (this.a == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("content_info_click");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat(str);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(integrationType));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        this.a.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Boolean bool) {
        if (this.a == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (bool.booleanValue()) {
            reportingEvent.setEventType("default_endcard_skipped");
            reportingEvent.setCustomString("end_card_type", "default");
        }
        this.a.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Boolean bool) {
        if (this.a == null || !NextGen.isReportingEnabled().booleanValue()) {
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
        this.a.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Ad ad, String str) {
        if (this.a == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("custom_cta_show");
        reportingEvent.setAdFormat(str);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.a.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Ad ad, String str2) {
        if (this.a == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        reportingEvent.setAdFormat(str2);
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(IntegrationType.STANDALONE));
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        this.a.reportEvent(reportingEvent);
    }

    protected void a(Context context, List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            EventTracker.post(context, it.next(), null, true);
        }
    }
}
