package com.google.android.material.appbar;

import K.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.AbstractC0279a;
import q1.d;
import r0.AbstractC0292a;
import x.AbstractC0333a;
import x.C0336d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0292a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1530b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0333a
    public final void b(View view) {
    }

    @Override // x.AbstractC0333a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0333a abstractC0333a = ((C0336d) view2.getLayoutParams()).f4100a;
        if (abstractC0333a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0333a).getClass();
            int i = this.f1530b;
            int d = bottom - (i == 0 ? 0 : d.d((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = S.f360a;
            view.offsetTopAndBottom(d);
        }
        return false;
    }

    @Override // x.AbstractC0333a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0333a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // r0.AbstractC0292a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3396u);
        this.f1530b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
