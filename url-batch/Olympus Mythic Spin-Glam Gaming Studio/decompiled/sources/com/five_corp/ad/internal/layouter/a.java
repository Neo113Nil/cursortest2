package com.five_corp.ad.internal.layouter;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Context context) {
        super(context);
        this.a = dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return this.a.a(motionEvent.getX(), motionEvent.getY()) != null;
        } catch (Exception e) {
            this.a.c.a(com.five_corp.ad.internal.logger.b.a(e));
            return false;
        }
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
