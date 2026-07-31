package com.five_corp.ad.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class j extends View implements com.five_corp.ad.internal.layouter.j {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public RectF e;
    public final com.five_corp.ad.internal.hub.ad_instance.e f;

    public j(Context context, com.five_corp.ad.internal.ad.custom_layout.f fVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        super(context);
        this.f = eVar;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(H.a(fVar.a));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(H.a(fVar.c));
        paint2.setStyle(style);
        paint2.setStrokeWidth(5.0f);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(H.a(fVar.b));
        this.e = new RectF(5.0f, 5.0f, getWidth() - 5.0f, getHeight() - 5.0f);
        this.d = 0.0f;
    }

    @Override // com.five_corp.ad.internal.layouter.j
    public final void a(com.five_corp.ad.internal.layouter.g gVar) {
        this.d = gVar.d;
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.e, this.c);
        canvas.drawArc(this.e, 270.0f, -(360.0f - (this.d * 360.0f)), false, this.a);
        canvas.drawArc(this.e, -90.0f, this.d * 360.0f, false, this.b);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.e = new RectF(5.0f, 5.0f, i - 5.0f, i2 - 5.0f);
            invalidate();
        } catch (Throwable th) {
            this.f.a(com.five_corp.ad.internal.logger.b.a(th));
        }
    }
}
