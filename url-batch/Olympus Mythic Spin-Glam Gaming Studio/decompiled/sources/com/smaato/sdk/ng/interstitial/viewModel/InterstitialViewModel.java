package com.smaato.sdk.ng.interstitial.viewModel;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smaato.sdk.ng.BaseViewModel;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.contentinfo.AdFeedbackFormHelper;
import com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener;
import com.smaato.sdk.ng.interstitial.InterstitialActivityInteractor;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastSender;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.ContentInfo;
import com.smaato.sdk.ng.models.ContentInfoIconXPosition;
import com.smaato.sdk.ng.models.ContentInfoIconYPosition;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.PositionX;
import com.smaato.sdk.ng.models.PositionY;
import com.smaato.sdk.ng.mraid.model.HTMLAd;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.URLValidator;
import com.smaato.sdk.ng.utils.UrlHandler;
import com.smaato.sdk.ng.views.CloseableContainer;
import com.smaato.sdk.ng.views.NGSDKAPIContentInfoView;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import com.smaato.sdk.ng.vpaid.models.vast.Icon;
import com.smaato.sdk.ng.vpaid.utils.Utils;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class InterstitialViewModel extends BaseViewModel implements NGSDKAPIContentInfoView.ContentInfoListener {
    private static final String v = "InterstitialViewModel";
    protected final Context b;
    protected final String c;
    protected final InterstitialActivityInteractor d;
    protected IntegrationType e;
    protected final int f;
    protected Ad g;
    private final NextGenInterstitialBroadcastSender h;
    private final UrlHandler i;
    private final AdFeedbackFormHelper l;
    private View m;
    protected AdTracker o;
    protected AdTracker p;
    protected AdTracker q;
    protected AdTracker r;
    protected HTMLAd s;
    public boolean isLinkClickRunning = false;
    protected boolean j = false;
    private boolean k = false;
    protected boolean n = false;
    protected final CloseableContainer.OnCloseListener t = new CloseableContainer.OnCloseListener() { // from class: com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel$$ExternalSyntheticLambda0
        @Override // com.smaato.sdk.ng.views.CloseableContainer.OnCloseListener
        public final void onClose() {
            InterstitialViewModel.this.closeButtonClicked();
        }
    };
    protected final CloseableContainer.OnSkipListener u = new CloseableContainer.OnSkipListener() { // from class: com.smaato.sdk.ng.interstitial.viewModel.InterstitialViewModel$$ExternalSyntheticLambda1
        @Override // com.smaato.sdk.ng.views.CloseableContainer.OnSkipListener
        public final void onSkip() {
            InterstitialViewModel.this.skipButtonClicked();
        }
    };

    class a implements AdFeedbackLoadListener {
        a() {
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onFormClosed() {
            InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
            interstitialViewModel.isLinkClickRunning = false;
            interstitialViewModel.j = false;
            interstitialViewModel.k = false;
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoad(String str) {
            InterstitialViewModel.this.k = true;
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoadFailed(Throwable th) {
            InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
            interstitialViewModel.isLinkClickRunning = false;
            interstitialViewModel.k = false;
            if (interstitialViewModel.j) {
                interstitialViewModel.j = false;
            }
            Logger.e(InterstitialViewModel.v, th.getMessage());
        }

        @Override // com.smaato.sdk.ng.contentinfo.listeners.AdFeedbackLoadListener
        public void onLoadFinished() {
            InterstitialViewModel interstitialViewModel = InterstitialViewModel.this;
            interstitialViewModel.isLinkClickRunning = false;
            interstitialViewModel.k = false;
            interstitialViewModel.j = true;
        }
    }

    public InterstitialViewModel(Context context, String str, String str2, int i, long j, InterstitialActivityInteractor interstitialActivityInteractor) {
        this.b = context;
        this.c = str;
        this.f = i;
        this.d = interstitialActivityInteractor;
        a(str2);
        this.h = new NextGenInterstitialBroadcastSender(context, j);
        this.i = new UrlHandler(context);
        this.l = new AdFeedbackFormHelper();
        b();
    }

    private void a(String str) {
        if (str == null) {
            this.e = IntegrationType.IN_APP_BIDDING;
            return;
        }
        IntegrationType integrationType = IntegrationType.HEADER_BIDDING;
        if (str.equals(integrationType.getCode())) {
            this.e = integrationType;
            return;
        }
        IntegrationType integrationType2 = IntegrationType.MEDIATION;
        if (str.equals(integrationType2.getCode())) {
            this.e = integrationType2;
            return;
        }
        IntegrationType integrationType3 = IntegrationType.STANDALONE;
        if (str.equals(integrationType3.getCode())) {
            this.e = integrationType3;
        } else {
            this.e = IntegrationType.IN_APP_BIDDING;
        }
    }

    private void b() {
        if (this.g == null) {
            synchronized (this) {
                try {
                    if (NextGen.getAdCache() != null) {
                        this.g = NextGen.getAdCache().remove(this.c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c() {
        if (this.g != null) {
            this.o = new AdTracker(this.g.getBeacons("impression"), this.g.getBeacons("click"));
            this.p = new AdTracker(this.g.getBeacons("custom_endcard_impression"), this.g.getBeacons("custom_endcard_click"));
            this.q = new AdTracker(null, null, null, this.g.getBeacons("companion_ad_event"), this.g.getBeacons("custom_endcard_event"));
            this.r = new AdTracker(this.g.getBeacons("custom_cta_show"), this.g.getBeacons("custom_cta_click"), false);
        }
    }

    public abstract void addFriendlyObstruction(View view);

    public abstract void closeButtonClicked();

    public abstract void destroyAd();

    public abstract View getAdView();

    public ViewGroup getContentInfoContainer() {
        Ad ad = this.g;
        if (ad != null) {
            return ad.getContentInfoContainer(this.b, this);
        }
        return null;
    }

    public void handleURL(String str) {
        Ad ad = this.g;
        if (ad != null) {
            this.i.handleUrl(str, ad.getLink(), this.g.getNavigationMode());
        }
    }

    public abstract Boolean hasReducedCloseSize();

    public void hideContentInfo() {
        View view = this.m;
        if (view != null) {
            this.d.removeContentInfoView(view);
        }
    }

    public boolean isAdSkippable() {
        return this.n;
    }

    public boolean isFeedbackFormOpen() {
        return this.j;
    }

    public boolean isValidAdToRender() {
        return (TextUtils.isEmpty(this.c) || this.h.getBroadcastId() == -1) ? false : true;
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onIconClicked(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                EventTracker.post(this.b, list.get(i), null, false);
            }
        }
        a(this.e, this.g, "fullscreen");
    }

    @Override // com.smaato.sdk.ng.views.NGSDKAPIContentInfoView.ContentInfoListener
    public void onLinkClicked(String str) {
        if (this.isLinkClickRunning) {
            return;
        }
        this.isLinkClickRunning = true;
        if (this.j || this.k) {
            return;
        }
        if (URLValidator.isValidURL(str)) {
            this.l.showFeedbackForm(this.b, str, this.g, "rewarded", IntegrationType.STANDALONE, new a());
            return;
        }
        this.isLinkClickRunning = false;
        this.j = false;
        this.k = false;
        Logger.e(v, "Content Info URL is invalid");
    }

    public abstract void pauseAd();

    public void processInterstitialAd() {
        Ad ad;
        FrameLayout contentInfoContainer;
        if (!isValidAdToRender()) {
            this.d.finishActivity();
            return;
        }
        View adView = getAdView();
        c();
        this.d.hideInterstitialCloseButton();
        this.d.hideInterstitialSkipButton();
        if (adView == null) {
            this.d.finishActivity();
            return;
        }
        if (hasReducedCloseSize().booleanValue()) {
            this.d.setCloseSize(20);
            this.d.setSkipSize(20);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.d.hideProgressBar();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.d.addProgressBarView(layoutParams2);
        this.d.addAdView(adView, layoutParams);
        if ((this instanceof VastInterstitialViewModel) || !shouldShowContentInfo() || (ad = this.g) == null || (contentInfoContainer = ad.getContentInfoContainer(this.b, this)) == null) {
            return;
        }
        this.d.addContentInfoView(contentInfoContainer, null);
    }

    public abstract void resetVolumeChangeTracker();

    public abstract void resumeAd();

    public void sendBroadcast(NextGenInterstitialBroadcastReceiver.Action action) {
        NextGenInterstitialBroadcastSender nextGenInterstitialBroadcastSender = this.h;
        if (nextGenInterstitialBroadcastSender != null) {
            nextGenInterstitialBroadcastSender.sendBroadcast(action);
        }
    }

    public void setupContentInfo(Icon icon) {
        if (this.g != null) {
            ContentInfo parseContentInfo = Utils.parseContentInfo(icon);
            View a2 = a(this.b, parseContentInfo);
            this.m = a2;
            if (a2 != null) {
                if (parseContentInfo != null) {
                    int i = (this.g.getContentInfoIconXPosition() == null ? parseContentInfo.getPositionX() != PositionX.RIGHT : this.g.getContentInfoIconXPosition() != ContentInfoIconXPosition.RIGHT) ? 8388611 : 8388613;
                    int i2 = (this.g.getContentInfoIconYPosition() == null ? parseContentInfo.getPositionY() != PositionY.BOTTOM : this.g.getContentInfoIconYPosition() != ContentInfoIconYPosition.BOTTOM) ? 48 : 80;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = i | i2;
                    this.d.addContentInfoView(this.m, layoutParams);
                } else {
                    this.d.addContentInfoView(a2, null);
                }
                if (parseContentInfo != null) {
                    a(this.b, parseContentInfo.getViewTrackers());
                }
            }
        }
    }

    public abstract boolean shouldShowContentInfo();

    public abstract void skipButtonClicked();

    public void sendBroadcast(NextGenInterstitialBroadcastReceiver.Action action, Bundle bundle) {
        NextGenInterstitialBroadcastSender nextGenInterstitialBroadcastSender = this.h;
        if (nextGenInterstitialBroadcastSender != null) {
            nextGenInterstitialBroadcastSender.sendBroadcast(action, bundle);
        }
    }

    private View a(Context context, ContentInfo contentInfo) {
        return contentInfo == null ? this.g.getContentInfoContainer(context, this) : this.g.getContentInfoContainer(context, contentInfo, this);
    }

    protected void a() {
        sendBroadcast(NextGenInterstitialBroadcastReceiver.Action.DISMISS);
        this.d.finishActivity();
    }
}
