package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public interface r5 {
    String a();

    void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    NativeBanner b();

    float d();

    void handleAdChoicesClick(Context context);

    void handleClick(boolean z, View view);

    void registerView(View view, List list, int i);

    void registerView(NativeBannerAdViewBinder nativeBannerAdViewBinder, List list, int i);

    void unregisterView();
}
