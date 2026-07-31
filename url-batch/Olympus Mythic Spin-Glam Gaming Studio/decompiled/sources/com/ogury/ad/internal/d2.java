package com.ogury.ad.internal;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d2 implements z {
    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        ViewGroup parentAsViewGroup = adLayout.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(adLayout);
        }
        adController.c();
    }
}
