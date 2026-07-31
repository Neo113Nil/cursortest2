package com.smaato.sdk.ng.presenter;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.CheckUtils;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.utils.json.JsonOperations;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AdPresenterDecorator implements AdPresenter, AdPresenter.Listener, AdPresenter.ImpressionListener, VideoListener, MRAIDViewListener {
    private static final String m = "AdPresenterDecorator";
    private final AdPresenter a;
    private final AdTracker b;
    private final ReportingController c;
    private final AdPresenter.Listener d;
    private final AdPresenter.ImpressionListener e;
    private VideoListener f;
    private MRAIDViewListener g;
    private IntegrationType k;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean l = false;

    public AdPresenterDecorator(AdPresenter adPresenter, AdTracker adTracker, ReportingController reportingController, AdPresenter.Listener listener, AdPresenter.ImpressionListener impressionListener, IntegrationType integrationType) {
        this.a = adPresenter;
        this.b = adTracker;
        this.c = reportingController;
        this.d = listener;
        this.e = impressionListener;
        this.k = integrationType;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void addFriendlyObstruction(View view) {
        AdPresenter adPresenter = this.a;
        if (adPresenter != null) {
            adPresenter.addFriendlyObstruction(view);
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void destroy() {
        this.a.destroy();
        this.h = true;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public Ad getAd() {
        return this.a.getAd();
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        AdPresenter adPresenter = this.a;
        if (adPresenter != null && (placementParams2 = adPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        AdTracker adTracker = this.b;
        if (adTracker != null && (placementParams = adTracker.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.h, "AdPresenterDecorator is destroyed")) {
            this.a.load();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdClicked(AdPresenter adPresenter) {
        if (this.h || this.j) {
            return;
        }
        if (this.c != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("click");
            reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.k));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            reportingEvent.setCustomString("click_source_type", "ad");
            this.c.reportEvent(reportingEvent);
        }
        this.b.trackClick();
        this.d.onAdClicked(adPresenter);
        this.j = true;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdError(AdPresenter adPresenter) {
        if (this.h) {
            return;
        }
        if (this.c != null) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("error");
            reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.k));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            if (getAd() != null && !TextUtils.isEmpty(getAd().getVast())) {
                reportingEvent.setVast(getAd().getVast());
            }
            this.c.reportEvent(reportingEvent);
        }
        Logger.d(m, "Banner error for zone id: ");
        this.d.onAdError(adPresenter);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.Listener
    public void onAdLoaded(AdPresenter adPresenter, View view) {
        if (this.h) {
            return;
        }
        this.d.onAdLoaded(adPresenter, view);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
        MRAIDViewListener mRAIDViewListener = this.g;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.onExpandedAdClosed();
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        if (this.h) {
            return;
        }
        if (this.i) {
            Log.i(m, "impression is already confirmed, dropping impression tracking");
            return;
        }
        if (this.c != null && NextGen.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("impression");
            reportingEvent.setTimestamp(String.valueOf(System.currentTimeMillis()));
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(this.k));
            Ad ad = getAd();
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(ad.getCampaignId());
                reportingEvent.setConfigId(ad.getConfigId());
            }
            this.c.reportEvent(reportingEvent);
        }
        this.i = true;
        this.b.trackImpression();
        AdPresenter.ImpressionListener impressionListener = this.e;
        if (impressionListener != null) {
            impressionListener.onImpression();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onReplayClicked() {
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
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.f;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setImpressionListener(AdPresenter.ImpressionListener impressionListener) {
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setListener(AdPresenter.Listener listener) {
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setMRaidListener(MRAIDViewListener mRAIDViewListener) {
        this.g = mRAIDViewListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setVideoListener(VideoListener videoListener) {
        this.f = videoListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking() {
        startTracking(null);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void stopTracking() {
        if (CheckUtils.NoThrow.checkArgument(!this.h, "AdPresenterDecorator is destroyed")) {
            this.a.stopTracking();
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking(NextGenConsumer<Double> nextGenConsumer) {
        if (CheckUtils.NoThrow.checkArgument(!this.h, "AdPresenterDecorator is destroyed")) {
            this.a.startTracking(nextGenConsumer);
        }
    }
}
