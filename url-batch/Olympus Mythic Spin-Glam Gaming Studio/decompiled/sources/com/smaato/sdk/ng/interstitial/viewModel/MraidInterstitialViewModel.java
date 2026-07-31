package com.smaato.sdk.ng.interstitial.viewModel;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.mraid.MRAIDBanner;
import com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewCloseLayoutListener;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.mraid.model.HTMLAd;
import com.smaato.sdk.ng.utils.ClickThroughTimerManager;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;

/* loaded from: classes14.dex */
public class MraidInterstitialViewModel extends InterstitialViewModel implements MRAIDViewListener, MRAIDNativeFeatureListener, MRAIDViewCloseLayoutListener, ClickThroughTimerManager.ClickThroughTimerListener {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private final String[] w;
    private MRAIDBanner x;
    private boolean y;
    private boolean z;

    public MraidInterstitialViewModel(Context context, String str, String str2, int i, long j, InterstitialActivityInteractor interstitialActivityInteractor) {
        super(context, str, str2, i, j, interstitialActivityInteractor);
        this.w = new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"};
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        processInterstitialAd();
        interstitialActivityInteractor.setContentLayout();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void addFriendlyObstruction(View view) {
        MRAIDBanner mRAIDBanner = this.x;
        if (mRAIDBanner != null) {
            mRAIDBanner.addViewabilityFriendlyObstruction(view, BaseFriendlyObstructionPurpose.OTHER, "Watermark");
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void closeButtonClicked() {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
        this.d.finishActivity();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void destroyAd() {
        MRAIDBanner mRAIDBanner = this.x;
        if (mRAIDBanner != null) {
            mRAIDBanner.stopAdSession();
            this.x.destroy();
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public View getAdView() {
        Ad ad = this.g;
        MRAIDBanner mRAIDBanner = null;
        if (ad != null) {
            if (ad.getAssetUrl("htmlbanner") != null) {
                mRAIDBanner = new MRAIDBanner(this.b, this.g.getAssetUrl("htmlbanner"), "", Boolean.TRUE, Boolean.FALSE, this.w, this, this, getContentInfoContainer());
            } else if (this.g.getAssetHtml("htmlbanner") != null) {
                mRAIDBanner = new MRAIDBanner(this.b, "", this.g.getAssetHtml("htmlbanner"), Boolean.TRUE, Boolean.FALSE, this.w, this, this, getContentInfoContainer());
            }
            if (mRAIDBanner != null) {
                HTMLAd hTMLAd = new HTMLAd(this.b, this.g, HTMLAd.AdType.INTERSTITIAL);
                this.s = hTMLAd;
                hTMLAd.setLink(this.g.getLink());
                this.s.setClickThroughTimerListener(this);
                mRAIDBanner.setCloseLayoutListener(this);
                Integer skipDelay = this.s.getSkipDelay();
                this.n = skipDelay != null && skipDelay.intValue() == 0;
                mRAIDBanner.setHtmlAd(this.s);
            }
        }
        this.x = mRAIDBanner;
        return mRAIDBanner;
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public Boolean hasReducedCloseSize() {
        return Boolean.valueOf(this.s.hasReducedCloseSize());
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
        InterstitialActivityInteractor interstitialActivityInteractor = this.d;
        if (interstitialActivityInteractor != null) {
            interstitialActivityInteractor.hideInterstitialCloseButton();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
        this.d.hideInterstitialSkipButton();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CLICK);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CLICK);
        handleURL(str);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.CLICK);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
        this.n = true;
        this.d.showInterstitialCloseButton(this.t);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
        this.n = false;
        this.d.showInterstitialSkipButton(this.u);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.ERROR);
        a();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.SHOW);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return true;
    }

    @Override // com.smaato.sdk.ng.utils.ClickThroughTimerManager.ClickThroughTimerListener
    public void onClickThroughTriggered() {
        this.o.trackClick();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewCloseLayoutListener
    public void onClose() {
        a();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_cta_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
            Ad ad = this.g;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.g.getCampaignId());
                reportingEvent.setConfigId(this.g.getConfigId());
            }
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        if (this.D) {
            return;
        }
        this.r.trackClick();
        this.D = true;
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
            Ad ad = this.g;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.g.getCampaignId());
                reportingEvent.setConfigId(this.g.getConfigId());
            }
            reportingEvent.setEventType("custom_cta_show");
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        if (this.C) {
            return;
        }
        this.r.trackImpression();
        this.C = true;
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
        if (this.B) {
            return;
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("custom_endcard_click");
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
            Ad ad = this.g;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.g.getCampaignId());
                reportingEvent.setConfigId(this.g.getConfigId());
            }
            reportingEvent.setCustomString("end_card_type", "custom");
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        this.o.trackClick();
        this.p.trackClick();
        this.q.trackCustomEndcardEvent(4, null);
        this.B = true;
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.q.trackCustomEndcardEvent(3, null);
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setEventType("custom_endcard_closed");
        reportingEvent.setCustomString("end_card_type", "custom");
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
        Ad ad = this.g;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.g.getCampaignId());
            reportingEvent.setConfigId(this.g.getConfigId());
        }
        reportingEvent.setEventType("custom_endcard_load_failure");
        reportingEvent.setCustomString("end_card_type", "custom");
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
        if (this.y) {
            return;
        }
        this.y = true;
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
        Ad ad = this.g;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.g.getCampaignId());
            reportingEvent.setConfigId(this.g.getConfigId());
        }
        reportingEvent.setEventType("custom_endcard_load_success");
        reportingEvent.setCustomString("end_card_type", "custom");
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
        if (this.z) {
            return;
        }
        if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.e));
            Ad ad = this.g;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(this.g.getCampaignId());
                reportingEvent.setConfigId(this.g.getConfigId());
            }
            reportingEvent.setEventType("custom_endcard_impression");
            reportingEvent.setCustomString("end_card_type", str);
            NextGen.getReportingController().reportEvent(reportingEvent);
        }
        this.p.trackImpression();
        this.q.trackCustomEndcardEvent(1, null);
        this.z = true;
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewCloseLayoutListener
    public void onRemoveCloseLayout() {
        this.d.hideInterstitialCloseButton();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewCloseLayoutListener
    public void onShowCloseLayout() {
        this.n = true;
        this.d.showInterstitialCloseButton(this.t);
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void pauseAd() {
        MRAIDBanner mRAIDBanner = this.x;
        if (mRAIDBanner != null) {
            mRAIDBanner.pause();
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void resetVolumeChangeTracker() {
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void resumeAd() {
        MRAIDBanner mRAIDBanner;
        if (isFeedbackFormOpen() || (mRAIDBanner = this.x) == null) {
            return;
        }
        mRAIDBanner.resume();
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public boolean shouldShowContentInfo() {
        return false;
    }

    @Override // com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel
    public void skipButtonClicked() {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.PLAYABLE_SKIP_CLICK);
        this.x.skipButtonClicked();
    }
}
