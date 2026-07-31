package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class m extends fh {
    public static final int DEFAULT_HEIGHT = 20;
    private int g;

    public m(Context context) {
        this(context, null);
    }

    @Override // com.my.target.fh, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.fh, android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.g >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedHeight(int i) {
        this.g = i;
    }

    @Override // com.my.target.fh, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        int i;
        int i2;
        int i3 = this.g;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (bitmap != null) {
                i2 = bitmap.getWidth();
                i4 = bitmap.getHeight();
            } else {
                i2 = 0;
            }
            setMeasuredDimension(((int) (i * (i4 > 0 ? i2 / i4 : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.g);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // com.my.target.fh, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        int i;
        int i2;
        int i3 = this.g;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (drawable != null) {
                i2 = drawable.getIntrinsicWidth();
                i4 = drawable.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            setMeasuredDimension(((int) (i * (i4 > 0 ? i2 / i4 : 0.0f))) + getPaddingLeft() + getPaddingRight(), this.g);
        }
        super.setImageDrawable(drawable);
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = -1;
        this.g = qi.a(20, context);
    }
}
