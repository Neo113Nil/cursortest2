package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class sg {
    public final f3 a;
    public final int b;

    public sg() {
        f3 minVisibilityAdjustmentGateway = new f3(0.75f);
        Intrinsics.checkNotNullParameter(minVisibilityAdjustmentGateway, "minVisibilityAdjustmentGateway");
        this.a = minVisibilityAdjustmentGateway;
        this.b = ib.a(50);
    }

    public final boolean a(g adLayout, rg resizeProps) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(resizeProps, "resizeProps");
        int i = resizeProps.b;
        int i2 = this.b;
        if (i < i2 || resizeProps.c < i2) {
            return false;
        }
        Rect containerRect = new Rect();
        adLayout.getWindowVisibleDisplayFrame(containerRect);
        Rect adLayoutRect = new Rect();
        int i3 = containerRect.left + resizeProps.d;
        adLayoutRect.left = i3;
        int i4 = containerRect.top + resizeProps.e;
        adLayoutRect.top = i4;
        adLayoutRect.right = i3 + resizeProps.b;
        adLayoutRect.bottom = i4 + resizeProps.c;
        f3 f3Var = this.a;
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        e3 e3Var = new e3(adLayoutRect, containerRect, f3Var.a);
        float a = e3Var.a();
        if (a < 0.5f) {
            return false;
        }
        boolean z = resizeProps.a;
        if (!z && a < 0.75f) {
            return false;
        }
        if (!z || a >= 0.75f) {
            return true;
        }
        if (!e3Var.b()) {
            return false;
        }
        resizeProps.d = adLayoutRect.left - containerRect.left;
        resizeProps.e = adLayoutRect.top - containerRect.top;
        resizeProps.b = adLayoutRect.width();
        resizeProps.c = adLayoutRect.height();
        return true;
    }
}
