package com.my.target;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class jf extends ProgressBar implements hf {
    public jf(Context context) {
        super(context, null, android.R.attr.progressBarStyleHorizontal);
    }

    @Override // com.my.target.hf
    public View a() {
        return this;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.my.target.hf
    public void setColor(int i) {
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(i), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        setProgressDrawable(layerDrawable);
    }

    @Override // com.my.target.hf
    public void setMaxTime(float f) {
        setMax((int) (f * 1000.0f));
    }

    @Override // com.my.target.hf
    public void setTimeChanged(float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            setProgress((int) (f * 1000.0f), true);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", getProgress(), (int) (f * 1000.0f));
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    @Override // com.my.target.hf
    public void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }
}
