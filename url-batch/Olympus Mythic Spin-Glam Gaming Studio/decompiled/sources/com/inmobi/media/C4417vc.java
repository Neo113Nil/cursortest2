package com.inmobi.media;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* renamed from: com.inmobi.media.vc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4417vc extends RelativeLayout {
    public C4417vc(Activity activity) {
        super(activity);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
