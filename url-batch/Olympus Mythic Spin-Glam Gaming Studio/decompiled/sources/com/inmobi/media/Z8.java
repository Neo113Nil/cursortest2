package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Z8 extends To {
    public final /* synthetic */ RelativeLayout.LayoutParams a;

    public Z8(RelativeLayout.LayoutParams layoutParams) {
        this.a = layoutParams;
    }

    @Override // com.inmobi.media.To
    public final void a(Tf orientation, Vo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        N3.a(finalInsets, this.a, orientation);
    }
}
