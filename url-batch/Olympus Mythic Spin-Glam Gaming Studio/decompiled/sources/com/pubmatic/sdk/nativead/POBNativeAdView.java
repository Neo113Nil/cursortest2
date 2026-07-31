package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class POBNativeAdView extends FrameLayout implements View.OnClickListener {
    private final POBNativeAdViewHandler a;

    public POBNativeAdView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.F, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAdViewAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.onClick(view);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setListener(@Nullable POBNativeAdViewListener pOBNativeAdViewListener) {
        this.a.setListener(pOBNativeAdViewListener);
    }

    public POBNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public POBNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        POBNativeAdViewHandler pOBNativeAdViewHandler = new POBNativeAdViewHandler();
        this.a = pOBNativeAdViewHandler;
        pOBNativeAdViewHandler.setAdView(this);
    }
}
