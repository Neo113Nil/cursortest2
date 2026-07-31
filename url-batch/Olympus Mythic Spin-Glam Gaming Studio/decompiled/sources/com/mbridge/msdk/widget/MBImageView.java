package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes14.dex */
public class MBImageView extends ImageView {
    private Bitmap a;
    private String b;

    class a implements c {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("mb-widget-imageview", str2 + " load failed:" + str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBImageView.this.setImageBitmap(bitmap);
        }
    }

    public MBImageView(Context context) {
        super(context);
        this.a = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.b, new a());
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else {
            q0.b("mb-widget-imageview", "onDraw bitmap recycled");
            a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.a = bitmap;
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            if (!bitmap.isRecycled()) {
                super.setImageBitmap(bitmap);
                return;
            }
            this.a = null;
            super.setImageBitmap(null);
            q0.b("mb-widget-imageview", "setImageBitmap recycled");
        }
    }

    public void setImageUrl(String str) {
        this.b = str;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
    }
}
