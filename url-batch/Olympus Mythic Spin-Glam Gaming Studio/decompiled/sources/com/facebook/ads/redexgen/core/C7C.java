package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C3247hB {
    public InterfaceC3090ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C3218gi c3218gi, NativeAd nativeAd, C2682Vd c2682Vd) {
        C2912bk c2912bk = new C2912bk(c3218gi);
        MediaView mediaView = new MediaView(c3218gi);
        AdOptionsView adOptionsView = new AdOptionsView(c3218gi, nativeAd, nativeAdLayout);
        c2682Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c3218gi, nativeAd, c2682Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c2912bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c2682Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c2912bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2588Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
