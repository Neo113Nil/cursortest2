package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.i9;
import com.my.target.mediation.MediationInterstitialAdAdapter;
import com.my.target.mi;
import com.my.target.q;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class MyTargetInterstitialAdAdapter implements MediationInterstitialAdAdapter {
    private i9 a;
    private InterstitialAd b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements InterstitialAd.InterstitialAdListener {
        private final MediationInterstitialAdAdapter.MediationInterstitialAdListener a;

        a(MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener) {
            this.a = mediationInterstitialAdListener;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onClick(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: Ad clicked");
            this.a.onClick(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDismiss(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: Ad dismissed");
            this.a.onDismiss(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDisplay(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: Ad displayed");
            this.a.onDisplay(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onFailedToShow(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: On failed to show");
            this.a.onFailedToShow(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onLoad(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: Ad loaded");
            this.a.onLoad(MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.a.onNoAd(iAdLoadingError, MyTargetInterstitialAdAdapter.this);
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onVideoCompleted(InterstitialAd interstitialAd) {
            mi.a("MyTargetInterstitialAdAdapter: Video completed");
            this.a.onVideoCompleted(MyTargetInterstitialAdAdapter.this);
        }
    }

    public void a(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        InterstitialAd interstitialAd = this.b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.setListener(null);
        this.b.destroy();
        this.b = null;
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void dismiss() {
        InterstitialAd interstitialAd = this.b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.dismiss();
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            InterstitialAd interstitialAd = new InterstitialAd(parseInt, context);
            this.b = interstitialAd;
            interstitialAd.setMediationEnabled(false);
            this.b.setListener(new a(mediationInterstitialAdListener));
            CustomParams customParams = this.b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.a != null) {
                mi.a("MyTargetInterstitialAdAdapter: Got banner from mediation response");
                this.b.a(this.a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                mi.a("MyTargetInterstitialAdAdapter: Load id " + parseInt);
                this.b.load();
                return;
            }
            mi.a("MyTargetInterstitialAdAdapter: Load id " + parseInt + " from BID " + payload);
            this.b.loadFromBid(payload);
        } catch (Throwable unused) {
            mi.b("MyTargetInterstitialAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationInterstitialAdListener.onNoAd(q.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationInterstitialAdAdapter
    public void show(@NonNull Context context) {
        InterstitialAd interstitialAd = this.b;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.show();
    }
}
