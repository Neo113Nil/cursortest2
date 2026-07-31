package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
class NonScrollImageView extends AppCompatImageView {
    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }

    public NonScrollImageView(Context context) {
        super(context);
    }

    public NonScrollImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
