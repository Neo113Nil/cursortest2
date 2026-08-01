package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p0.AbstractC0279a;
import x.AbstractC0333a;
import x.C0336d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0333a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // x.AbstractC0333a
    public final boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0333a
    public final void c(C0336d c0336d) {
        if (c0336d.h == 0) {
            c0336d.h = 80;
        }
    }

    @Override // x.AbstractC0333a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0333a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3384g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
