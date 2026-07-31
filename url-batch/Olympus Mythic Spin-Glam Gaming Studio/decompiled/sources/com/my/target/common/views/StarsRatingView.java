package com.my.target.common.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.my.target.mi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public class StarsRatingView extends View {
    private static final Paint f;
    private int a;
    private float b;
    private float c;
    private Bitmap d;
    private boolean e;

    static {
        Paint paint = new Paint();
        f = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public StarsRatingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.a <= 0) {
            return;
        }
        int floor = (int) Math.floor(this.c);
        int ceil = (int) Math.ceil(5.0f - this.c);
        float f2 = floor;
        boolean z = this.c - f2 >= 0.2f;
        try {
            int i = this.a;
            this.d = Bitmap.createBitmap((int) ((i + this.b) * 5.0f), i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.d);
            a(0, this.a, -552162, canvas, floor);
            int i2 = this.a;
            int i3 = (int) (0 + ((i2 + this.b) * f2));
            a(i3, i2, -3355444, canvas, ceil);
            if (z) {
                int i4 = this.a;
                double d = this.c;
                a(i3, i4, (float) (d - Math.floor(d)), canvas);
            }
            invalidate();
            this.e = false;
        } catch (OutOfMemoryError unused) {
            mi.a("StarsRatingView: Unable to create rating bitmap because of OOME");
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.c > 0.0f) {
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                if (this.a <= 0 || this.e) {
                    return;
                }
                this.e = true;
                post(new Runnable() { // from class: com.my.target.common.views.StarsRatingView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        StarsRatingView.this.a();
                    }
                });
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.a;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
            this.a = i3;
        }
        setMeasuredDimension((int) ((i3 * 5) + (this.b * 4.0f)), i3);
    }

    public void setRating(float f2) {
        setContentDescription(Float.toString(f2));
        if (f2 > 5.0f || f2 < 0.0f) {
            mi.a("StarsRatingView: Rating is out of bounds - " + f2);
            this.c = 0.0f;
        } else {
            this.c = f2;
        }
        invalidate();
    }

    public void setStarSize(int i) {
        this.a = i;
    }

    public void setStarsPadding(float f2) {
        this.b = f2;
    }

    private void a(int i, int i2, int i3, Canvas canvas, int i4) {
        Paint paint = f;
        paint.setColor(i3);
        canvas.drawPath(a(i, i2 / 2, i4), paint);
    }

    private Path a(int i, float f2, int i2) {
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3;
            double d = i + f2 + (f3 * f2 * 2.0f) + (f3 * this.b);
            double d2 = f2;
            float f4 = 2.0f * f2;
            path.moveTo((float) (d + (Math.sin(0.0d) * d2)), f4 - ((float) ((Math.cos(0.0d) * d2) + d2)));
            double d3 = 0.45f * f2;
            path.lineTo((float) (d + (Math.sin(0.6283185307179586d) * d3)), f4 - ((float) (d2 + (Math.cos(0.6283185307179586d) * d3))));
            int i4 = 1;
            while (i4 < 5) {
                double d4 = i4 * 1.2566370614359172d;
                path.lineTo((float) (d + (Math.sin(d4) * d2)), f4 - ((float) (d2 + (Math.cos(d4) * d2))));
                double d5 = d4 + 0.6283185307179586d;
                path.lineTo((float) (d + (Math.sin(d5) * d3)), f4 - ((float) ((Math.cos(d5) * d3) + d2)));
                i4++;
                i3 = i3;
            }
            i3++;
        }
        path.close();
        return path;
    }

    private void a(int i, int i2, float f2, Canvas canvas) {
        Paint paint = f;
        paint.setColor(-552162);
        Path a = a(0, i2 / 2, 1);
        float f3 = i2 * f2;
        Rect rect = new Rect(i, 0, (int) (i + f3), i2);
        Bitmap createBitmap = Bitmap.createBitmap((int) f3, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawPath(a, paint);
        canvas.drawBitmap(createBitmap, (Rect) null, rect, paint);
    }
}
