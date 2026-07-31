package com.yandex.mobile.ads.nativeads;

import android.view.View;
import yads.d32;
import yads.e22;
import yads.f22;

/* loaded from: classes3.dex */
public abstract class i {
    public static f22 a(NativeAdViewBinder nativeAdViewBinder) {
        View nativeAdView = nativeAdViewBinder.getNativeAdView();
        d32 d32Var = d32.c;
        e22 e22Var = new e22(nativeAdView);
        e22Var.d.put("age", nativeAdViewBinder.getAgeView());
        e22Var.d.put("body", nativeAdViewBinder.getBodyView());
        e22Var.d.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        e22Var.d.put("domain", nativeAdViewBinder.getDomainView());
        e22Var.d.put("favicon", nativeAdViewBinder.getFaviconView());
        e22Var.d.put("feedback", nativeAdViewBinder.getFeedbackView());
        e22Var.d.put("icon", nativeAdViewBinder.getIconView());
        e22Var.d.put("media", nativeAdViewBinder.getMediaView());
        e22Var.d.put("price", nativeAdViewBinder.getPriceView());
        e22Var.d.put("rating", nativeAdViewBinder.getRatingView());
        e22Var.d.put("review_count", nativeAdViewBinder.getReviewCountView());
        e22Var.d.put("sponsored", nativeAdViewBinder.getSponsoredView());
        e22Var.d.put("title", nativeAdViewBinder.getTitleView());
        e22Var.d.put("warning", nativeAdViewBinder.getWarningView());
        return new f22(e22Var);
    }
}
