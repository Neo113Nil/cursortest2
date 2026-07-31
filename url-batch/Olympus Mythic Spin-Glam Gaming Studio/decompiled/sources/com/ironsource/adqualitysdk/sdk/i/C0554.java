package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.у, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0554 extends RelativeLayout {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0506 f797;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0554(C0506 c0506, Context context) {
        super(context);
        this.f797 = c0506;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0506.m4030(this.f797, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
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
