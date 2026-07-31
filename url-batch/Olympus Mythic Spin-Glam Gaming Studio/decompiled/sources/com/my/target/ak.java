package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.PathParser;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
final class ak extends FrameLayout {
    private final Paint a;
    private final DisplayMetrics b;

    public ak(Context context) {
        super(context);
        this.a = new Paint();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.b = displayMetrics;
        setWillNotDraw(false);
        b();
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(a());
        int applyDimension = (int) TypedValue.applyDimension(1, 36.0f, displayMetrics);
        int applyDimension2 = (int) TypedValue.applyDimension(1, 24.0f, displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(applyDimension2, applyDimension2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        setLayoutParams(new FrameLayout.LayoutParams(applyDimension, applyDimension));
    }

    private Bitmap a() {
        int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, this.b);
        Bitmap createBitmap = Bitmap.createBitmap(applyDimension, applyDimension, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path createPathFromPathData = PathParser.createPathFromPathData("M 0.263 0.264 C 0.615 -0.088 1.185 -0.088 1.536 0.264 L 7 5.727 L 12.463 0.264 C 12.815 -0.088 13.385 -0.088 13.736 0.264 C 14.088 0.615 14.088 1.185 13.736 1.536 L 8.272 7 L 13.736 12.464 C 14.088 12.815 14.088 13.385 13.736 13.736 C 13.385 14.088 12.815 14.088 12.463 13.736 L 7 8.273 L 1.536 13.736 C 1.185 14.088 0.615 14.088 0.263 13.736 C -0.088 13.385 -0.088 12.815 0.263 12.464 L 5.727 7 L 0.263 1.536 C -0.088 1.185 -0.088 0.615 0.263 0.264 Z");
        RectF rectF = new RectF();
        createPathFromPathData.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-rectF.left, -rectF.top);
        float f = this.b.density;
        matrix.postScale(f, f);
        float f2 = applyDimension;
        matrix.postTranslate((f2 - (rectF.width() * f)) / 2.0f, (f2 - (rectF.height() * f)) / 2.0f);
        createPathFromPathData.transform(matrix);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(createPathFromPathData, paint);
        return createBitmap;
    }

    private void b() {
        this.a.setColor(1711276032);
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, this.a);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
