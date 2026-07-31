package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class f3 implements pa {
    public final float a;

    public f3(float f) {
        this.a = f;
    }

    @Override // com.ogury.ad.internal.pa
    public final void a(Rect adLayoutRect, Rect containerRect) {
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        e3 e3Var = new e3(adLayoutRect, containerRect, this.a);
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        e3Var.b();
    }
}
