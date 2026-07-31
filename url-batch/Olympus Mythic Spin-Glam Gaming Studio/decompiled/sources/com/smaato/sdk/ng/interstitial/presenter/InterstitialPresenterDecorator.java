package com.smaato.sdk.ng.interstitial.presenter;

import android.text.TextUtils;
import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.CheckUtils;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class InterstitialPresenterDecorator implements InterstitialPresenter, InterstitialPresenter.Listener, VideoListener, CustomEndCardListener {
    private static final String r = "InterstitialPresenterDecorator";
    private final InterstitialPresenter a;
    private final AdTracker b;
    private final AdTracker c;
    private final ReportingController d;
    private final InterstitialPresenter.Listener e;
    private VideoListener f;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private IntegrationType q;

    public InterstitialPresenterDecorator(InterstitialPresenter interstitialPresenter, AdTracker adTracker, AdTracker adTracker2, ReportingController reportingController, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        this.a = interstitialPresenter;
        this.b = adTracker;
        this.c = adTracker2;
        this.d = reportingController;
        this.e = listener;
        this.q = integrationType;
    }

    private void a() {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("companion_view");
        reportingEvent.setAdFormat("banner");
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(IntegrationType.STANDALONE));
        Ad ad = getAd();
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void destroy() {
        this.a.destroy();
        this.g = true;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public Ad getAd() {
        return this.a.getAd();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        InterstitialPresenter interstitialPresenter = this.a;
        if (interstitialPresenter != null && (placementParams2 = interstitialPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        AdTracker adTracker = this.b;
        if (adTracker != null && (placementParams = adTracker.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public boolean isReady() {
        return this.a.isReady();
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.g, "InterstitialPresenterDecorator is destroyed")) {
            this.a.load();
        }
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onCustomEndCardClick() {
        if (this.g || this.p) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_endcard_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("end_card_type", "custom");
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackClick();
        this.b.trackCustomEndcardEvent(4, null);
        this.c.trackClick();
        this.p = true;
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onCustomEndCardShow() {
        if (this.g || this.n) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_endcard_impression");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("end_card_type", "custom");
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackCustomEndcardEvent(1, null);
        this.c.trackImpression();
        this.n = true;
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onDefaultEndCardClick() {
        if (this.g || this.m) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("default_endcard_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("end_card_type", "default");
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackCompanionAdEvent(4, null);
        this.m = true;
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onDefaultEndCardShow() {
        if (this.g || this.l) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            a();
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("default_endcard_impression");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("end_card_type", "default");
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackCompanionAdEvent(1, null);
        this.l = true;
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onEndCardLoadFailure(boolean z) {
        String str;
        if (this.g) {
            return;
        }
        if (z) {
            this.b.trackCustomEndcardEvent(5, Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
            str = "custom_endcard_load_failure";
        } else {
            this.b.trackCompanionAdEvent(5, Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
            str = "default_endcard_load_failure";
        }
        if (this.d == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("fullscreen");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
        Ad ad = getAd();
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        this.d.reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onEndCardLoadSuccess(boolean z) {
        if (this.g) {
            return;
        }
        String str = z ? "custom_endcard_load_success" : "default_endcard_load_success";
        if (this.d == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType(str);
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("fullscreen");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
        Ad ad = getAd();
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        this.d.reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialClicked(InterstitialPresenter interstitialPresenter) {
        if (this.g || this.i) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("click_source_type", "ad");
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackClick();
        this.e.onInterstitialClicked(interstitialPresenter);
        this.i = true;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialDismissed(InterstitialPresenter interstitialPresenter) {
        if (this.g || this.k) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("interstitial_closed");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            this.d.reportEvent(reportingEvent);
        }
        this.k = true;
        this.e.onInterstitialDismissed(interstitialPresenter);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialError(InterstitialPresenter interstitialPresenter) {
        if (this.g) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("error");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            if (getAd() != null && !TextUtils.isEmpty(getAd().getVast())) {
                reportingEvent.setVast(getAd().getVast());
            }
            this.d.reportEvent(reportingEvent);
        }
        Logger.d(r, "Interstitial error for zone id: ");
        this.b.trackSdkEvent(1, Integer.valueOf(NextGenErrorCode.UNKNOWN_ERROR.getCode()));
        this.e.onInterstitialError(interstitialPresenter);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialLoaded(InterstitialPresenter interstitialPresenter) {
        if (this.g) {
            return;
        }
        this.b.trackSdkEvent(1, null);
        this.e.onInterstitialLoaded(interstitialPresenter);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialShown(InterstitialPresenter interstitialPresenter) {
        if (this.g || this.h) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("impression");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            this.d.reportEvent(reportingEvent);
        }
        this.b.trackSdkEvent(2, null);
        this.b.trackImpression();
        this.e.onInterstitialShown(interstitialPresenter);
        this.h = true;
    }

    @Override // com.smaato.sdk.ng.CustomEndCardListener
    public void onPlayableSkipButtonClicked() {
        if (this.g || this.j) {
            return;
        }
        if (this.d != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("playable_skip_clicked");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.q));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            this.d.reportEvent(reportingEvent);
        }
        this.j = true;
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener;
        if (this.g || this.o || (videoListener = this.f) == null) {
            return;
        }
        this.o = true;
        videoListener.onVideoSkipped();
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setCustomEndCardListener(CustomEndCardListener customEndCardListener) {
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setListener(InterstitialPresenter.Listener listener) {
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setVideoListener(VideoListener videoListener) {
        this.f = videoListener;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void show() {
        if (CheckUtils.NoThrow.checkArgument(!this.g, "InterstitialPresenterDecorator is destroyed")) {
            this.a.show();
        }
    }
}
