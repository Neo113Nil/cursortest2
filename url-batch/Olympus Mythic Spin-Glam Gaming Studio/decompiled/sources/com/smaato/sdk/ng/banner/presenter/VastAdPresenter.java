package com.smaato.sdk.ng.banner.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.contentinfo.AdFeedbackFormHelper;
import com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.ContentInfo;
import com.smaato.sdk.ng.models.ContentInfoIconXPosition;
import com.smaato.sdk.ng.models.ContentInfoIconYPosition;
import com.smaato.sdk.ng.models.ImpressionTrackingMethod;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.PositionX;
import com.smaato.sdk.ng.models.PositionY;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.CheckUtils;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.utils.URLValidator;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.visibility.ImpressionManager;
import com.smaato.sdk.ng.visibility.ImpressionTracker;
import com.smaato.sdk.ng.vpaid.CloseButtonListener;
import com.smaato.sdk.ng.vpaid.PlayerInfo;
import com.smaato.sdk.ng.vpaid.VideoAd;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdListener;
import com.smaato.sdk.ng.vpaid.VideoAdView;
import com.smaato.sdk.ng.vpaid.VideoVisibilityListener;
import com.smaato.sdk.ng.vpaid.VideoVisibilityManager;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import com.smaato.sdk.ng.vpaid.models.vast.Icon;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class VastAdPresenter implements AdPresenter, ImpressionTracker.Listener, NGSDKAPIContentInfoView.ContentInfoListener, VideoVisibilityListener {
    private static final String a = "VastAdPresenter";
    private Boolean A;
    private Boolean B;
    private Boolean C;
    private Boolean D;
    private IntegrationType E;
    private AdTracker F;
    private AdTracker G;
    private AdTracker H;
    private AdTracker I;
    private AdTracker J;
    private ReportingController K;
    private final ImpressionTracker.Listener L;
    private final AdPresenter.ImpressionListener M;
    private final CloseButtonListener N;
    private final VideoAdListener O;
    private final Context b;
    private final Ad c;
    private final ImpressionTrackingMethod d;
    private final View e;
    private VideoVisibilityManager f;
    private AdPresenter.Listener g;
    private AdPresenter.ImpressionListener h;
    private VideoListener i;
    public boolean isLinkClickRunning;
    private Icon j;
    private boolean k;
    private AdSize n;
    private VideoAdView o;
    private VideoAd p;
    private View q;
    private Boolean s;
    private Boolean t;
    private List<String> u;
    private Boolean v;
    private Boolean w;
    private Boolean x;
    private Boolean y;
    private Boolean z;
    private boolean l = false;
    private boolean m = false;
    private boolean r = false;

    class a implements ImpressionTracker.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.visibility.ImpressionTracker.Listener
        public void onImpression(View view) {
            VideoAd videoAd = VastAdPresenter.this.p;
            if (videoAd != null) {
                videoAd.show();
            }
        }
    }

    class b implements AdPresenter.ImpressionListener {
        b() {
        }

        @Override // com.smaato.sdk.ng.presenter.AdPresenter.ImpressionListener
        public void onImpression() {
            AdPresenter.ImpressionListener impressionListener = VastAdPresenter.this.h;
            if (impressionListener != null) {
                impressionListener.onImpression();
            }
        }
    }

    class c implements CloseButtonListener {
        c() {
        }

        @Override // com.smaato.sdk.ng.vpaid.CloseButtonListener
        public void onCloseButtonVisible() {
        }
    }

    class d extends VideoAdListener {
        d() {
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdClicked() {
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            if (vastAdPresenter.k) {
                return;
            }
            AdPresenter.Listener listener = vastAdPresenter.g;
            if (listener != null) {
                listener.onAdClicked(vastAdPresenter);
            }
            VastAdPresenter.this.m = true;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdCustomEndCardFound() {
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDidReachEnd() {
            VideoListener videoListener = VastAdPresenter.this.i;
            if (videoListener != null) {
                videoListener.onVideoFinished();
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed() {
            onAdDismissed(-1);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadFail(PlayerInfo playerInfo) {
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            AdPresenter.Listener listener = vastAdPresenter.g;
            if (listener != null) {
                listener.onAdError(vastAdPresenter);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdLoadSuccess() {
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            if (vastAdPresenter.k || vastAdPresenter.l) {
                return;
            }
            vastAdPresenter.l = true;
            AdPresenter.Listener listener = vastAdPresenter.g;
            if (listener != null) {
                listener.onAdLoaded(vastAdPresenter, vastAdPresenter.a());
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdSkipped() {
            VideoListener videoListener = VastAdPresenter.this.i;
            if (videoListener != null) {
                videoListener.onVideoSkipped();
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdStarted() {
            VideoListener videoListener = VastAdPresenter.this.i;
            if (videoListener != null) {
                videoListener.onVideoStarted();
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTACLick(boolean z) {
            String str = z ? "custom_cta_endcard_click" : "custom_cta_click";
            if (VastAdPresenter.this.u.contains(str)) {
                return;
            }
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType(str);
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                reportingEvent.setTimestamp(System.currentTimeMillis());
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            if (str.equals("custom_cta_endcard_click")) {
                AdTracker adTracker = VastAdPresenter.this.J;
                if (adTracker != null) {
                    adTracker.trackClick();
                }
            } else {
                AdTracker adTracker2 = VastAdPresenter.this.I;
                if (adTracker2 != null) {
                    adTracker2.trackImpression();
                }
            }
            VastAdPresenter.this.u.add(str);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTALoadFail() {
            Logger.e("onCustomCTALoadFail", "CTA Failed to load");
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomCTAShow() {
            if (VastAdPresenter.this.z.booleanValue()) {
                return;
            }
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType("custom_cta_show");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                reportingEvent.setTimestamp(System.currentTimeMillis());
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            AdTracker adTracker = VastAdPresenter.this.I;
            if (adTracker != null) {
                adTracker.trackImpression();
            }
            VastAdPresenter.this.z = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardClick(String str) {
            if (VastAdPresenter.this.t.booleanValue()) {
                return;
            }
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType("custom_endcard_click");
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                reportingEvent.setCustomString("end_card_type", "custom");
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            if (!vastAdPresenter.m) {
                vastAdPresenter.F.trackClick();
            }
            VastAdPresenter.this.G.trackClick();
            VastAdPresenter.this.H.trackCustomEndcardEvent(4, null);
            VastAdPresenter.this.t = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onCustomEndCardShow(String str) {
            if (VastAdPresenter.this.w.booleanValue()) {
                return;
            }
            VastAdPresenter.this.b();
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                reportingEvent.setEventType("custom_endcard_impression");
                reportingEvent.setCustomString("end_card_type", str);
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            VastAdPresenter.this.G.trackImpression();
            VastAdPresenter.this.H.trackCustomEndcardEvent(1, null);
            VastAdPresenter.this.w = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardClick(String str) {
            if (VastAdPresenter.this.s.booleanValue()) {
                return;
            }
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setEventType("default_endcard_click");
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                reportingEvent.setCustomString("end_card_type", "default");
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            VastAdPresenter.this.H.trackCompanionAdEvent(4, null);
            VastAdPresenter.this.s = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onDefaultEndCardShow(String str) {
            if (VastAdPresenter.this.v.booleanValue()) {
                return;
            }
            VastAdPresenter.this.g();
            if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                Ad ad = VastAdPresenter.this.c;
                if (ad != null) {
                    reportingEvent.setImpId(ad.getSessionId());
                    reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                    reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                }
                reportingEvent.setEventType("default_endcard_impression");
                reportingEvent.setCustomString("end_card_type", str);
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
            VastAdPresenter.this.H.trackCompanionAdEvent(1, null);
            VastAdPresenter.this.v = Boolean.TRUE;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardClosed(Boolean bool) {
            if (bool.booleanValue() && VastAdPresenter.this.D.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastAdPresenter.this.C.booleanValue()) {
                if (bool.booleanValue()) {
                    VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                    vastAdPresenter.D = Boolean.TRUE;
                    vastAdPresenter.H.trackCustomEndcardEvent(3, null);
                } else {
                    VastAdPresenter vastAdPresenter2 = VastAdPresenter.this;
                    vastAdPresenter2.C = Boolean.TRUE;
                    vastAdPresenter2.H.trackCompanionAdEvent(3, null);
                }
                if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setTimestamp(System.currentTimeMillis());
                if (VastAdPresenter.this.C.booleanValue()) {
                    reportingEvent.setEventType("custom_endcard_closed");
                    reportingEvent.setCustomString("end_card_type", "custom");
                } else {
                    reportingEvent.setEventType("default_endcard_closed");
                    reportingEvent.setCustomString("end_card_type", "default");
                }
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardLoadFail(Boolean bool) {
            if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
                return;
            }
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setTimestamp(System.currentTimeMillis());
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
            Ad ad = VastAdPresenter.this.c;
            if (ad != null) {
                reportingEvent.setImpId(ad.getSessionId());
                reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
            }
            if (bool.booleanValue()) {
                reportingEvent.setEventType("custom_endcard_load_failure");
                reportingEvent.setCustomString("end_card_type", "custom");
            } else {
                reportingEvent.setEventType("default_endcard_load_failure");
                reportingEvent.setCustomString("end_card_type", "default");
            }
            NextGen.getReportingController().reportEvent(reportingEvent);
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public synchronized void onEndCardLoadSuccess(Boolean bool) {
            try {
                if ((!bool.booleanValue() || !VastAdPresenter.this.y.booleanValue()) && (bool.booleanValue() || !VastAdPresenter.this.x.booleanValue())) {
                    if (bool.booleanValue()) {
                        VastAdPresenter.this.y = Boolean.TRUE;
                    } else {
                        VastAdPresenter.this.x = Boolean.TRUE;
                    }
                    if (NextGen.getReportingController() != null && NextGen.isReportingEnabled().booleanValue()) {
                        ReportingEvent reportingEvent = new ReportingEvent();
                        reportingEvent.setTimestamp(System.currentTimeMillis());
                        reportingEvent.setAdFormat("banner");
                        reportingEvent.setPlatform("android");
                        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(VastAdPresenter.this.E));
                        Ad ad = VastAdPresenter.this.c;
                        if (ad != null) {
                            reportingEvent.setImpId(ad.getSessionId());
                            reportingEvent.setCampaignId(VastAdPresenter.this.c.getCampaignId());
                            reportingEvent.setConfigId(VastAdPresenter.this.c.getConfigId());
                        }
                        if (VastAdPresenter.this.x.booleanValue()) {
                            reportingEvent.setEventType("default_endcard_load_success");
                            reportingEvent.setCustomString("end_card_type", "default");
                        } else {
                            reportingEvent.setEventType("custom_endcard_load_success");
                            reportingEvent.setCustomString("end_card_type", "custom");
                        }
                        NextGen.getReportingController().reportEvent(reportingEvent);
                    }
                }
            } finally {
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onEndCardSkipped(Boolean bool) {
            if (bool.booleanValue() && VastAdPresenter.this.B.booleanValue()) {
                return;
            }
            if (bool.booleanValue() || !VastAdPresenter.this.A.booleanValue()) {
                if (bool.booleanValue()) {
                    VastAdPresenter.this.H.trackCustomEndcardEvent(2, null);
                } else {
                    VastAdPresenter vastAdPresenter = VastAdPresenter.this;
                    vastAdPresenter.A = Boolean.TRUE;
                    vastAdPresenter.H.trackCompanionAdEvent(2, null);
                }
                if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setTimestamp(System.currentTimeMillis());
                if (VastAdPresenter.this.A.booleanValue()) {
                    reportingEvent.setEventType("default_endcard_skipped");
                    reportingEvent.setCustomString("end_card_type", "default");
                }
                NextGen.getReportingController().reportEvent(reportingEvent);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdListener
        public void onAdDismissed(int i) {
            VastAdPresenter.this.b();
            VideoListener videoListener = VastAdPresenter.this.i;
            if (videoListener != null) {
                videoListener.onVideoDismissed(i);
            }
        }
    }

    class e implements AdFeedbackLoadListener {
        e() {
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onFormClosed() {
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            vastAdPresenter.r = false;
            vastAdPresenter.isLinkClickRunning = false;
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoad(String str) {
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoadFailed(Throwable th) {
            Logger.e(VastAdPresenter.a, th.getMessage());
            VastAdPresenter.this.isLinkClickRunning = false;
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoadFinished() {
            VastAdPresenter vastAdPresenter = VastAdPresenter.this;
            vastAdPresenter.r = true;
            vastAdPresenter.isLinkClickRunning = false;
        }
    }

    public VastAdPresenter(Context context, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, IntegrationType integrationType, View view) {
        Boolean bool = Boolean.FALSE;
        this.s = bool;
        this.t = bool;
        this.u = new ArrayList();
        this.v = bool;
        this.w = bool;
        this.x = bool;
        this.y = bool;
        this.z = bool;
        this.A = bool;
        this.B = bool;
        this.C = bool;
        this.D = bool;
        this.L = new a();
        this.M = new b();
        this.N = new c();
        this.O = new d();
        this.isLinkClickRunning = false;
        this.b = context;
        this.n = adSize;
        this.c = ad;
        this.e = view;
        this.K = NextGen.getReportingController();
        ImpressionTrackingMethod fromString = (ad == null || ad.getImpressionTrackingMethod() == null || ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod()) == null) ? null : ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod());
        if (fromString != null) {
            this.d = fromString;
        } else if (impressionTrackingMethod != null) {
            this.d = impressionTrackingMethod;
        } else {
            this.d = ImpressionTrackingMethod.AD_VIEWABLE;
        }
        VideoVisibilityManager videoVisibilityManager = VideoVisibilityManager.getInstance();
        this.f = videoVisibilityManager;
        videoVisibilityManager.addCallback(this);
        this.E = integrationType;
        c();
        d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View a() {
        ViewGroup frameLayout = new FrameLayout(this.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.addView(this.o, layoutParams);
        a(frameLayout);
        View view = this.e;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            frameLayout.addView(this.e);
        }
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void c() {
        if (this.c != null) {
            this.F = new AdTracker(this.c.getBeacons("impression"), this.c.getBeacons("click"));
            this.G = new AdTracker(this.c.getBeacons("custom_endcard_impression"), this.c.getBeacons("custom_endcard_click"));
        }
    }

    private void d() {
        if (this.c != null) {
            this.I = new AdTracker(this.c.getBeacons("custom_cta_show"), this.c.getBeacons("custom_cta_click"), false);
            this.J = new AdTracker(null, this.c.getBeacons("custom_cta_endcard_click"), false);
        }
    }

    private void e() {
        if (this.c != null) {
            this.H = new AdTracker(null, null, null, this.c.getBeacons("companion_ad_event"), this.c.getBeacons("custom_endcard_event"));
        }
    }

    private void f() {
        if (this.K == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("content_info_click");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setPlatform("android");
        Ad ad = this.c;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.c.getCampaignId());
            reportingEvent.setConfigId(this.c.getConfigId());
        }
        this.K.reportEvent(reportingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (NextGen.getReportingController() == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("companion_view");
        reportingEvent.setAdFormat("banner");
        reportingEvent.setCreativeType("video");
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(NextGen.getSDKVersionInfo(IntegrationType.STANDALONE));
        Ad ad = this.c;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.c.getCampaignId());
            reportingEvent.setConfigId(this.c.getConfigId());
        }
        reportingEvent.setTimestamp(System.currentTimeMillis());
        NextGen.getReportingController().reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void addFriendlyObstruction(View view) {
        VideoAd videoAd = this.p;
        if (videoAd != null) {
            videoAd.addFriendlyObstruction(view);
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void destroy() {
        VideoAd videoAd = this.p;
        if (videoAd != null) {
            videoAd.destroy();
        }
        this.f.removeCallback(this);
        this.g = null;
        this.k = true;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public Ad getAd() {
        return this.c;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void load() {
        VideoAdCacheItem inspect;
        if (CheckUtils.NoThrow.checkArgument(!this.k, "VastMRectPresenter is destroyed")) {
            try {
                if (this.c != null) {
                    this.p = new VideoAd(this.b, this.c, false, false, this.M);
                    VideoAdView videoAdView = new VideoAdView(this.b);
                    this.o = videoAdView;
                    this.p.bindView(videoAdView);
                    this.p.setAdListener(this.O);
                    this.p.setAdCloseButtonListener(this.N);
                    Boolean bool = Boolean.FALSE;
                    this.s = bool;
                    this.t = bool;
                    this.v = bool;
                    this.w = bool;
                    this.x = bool;
                    this.y = bool;
                    if (!TextUtils.isEmpty(getAd().getSessionId()) && (inspect = NextGen.getVideoAdCache().inspect(getAd().getSessionId())) != null) {
                        this.p.setVideoCacheItem(inspect);
                        if (inspect.getAdParams() != null && inspect.getAdParams().getAdIcon() != null) {
                            this.j = inspect.getAdParams().getAdIcon();
                        }
                    }
                    this.p.load(this.E);
                }
            } catch (Exception e2) {
                Logger.e(a, e2.getMessage());
                AdPresenter.Listener listener = this.g;
                if (listener != null) {
                    listener.onAdError(this);
                }
                VideoListener videoListener = this.i;
                if (videoListener != null) {
                    videoListener.onVideoError(0);
                }
            }
        }
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                EventTracker.post(this.b, list.get(i), null, false);
            }
        }
        f();
    }

    @Override // com.smaato.sdk.ng.visibility.ImpressionTracker.Listener
    public void onImpression(View view) {
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public synchronized void onLinkClicked(String str) {
        Ad ad;
        if (this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        AdFeedbackFormHelper adFeedbackFormHelper = new AdFeedbackFormHelper();
        if (URLValidator.isValidURL(str) && (ad = this.c) != null) {
            adFeedbackFormHelper.showFeedbackForm(this.b, str, ad, "banner", IntegrationType.STANDALONE, new e());
        } else {
            Logger.e(a, "URL is invalid");
            this.isLinkClickRunning = false;
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoVisibilityListener
    public void pauseAd() {
        VideoAd videoAd = this.p;
        if (videoAd == null || !videoAd.isShowing()) {
            return;
        }
        this.p.pause();
    }

    @Override // com.smaato.sdk.ng.vpaid.VideoVisibilityListener
    public void resumeAd() {
        VideoAd videoAd = this.p;
        if (videoAd == null || !videoAd.isShowing() || this.r) {
            return;
        }
        this.p.resume();
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setImpressionListener(AdPresenter.ImpressionListener impressionListener) {
        this.h = impressionListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setListener(AdPresenter.Listener listener) {
        this.g = listener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setMRaidListener(MRAIDViewListener mRAIDViewListener) {
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setVideoListener(VideoListener videoListener) {
        this.i = videoListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking() {
        startTracking(null);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void stopTracking() {
        if (this.d == ImpressionTrackingMethod.AD_VIEWABLE) {
            ImpressionManager.stopTrackingView(this.o);
        }
        this.p.dismiss();
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking(NextGenConsumer<Double> nextGenConsumer) {
        if (this.d == ImpressionTrackingMethod.AD_VIEWABLE) {
            ImpressionManager.startTrackingView(this.o, this.n, this.c.getImpressionMinVisibleTime(), this.c.getImpressionVisiblePercent(), this.L, nextGenConsumer);
            return;
        }
        VideoAd videoAd = this.p;
        if (videoAd != null) {
            videoAd.show();
        }
    }

    private void a(ViewGroup viewGroup) {
        if (getAd() == null || viewGroup == null) {
            return;
        }
        ContentInfo parseContentInfo = Utils.parseContentInfo(this.j);
        View a2 = a(viewGroup.getContext(), getAd(), parseContentInfo);
        this.q = a2;
        if (a2 != null) {
            if (parseContentInfo != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2.getLayoutParams();
                layoutParams.gravity = ((getAd().getContentInfoIconXPosition() == null ? parseContentInfo.getPositionX() != PositionX.RIGHT : getAd().getContentInfoIconXPosition() != ContentInfoIconXPosition.RIGHT) ? 8388611 : 8388613) | ((getAd().getContentInfoIconYPosition() == null ? parseContentInfo.getPositionY() != PositionY.BOTTOM : getAd().getContentInfoIconYPosition() != ContentInfoIconYPosition.BOTTOM) ? 48 : 80);
                viewGroup.addView(this.q, layoutParams);
            } else {
                viewGroup.addView(a2);
            }
            if (parseContentInfo == null || parseContentInfo.getViewTrackers() == null || parseContentInfo.getViewTrackers().isEmpty()) {
                return;
            }
            Iterator<String> it = parseContentInfo.getViewTrackers().iterator();
            while (it.hasNext()) {
                EventTracker.post(viewGroup.getContext(), it.next(), null, true);
            }
        }
    }

    private View a(Context context, Ad ad, ContentInfo contentInfo) {
        return contentInfo == null ? ad.getContentInfoContainer(context, this) : ad.getContentInfoContainer(context, contentInfo, this);
    }
}
