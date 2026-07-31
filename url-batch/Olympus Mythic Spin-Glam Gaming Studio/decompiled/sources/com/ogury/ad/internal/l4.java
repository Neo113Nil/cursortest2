package com.ogury.ad.internal;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class l4 implements z {
    public final b4 a;
    public final InterstitialActivity b;
    public final z c;
    public final boolean d;
    public final String e;
    public final q4 f;

    public l4(b4 b4Var, InterstitialActivity interstitialActivity, z closeCommandInCollapsedMode, boolean z, String adUnitId) {
        q4 lastPositionManager = q4.a;
        Intrinsics.checkNotNullParameter(interstitialActivity, "interstitialActivity");
        Intrinsics.checkNotNullParameter(closeCommandInCollapsedMode, "closeCommandInCollapsedMode");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(lastPositionManager, "lastPositionManager");
        this.a = b4Var;
        this.b = interstitialActivity;
        this.c = closeCommandInCollapsedMode;
        this.d = z;
        this.e = adUnitId;
        this.f = lastPositionManager;
    }

    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Rect rect;
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        q4 q4Var = this.f;
        String adUnitId = this.e;
        q4Var.getClass();
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Rect rect2 = (Rect) q4.b.get(adUnitId);
        if (rect2 == null) {
            rect = null;
        } else {
            rect = new Rect(rect2);
            ViewGroup parentAsViewGroup = adLayout.getParentAsViewGroup();
            if (parentAsViewGroup != null) {
                rect.top -= wi.a(parentAsViewGroup).top;
            }
        }
        rg rgVar = adLayout.e;
        adLayout.a(rgVar != null ? rect == null ? rg.a(rgVar, 0, 0, 31) : rg.a(rgVar, rect.left, rect.top, 7) : null);
        ViewGroup parentAsViewGroup2 = adLayout.getParentAsViewGroup();
        if (parentAsViewGroup2 != null) {
            parentAsViewGroup2.removeView(adLayout);
        }
        adLayout.setupDrag(this.d);
        b4 b4Var = this.a;
        if (b4Var != null) {
            b4Var.a(adLayout);
        }
        adController.a(2);
        this.b.finish();
        z zVar = this.c;
        Intrinsics.checkNotNullParameter(zVar, "<set-?>");
        adController.B = zVar;
        eb ebVar = new eb();
        Intrinsics.checkNotNullParameter(ebVar, "<set-?>");
        adController.z = ebVar;
    }
}
