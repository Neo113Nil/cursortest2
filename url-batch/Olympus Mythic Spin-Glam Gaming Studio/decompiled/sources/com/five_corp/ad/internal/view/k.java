package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes15.dex */
public final class k extends FrameLayout implements com.five_corp.ad.internal.layouter.j {
    public final com.five_corp.ad.internal.cache.b a;

    public k(Context context, com.five_corp.ad.internal.cache.f fVar, com.five_corp.ad.internal.ad.custom_layout.g gVar) {
        super(context);
        com.five_corp.ad.internal.cache.b a = fVar.a(context, gVar.b);
        com.five_corp.ad.internal.cache.b a2 = fVar.a(context, gVar.a);
        this.a = a2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        a.setScaleType(scaleType);
        a2.setScaleType(scaleType);
        addView(a, new FrameLayout.LayoutParams(-1, -1));
        addView(a2, new FrameLayout.LayoutParams(0, -1));
    }

    @Override // com.five_corp.ad.internal.layouter.j
    public final void a(com.five_corp.ad.internal.layouter.g gVar) {
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = (int) (getWidth() * gVar.d);
        this.a.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
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
}
