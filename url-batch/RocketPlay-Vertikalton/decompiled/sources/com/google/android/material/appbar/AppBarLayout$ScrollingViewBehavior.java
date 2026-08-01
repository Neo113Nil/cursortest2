package com.google.android.material.appbar;

import F1.l;
import K.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s0.AbstractC0363a;
import u0.AbstractC0373a;
import x.AbstractC0379a;
import x.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0373a {

    /* renamed from: b, reason: collision with root package name */
    public final int f2124b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0379a
    public final void b(View view) {
    }

    @Override // x.AbstractC0379a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0379a abstractC0379a = ((d) view2.getLayoutParams()).f4447a;
        if (abstractC0379a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0379a).getClass();
            int i = this.f2124b;
            int m2 = bottom - (i == 0 ? 0 : l.m((int) (RecyclerView.f1949A0 * i), 0, i));
            WeakHashMap weakHashMap = T.f633a;
            view.offsetTopAndBottom(m2);
        }
        return false;
    }

    @Override // x.AbstractC0379a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0379a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // u0.AbstractC0373a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4111u);
        this.f2124b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
