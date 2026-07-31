package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.ogury.ad.OguryBannerAdView;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x0 {
    public final Application a;
    public final u3 b;
    public g c;
    public final k1 d;
    public final m1 e;
    public t6 f;
    public boolean g;
    public OguryBannerAdView h;

    public x0(Application application) {
        u3 interstitialShowCommand = InterstitialActivity.e;
        Intrinsics.checkNotNullParameter(application, "context");
        g adLayout = new g(application);
        adLayout.setupDrag(false);
        k1 adControllerFactory = new k1();
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        m1 sizeCalculator = new m1(adLayout, applicationContext);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(interstitialShowCommand, "interstitialShowCommand");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(sizeCalculator, "sizeCalculator");
        this.a = application;
        this.b = interstitialShowCommand;
        this.c = adLayout;
        this.d = adControllerFactory;
        this.e = sizeCalculator;
        this.f = a();
    }

    public final t6 a() {
        k1 k1Var = this.d;
        Application application = this.a;
        g adLayout = this.c;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        j1 j1Var = new j1(adLayout, new wi());
        x xVar = x.g;
        u3 u3Var = InterstitialActivity.e;
        j6 j6Var = new j6(application, adLayout, new z2(xVar), false);
        Intrinsics.checkNotNullParameter(j1Var, "<set-?>");
        j6Var.j = j1Var;
        t6 t6Var = new t6(j6Var);
        v0 v0Var = new v0(this);
        Intrinsics.checkNotNullParameter(v0Var, "<set-?>");
        t6Var.B = v0Var;
        t6Var.A = new eh(new w0(this));
        l1 l1Var = new l1();
        Intrinsics.checkNotNullParameter(l1Var, "<set-?>");
        t6Var.z = l1Var;
        return t6Var;
    }

    public final void b() {
        String str;
        t6 t6Var = this.f;
        if (t6Var == null) {
            return;
        }
        y7 y7Var = t6Var.o;
        if (y7Var == null || !y7Var.l) {
            t6Var.B.a(t6Var.f, t6Var);
        } else {
            b bVar = t6Var.t;
            if (bVar != null && (str = bVar.b) != null) {
                s7 s7Var = t6Var.e;
                r7 r7Var = new r7(str, com.safedk.android.analytics.brandsafety.creatives.discoveries.h.ah);
                s7Var.getClass();
                s7.a(r7Var);
            }
            t6Var.D = true;
        }
        t6Var.f();
    }

    public final void a(b bVar, FrameLayout frameLayout, List list, boolean z) {
        t6 t6Var;
        if (frameLayout != null) {
            t6 t6Var2 = this.f;
            if (t6Var2 != null) {
                t6Var2.a(bVar, list);
            }
            this.g = bVar.y.a;
            frameLayout.addView(this.c);
            LogTag logTag = LogTag.REQUESTS;
            SourceTag sourceTag = SourceTag.ADS;
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Show][" + bVar.n.a + "] Ad succefully attached to the banner view");
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + bVar.x.b + "][Show][" + bVar.n.a + "] Waiting for adding banner view in a layout...");
            if ((!frameLayout.hasWindowFocus() || z) && (t6Var = this.f) != null) {
                t6Var.d();
            }
        }
    }
}
