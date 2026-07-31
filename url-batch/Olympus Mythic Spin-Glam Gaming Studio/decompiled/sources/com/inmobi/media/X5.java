package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class X5 extends To {
    public final /* synthetic */ RelativeLayout.LayoutParams a;

    public X5(RelativeLayout.LayoutParams layoutParams) {
        this.a = layoutParams;
    }

    @Override // com.inmobi.media.To
    public final void a(Tf orientation, Vo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        N3.a(finalInsets, this.a, orientation);
    }
}
