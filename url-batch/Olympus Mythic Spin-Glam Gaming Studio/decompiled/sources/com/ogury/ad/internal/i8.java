package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class i8 implements pa {
    public int a;

    @Override // com.ogury.ad.internal.pa
    public final void a(Rect adLayoutRect, Rect containerRect) {
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        int i = containerRect.top;
        int i2 = i - this.a;
        if (i2 != 0) {
            this.a = i;
            adLayoutRect.top -= i2;
            adLayoutRect.bottom -= i2;
        }
    }
}
