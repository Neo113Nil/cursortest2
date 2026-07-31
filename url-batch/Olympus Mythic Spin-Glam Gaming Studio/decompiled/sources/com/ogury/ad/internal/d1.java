package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import com.ironsource.X3;
import com.ogury.ad.OguryBannerAdView;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d1 {
    public final Context a;
    public final OguryBannerAdView b;
    public final y0 c;
    public final e1 d;
    public final f1 e;
    public final OguryMediation f;
    public x0 g;
    public o0 h;
    public o0 i;
    public x0 j;
    public hh k;

    public d1(Context context, OguryBannerAdView container, OguryMediation oguryMediation) {
        u3 u3Var = InterstitialActivity.e;
        y0 adControllerFactory = new y0();
        e1 adsSourceFactory = new e1(context);
        f1 bannerCallback = new f1();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(adsSourceFactory, "adsSourceFactory");
        Intrinsics.checkNotNullParameter(bannerCallback, "bannerCallback");
        this.a = context;
        this.b = container;
        this.c = adControllerFactory;
        this.d = adsSourceFactory;
        this.e = bannerCallback;
        this.f = oguryMediation;
        bannerCallback.b = new a1(this);
    }

    public final void a(c adConfig, String str) {
        x adType = x.g;
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        o0 o0Var = this.h;
        if (o0Var != null && o0Var.q) {
            o0Var.b();
        }
        if (!adType.a()) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, "[Banner][Load][" + adConfig.a + "] Failed to load (invalid ad type: Standard Banners)");
            throw new IllegalArgumentException(("AdType " + adType + " is not a banner type").toString());
        }
        if (adConfig.a.length() <= 0) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, X3.j.d + "Standard Banners][Load] Failed to load (invalid ad unit ID: \"" + adConfig.a + "\")");
            throw new IllegalArgumentException("Ad unit must be set before loading an ad");
        }
        this.k = adConfig.g;
        o0 o0Var2 = this.h;
        if (o0Var2 == null || !o0Var2.r) {
            this.i = o0Var2;
            this.j = this.g;
        } else {
            x0 x0Var = this.g;
            if (x0Var != null) {
                x0Var.b();
            }
            o0 o0Var3 = this.h;
            if (o0Var3 != null) {
                o0Var3.a();
            }
        }
        y0 y0Var = this.c;
        Context applicationContext = this.a.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        y0Var.getClass();
        Intrinsics.checkNotNullParameter(application, "application");
        u3 u3Var = InterstitialActivity.e;
        this.g = new x0(application);
        e1 e1Var = this.d;
        OguryMediation oguryMediation = this.f;
        o0 o0Var4 = this.h;
        boolean z = o0Var4 != null && o0Var4.o;
        e1Var.getClass();
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Context context = e1Var.a;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        o0 o0Var5 = new o0(context, uuid, oguryMediation, adConfig, adType, z);
        this.h = o0Var5;
        o0Var5.t = this.e;
        if (str != null) {
            o0Var5.a(str);
        } else {
            o0Var5.a((String) null);
        }
    }

    public final void a() {
        x0 x0Var;
        y7 y7Var;
        hh adSize = this.k;
        if (adSize == null || (x0Var = this.g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        t6 t6Var = x0Var.f;
        x0Var.e.a(adSize, x0Var.g, t6Var != null && ((y7Var = t6Var.o) == null || (!Intrinsics.areEqual(y7Var.getAdState(), "resized") && (t6Var.f.getParent() instanceof o1))));
    }
}
