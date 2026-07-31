package com.smaato.sdk.ng.banner.presenter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.contentinfo.AdFeedbackFormHelper;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.models.ImpressionTrackingMethod;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.mraid.MRAIDBanner;
import com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.CheckUtils;
import com.smaato.sdk.ng.utils.NextGenConsumer;
import com.smaato.sdk.ng.utils.UrlHandler;
import com.smaato.sdk.ng.viewability.baseom.BaseFriendlyObstructionPurpose;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.views.ProgressDialogFragment;
import com.smaato.sdk.ng.visibility.ImpressionManager;
import com.smaato.sdk.ng.visibility.ImpressionTracker;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MraidAdPresenter implements AdPresenter, MRAIDViewListener, MRAIDNativeFeatureListener, ImpressionTracker.Listener, NGSDKAPIContentInfoView.ContentInfoListener {
    private final Context a;
    private final Ad b;
    private final ImpressionTrackingMethod c;
    private final UrlHandler d;
    private final String[] e;
    private final View f;
    private AdSize g;
    private AdPresenter.Listener h;
    private AdPresenter.ImpressionListener i;
    private MRAIDBanner j;
    private MRAIDViewListener l;
    private boolean k = false;
    String n = "";
    private ReportingController m = NextGen.getReportingController();

    public MraidAdPresenter(Context context, Ad ad, AdSize adSize, ImpressionTrackingMethod impressionTrackingMethod, View view) {
        this.a = context;
        this.g = adSize;
        this.b = ad;
        this.f = view;
        if (ad != null && ad.getImpressionTrackingMethod() != null && ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod()) != null) {
            impressionTrackingMethod = ImpressionTrackingMethod.fromString(ad.getImpressionTrackingMethod());
        }
        if (impressionTrackingMethod != null) {
            this.c = impressionTrackingMethod;
        } else {
            this.c = ImpressionTrackingMethod.AD_VIEWABLE;
        }
        this.d = new UrlHandler(context);
        this.e = new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"};
    }

    private void a() {
        if (this.m == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("content_info_click");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        if (this.g == AdSize.SIZE_INTERSTITIAL) {
            reportingEvent.setAdFormat("fullscreen");
        } else {
            reportingEvent.setAdFormat("banner");
        }
        reportingEvent.setPlatform("android");
        Ad ad = getAd();
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(ad.getCampaignId());
            reportingEvent.setConfigId(ad.getConfigId());
        }
        this.m.reportEvent(reportingEvent);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void addFriendlyObstruction(View view) {
        MRAIDBanner mRAIDBanner = this.j;
        if (mRAIDBanner != null) {
            mRAIDBanner.addViewabilityFriendlyObstruction(view, BaseFriendlyObstructionPurpose.OTHER, "Watermark");
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void destroy() {
        MRAIDBanner mRAIDBanner = this.j;
        if (mRAIDBanner != null) {
            mRAIDBanner.destroy();
        }
        this.h = null;
        this.k = true;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public Ad getAd() {
        return this.b;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public JSONObject getPlacementParams() {
        return null;
    }

    public void hideProgressDialog(FragmentManager fragmentManager) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("progress dialog");
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.k, "MraidAdPresenter is destroyed")) {
            Boolean mraidExpand = this.b.getMraidExpand();
            if (mraidExpand == null) {
                mraidExpand = Boolean.TRUE;
            }
            Boolean bool = mraidExpand;
            if (this.b.getAssetUrl("htmlbanner") != null) {
                this.j = new MRAIDBanner(this.a, this.b.getAssetUrl("htmlbanner"), "", Boolean.TRUE, bool, this.e, this, this, this.b.getContentInfoContainer(this.a, this));
            } else if (this.b.getAssetHtml("htmlbanner") != null) {
                this.j = new MRAIDBanner(this.a, "", this.b.getAssetHtml("htmlbanner"), Boolean.TRUE, bool, this.e, this, this, this.b.getContentInfoContainer(this.a, this));
            }
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
        AdPresenter.Listener listener;
        if (this.k || (listener = this.h) == null) {
            return;
        }
        listener.onAdClicked(this);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        String str2;
        String str3;
        if (this.k) {
            return;
        }
        Ad ad = this.b;
        if (ad != null) {
            str2 = ad.getNavigationMode();
            str3 = this.b.getLink();
        } else {
            str2 = null;
            str3 = null;
        }
        this.d.handleUrl(str, str3, str2);
        AdPresenter.Listener listener = this.h;
        if (listener != null) {
            listener.onAdClicked(this);
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
        AdPresenter.Listener listener;
        if (this.k || (listener = this.h) == null) {
            return;
        }
        listener.onAdClicked(this);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
        MRAIDViewListener mRAIDViewListener = this.l;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.onExpandedAdClosed();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        AdPresenter.Listener listener;
        if (this.k || (listener = this.h) == null) {
            return;
        }
        listener.onAdError(this);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        AdPresenter.ImpressionListener impressionListener;
        if (this.k || this.h == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.a);
        MRAIDBanner mRAIDBanner = this.j;
        if (mRAIDBanner != null && mRAIDBanner.getParent() != null) {
            ((ViewGroup) this.j.getParent()).removeView(this.j);
        }
        frameLayout.addView(this.j);
        View view = this.f;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.f.getParent()).removeView(this.f);
            }
            frameLayout.addView(this.f);
        }
        this.h.onAdLoaded(this, frameLayout);
        if (this.c != ImpressionTrackingMethod.AD_RENDERED || (impressionListener = this.i) == null) {
            return;
        }
        impressionListener.onImpression();
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return true;
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
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                EventTracker.post(this.a, list.get(i), null, false);
            }
        }
        a();
    }

    @Override // com.smaato.sdk.ng.visibility.ImpressionTracker.Listener
    public void onImpression(View view) {
        AdPresenter.ImpressionListener impressionListener = this.i;
        if (impressionListener != null) {
            impressionListener.onImpression();
        }
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onLinkClicked(String str) {
        new AdFeedbackFormHelper().showFeedbackForm(this.a, str, this.b, "banner", IntegrationType.STANDALONE);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setImpressionListener(AdPresenter.ImpressionListener impressionListener) {
        this.i = impressionListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setListener(AdPresenter.Listener listener) {
        this.h = listener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setMRaidListener(MRAIDViewListener mRAIDViewListener) {
        this.l = mRAIDViewListener;
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void setVideoListener(VideoListener videoListener) {
    }

    public void showProgressDialog(FragmentManager fragmentManager, String str, String str2) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("progress dialog");
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
        }
        fragmentManager.beginTransaction().addToBackStack(null).commit();
        ProgressDialogFragment.newInstance(str, str2).show(fragmentManager, "progress dialog");
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking() {
        startTracking(null);
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void stopTracking() {
        MRAIDBanner mRAIDBanner = this.j;
        if (mRAIDBanner != null) {
            mRAIDBanner.stopAdSession();
            if (this.c == ImpressionTrackingMethod.AD_VIEWABLE) {
                ImpressionManager.stopTrackingView(this.j);
            }
        }
    }

    @Override // com.smaato.sdk.ng.presenter.AdPresenter
    public void startTracking(NextGenConsumer<Double> nextGenConsumer) {
        MRAIDBanner mRAIDBanner = this.j;
        if (mRAIDBanner == null || this.c != ImpressionTrackingMethod.AD_VIEWABLE) {
            return;
        }
        ImpressionManager.startTrackingView(mRAIDBanner, this.g, this.b.getImpressionMinVisibleTime(), this.b.getImpressionVisiblePercent(), this, nextGenConsumer);
    }
}
