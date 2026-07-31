package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class xg extends View {
    private static final Paint a;
    private static final Path b;

    static {
        Paint paint = new Paint();
        a = paint;
        b = new Path();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public xg(Context context) {
        super(context);
    }

    private static Path a(float f) {
        Path path = b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f2 = 0.45f * f;
        double d = f;
        float f3 = f * 2.0f;
        path.moveTo((float) ((Math.sin(0.0d) * d) + d), f3 - ((float) ((Math.cos(0.0d) * d) + d)));
        double d2 = f2;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            Path path2 = b;
            double d3 = i * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d3) * d) + d), f3 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d4) * d2) + d), f3 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        Path path3 = b;
        path3.close();
        return path3;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredHeight == 0.0f) {
            return;
        }
        canvas.drawPath(a(measuredHeight), a);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(min, min);
    }

    public void setColor(int i) {
        a.setColor(i);
        invalidate();
    }
}
