package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.MediaController;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4337sc extends MediaController {
    public C4337sc(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.MediaController
    public final void show(int i) {
        super.show(i);
    }
}
