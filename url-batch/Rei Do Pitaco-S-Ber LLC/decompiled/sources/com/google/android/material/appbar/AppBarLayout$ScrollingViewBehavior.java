package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.f80;
import defpackage.jx;
import defpackage.kd;
import defpackage.m60;
import defpackage.u80;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends u80 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.E);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // defpackage.hd
    public final boolean b(View view, View view2) {
        return false;
    }

    @Override // defpackage.hd
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((kd) view2.getLayoutParams()).a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.b;
            int m = bottom - (i == 0 ? 0 : m60.m((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = f80.a;
            view.offsetTopAndBottom(m);
        }
        return false;
    }

    @Override // defpackage.hd
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // defpackage.hd
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // defpackage.u80
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }
}
