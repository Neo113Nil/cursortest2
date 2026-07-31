package com.smaato.sdk.ng.rewarded.presenter;

import android.content.Context;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter;
import com.smaato.sdk.ng.utils.AdTracker;
import com.smaato.sdk.ng.utils.Logger;

/* loaded from: classes3.dex */
public class RewardedPresenterFactory {
    private static final String c = "RewardedPresenterFactory";
    private final Context a;
    private final String b;

    public RewardedPresenterFactory(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    RewardedPresenter a(int i, Ad ad, IntegrationType integrationType, String str) {
        if (i == 15) {
            return new VastRewardedPresenter(this.a, ad, this.b, integrationType, str);
        }
        if (i != 27 && i != 29) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(c, "Incompatible asset group type: " + i + ", for rewarded ad format.");
                    return null;
            }
        }
        return new MraidRewardedPresenter(this.a, ad, this.b, str);
    }

    public RewardedPresenter createRewardedPresenter(Ad ad, RewardedPresenter.Listener listener, IntegrationType integrationType) {
        return createRewardedPresenter(ad, listener, integrationType, null);
    }

    public RewardedPresenter createRewardedPresenter(Ad ad, RewardedPresenter.Listener listener, IntegrationType integrationType, String str) {
        RewardedPresenter a = a(ad.assetgroupid, ad, integrationType, str);
        if (a == null) {
            return null;
        }
        RewardedPresenterDecorator rewardedPresenterDecorator = new RewardedPresenterDecorator(a, new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), new AdTracker(ad.getBeacons("custom_endcard_impression"), ad.getBeacons("custom_endcard_click")), NextGen.getReportingController(), listener, integrationType);
        a.setListener(rewardedPresenterDecorator);
        a.setCustomEndCardListener(rewardedPresenterDecorator);
        return rewardedPresenterDecorator;
    }
}
