package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.O6;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class IronSource {

    public enum a {
        REWARDED_VIDEO(O6.H0),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");

        private String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return p.h().a(activity, iSBannerSize);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        p.h().e(str);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String a2;
        synchronized (IronSource.class) {
            a2 = p.h().a(context);
        }
        return a2;
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return p.h().d(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return p.h().h(str);
    }

    public static void loadISDemandOnlyBanner(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        p.h().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyInterstitial(@NotNull Activity activity, String str) {
        p.h().a(activity, str);
    }

    public static void loadISDemandOnlyRewardedVideo(@NotNull Activity activity, String str) {
        p.h().b(activity, str);
    }

    public static void setAdRevenueData(@NotNull String str, @NotNull JSONObject jSONObject) {
        p.h().a(str, jSONObject);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        p.h().a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        p.h().a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setMediationType(String str) {
        p.h().f(str);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        p.h().c(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        p.h().a(str);
    }
}
