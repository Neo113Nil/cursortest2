package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.i9;
import com.my.target.mediation.MediationRewardedAdAdapter;
import com.my.target.mi;
import com.my.target.q;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public final class MyTargetRewardedAdAdapter implements MediationRewardedAdAdapter {
    private i9 a;
    private RewardedAd b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements RewardedAd.RewardedAdListener {
        private final MediationRewardedAdAdapter.MediationRewardedAdListener a;

        a(MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener) {
            this.a = mediationRewardedAdListener;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: Ad clicked");
            this.a.onClick(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: Ad dismissed");
            this.a.onDismiss(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: Ad displayed");
            this.a.onDisplay(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: Ad failed to show");
            this.a.onFailedToShow(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: Ad loaded");
            this.a.onLoad(MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: No ad (" + iAdLoadingError.getMessage() + ")");
            this.a.onNoAd(iAdLoadingError, MyTargetRewardedAdAdapter.this);
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(Reward reward, RewardedAd rewardedAd) {
            mi.a("MyTargetRewardedAdAdapter$AdListener: onReward - " + reward.type);
            this.a.onReward(reward, MyTargetRewardedAdAdapter.this);
        }
    }

    public void a(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        RewardedAd rewardedAd = this.b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.setListener(null);
        this.b.destroy();
        this.b = null;
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void dismiss() {
        RewardedAd rewardedAd = this.b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.dismiss();
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationRewardedAdAdapter.MediationRewardedAdListener mediationRewardedAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            RewardedAd rewardedAd = new RewardedAd(parseInt, context);
            this.b = rewardedAd;
            rewardedAd.setMediationEnabled(false);
            this.b.setListener(new a(mediationRewardedAdListener));
            CustomParams customParams = this.b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.a != null) {
                mi.a("MyTargetRewardedAdAdapter: Got banner from mediation response");
                this.b.a(this.a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                mi.a("MyTargetRewardedAdAdapter: Load id " + parseInt);
                this.b.load();
                return;
            }
            mi.a("MyTargetRewardedAdAdapter: Load id " + parseInt + " from BID " + payload);
            this.b.loadFromBid(payload);
        } catch (Throwable unused) {
            mi.b("MyTargetRewardedAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationRewardedAdListener.onNoAd(q.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationRewardedAdAdapter
    public void show(@NonNull Context context) {
        RewardedAd rewardedAd = this.b;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.show();
    }
}
