package com.smaato.sdk.banner.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.banner.ad.AutoReloadInterval;
import com.smaato.sdk.banner.ad.BannerAdSize;
import com.smaato.sdk.core.ad.AdRequestParams;
import com.smaato.sdk.core.ad.KeyValuePairs;
import com.smaato.sdk.core.ub.SmaatoUBCache;
import com.smaato.sdk.iahb.SmaatoSdkInAppBidding;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdSize;
import com.smaato.sdk.ng.views.NextGenAdView;

/* loaded from: classes11.dex */
public class BannerView extends NextGenAdView implements NextGenAdView.Listener {
    private AdRequestParams mAdRequestParams;
    private String mAdSpaceId;
    private BannerAdSize mBannerAdSize;
    private EventListener mEventListener;

    public interface EventListener {
        default void onAdClicked(BannerView bannerView) {
        }

        default void onAdFailedToLoad(BannerView bannerView, BannerError bannerError) {
        }

        default void onAdImpression(BannerView bannerView) {
        }

        default void onAdLoaded(BannerView bannerView) {
        }

        default void onAdTTLExpired(BannerView bannerView) {
        }
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public KeyValuePairs getKeyValuePairs() {
        return null;
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setAutoReloadInterval(AutoReloadInterval autoReloadInterval) {
    }

    public void setKeyValuePairs(KeyValuePairs keyValuePairs) {
    }

    public void setMediationAdapterVersion(String str) {
    }

    public void setMediationNetworkName(String str) {
    }

    public void setMediationNetworkSDKVersion(String str) {
    }

    public BannerView(Context context) {
        super(context);
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AutoReloadInterval getAutoReloadInterval() {
        return AutoReloadInterval.DISABLED;
    }

    public void setEventListener(EventListener eventListener) {
        if (eventListener != null) {
            this.mEventListener = eventListener;
        }
    }

    public String getSessionId() {
        return getImpressionId();
    }

    public String getAdSpaceId() {
        return this.mAdSpaceId;
    }

    public BannerAdSize getBannerAdSize() {
        return this.mBannerAdSize;
    }

    private BannerAdSize mapNextGenSizeToSmaato(AdSize adSize) {
        if (adSize == null) {
            return BannerAdSize.XX_LARGE_320x50;
        }
        int i = AnonymousClass1.$SwitchMap$com$smaato$sdk$ng$models$AdSize[adSize.ordinal()];
        if (i == 1) {
            return BannerAdSize.MEDIUM_RECTANGLE_300x250;
        }
        if (i == 2) {
            return BannerAdSize.LEADERBOARD_728x90;
        }
        if (i == 3) {
            return BannerAdSize.SKYSCRAPER_120x600;
        }
        return BannerAdSize.XX_LARGE_320x50;
    }

    private AdSize mapSmaatoSizeToNextGen(BannerAdSize bannerAdSize) {
        if (bannerAdSize == null) {
            return AdSize.SIZE_320x50;
        }
        int i = AnonymousClass1.$SwitchMap$com$smaato$sdk$banner$ad$BannerAdSize[bannerAdSize.ordinal()];
        if (i == 1) {
            return AdSize.SIZE_300x250;
        }
        if (i == 2) {
            return AdSize.SIZE_728x90;
        }
        if (i == 3) {
            return AdSize.SIZE_160x600;
        }
        return AdSize.SIZE_320x50;
    }

    /* renamed from: com.smaato.sdk.banner.widget.BannerView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$banner$ad$BannerAdSize;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$ng$models$AdSize;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            $SwitchMap$com$smaato$sdk$banner$ad$BannerAdSize = iArr;
            try {
                iArr[BannerAdSize.MEDIUM_RECTANGLE_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$smaato$sdk$banner$ad$BannerAdSize[BannerAdSize.LEADERBOARD_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$smaato$sdk$banner$ad$BannerAdSize[BannerAdSize.SKYSCRAPER_120x600.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AdSize.values().length];
            $SwitchMap$com$smaato$sdk$ng$models$AdSize = iArr2;
            try {
                iArr2[AdSize.SIZE_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$models$AdSize[AdSize.SIZE_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$smaato$sdk$ng$models$AdSize[AdSize.SIZE_160x600.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public void loadAd(String str, BannerAdSize bannerAdSize) {
        loadAd(str, bannerAdSize, null);
    }

    public void loadAd(String str, BannerAdSize bannerAdSize, AdRequestParams adRequestParams) {
        this.mBannerAdSize = bannerAdSize;
        this.mAdSpaceId = str;
        this.mAdRequestParams = adRequestParams;
        super.setAdSize(mapSmaatoSizeToNextGen(bannerAdSize));
        AdRequestParams adRequestParams2 = this.mAdRequestParams;
        if (adRequestParams2 != null && !TextUtils.isEmpty(adRequestParams2.getUBUniqueId())) {
            String uBUniqueId = this.mAdRequestParams.getUBUniqueId();
            String bid = SmaatoSdkInAppBidding.getBid(uBUniqueId);
            final Ad ad = SmaatoUBCache.getAd(uBUniqueId);
            if (!TextUtils.isEmpty(bid)) {
                renderAd(bid, this);
                return;
            }
            if (ad != null) {
                post(new Runnable() { // from class: com.smaato.sdk.banner.widget.BannerView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BannerView.this.lambda$loadAd$0(ad);
                    }
                });
                return;
            }
            EventListener eventListener = this.mEventListener;
            if (eventListener != null) {
                eventListener.onAdFailedToLoad(this, BannerError.INVALID_REQUEST);
                return;
            }
            return;
        }
        super.load(str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(Ad ad) {
        renderAd(ad, this);
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView.Listener
    public void onAdLoaded() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdLoaded(this);
        }
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView.Listener
    public void onAdLoadFailed(Throwable th) {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdFailedToLoad(this, ErrorMapper.mapBannerError(th));
        }
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView.Listener
    public void onAdImpression() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdImpression(this);
        }
    }

    @Override // com.smaato.sdk.ng.views.NextGenAdView.Listener
    public void onAdClick() {
        EventListener eventListener = this.mEventListener;
        if (eventListener != null) {
            eventListener.onAdClicked(this);
        }
    }
}
