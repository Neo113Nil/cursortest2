package com.ogury.ad.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class l1 implements z {
    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        ViewGroup.LayoutParams layoutParams = adLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 0;
        adLayout.setLeft(0);
        adLayout.setTop(0);
        adLayout.a(adLayout.e);
    }
}
