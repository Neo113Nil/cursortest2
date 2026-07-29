package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Point;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0030h {
    public static Point a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        float x = view.getX();
        float y = view.getY();
        boolean z = C0031h0.A;
        return new Point((int) (x - (z ? 0.0f : 10000.0f)), (int) (y - (z ? 0.0f : 10000.0f)));
    }
}
