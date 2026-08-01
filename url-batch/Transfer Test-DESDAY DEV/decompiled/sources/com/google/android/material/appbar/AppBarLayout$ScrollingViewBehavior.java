package com.google.android.material.appbar;

import A.c;
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
import u0.AbstractC0338a;
import w0.AbstractC0345a;
import x.AbstractC0346a;
import x.d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0345a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1756b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // x.AbstractC0346a
    public final void b(View view) {
    }

    @Override // x.AbstractC0346a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0346a abstractC0346a = ((d) view2.getLayoutParams()).f4050a;
        if (abstractC0346a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0346a).getClass();
            int i = this.f1756b;
            int n2 = bottom - (i == 0 ? 0 : c.n((int) (RecyclerView.f1570A0 * i), 0, i));
            WeakHashMap weakHashMap = T.f372a;
            view.offsetTopAndBottom(n2);
        }
        return false;
    }

    @Override // x.AbstractC0346a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // x.AbstractC0346a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // w0.AbstractC0345a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.f3801u);
        this.f1756b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
