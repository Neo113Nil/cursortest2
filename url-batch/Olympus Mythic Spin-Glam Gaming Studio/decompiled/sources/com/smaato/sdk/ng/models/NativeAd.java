package com.smaato.sdk.ng.models;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.ReportingController;
import com.smaato.sdk.ng.analytics.ReportingEvent;
import com.smaato.sdk.ng.contentinfo.AdFeedbackFormHelper;
import com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener;
import com.smaato.sdk.ng.prefs.SessionImpressionPrefs;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.URLValidator;
import com.smaato.sdk.ng.utils.UrlHandler;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.views.NGSDKBeaconWebView;
import com.smaato.sdk.ng.visibility.ImpressionManager;
import com.smaato.sdk.ng.visibility.ImpressionTracker;
import com.smaato.sdk.ng.visibility.TrackingManager;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class NativeAd implements ImpressionTracker.Listener, NGSDKAPIContentInfoView.ContentInfoListener {
    private static final String TAG = "NativeAd";
    private Bitmap bannerBitmap;
    private Bitmap iconBitmap;
    public boolean isLinkClickRunning;
    protected Ad mAd;
    private View mAdView;
    private View mClickableView;
    private boolean mIsImpressionConfirmed;
    protected Listener mListener;
    private ReportingController mReportingController;
    private Map<String, String> mTrackingExtras;
    private List<String> mUsedAssets;
    String processedURL;

    public interface Listener {
        void onAdClick(NativeAd nativeAd, View view);

        void onAdImpression(NativeAd nativeAd, View view);
    }

    public NativeAd() {
        this.processedURL = "";
        this.isLinkClickRunning = false;
        this.mAd = null;
        this.mReportingController = NextGen.getReportingController();
    }

    private void confirmBeacons(String str, Context context) {
        Ad ad = this.mAd;
        if (ad == null) {
            Log.w(TAG, "confirmBeacons - Error: ad data not present");
            return;
        }
        List<AdData> beacons = ad.getBeacons(str);
        if (beacons == null) {
            return;
        }
        for (AdData adData : beacons) {
            String injectExtras = injectExtras(adData.getURL());
            String stringField = adData.getStringField(POBConstants.KEY_JS);
            if (!TextUtils.isEmpty(injectExtras)) {
                TrackingManager.track(context, injectExtras);
            } else if (!TextUtils.isEmpty(stringField)) {
                try {
                    new NGSDKBeaconWebView(context).loadBeacon(stringField);
                } catch (Exception e) {
                    Log.e(TAG, "confirmImpressionBeacons - JS Error: " + e);
                }
            }
        }
    }

    private void confirmClickBeacons(Context context) {
        confirmBeacons("click", context);
    }

    private void confirmImpressionBeacons(Context context) {
        List<String> list = this.mUsedAssets;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                TrackingManager.track(context, it.next());
            }
        }
        confirmBeacons("impression", context);
    }

    private String getClickUrl() {
        return injectExtras(this.mAd.link);
    }

    private String injectExtras(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.mTrackingExtras) == null || map.size() <= 0) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : this.mTrackingExtras.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getKey());
        }
        return buildUpon.build().toString();
    }

    private void invokeOnContentInfoClick() {
        if (this.mReportingController == null || !NextGen.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setEventType("content_info_click");
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("native");
        reportingEvent.setPlatform("android");
        Ad ad = this.mAd;
        if (ad != null) {
            reportingEvent.setImpId(ad.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        this.mReportingController.reportEvent(reportingEvent);
    }

    private void stopTrackingClicks() {
        View view = this.mClickableView;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    private void stopTrackingImpression() {
        ImpressionManager.stopTrackingAll(this);
    }

    public Bitmap getBannerBitmap() {
        return this.bannerBitmap;
    }

    public String getBannerUrl() {
        AdData asset;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("banner")) == null) {
            return null;
        }
        return asset.getURL();
    }

    public Integer getBidPoints() {
        Ad ad = this.mAd;
        return Integer.valueOf(ad != null ? ad.getECPM().intValue() : 0);
    }

    public String getCallToActionText() {
        AdData asset;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("cta")) == null) {
            return null;
        }
        return asset.getText();
    }

    public View getContentInfo(Context context) {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getContentInfo(context, this);
        }
        return null;
    }

    public String getContentInfoClickUrl() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getContentInfoClickUrl();
        }
        return null;
    }

    public String getContentInfoIconUrl() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getContentInfoIconUrl();
        }
        return null;
    }

    public String getContentInfoText() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getContentInfoText();
        }
        return null;
    }

    public String getCreativeId() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getCreativeId();
        }
        return null;
    }

    public String getDescription() {
        AdData asset;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("description")) == null) {
            return null;
        }
        return asset.getText();
    }

    public Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public String getIconUrl() {
        AdData asset;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("icon")) == null) {
            return null;
        }
        return asset.getURL();
    }

    public String getImpressionId() {
        Ad ad = this.mAd;
        if (ad != null) {
            return ad.getImpressionId();
        }
        return null;
    }

    public int getRating() {
        AdData asset;
        Double number;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("rating")) == null || (number = asset.getNumber()) == null) {
            return 0;
        }
        return number.intValue();
    }

    public String getTitle() {
        AdData asset;
        Ad ad = this.mAd;
        if (ad == null || (asset = ad.getAsset("title")) == null) {
            return null;
        }
        return asset.getText();
    }

    protected void invokeOnClick(View view) {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdClick(this, view);
        }
    }

    public synchronized void invokeOnImpression(View view) {
        try {
            this.mIsImpressionConfirmed = true;
            if (view != null && view.getContext() != null) {
                Ad ad = this.mAd;
                if (ad != null && !TextUtils.isEmpty(ad.getZoneId())) {
                    new SessionImpressionPrefs(view.getContext()).insert(this.mAd.getZoneId());
                }
                Listener listener = this.mListener;
                if (listener != null) {
                    listener.onAdImpression(this, view);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                EventTracker.post(this.mAdView.getContext(), list.get(i), null, false);
            }
        }
        invokeOnContentInfoClick();
    }

    @Override // com.smaato.sdk.ng.visibility.ImpressionTracker.Listener
    public void onImpression(View view) {
        confirmImpressionBeacons(view.getContext());
        invokeOnImpression(view);
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public synchronized void onLinkClicked(String str) {
        View view = this.mAdView;
        if (view == null || view.getContext() == null || this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        AdFeedbackFormHelper adFeedbackFormHelper = new AdFeedbackFormHelper();
        if (URLValidator.isValidURL(str)) {
            adFeedbackFormHelper.showFeedbackForm(this.mAdView.getContext(), str, this.mAd, "native", IntegrationType.STANDALONE, new AdFeedbackLoadListener() { // from class: com.smaato.sdk.ng.models.NativeAd.1
                @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
                public void onFormClosed() {
                    NativeAd.this.isLinkClickRunning = false;
                }

                @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoad(String str2) {
                    NativeAd.this.processedURL = str2;
                }

                @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFailed(Throwable th) {
                    NativeAd.this.isLinkClickRunning = false;
                    Logger.e(NativeAd.TAG, th.getMessage());
                }

                @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
                public void onLoadFinished() {
                    NativeAd.this.isLinkClickRunning = false;
                }
            });
        } else {
            Logger.e(TAG, "Content info url is invalid");
            this.isLinkClickRunning = false;
        }
    }

    public void onNativeClick() {
        View view = this.mAdView;
        if (view != null) {
            confirmClickBeacons(view.getContext());
            openURL(getClickUrl(), true);
        }
    }

    protected void openURL(String str, boolean z) {
        View view;
        Context context = ((!z || (view = this.mAdView) == null) && (view = this.mClickableView) == null) ? null : view.getContext();
        if (context == null || this.mAd == null) {
            return;
        }
        new UrlHandler(context).handleUrl(str, this.mAd.getLink(), this.mAd.getNavigationMode());
    }

    public void setBannerBitmap(Bitmap bitmap) {
        this.bannerBitmap = bitmap;
    }

    public void setIconBitmap(Bitmap bitmap) {
        this.iconBitmap = bitmap;
    }

    public void startTracking(View view, Listener listener) {
        startTracking(view, view, listener);
    }

    public void startTrackingClicks(View view) {
        if (TextUtils.isEmpty(getClickUrl())) {
            Log.w(TAG, "click url is empty, clicks won't be tracked");
        } else if (view == null) {
            Log.w(TAG, "click view is null, clicks won't be tracked");
        } else {
            this.mClickableView = view;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.ng.models.NativeAd$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NativeAd.this.onNativeClick(view2);
                }
            });
        }
    }

    public void startTrackingImpression(View view) {
        if (view == null) {
            Log.w(TAG, "ad view is null, cannot start tracking");
        } else if (this.mIsImpressionConfirmed) {
            Log.i(TAG, "impression is already confirmed, dropping impression tracking");
        } else {
            this.mAdView = view;
            ImpressionManager.startTrackingView(view, this.mAd.getImpressionMinVisibleTime(), this.mAd.getImpressionVisiblePercent(), this);
        }
    }

    public void stopTracking() {
        stopTrackingImpression();
        stopTrackingClicks();
    }

    public void startTracking(View view, View view2, Listener listener) {
        startTracking(view, view2, null, listener);
    }

    public void startTracking(View view, View view2, Map<String, String> map, Listener listener) {
        if (listener == null) {
            Log.w(TAG, "startTracking - listener is null, start tracking without callbacks");
        }
        this.mListener = listener;
        this.mTrackingExtras = map;
        stopTracking();
        startTrackingImpression(view);
        startTrackingClicks(view2);
    }

    public void onNativeClick(View view) {
        invokeOnClick(view);
        confirmClickBeacons(view.getContext());
        openURL(getClickUrl(), false);
    }

    public NativeAd(Ad ad) {
        this.processedURL = "";
        this.isLinkClickRunning = false;
        this.mAd = ad;
        this.mReportingController = NextGen.getReportingController();
    }
}
