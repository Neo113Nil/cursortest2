package com.smaato.sdk.ng.interstitial.presenter;

import android.content.Context;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.SkipOffset;
import com.smaato.sdk.ng.utils.AdEndCardManager;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.SkipOffsetManager;

/* loaded from: classes14.dex */
public class InterstitialPresenterFactory {
    private static final String c = "InterstitialPresenterFactory";
    private final Context a;
    private final String b;

    public InterstitialPresenterFactory(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    InterstitialPresenter a(int i, Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, IntegrationType integrationType, String str) {
        if (i == 15) {
            int offset = skipOffset2.getOffset();
            if (!skipOffset2.isCustom()) {
                offset = (ad.hasEndCard() && AdEndCardManager.isEndCardEnabled(ad).booleanValue()) ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset().intValue() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset().intValue();
            }
            return new VastInterstitialPresenter(this.a, ad, this.b, offset, integrationType, str);
        }
        if (i != 27 && i != 29) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(c, "Incompatible asset group type: " + i + ", for interstitial ad format.");
                    return null;
            }
        }
        return new MraidInterstitialPresenter(this.a, ad, this.b, Integer.valueOf(skipOffset.getOffset()), str);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        return createInterstitialPresenter(ad, listener, integrationType, null);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, InterstitialPresenter.Listener listener, IntegrationType integrationType, String str) {
        return createInterstitialPresenter(ad, new SkipOffset(SkipOffsetManager.getDefaultHtmlInterstitialSkipOffset().intValue(), false), new SkipOffset((ad.hasEndCard() ? SkipOffsetManager.getDefaultVideoWithEndCardSkipOffset() : SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset()).intValue(), false), listener, integrationType, str);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, InterstitialPresenter.Listener listener, IntegrationType integrationType) {
        return createInterstitialPresenter(ad, skipOffset, skipOffset2, listener, integrationType, null);
    }

    public InterstitialPresenter createInterstitialPresenter(Ad ad, SkipOffset skipOffset, SkipOffset skipOffset2, InterstitialPresenter.Listener listener, IntegrationType integrationType, String str) {
        InterstitialPresenter a = a(ad.assetgroupid, ad, skipOffset, skipOffset2, integrationType, str);
        if (a == null) {
            return null;
        }
        InterstitialPresenterDecorator interstitialPresenterDecorator = new InterstitialPresenterDecorator(a, new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), new AdTracker(ad.getBeacons("custom_endcard_impression"), ad.getBeacons("custom_endcard_click")), NextGen.getReportingController(), listener, integrationType);
        a.setListener(interstitialPresenterDecorator);
        a.setVideoListener(interstitialPresenterDecorator);
        a.setCustomEndCardListener(interstitialPresenterDecorator);
        return interstitialPresenterDecorator;
    }
}
