package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.api.NativeAdViewApi;

/* loaded from: assets/audience_network/classes2.dex */
public final class S4 implements NativeAdViewApi {
    public static View A00(C3218gi c3218gi, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        C2682Vd c2682Vd = (C2682Vd) nativeAdViewAttributes.getInternalAttributes();
        UK internalNativeAd = UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(EnumC2683Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c2682Vd);
        C7C c7c = new C7C();
        NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c3218gi, c7c);
        c7c.A08(mediumRectTemplateLayout, c3218gi, nativeAd, c2682Vd);
        mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static View A01(C3218gi c3218gi, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        UK A0L = UK.A0L(nativeAd.getInternalNativeAd());
        C2682Vd c2682Vd = (C2682Vd) nativeAdViewAttributes.getInternalAttributes();
        A0L.A1h(EnumC2683Ve.A0B);
        A0L.A1g(c2682Vd);
        C7C c7c = new C7C();
        NativeAdLayout nativeAdLayout = new NativeAdLayout(c3218gi, c7c);
        c7c.A08(nativeAdLayout, c3218gi, nativeAd, c2682Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd) {
        return render(context, nativeAd, (NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(C2591Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C2591Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
        C3218gi contextWrapper;
        try {
            if (context instanceof C3218gi) {
                contextWrapper = (C3218gi) context;
            } else {
                contextWrapper = C2591Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (Throwable th) {
            return Z4.A00(C2591Rp.A03(context), th);
        }
    }
}
