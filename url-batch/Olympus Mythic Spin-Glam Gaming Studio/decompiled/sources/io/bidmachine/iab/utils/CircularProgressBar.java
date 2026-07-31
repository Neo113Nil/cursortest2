package io.bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes14.dex */
public final class CircularProgressBar extends ProgressBar implements IabElement {
    CircularProgressDrawable a;
    final Paint b;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
        a(context);
    }

    void a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int dpToPx = Utils.dpToPx(context, 8.0f);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(context);
        this.a = circularProgressDrawable;
        circularProgressDrawable.setStrokeWidth(f * 4.0f);
        this.a.setColorSchemeColors(-65536);
        this.a.setStrokeCap(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.a);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.setCenterRadius((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.a.getStrokeWidth());
    }

    public void setColorSchemeColors(int... iArr) {
        this.a.setColorSchemeColors(iArr);
    }

    public void setProgressBackgroundColor(int i) {
        this.b.setColor(i);
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.a.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        this.a.setColorSchemeColors(iabElementStyle.getStrokeColor().intValue());
        this.b.setColor(iabElementStyle.getFillColor().intValue());
        postInvalidate();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
        a(context);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
        a(context);
    }
}
