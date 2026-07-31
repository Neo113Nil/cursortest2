package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class k1 extends TextView {
    private final GradientDrawable a;
    private final int b;

    public k1(Context context) {
        this(context, null);
    }

    public void a(int i, int i2) {
        a(i, i2, 0);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        this.a.setBounds(getPaddingLeft() - this.b, getPaddingTop(), getWidth(), getHeight());
        this.a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.b * 2), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    public k1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i, int i2, int i3) {
        this.a.setStroke(i, i2);
        this.a.setCornerRadius(i3);
        invalidate();
    }

    public k1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }
}
