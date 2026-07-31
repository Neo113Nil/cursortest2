package com.smaato.sdk.ng.contentinfo;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.mraid.MRAIDInterstitial;
import com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener;
import com.smaato.sdk.ng.mraid.MRAIDView;
import com.smaato.sdk.ng.mraid.MRAIDViewListener;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.URLValidator;
import com.smaato.sdk.ng.utils.UrlHandler;

/* loaded from: classes3.dex */
public class AdFeedbackView implements MRAIDViewListener, MRAIDNativeFeatureListener {
    private static final String f = "AdFeedbackView";
    private MRAIDInterstitial a;
    private AdFeedbackLoadListener b;
    private AdFeedbackData c;
    private UrlHandler d;
    private boolean e = false;

    public interface AdFeedbackLoadListener {
        void onFormClosed();

        void onLoad(String str);

        void onLoadFailed(Throwable th);

        void onLoadFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.showDefaultContentInfoURL(Ad.CONTENT_INFO_LINK_URL);
        this.b.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideCloseButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidHideSkipButton() {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCallTel(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureCreateCalendarEvent(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureOpenBrowser(String str) {
        this.d.handleUrl(str, null, null);
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeaturePlayVideo(String str) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDNativeFeatureListener
    public void mraidNativeFeatureSendSms(String str) {
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
        AdFeedbackLoadListener adFeedbackLoadListener = this.b;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onFormClosed();
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
        this.e = false;
        AdFeedbackLoadListener adFeedbackLoadListener = this.b;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
        new FeedbackJSInterface().submitData(this.c, mRAIDView);
        this.e = true;
        AdFeedbackLoadListener adFeedbackLoadListener = this.b;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFinished();
            Logger.d(f, "Feedback form loaded");
        }
    }

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
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

    @Override // com.smaato.sdk.ng.mraid.MRAIDViewListener
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
        AdFeedbackLoadListener adFeedbackLoadListener = this.b;
        if (adFeedbackLoadListener != null) {
            adFeedbackLoadListener.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK, "The feedback form requires an Activity context"));
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
                    Logger.e(f, e.getMessage());
                    NextGen.reportException((Exception) e);
                    str4 = str3;
                    this.d = new UrlHandler(context);
                    this.c = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
                    processUrl = new FeedbackMacros().processUrl(str4, this.c);
                    if (!TextUtils.isEmpty(processUrl)) {
                    }
                    Boolean bool = Boolean.TRUE;
                    MRAIDInterstitial mRAIDInterstitial = new MRAIDInterstitial(context, str4, null, bool, bool, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
                    this.a = mRAIDInterstitial;
                    mRAIDInterstitial.markCreativeAdComingFromFeedbackForm();
                    this.b = adFeedbackLoadListener;
                    adFeedbackLoadListener.onLoad(str4);
                }
                this.d = new UrlHandler(context);
                this.c = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
                processUrl = new FeedbackMacros().processUrl(str4, this.c);
                if (!TextUtils.isEmpty(processUrl)) {
                    str4 = processUrl;
                }
                Boolean bool2 = Boolean.TRUE;
                MRAIDInterstitial mRAIDInterstitial2 = new MRAIDInterstitial(context, str4, null, bool2, bool2, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
                this.a = mRAIDInterstitial2;
                mRAIDInterstitial2.markCreativeAdComingFromFeedbackForm();
                this.b = adFeedbackLoadListener;
                adFeedbackLoadListener.onLoad(str4);
            }
        }
        str4 = str;
        this.d = new UrlHandler(context);
        this.c = new AdFeedbackDataCollector(integrationType).collectData(ad, str2, integrationType);
        processUrl = new FeedbackMacros().processUrl(str4, this.c);
        if (!TextUtils.isEmpty(processUrl)) {
        }
        Boolean bool22 = Boolean.TRUE;
        MRAIDInterstitial mRAIDInterstitial22 = new MRAIDInterstitial(context, str4, null, bool22, bool22, new String[]{"calendar", "inlineVideo", "sms", "storePicture", "tel", "location"}, this, this, null);
        this.a = mRAIDInterstitial22;
        mRAIDInterstitial22.markCreativeAdComingFromFeedbackForm();
        this.b = adFeedbackLoadListener;
        adFeedbackLoadListener.onLoad(str4);
    }

    public synchronized void showFeedbackForm(Activity activity, String str) {
        MRAIDInterstitial mRAIDInterstitial = this.a;
        if (mRAIDInterstitial != null && mRAIDInterstitial.isLoaded() && this.e) {
            if (URLValidator.isValidURL(str)) {
                this.a.show(activity, new MRAIDView.OnExpandCreativeFailListener() { // from class: com.smaato.sdk.ng.contentinfo.AdFeedbackView$$ExternalSyntheticLambda0
                    @Override // com.smaato.sdk.ng.mraid.MRAIDView.OnExpandCreativeFailListener
                    public final void onExpandFailed() {
                        AdFeedbackView.this.a();
                    }
                }, str);
                return;
            }
            AdFeedbackLoadListener adFeedbackLoadListener = this.b;
            if (adFeedbackLoadListener != null) {
                adFeedbackLoadListener.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
            }
        } else {
            AdFeedbackLoadListener adFeedbackLoadListener2 = this.b;
            if (adFeedbackLoadListener2 != null) {
                adFeedbackLoadListener2.onLoadFailed(new NextGenError(NextGenErrorCode.ERROR_LOADING_FEEDBACK));
            }
        }
    }
}
