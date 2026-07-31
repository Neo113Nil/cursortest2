package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.common.ExternalClickHandler;
import com.my.target.common.listeners.HtmlCustomEventListener;
import com.my.target.common.listeners.HtmlInteractionListener;
import com.my.target.common.listeners.HtmlInteractiveProgressListener;
import com.my.target.common.listeners.HtmlLoadingListener;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.views.MediaAdView;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public interface q5 {
    String a();

    void a(long j);

    void a(View view, List list, int i, MediaAdView mediaAdView);

    void a(ExternalClickHandler externalClickHandler);

    void a(HtmlCustomEventListener htmlCustomEventListener);

    void a(HtmlInteractionListener htmlInteractionListener);

    void a(HtmlInteractiveProgressListener htmlInteractiveProgressListener);

    void a(HtmlLoadingListener htmlLoadingListener);

    void a(NativeAd.CollageItemsShowHandler collageItemsShowHandler);

    void a(NativeAd.NativeAdMediaListener nativeAdMediaListener);

    NativeAd.NativeAdVideoPlayer c();

    float d();

    boolean e();

    void f();

    NativePromoBanner g();

    void handleAdChoicesClick(Context context);

    void handleClick(boolean z, View view);

    void registerView(NativeAdViewBinder nativeAdViewBinder, List list, int i);

    void unregisterView();
}
