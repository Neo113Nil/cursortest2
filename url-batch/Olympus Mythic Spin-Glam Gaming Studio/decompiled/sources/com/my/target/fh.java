package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class fh extends ImageView {
    private Bitmap a;
    private Drawable b;
    private int c;
    private int d;
    private int e;
    private int f;

    public fh(Context context) {
        super(context);
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public boolean hasImage() {
        return (this.a == null && this.b == null) ? false : true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.c;
        if (i3 == 0 || (intrinsicWidth = this.d) == 0) {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                intrinsicWidth = bitmap.getWidth();
                i3 = this.a.getHeight();
            } else {
                Drawable drawable = this.b;
                if (drawable == null) {
                    setMeasuredDimension(0, 0);
                    return;
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    i3 = this.b.getIntrinsicHeight();
                }
            }
        }
        if (intrinsicWidth <= 0 || i3 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = intrinsicWidth;
        float f2 = i3;
        float f3 = f / f2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f;
        if (i4 > 0) {
            size2 = Math.min(i4, size2);
        }
        int i5 = this.e;
        if (i5 > 0) {
            size = Math.min(i5, size);
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode != 0 || mode2 != 0) {
            if (mode == 0) {
                intrinsicWidth = (int) (size2 * f3);
            } else {
                if (mode2 == 0) {
                    i3 = (int) (size / f3);
                } else {
                    float f4 = size;
                    float f5 = f4 / f;
                    float f6 = size2;
                    if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                        intrinsicWidth = (int) (f6 * f3);
                    } else {
                        i3 = (int) (f4 / f3);
                    }
                }
                intrinsicWidth = size;
            }
            i3 = size2;
        }
        setMeasuredDimension(intrinsicWidth, i3);
    }

    public void setImageBitmap(@Nullable Bitmap bitmap, boolean z) {
        if (!z) {
            setImageBitmap(bitmap);
            return;
        }
        setAlpha(0.0f);
        setImageBitmap(bitmap);
        animate().alpha(1.0f).setDuration(300L);
    }

    public void setImageData(@Nullable ImageData imageData) {
        if (imageData == null) {
            this.c = 0;
            this.d = 0;
            setImageBitmap(null);
        } else {
            this.c = imageData.getHeight();
            this.d = imageData.getWidth();
            setImageBitmap(imageData.getBitmap());
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.b = drawable;
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.f = i;
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.e = i;
    }

    public void setPlaceholderDimensions(int i, int i2) {
        this.d = i;
        this.c = i2;
    }

    public fh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.a = bitmap;
        super.setImageBitmap(bitmap);
    }
}
