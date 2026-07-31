package com.ogury.ad.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class oa {
    public final Context a;
    public final ha b;
    public final p0 c;
    public final ne d;
    public final rf e;
    public final sf f;
    public final cb g;
    public final OguryMediation h;
    public OguryListenerAdapter i;
    public ga j;
    public o0 k;

    public oa(Context context, c adConfig, OguryMediation oguryMediation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        u3 u3Var = InterstitialActivity.e;
        ha adControllerFactory = new ha();
        p0 adsSourceFactory = new p0(context, adConfig, x.f);
        ne profigHandler = ne.g.a(context);
        rf publisherActivityFilter = new rf();
        sf publisherFragmentFilter = new sf();
        cb positionCalculatorFactory = db.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(adsSourceFactory, "adsSourceFactory");
        Intrinsics.checkNotNullParameter(profigHandler, "profigHandler");
        Intrinsics.checkNotNullParameter(publisherActivityFilter, "publisherActivityFilter");
        Intrinsics.checkNotNullParameter(publisherFragmentFilter, "publisherFragmentFilter");
        Intrinsics.checkNotNullParameter(positionCalculatorFactory, "positionCalculatorFactory");
        this.a = context;
        this.b = adControllerFactory;
        this.c = adsSourceFactory;
        this.d = profigHandler;
        this.e = publisherActivityFilter;
        this.f = publisherFragmentFilter;
        this.g = positionCalculatorFactory;
        this.h = oguryMediation;
    }

    public final void a(int i, int i2) {
        o0 o0Var = this.k;
        if (o0Var != null && o0Var.r) {
            ga gaVar = this.j;
            if (gaVar != null) {
                gaVar.a();
            }
            o0 o0Var2 = this.k;
            if (o0Var2 != null) {
                o0Var2.a();
            }
        }
        o0 o0Var3 = this.k;
        if (o0Var3 != null && o0Var3.q) {
            o0Var3.b();
        }
        ha haVar = this.b;
        Context applicationContext = this.a.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        rf publisherActivityFilter = this.e;
        sf publisherFragmentFilter = this.f;
        haVar.getClass();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(publisherActivityFilter, "publisherActivityFilter");
        Intrinsics.checkNotNullParameter(publisherFragmentFilter, "publisherFragmentFilter");
        ya yaVar = new ya(publisherActivityFilter, publisherFragmentFilter, kh.a, le.a);
        u3 u3Var = InterstitialActivity.e;
        this.j = new ga(application, yaVar);
        p0 p0Var = this.c;
        o0 o0Var4 = this.k;
        boolean z = o0Var4 != null && o0Var4.o;
        OguryMediation oguryMediation = this.h;
        Context context = p0Var.a;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        o0 o0Var5 = new o0(context, uuid, oguryMediation, p0Var.b, p0Var.c, z);
        this.k = o0Var5;
        o0Var5.t = this.i;
        o0Var5.w = new da(i, i2);
        o0Var5.a((String) null);
    }

    public final void a(Activity activity, bb overlayPosition) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(overlayPosition, "overlayPosition");
        if (this.k == null) {
            IntegrationLogger.e(LogTag.REQUESTS, SourceTag.ADS, "[Thumbnail][Show] Failed to show (no ad loaded)");
            OguryListenerAdapter oguryListenerAdapter = this.i;
            if (oguryListenerAdapter != null) {
                oguryListenerAdapter.onAdNotLoaded();
            }
        }
        o0 o0Var = this.k;
        if (o0Var != null) {
            o0Var.a(new na(this, activity, overlayPosition));
        }
    }
}
