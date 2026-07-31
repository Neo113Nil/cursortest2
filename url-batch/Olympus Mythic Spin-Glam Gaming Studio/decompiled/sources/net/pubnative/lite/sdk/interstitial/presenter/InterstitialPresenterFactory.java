package net.pubnative.lite.sdk.interstitial.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;

/* loaded from: classes11.dex */
public class InterstitialPresenterFactory {
    private static final String TAG = "InterstitialPresenterFactory";
    private final Context mContext;
    private final String mZoneId;

    public InterstitialPresenterFactory(Context context, String str) {
        this.mContext = context;
        this.mZoneId = str;
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        return createInterstitialPresenter(ad, listener, integrationType, null);
    }

    InterstitialPresenter fromCreativeType(int i, Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, IntegrationType integrationType, String str) {
        if (i == 15) {
            int offset = skipOffset2.getOffset();
            if (!skipOffset2.isCustom()) {
                offset = (ad.hasEndCard() && AdEndCardManager.isEndCardEnabled(ad).booleanValue()) ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset().intValue() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset().intValue();
            }
            return new VastInterstitialPresenter(this.mContext, ad, this.mZoneId, offset, integrationType, str);
        }
        if (i != 27 && i != 29) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(TAG, "Incompatible asset group type: " + i + ", for interstitial ad format.");
                    return null;
            }
        }
        return new MraidInterstitialPresenter(this.mContext, ad, this.mZoneId, Integer.valueOf(skipOffset.getOffset()), str);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, InterstitialPresenter.Listener listener, IntegrationType integrationType, String str) {
        return createInterstitialPresenter(ad, new SkipOffset(SkipOffsetManager.getDefaultHtmlInterstitialSkipOffset().intValue(), false), new SkipOffset((ad.hasEndCard() ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset()).intValue(), false), listener, integrationType, str);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        return createInterstitialPresenter(ad, skipOffset, skipOffset2, listener, integrationType, null);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, InterstitialPresenter.Listener listener, IntegrationType integrationType, String str) {
        InterstitialPresenter fromCreativeType = fromCreativeType(ad.assetgroupid, ad, skipOffset, skipOffset2, integrationType, str);
        if (fromCreativeType == null) {
            return null;
        }
        InterstitialPresenterDecorator interstitialPresenterDecorator = new InterstitialPresenterDecorator(fromCreativeType, new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), new AdTracker(ad.getBeacons("custom_endcard_impression"), ad.getBeacons("custom_endcard_click")), HyBid.getReportingController(), listener, integrationType);
        fromCreativeType.setListener(interstitialPresenterDecorator);
        fromCreativeType.setVideoListener(interstitialPresenterDecorator);
        fromCreativeType.setCustomEndCardListener(interstitialPresenterDecorator);
        return interstitialPresenterDecorator;
    }
}
