package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ionia.reidopitaco.libya.R;
import defpackage.g90;
import defpackage.jx;
import defpackage.m60;
import defpackage.mu;
import defpackage.tg;
import defpackage.x7;
import defpackage.y5;
import defpackage.y7;
import defpackage.z7;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class BottomNavigationView extends mu {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        y5 K = m60.K(getContext(), attributeSet, jx.b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) K.a;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        K.n();
        g90.a(this, new tg(12));
    }

    @Override // defpackage.mu
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            i3 = i2;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        x7 x7Var = (x7) getMenuView();
        if (x7Var.k0 != z) {
            x7Var.setItemHorizontalTranslationEnabled(z);
            getPresenter().j(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(y7 y7Var) {
        setOnItemReselectedListener(y7Var);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(z7 z7Var) {
        setOnItemSelectedListener(z7Var);
    }
}
