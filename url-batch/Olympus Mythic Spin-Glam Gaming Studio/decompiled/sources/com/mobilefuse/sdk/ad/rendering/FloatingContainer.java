package com.mobilefuse.sdk.ad.rendering;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.internal.Callback;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class FloatingContainer extends RelativeLayout {
    private View.OnTouchListener floatingTouchListener;
    private Callback<Boolean> onTouchInteractionEnabledChanged;
    private boolean touchInteractionEnabled;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("MobileFuse|SafeDK: Execution> Lcom/mobilefuse/sdk/ad/rendering/FloatingContainer;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.E, this, motionEvent);
        return safedk_FloatingContainer_dispatchTouchEvent_5cbf80a3d93efb3b2684eed1d489b8af(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public FloatingContainer(Context context) throws Throwable {
        super(context);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    public FloatingContainer(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    public FloatingContainer(Context context, AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    @RequiresApi
    public FloatingContainer(Context context, AttributeSet attributeSet, int i, int i2) throws Throwable {
        super(context, attributeSet, i, i2);
        this.touchInteractionEnabled = true;
        this.onTouchInteractionEnabledChanged = null;
    }

    public boolean safedk_FloatingContainer_dispatchTouchEvent_5cbf80a3d93efb3b2684eed1d489b8af(MotionEvent p0) {
        if (this.touchInteractionEnabled) {
            return super.dispatchTouchEvent(p0);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            View.OnTouchListener onTouchListener = this.floatingTouchListener;
            if (onTouchListener == null) {
                return false;
            }
            onTouchListener.onTouch(this, motionEvent);
            return false;
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
            return false;
        }
    }

    public void setFloatingTouchListener(View.OnTouchListener onTouchListener) {
        this.floatingTouchListener = onTouchListener;
    }

    public boolean isTouchInteractionEnabled() {
        return this.touchInteractionEnabled;
    }

    public void setTouchInteractionEnabled(boolean z) {
        this.touchInteractionEnabled = z;
        Callback<Boolean> callback = this.onTouchInteractionEnabledChanged;
        if (callback != null) {
            try {
                callback.call(Boolean.valueOf(z));
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
            }
        }
    }

    public void setOnTouchInteractionEnabledChanged(Callback<Boolean> callback) {
        this.onTouchInteractionEnabledChanged = callback;
    }
}
