package com.ogury.ad.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class k4 implements z {
    public final FrameLayout a;
    public final InterstitialActivity b;
    public final z c;

    public k4(FrameLayout frameLayout, InterstitialActivity interstitialActivity, z closeCommandInCollapsedMode) {
        Intrinsics.checkNotNullParameter(interstitialActivity, "interstitialActivity");
        Intrinsics.checkNotNullParameter(closeCommandInCollapsedMode, "closeCommandInCollapsedMode");
        this.a = frameLayout;
        this.b = interstitialActivity;
        this.c = closeCommandInCollapsedMode;
    }

    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        if (adController.D) {
            this.b.finish();
            return;
        }
        ViewGroup parentAsViewGroup = adLayout.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(adLayout);
        }
        adLayout.setupDrag(false);
        adLayout.a(adLayout.e);
        this.a.addView(adLayout);
        adController.a(2);
        this.b.finish();
        z zVar = this.c;
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        adController.B = zVar;
        l1 l1Var = new l1();
        Intrinsics.checkNotNullParameter(l1Var, "<set-?>");
        adController.z = l1Var;
    }
}
