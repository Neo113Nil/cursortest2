package com.ogury.ad.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ga {
    public final Application a;
    public final ya b;
    public final u3 c;
    public xa d;
    public g e;
    public final ab f;
    public final q4 g;
    public t6 h;
    public final rg i;
    public Activity j;

    public ga(Application application, ya overlayInjectorFactory) {
        u3 interstitialShowCommand = InterstitialActivity.e;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        g adLayout = new g(applicationContext);
        ab mraidAdControllerFactory = new ab();
        q4 positionManager = q4.a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(overlayInjectorFactory, "overlayInjectorFactory");
        Intrinsics.checkNotNullParameter(interstitialShowCommand, "interstitialShowCommand");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(mraidAdControllerFactory, "mraidAdControllerFactory");
        Intrinsics.checkNotNullParameter(positionManager, "positionManager");
        this.a = application;
        this.b = overlayInjectorFactory;
        this.c = interstitialShowCommand;
        this.d = null;
        this.e = adLayout;
        this.f = mraidAdControllerFactory;
        this.g = positionManager;
        this.i = new rg();
        adLayout.setContainsOverlayAd(true);
        this.h = b();
    }

    public final void a(b bVar, List list, Activity activity, boolean z) {
        xa xaVar;
        xa xaVar2 = this.d;
        if (xaVar2 != null) {
            xaVar2.b();
        }
        t6 t6Var = this.h;
        if (t6Var == null) {
            return;
        }
        this.d = this.b.a(activity, this.e, t6Var);
        String adUnitId = bVar.n.a;
        q4 q4Var = this.g;
        g adLayout = this.e;
        q4Var.getClass();
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        adLayout.setOnOverlayPositionChanged(new p4(adLayout, adUnitId));
        this.g.getClass();
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Rect rect = (Rect) q4.b.get(adUnitId);
        if (rect != null) {
            rg rgVar = this.i;
            rgVar.d = rect.left;
            rgVar.e = rect.top;
        }
        t6 t6Var2 = this.h;
        if (t6Var2 != null) {
            rg rgVar2 = this.i;
            int i = rgVar2.d;
            int i2 = rgVar2.e;
            rg rgVar3 = t6Var2.w;
            rgVar3.d = i;
            rgVar3.e = i2;
        }
        t6Var.a(bVar, list);
        if (z && (xaVar = this.d) != null) {
            xaVar.a();
        }
        xa xaVar3 = this.d;
        if (xaVar3 != null) {
            xaVar3.c();
        }
    }

    public final t6 b() {
        ab abVar = this.f;
        Application application = this.a;
        g adLayout = this.e;
        abVar.getClass();
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        x xVar = x.f;
        u3 u3Var = InterstitialActivity.e;
        t6 t6Var = new t6(new j6(application, adLayout, new z2(xVar), false));
        eb ebVar = new eb();
        Intrinsics.checkNotNullParameter(ebVar, "<set-?>");
        t6Var.z = ebVar;
        ea eaVar = new ea(this);
        Intrinsics.checkNotNullParameter(eaVar, "<set-?>");
        t6Var.B = eaVar;
        t6Var.A = new gh(new fa(this));
        return t6Var;
    }

    public final void a() {
        xa xaVar = this.d;
        if (xaVar != null) {
            xaVar.b();
        }
        this.d = null;
        g gVar = this.e;
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(gVar);
        }
        t6 t6Var = this.h;
        if (t6Var != null) {
            t6Var.c();
        }
        this.h = null;
    }
}
