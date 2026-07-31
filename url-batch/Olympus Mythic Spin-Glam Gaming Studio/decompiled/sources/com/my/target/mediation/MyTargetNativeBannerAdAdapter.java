package com.my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.CustomParams;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.common.models.ImageData;
import com.my.target.hd;
import com.my.target.mediation.MediationNativeBannerAdAdapter;
import com.my.target.mi;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.q;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class MyTargetNativeBannerAdAdapter implements MediationNativeBannerAdAdapter, AdChoicesClickHandler, ClickHandler {
    private hd a;
    private NativeBannerAd b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements NativeBannerAd.NativeBannerAdListener, NativeBannerAd.NativeBannerAdChoicesOptionListener, NativeBannerAd.NativeBannerAdChoicesListener {
        private final MediationNativeBannerAdAdapter.MediationNativeBannerAdListener a;

        a(MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener) {
            this.a = mediationNativeBannerAdListener;
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close manually");
            this.a.closeIfAutomaticallyDisabled(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeBannerAdAdapter$AdListener: AdChoices icon downloading successfully");
            this.a.onAdChoicesIconLoad(imageData, z, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onClick(NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeBannerAdAdapter$AdListener: Ad clicked");
            this.a.onClick(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public void onCloseAutomatically(NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeAdAdapter: the ad [" + nativeBannerAd + "] should close automatically");
            this.a.onCloseAutomatically(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onLoad(NativeBanner nativeBanner, NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeBannerAdAdapter$AdListener: Ad loaded");
            this.a.onLoad(nativeBanner, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeBannerAdAdapter$AdListener: No ad (" + iAdLoadingError.getMessage() + ")");
            this.a.onNoAd(iAdLoadingError, MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdListener
        public void onShow(NativeBannerAd nativeBannerAd) {
            mi.a("MyTargetNativeBannerAdAdapter$AdListener: Ad shown");
            this.a.onShow(MyTargetNativeBannerAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeBannerAd.NativeBannerAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            mi.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.a.shouldCloseAutomatically();
        }
    }

    public void a(hd hdVar) {
        this.a = hdVar;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
        this.b.setListener(null);
        this.b = null;
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    @Nullable
    public View getIconView(@NonNull Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(@NonNull Context context) {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.ClickHandler
    public void handleClick(boolean z, @NonNull View view) {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.handleClick(z, view);
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void load(@NonNull MediationNativeBannerAdConfig mediationNativeBannerAdConfig, @NonNull MediationNativeBannerAdAdapter.MediationNativeBannerAdListener mediationNativeBannerAdListener, @NonNull Context context) {
        String placementId = mediationNativeBannerAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            NativeBannerAd nativeBannerAd = new NativeBannerAd(parseInt, mediationNativeBannerAdConfig.getMenuFactory(), context);
            this.b = nativeBannerAd;
            nativeBannerAd.setMediationEnabled(false);
            this.b.setCachePolicy(mediationNativeBannerAdConfig.getCachePolicy());
            a aVar = new a(mediationNativeBannerAdListener);
            this.b.setListener(aVar);
            this.b.setAdChoicesListener(aVar);
            this.b.setAdChoicesOptionListener(aVar);
            CustomParams customParams = this.b.getCustomParams();
            customParams.setAge(mediationNativeBannerAdConfig.getAge());
            customParams.setGender(mediationNativeBannerAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeBannerAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeBannerAdConfig.getPayload();
            if (this.a != null) {
                mi.a("MyTargetNativeBannerAdAdapter: Got banner from mediation response");
                this.b.a(this.a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                mi.a("MyTargetNativeBannerAdAdapter: Load id " + parseInt);
                this.b.load();
                return;
            }
            mi.a("MyTargetNativeBannerAdAdapter: Load id " + parseInt + " from BID " + payload);
            this.b.loadFromBid(payload);
        } catch (Throwable unused) {
            mi.b("MyTargetNativeBannerAdAdapter: Error - " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeBannerAdListener.onNoAd(q.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list, int i) {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.setAdChoicesPlacement(i);
        this.b.registerView(view, list);
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void unregisterView() {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.unregisterView();
    }

    @Override // com.my.target.mediation.MediationNativeBannerAdAdapter
    public void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list, int i) {
        NativeBannerAd nativeBannerAd = this.b;
        if (nativeBannerAd == null) {
            return;
        }
        nativeBannerAd.setAdChoicesPlacement(i);
        this.b.registerView(nativeBannerAdViewBinder, list);
    }
}
