package net.pubnative.lite.sdk.contentinfo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.URLValidator;
import net.pubnative.lite.sdk.utils.UrlHandler;

/* loaded from: classes5.dex */
public class AdFeedbackView implements MRAIDViewListener, MRAIDNativeFeatureListener {
    private static final String TAG = "AdFeedbackView";
    private AdFeedbackData mAdFeedbackData;
    private boolean mIsReady = false;
    private AdFeedbackLoadListener mListener;
    private UrlHandler mUrlHandlerDelegate;
    private MRAIDInterstitial mViewContainer;

    public interface AdFeedbackLoadListener {
        void onFormClosed();

        void onLoad(String str);

        void onLoadFailed(Throwable th);

        void onLoadFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showFeedbackForm$0() {
        this.mViewContainer.showDefaultContentInfoURL(Ad.CONTENT_INFO_LINK_URL);
        this.mListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        this.mUrlHandlerDelegate.handleUrl(str, null, null);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureStorePicture(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowSkipButton() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onFormClosed();
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        this.mIsReady = false;
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        new FeedbackJSInterface().submitData(this.mAdFeedbackData, mRAIDView);
        this.mIsReady = true;
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFinished();
            Logger.d(TAG, "Feedback form loaded");
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAClick() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTALoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomCTAShow() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClicked() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadFail() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardLoadSuccess() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onCustomEndCardShow(String str) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onReplayClicked() {
    }

    public void prepare(Context context, String str, AdFeedbackLoadListener adFeedbackLoadListener) {
        prepare(context, str, null, null, null, adFeedbackLoadListener);
    }

    public void showFeedbackForm(Context context, String str) {
        if (context instanceof Activity) {
            showFeedbackForm((Activity) context, str);
            return;
        }
        AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK, "The feedback form requires an Activity context"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepare(Context context, String str, Ad ad, String str2, IntegrationType integrationType, AdFeedbackLoadListener adFeedbackLoadListener) {
        String str3;
        String str4;
        Uri parse;
        String processUrl;
        if (!TextUtils.isEmpty(str)) {
            try {
                parse = Uri.parse(str);
            } catch (RuntimeException e) {
                e = e;
                str3 = str;
            }
            if (parse != null && TextUtils.isEmpty(parse.getQueryParameter("apptoken"))) {
                str3 = parse.buildUpon().appendQueryParameter("apptoken", "token_macro").build().toString();
                try {
                    str4 = str3.replace("token_macro", "[APPTOKEN]");
                } catch (RuntimeException e2) {
                    e = e2;
                    Logger.e(TAG, e.getMessage());
                    HyBid.reportException((Exception) e);
                    str4 = str3;
                    this.mUrlHandlerDelegate = new UrlHandler(context);
                    this.mAdFeedbackData = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
                    processUrl = new FeedbackMacros().processUrl(str4, this.mAdFeedbackData);
                    if (!TextUtils.isEmpty(processUrl)) {
                    }
                    Boolean bool = Boolean.TRUE;
                    MRAIDInterstitial mRAIDInterstitial = new MRAIDInterstitial(context, str4, null, bool, bool, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
                    this.mViewContainer = mRAIDInterstitial;
                    mRAIDInterstitial.markCreativeAdComingFromFeedbackForm();
                    this.mListener = adFeedbackLoadListener;
                    adFeedbackLoadListener.onLoad(str4);
                }
                this.mUrlHandlerDelegate = new UrlHandler(context);
                this.mAdFeedbackData = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
                processUrl = new FeedbackMacros().processUrl(str4, this.mAdFeedbackData);
                if (!TextUtils.isEmpty(processUrl)) {
                    str4 = processUrl;
                }
                Boolean bool2 = Boolean.TRUE;
                MRAIDInterstitial mRAIDInterstitial2 = new MRAIDInterstitial(context, str4, null, bool2, bool2, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
                this.mViewContainer = mRAIDInterstitial2;
                mRAIDInterstitial2.markCreativeAdComingFromFeedbackForm();
                this.mListener = adFeedbackLoadListener;
                adFeedbackLoadListener.onLoad(str4);
            }
        }
        str4 = str;
        this.mUrlHandlerDelegate = new UrlHandler(context);
        this.mAdFeedbackData = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
        processUrl = new FeedbackMacros().processUrl(str4, this.mAdFeedbackData);
        if (!TextUtils.isEmpty(processUrl)) {
        }
        Boolean bool22 = Boolean.TRUE;
        MRAIDInterstitial mRAIDInterstitial22 = new MRAIDInterstitial(context, str4, null, bool22, bool22, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
        this.mViewContainer = mRAIDInterstitial22;
        mRAIDInterstitial22.markCreativeAdComingFromFeedbackForm();
        this.mListener = adFeedbackLoadListener;
        adFeedbackLoadListener.onLoad(str4);
    }

    public synchronized void showFeedbackForm(Activity activity, String str) {
        MRAIDInterstitial mRAIDInterstitial = this.mViewContainer;
        if (mRAIDInterstitial != null && mRAIDInterstitial.isLoaded() && this.mIsReady) {
            if (URLValidator.isValidURL(str)) {
                this.mViewContainer.show(activity, new MRAIDView.OnExpandCreativeFailListener() { // from class: net.pubnative.lite.sdk.contentinfo.AdFeedbackView$$ExternalSyntheticLambda0
                    @Override // net.pubnative.lite.sdk.mraid.MRAIDView.OnExpandCreativeFailListener
                    public final void onExpandFailed() {
                        AdFeedbackView.this.lambda$showFeedbackForm$0();
                    }
                }, str);
                return;
            }
            AdFeedbackLoadListener adFeedbackLoadListener = this.mListener;
            if (adFeedbackLoadListener != null) {
                adFeedbackLoadListener.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
            }
        } else {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.mListener;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoadFailed(new HyBidError(HyBidErrorCode.ERROR_LOADING_FEEDBACK));
            }
        }
    }
}
