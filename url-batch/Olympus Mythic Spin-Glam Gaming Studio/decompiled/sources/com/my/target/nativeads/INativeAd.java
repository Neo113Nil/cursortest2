package com.my.target.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.NativeAdView;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public interface INativeAd extends IAd {
    void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder);

    void registerView(@NonNull NativeAdViewBinder nativeAdViewBinder, @Nullable List<View> list);

    void registerView(@NonNull NativeAdView nativeAdView);

    void registerView(@NonNull NativeAdView nativeAdView, @Nullable List<View> list);
}
