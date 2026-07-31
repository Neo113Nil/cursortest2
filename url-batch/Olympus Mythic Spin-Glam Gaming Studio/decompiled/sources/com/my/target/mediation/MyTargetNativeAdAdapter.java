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
import com.my.target.mediation.MediationNativeAdAdapter;
import com.my.target.mi;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.q;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class MyTargetNativeAdAdapter implements MediationNativeAdAdapter, AdChoicesClickHandler, ClickHandler {
    private hd a;
    private NativeAd b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements NativeAd.NativeAdListener, NativeAd.NativeAdChoicesListener, NativeAd.NativeAdChoicesOptionListener {
        private final MediationNativeAdAdapter.MediationNativeAdListener a;

        a(MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener) {
            this.a = mediationNativeAdListener;
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void closeIfAutomaticallyDisabled(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close manually");
            this.a.closeIfAutomaticallyDisabled(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesListener
        public void onAdChoicesIconLoad(ImageData imageData, boolean z, NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: AdChoices icon downloading successfully");
            this.a.onAdChoicesIconLoad(imageData, z, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(NativeAd nativeAd) {
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public void onCloseAutomatically(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: the ad [" + nativeAd + "] should close automatically");
            this.a.onCloseAutomatically(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onLoad(NativePromoBanner nativePromoBanner, NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Ad loaded");
            this.a.onLoad(nativePromoBanner, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: No ad (" + iAdLoadingError.getMessage() + ")");
            this.a.onNoAd(iAdLoadingError, MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onShow(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Ad shown");
            this.a.onShow(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener, com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoComplete(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Video completed");
            this.a.onVideoComplete(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener, com.my.target.nativeads.NativeAd.NativeAdVideoListener
        public void onVideoPause(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Video paused");
            this.a.onVideoPause(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onVideoPlay(NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Video playing");
            this.a.onVideoPlay(MyTargetNativeAdAdapter.this);
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdChoicesOptionListener
        public boolean shouldCloseAutomatically() {
            mi.a("MyTargetNativeAdAdapter: call 'shouldCloseAutomatically' for the ad");
            return this.a.shouldCloseAutomatically();
        }

        @Override // com.my.target.nativeads.NativeAd.NativeAdListener
        public void onClick(View view, NativeAd nativeAd) {
            mi.a("MyTargetNativeAdAdapter: Ad clicked");
            this.a.onClick(MyTargetNativeAdAdapter.this);
        }
    }

    public void a(hd hdVar) {
        this.a = hdVar;
    }

    @Override // com.my.target.mediation.MediationAdapter
    public void destroy() {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
        this.b.setListener(null);
        this.b = null;
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    @Nullable
    public View getMediaView(@NonNull Context context) {
        return null;
    }

    @Override // com.my.target.mediation.AdChoicesClickHandler
    public void handleAdChoicesClick(@NonNull Context context) {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.handleAdChoicesClick(context);
    }

    @Override // com.my.target.mediation.ClickHandler
    public void handleClick(boolean z, @NonNull View view) {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.handleClick(z, view);
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void load(@NonNull MediationNativeAdConfig mediationNativeAdConfig, @NonNull MediationNativeAdAdapter.MediationNativeAdListener mediationNativeAdListener, @NonNull Context context) {
        String placementId = mediationNativeAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            NativeAd nativeAd = new NativeAd(parseInt, mediationNativeAdConfig.getMenuFactory(), context);
            this.b = nativeAd;
            nativeAd.setMediationEnabled(false);
            this.b.setCachePolicy(mediationNativeAdConfig.getCachePolicy());
            a aVar = new a(mediationNativeAdListener);
            this.b.setListener(aVar);
            this.b.setAdChoicesListener(aVar);
            this.b.setAdChoicesOptionListener(aVar);
            CustomParams customParams = this.b.getCustomParams();
            customParams.setAge(mediationNativeAdConfig.getAge());
            customParams.setGender(mediationNativeAdConfig.getGender());
            for (Map.Entry<String, String> entry : mediationNativeAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam(entry.getKey(), entry.getValue());
            }
            String payload = mediationNativeAdConfig.getPayload();
            if (this.a != null) {
                mi.a("MyTargetNativeAdAdapter: Got banner from mediation response");
                this.b.a(this.a);
                return;
            }
            if (TextUtils.isEmpty(payload)) {
                mi.a("MyTargetNativeAdAdapter: Load id " + parseInt);
                this.b.load();
                return;
            }
            mi.a("MyTargetNativeAdAdapter: Load id " + parseInt + " from BID " + payload);
            this.b.loadFromBid(payload);
        } catch (Throwable unused) {
            mi.b("MyTargetNativeAdAdapter error: " + ("failed to request ad, unable to convert slotId " + placementId + " to int"));
            mediationNativeAdListener.onNoAd(q.o, this);
        }
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    @Deprecated
    public void registerView(@NonNull View view, @Nullable List<View> list, int i) {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setAdChoicesPlacement(i);
        this.b.registerView(view, list);
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void unregisterView() {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    @Override // com.my.target.mediation.MediationNativeAdAdapter
    public void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list, int i) {
        NativeAd nativeAd = this.b;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setAdChoicesPlacement(i);
        this.b.registerView(nativeAdViewBinder, list);
    }
}
