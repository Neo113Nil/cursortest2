package com.ogury.ad.internal;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ia {
    public final g a;
    public final t6 b;

    public ia(g adLayout, t6 adController) {
        r8 oguryAds = r8.a;
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        Intrinsics.checkNotNullParameter(oguryAds, "oguryAds");
        this.a = adLayout;
        this.b = adController;
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (r8.b || this.a.getParent() != null) {
            return;
        }
        t6 t6Var = this.b;
        if (t6Var.y != 3) {
            y7 y7Var = t6Var.o;
            if (y7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                y7Var = null;
            }
            if (Intrinsics.areEqual(y7Var.getAdState(), "expanded")) {
                return;
            }
            r8.b = true;
            g gVar = this.a;
            activity.addContentView(gVar, gVar.getLayoutParams());
            if (activity.hasWindowFocus()) {
                this.b.e();
            } else {
                this.b.d();
            }
        }
    }

    public final void a() {
        if (this.a.getParent() == null || this.b.a()) {
            return;
        }
        this.b.d();
        g gVar = this.a;
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(gVar);
        }
    }
}
