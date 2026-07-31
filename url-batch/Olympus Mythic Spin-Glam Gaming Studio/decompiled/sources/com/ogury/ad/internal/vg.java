package com.ogury.ad.internal;

import android.content.res.Configuration;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class vg implements pa {
    public final Configuration a;
    public Rect b;
    public Rect c;
    public int d;

    public vg(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration;
        this.b = new Rect();
        this.c = new Rect();
        this.d = configuration.orientation;
    }

    @Override // com.ogury.ad.internal.pa
    public final void a(Rect adLayoutRect, Rect containerRect) {
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        int i = this.a.orientation;
        if (this.d != i) {
            int i2 = this.c.left;
            Rect rect = this.b;
            int i3 = i2 - rect.left;
            int width = rect.width() - this.c.width();
            if (width != 0) {
                float f = i3 / width;
                int width2 = adLayoutRect.width();
                int roundToInt = MathKt.roundToInt((containerRect.width() - width2) * f) + containerRect.left;
                adLayoutRect.left = roundToInt;
                adLayoutRect.right = roundToInt + width2;
            }
            int i4 = this.c.top;
            Rect rect2 = this.b;
            int i5 = i4 - rect2.top;
            int height = rect2.height() - this.c.height();
            if (height != 0) {
                float f2 = i5 / height;
                int height2 = adLayoutRect.height();
                int roundToInt2 = MathKt.roundToInt((containerRect.height() - height2) * f2) + containerRect.top;
                adLayoutRect.top = roundToInt2;
                adLayoutRect.bottom = roundToInt2 + height2;
            }
        }
        this.b = new Rect(containerRect);
        this.d = i;
    }
}
