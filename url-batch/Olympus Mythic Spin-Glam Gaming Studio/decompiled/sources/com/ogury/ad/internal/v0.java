package com.ogury.ad.internal;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v0 implements z {
    public final /* synthetic */ x0 a;

    public v0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        x0 x0Var = this.a;
        g gVar = x0Var.c;
        ViewGroup parentAsViewGroup = gVar.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(gVar);
        }
        t6 t6Var = x0Var.f;
        if (t6Var != null) {
            t6Var.c();
        }
        x0Var.f = null;
    }
}
