package com.smaato.sdk.ng.vpaid;

import android.content.Context;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.presenter.AdPresenter;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.helpers.EventTracker;
import com.smaato.sdk.ng.vpaid.helpers.FileLoader;
import com.smaato.sdk.ng.vpaid.utils.FileUtils;
import com.smaato.sdk.ng.vpaid.utils.Utils;

/* loaded from: classes5.dex */
abstract class a extends b {
    private static final String x = "a";

    a(Context context, Ad ad, boolean z, boolean z2, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) throws Exception {
        super(context, ad, z, z2, impressionListener, adCloseButtonListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(IntegrationType integrationType) {
        String str = x;
        Logger.d(str, "Start loading ad");
        if (h() == 201 || h() == 202) {
            Logger.d(str, "Ad already loading or showing");
            return;
        }
        EventTracker.clear();
        a(201);
        l();
        B();
        FileUtils.deleteExpiredFiles(i());
        if (isReady()) {
            Logger.d(str, "Ad already loaded");
            t();
        } else if (Utils.isOnline(i())) {
            b(integrationType);
        } else {
            c(new PlayerInfo("No connection"));
        }
    }

    public void clearCache() {
        FileUtils.clearCache(i());
    }

    public void destroy() {
        Logger.d(x, "Ad will be destroyed");
        z();
        D();
        E();
        a(200);
        a();
        x();
        k().stopAdSession();
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public abstract void dismiss();

    public boolean isLoading() {
        return h() == 201;
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public boolean isReady() {
        return super.isReady();
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public boolean isRewarded() {
        return super.isRewarded();
    }

    public boolean isShowing() {
        return h() == 202;
    }

    public void load(final IntegrationType integrationType) {
        a(new Runnable() { // from class: com.smaato.sdk.ng.vpaid.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(integrationType);
            }
        });
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        super.setAdCloseButtonListener(closeButtonListener);
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public void setAdListener(VideoAdListener videoAdListener) {
        super.setAdListener(videoAdListener);
    }

    public void setDebugMode(boolean z) {
        Utils.setDebugMode(z);
    }

    @Override // com.smaato.sdk.ng.vpaid.b
    public void setRewarded(boolean z) {
        super.setRewarded(z);
    }

    public void useMobileNetworkForCaching(boolean z) {
        FileLoader.setUseMobileNetworkForCaching(z);
    }
}
