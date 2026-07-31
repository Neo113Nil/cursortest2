package com.my.target.nativeads.factories;

import android.content.Context;
import androidx.annotation.NonNull;
import com.my.target.nativeads.NativeAppwallAd;
import com.my.target.nativeads.banners.NativeAppwallBanner;
import com.my.target.nativeads.views.AppwallAdTeaserView;
import com.my.target.nativeads.views.AppwallAdView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class NativeAppwallViewsFactory {
    @NonNull
    public static AppwallAdTeaserView getAppwallAppView(@NonNull NativeAppwallBanner nativeAppwallBanner, @NonNull Context context) {
        AppwallAdTeaserView appwallAppView = getAppwallAppView(context);
        appwallAppView.setNativeAppwallBanner(nativeAppwallBanner);
        return appwallAppView;
    }

    @NonNull
    public static AppwallAdView getAppwallView(@NonNull NativeAppwallAd nativeAppwallAd, @NonNull Context context) {
        AppwallAdView appwallView = getAppwallView(context);
        appwallView.setupView(nativeAppwallAd);
        return appwallView;
    }

    @NonNull
    public static AppwallAdTeaserView getAppwallAppView(@NonNull Context context) {
        return new AppwallAdTeaserView(context);
    }

    @NonNull
    public static AppwallAdView getAppwallView(@NonNull Context context) {
        return new AppwallAdView(context);
    }
}
