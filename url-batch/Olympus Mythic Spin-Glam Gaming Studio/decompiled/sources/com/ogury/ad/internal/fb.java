package com.ogury.ad.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class fb {
    public final View a;

    public fb(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.a = ((ViewGroup) decorView).getChildAt(0);
    }
}
