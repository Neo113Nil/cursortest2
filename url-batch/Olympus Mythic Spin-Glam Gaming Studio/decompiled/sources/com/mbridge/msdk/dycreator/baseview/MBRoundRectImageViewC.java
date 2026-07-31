package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class MBRoundRectImageViewC extends MBImageView {
    private Paint d;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Paint();
    }

    private Bitmap a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                int width = getWidth();
                float height = getHeight() / bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(width / bitmap.getWidth(), height);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e) {
                q0.b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap a = a(((BitmapDrawable) drawable).getBitmap());
            if (a != null && !a.isRecycled()) {
                Bitmap a2 = a(a, 30);
                if (a2 != null && !a2.isRecycled()) {
                    Rect rect = new Rect(0, 0, a2.getWidth(), a2.getHeight());
                    this.d.reset();
                    canvas.drawBitmap(a2, rect, rect, this.d);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e) {
            q0.b("MBRoundRectImageViewC", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private Bitmap a(Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f = i;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f, f, paint);
                return createBitmap;
            } catch (Exception e) {
                q0.b("MBRoundRectImageViewC", e.getMessage());
            }
        }
        return bitmap;
    }
}
