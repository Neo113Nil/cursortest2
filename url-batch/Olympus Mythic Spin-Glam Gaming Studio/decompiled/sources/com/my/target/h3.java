package com.my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class h3 extends FrameLayout {
    private final m a;
    private int b;
    private int c;

    public h3(Context context) {
        this(context, null);
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public m getAdChoicesView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.b;
        if (i3 <= 0 || this.c <= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        }
    }

    public h3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m mVar = new m(context);
        this.a = mVar;
        int a = qi.a(2, context);
        mVar.setPadding(a, a, a, a);
        mVar.setFixedHeight(qi.a(17, context));
        addView(mVar);
    }
}
