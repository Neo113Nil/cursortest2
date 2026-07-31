package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes9.dex */
public final class i4 {
    public final InterstitialActivity a;
    public final g b;
    public final t6 c;

    public i4(InterstitialActivity activity, Intent intent, b ad, List ads, z3 adControllerFactory, y2 expandCacheStore) {
        z zVar;
        t6 t6Var;
        b4 b4Var;
        t6 t6Var2;
        t6 t6Var3;
        t6 t6Var4;
        t6 t6Var5;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(expandCacheStore, "expandCacheStore");
        this.a = activity;
        int intExtra = intent.getIntExtra(X3.a.t, 0);
        if (intExtra == 0) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            g adLayout = new g(applicationContext);
            this.b = adLayout;
            x xVar = ad.x;
            u3 u3Var = InterstitialActivity.e;
            z2 expandToInterstitialViewCommand = new z2(xVar);
            adControllerFactory.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(adLayout, "adLayout");
            Intrinsics.checkNotNullParameter(expandToInterstitialViewCommand, "expandToInterstitialViewCommand");
            Application application = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            t6 t6Var6 = new t6(new j6(application, adLayout, expandToInterstitialViewCommand, true));
            this.c = t6Var6;
            t6Var6.A = new fh();
            boolean z = ad.m.a;
            String str = ad.n.a;
            Application application2 = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
            l4 l4Var = new l4(new b4(application2), activity, new d2(), z, str);
            Intrinsics.checkNotNullParameter(l4Var, "<set-?>");
            t6Var6.z = l4Var;
            h4 h4Var = new h4(this);
            Intrinsics.checkNotNullParameter(h4Var, "<set-?>");
            t6Var6.C = h4Var;
            t6Var6.a(ad, ads);
        } else {
            if (intExtra != 1) {
                throw new IllegalStateException(("Wrong mode " + intExtra).toString());
            }
            String stringExtra = intent.getStringExtra("expand_cache_item_id");
            expandCacheStore.getClass();
            x2 x2Var = (x2) TypeIntrinsics.asMutableMap(y2.b).remove(stringExtra);
            if (x2Var == null) {
                throw new IllegalStateException("Cache Item not found");
            }
            g gVar = x2Var.c;
            this.b = gVar;
            t6 t6Var7 = x2Var.d;
            this.c = t6Var7;
            Intrinsics.checkNotNullParameter(ad, "<this>");
            if (ad.x.b()) {
                Application application3 = activity.getApplication();
                Intrinsics.checkNotNullExpressionValue(application3, "getApplication(...)");
                b4Var = new b4(application3);
            } else {
                b4Var = null;
            }
            if (x2Var.a.a()) {
                if (t6Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adController");
                    t6Var4 = null;
                } else {
                    t6Var4 = t6Var7;
                }
                FrameLayout frameLayout = x2Var.b;
                if (t6Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adController");
                    t6Var5 = null;
                } else {
                    t6Var5 = t6Var7;
                }
                k4 k4Var = new k4(frameLayout, activity, t6Var5.B);
                t6Var4.getClass();
                Intrinsics.checkNotNullParameter(k4Var, "<set-?>");
                t6Var4.z = k4Var;
            } else {
                if (t6Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adController");
                    t6Var2 = null;
                } else {
                    t6Var2 = t6Var7;
                }
                if (t6Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adController");
                    t6Var3 = null;
                } else {
                    t6Var3 = t6Var7;
                }
                l4 l4Var2 = new l4(b4Var, activity, t6Var3.B, ad.m.a, ad.n.a);
                t6Var2.getClass();
                Intrinsics.checkNotNullParameter(l4Var2, "<set-?>");
                t6Var2.z = l4Var2;
            }
            if (t6Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adController");
                t6Var7 = null;
            }
            h4 h4Var2 = new h4(this);
            t6Var7.getClass();
            Intrinsics.checkNotNullParameter(h4Var2, "<set-?>");
            t6Var7.C = h4Var2;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adLayout");
                gVar = null;
            }
            gVar.b();
        }
        Intrinsics.checkNotNullParameter(ad, "<this>");
        if (ad.x.b()) {
            zVar = null;
        } else {
            t6 t6Var8 = this.c;
            if (t6Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adController");
                t6Var8 = null;
            }
            zVar = t6Var8.B;
        }
        t6 t6Var9 = this.c;
        if (t6Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adController");
            t6Var = null;
        } else {
            t6Var = t6Var9;
        }
        g4 g4Var = new g4(zVar, this);
        t6Var.getClass();
        Intrinsics.checkNotNullParameter(g4Var, "<set-?>");
        t6Var.B = g4Var;
    }
}
