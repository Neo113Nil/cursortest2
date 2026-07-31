package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.NativeBannerAdView;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public interface INativeBannerAd extends IAd {
    void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder);

    void registerView(@NonNull NativeBannerAdViewBinder nativeBannerAdViewBinder, @Nullable List<View> list);

    void registerView(@NonNull NativeBannerAdView nativeBannerAdView);

    void registerView(@NonNull NativeBannerAdView nativeBannerAdView, @Nullable List<View> list);
}
