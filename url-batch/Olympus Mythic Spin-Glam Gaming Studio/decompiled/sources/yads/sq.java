package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.math.MathKt;

/* loaded from: classes4.dex */
public final class sq extends View {
    public final float a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public float f;

    public sq(Context context) {
        super(context);
        this.a = yg0.a(context, 34.0f);
        float roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.b = roundToInt;
        float roundToInt2 = MathKt.roundToInt(TypedValue.applyDimension(1, 20.0f, context.getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(roundToInt);
        paint2.setAntiAlias(true);
        this.d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(roundToInt2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.e = paint3;
        this.f = 40.0f;
        paint2.setColor(hl3.a(-65536, 40.0f));
        paint.setColor(hl3.a(-1, this.f));
        paint3.setColor(hl3.a(-65536, this.f));
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        float f2 = this.a / f;
        canvas.drawCircle(f2, f2, f2, this.c);
        canvas.drawCircle(f2, f2, f2 - (this.b / f), this.d);
        float f3 = this.a / f;
        canvas.drawText("!", f3, f3 - ((this.e.ascent() + this.e.descent()) / f), this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) this.a;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        float f = z ? 0.0f : 40.0f;
        this.f = f;
        this.d.setColor(hl3.a(-65536, f));
        this.c.setColor(hl3.a(-1, this.f));
        this.e.setColor(hl3.a(-65536, this.f));
        invalidate();
    }
}
