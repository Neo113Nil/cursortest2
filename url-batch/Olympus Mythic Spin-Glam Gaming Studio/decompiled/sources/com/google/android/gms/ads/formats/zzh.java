package com.google.android.gms.ads.formats;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes9.dex */
public final class zzh extends FrameLayout {
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/formats/zzh;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.h, this, motionEvent);
        return safedk_zzh_dispatchTouchEvent_53cc396da6a5f609f99661838cc2cd2b(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw null;
    }

    public boolean safedk_zzh_dispatchTouchEvent_53cc396da6a5f609f99661838cc2cd2b(MotionEvent p0) {
        throw null;
    }
}
