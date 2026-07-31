package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٽ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0649 extends AppOpenAd.AppOpenAdLoadCallback implements InterfaceC1111 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1376;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1189 f1377;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AppOpenAd.AppOpenAdLoadCallback f1378;

    public C0649(C0624 c0624, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, C1189 c1189) {
        this.f1376 = c0624;
        this.f1378 = appOpenAdLoadCallback;
        this.f1377 = c1189;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f1376.m4103(this, this.f1377, StringFog.decrypt("seuJUKCA4liU15Z+tKbtdZz5mHy7y+N3sf+/frmJ6X2k9LVwsYE=\n", "8Jv5H9DljBk=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1378;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(loadAdError);
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        AppOpenAd appOpenAd2 = appOpenAd;
        this.f1376.m4103(this, this.f1377, StringFog.decrypt("MgWEdMITcbUXOZta1jV+mB8XlVjZWHCaMhG4VNMSepA=\n", "c3X0O7J2H/Q=\n"), appOpenAd2);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1378;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(appOpenAd2);
        }
    }

    public final void onAppOpenAdFailedToLoad(int i) {
        this.f1376.m4103(this, this.f1377, StringFog.decrypt("G/y+tKS87jM+wKGasJrhHjbur5i/9+8cG/y+tKS87jM+yq+SuLzkJjXAoZqw\n", "WozO+9TZgHI=\n"), Integer.valueOf(i));
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1378;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    public final void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        this.f1376.m4103(this, this.f1377, StringFog.decrypt("UaBpTVbqd1h0nHZjQsx4dXyyeGFNoXZ3UaBpTVbqd1h0nHZjQup9\n", "ENAZAiaPGRk=\n"), appOpenAd);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1378;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(appOpenAd);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1111
    /* renamed from: ﾒ */
    public final Object mo3996() {
        return this.f1378;
    }

    public final void onAppOpenAdFailedToLoad(LoadAdError loadAdError) {
        this.f1376.m4103(this, this.f1377, StringFog.decrypt("JLNeVmn8z3IBj0F4fdrAXwmhT3pyt85dJLNeVmn8z3IBhU9wdfzFZwqPQXh9zshHDYZca3br\n", "ZcMuGRmZoTM=\n"), loadAdError);
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f1378;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }
}
