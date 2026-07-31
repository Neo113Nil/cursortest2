package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class cq extends FrameLayout {
    public final cm0 a;
    public final int b;
    public final Paint c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(Context context, yg0 yg0Var) {
        super(context);
        cm0 cm0Var = new cm0();
        this.a = cm0Var;
        yg0Var.getClass();
        this.b = yg0.a(context, 0.5f);
        Paint paint = new Paint();
        this.c = paint;
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(roundToInt);
        paint.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.b;
        canvas.drawRect(f, f, getWidth() - this.b, getHeight() - this.b, this.c);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        bj1 a = this.a.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setColor(int i) {
        if (this.c.getColor() != i) {
            this.c.setColor(i);
            requestLayout();
        }
    }
}
