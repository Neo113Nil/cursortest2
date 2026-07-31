package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.Map;
import yads.d8;
import yads.f00;
import yads.ip2;
import yads.kp2;
import yads.ua;
import yads.vw2;

/* loaded from: classes3.dex */
public final class h {
    public final d8 a(AdRequest adRequest, NativeAdOptions nativeAdOptions) {
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        ip2 a = preferredTheme != null ? kp2.a(preferredTheme) : null;
        adRequest.getTargeting();
        String adUnitId = adRequest.getAdUnitId();
        String biddingData = adRequest.getBiddingData();
        Map<String, String> parameters = adRequest.getParameters();
        boolean shouldLoadImagesAutomatically = nativeAdOptions.getShouldLoadImagesAutomatically();
        vw2 vw2Var = vw2.l;
        if (vw2Var == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
        }
        ua a2 = vw2Var.a();
        return new d8(adUnitId, null, null, null, null, null, parameters, biddingData, a, shouldLoadImagesAutomatically, null, a2 != null ? new f00(a2.a, a2.b, a2.c) : null);
    }
}
