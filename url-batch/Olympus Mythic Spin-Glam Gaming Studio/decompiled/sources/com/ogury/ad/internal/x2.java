package com.ogury.ad.internal;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x2 {
    public final x a;
    public final FrameLayout b;
    public final g c;
    public final t6 d;

    public x2(x adType, FrameLayout parent, g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        this.a = adType;
        this.b = parent;
        this.c = adLayout;
        this.d = adController;
    }
}
