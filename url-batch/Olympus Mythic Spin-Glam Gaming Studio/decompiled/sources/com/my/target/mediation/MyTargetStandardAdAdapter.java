package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.my.target.ads.MyTargetView;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.mediation.MediationStandardAdAdapter;
import com.my.target.mi;
import com.my.target.nh;
import com.my.target.q;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public final class MyTargetStandardAdAdapter implements MediationStandardAdAdapter {
    private nh a;
    private MyTargetView b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MyTargetView.MyTargetViewListener {
        private final MediationStandardAdAdapter.MediationStandardAdListener a;

        a(MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener) {
            this.a = mediationStandardAdListener;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(MyTargetView myTargetView) {
            mi.a("MyTargetStandardAdAdapter: Ad clicked");
            this.a.onClick(MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(MyTargetView myTargetView) {
            mi.a("MyTargetStandardAdAdapter: Ad loaded");
            this.a.onLoad(myTargetView, MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MyTargetView myTargetView) {
            mi.a("MyTargetStandardAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.a.onNoAd(iAdLoadingError, MyTargetStandardAdAdapter.this);
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(MyTargetView myTargetView) {
            mi.a("MyTargetStandardAdAdapter: Ad shown");
            this.a.onShow(MyTargetStandardAdAdapter.this);
        }
    }

    public void a(nh nhVar) {
        this.a = nhVar;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        MyTargetView myTargetView = this.b;
        if (myTargetView == null) {
            return;
        }
        myTargetView.setListener(null);
        this.b.destroy();
        this.b = null;
    }

    @Override // com.my.target.mediation.MediationStandardAdAdapter
    public void load(@NonNull MediationAdConfig mediationAdConfig, @NonNull MyTargetView.AdSize adSize, @NonNull MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener, @NonNull Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            MyTargetView myTargetView = new MyTargetView(context);
            this.b = myTargetView;
            myTargetView.setSlotId(parseInt);
            this.b.setAdSize(adSize);
            this.b.setRefreshAd(false);
            this.b.setMediationEnabled(false);
            this.b.setListener(new a(mediationStandardAdListener));
            CustomParams customParams = this.b.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.a != null) {
                mi.a("MyTargetStandardAdAdapter: Got banner from mediation response");
                this.b.a(this.a, adSize);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                mi.a("MyTargetStandardAdAdapter: Load id " + parseInt);
                this.b.load();
                return;
            }
            mi.a("MyTargetStandardAdAdapter: Load id " + parseInt + " from BID " + payload);
            this.b.loadFromBid(payload);
        } catch (Throwable unused) {
            mi.b("MyTargetStandardAdAdapter: Error - failed to request ad, unable to convert slotId " + placementId + " to int");
            mediationStandardAdListener.onNoAd(q.o, this);
        }
    }
}
