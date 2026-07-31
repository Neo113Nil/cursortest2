package com.ogury.ad.internal;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v1 {
    public final Context a;
    public final FrameLayout b;
    public final b c;

    public v1(Context context, FrameLayout activityRoot, b ad) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityRoot, "activityRoot");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a = context;
        this.b = activityRoot;
        this.c = ad;
    }

    public static FrameLayout.LayoutParams a(li liVar, FrameLayout.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        int i = liVar.g;
        if (i != -1) {
            layoutParams.leftMargin = ib.a(i);
        }
        int i2 = liVar.f;
        if (i2 != -1) {
            layoutParams.topMargin = ib.a(i2);
        }
        int i3 = liVar.e;
        layoutParams.width = i3 <= 0 ? -1 : ib.a(i3);
        int i4 = liVar.d;
        layoutParams.height = i4 > 0 ? ib.a(i4) : -1;
        return layoutParams;
    }
}
