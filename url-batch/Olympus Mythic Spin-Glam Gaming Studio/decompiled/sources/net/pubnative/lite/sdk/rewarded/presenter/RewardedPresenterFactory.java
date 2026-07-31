package net.pubnative.lite.sdk.rewarded.presenter;

import android.content.Context;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenter;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes5.dex */
public class RewardedPresenterFactory {
    private static final String TAG = "RewardedPresenterFactory";
    private final Context mContext;
    private final String mZoneId;

    public RewardedPresenterFactory(Context context, String str) {
        this.mContext = context;
        this.mZoneId = str;
    }

    public RewardedPresenter createRewardedPresenter(Ad ad, RewardedPresenter.Listener listener, IntegrationType integrationType) {
        return createRewardedPresenter(ad, listener, integrationType, null);
    }

    RewardedPresenter fromCreativeType(int i, Ad ad, IntegrationType integrationType, String str) {
        if (i == 15) {
            return new VastRewardedPresenter(this.mContext, ad, this.mZoneId, integrationType, str);
        }
        if (i != 27 && i != 29) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    Logger.e(TAG, "Incompatible asset group type: " + i + ", for rewarded ad format.");
                    return null;
            }
        }
        return new MraidRewardedPresenter(this.mContext, ad, this.mZoneId, str);
    }

    public RewardedPresenter createRewardedPresenter(Ad ad, RewardedPresenter.Listener listener, IntegrationType integrationType, String str) {
        RewardedPresenter fromCreativeType = fromCreativeType(ad.assetgroupid, ad, integrationType, str);
        if (fromCreativeType == null) {
            return null;
        }
        RewardedPresenterDecorator rewardedPresenterDecorator = new RewardedPresenterDecorator(fromCreativeType, new AdTracker(ad.getBeacons("impression"), ad.getBeacons("click"), ad.getBeacons("sdk_event"), ad.getBeacons("companion_ad_event"), ad.getBeacons("custom_endcard_event")), new AdTracker(ad.getBeacons("custom_endcard_impression"), ad.getBeacons("custom_endcard_click")), HyBid.getReportingController(), listener, integrationType);
        fromCreativeType.setListener(rewardedPresenterDecorator);
        fromCreativeType.setCustomEndCardListener(rewardedPresenterDecorator);
        return rewardedPresenterDecorator;
    }
}
