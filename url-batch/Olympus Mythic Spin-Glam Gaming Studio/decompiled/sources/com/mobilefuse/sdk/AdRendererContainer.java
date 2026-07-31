package com.mobilefuse.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class AdRendererContainer extends RelativeLayout {
    private Runnable attachedToWindowCallback;
    private Runnable delayedProgressBarTask;
    private Runnable detachedFromWindowCallback;
    private Handler handler;
    private ProgressBar progressBar;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            showProgressBar();
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public AdRendererContainer(@NonNull Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.AdRendererContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.this.lambda$new$0();
            }
        };
    }

    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.AdRendererContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.this.lambda$new$0();
            }
        };
    }

    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.AdRendererContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.this.lambda$new$0();
            }
        };
    }

    @RequiresApi
    public AdRendererContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.handler = new Handler(Looper.getMainLooper());
        this.delayedProgressBarTask = new Runnable() { // from class: com.mobilefuse.sdk.AdRendererContainer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdRendererContainer.this.lambda$new$0();
            }
        };
    }

    public void showProgressBarWithDelay(long j) throws Throwable {
        this.handler.postDelayed(this.delayedProgressBarTask, j);
    }

    public void showProgressBar() throws Throwable {
        this.handler.removeCallbacks(this.delayedProgressBarTask);
        if (this.progressBar != null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.progressBar = progressBar;
        addView(progressBar, layoutParams);
    }

    public void hideProgressBar() throws Throwable {
        this.handler.removeCallbacks(this.delayedProgressBarTask);
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            return;
        }
        removeView(progressBar);
        this.progressBar = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Log.d("MF sdk", "onAttachedToWindow");
        super.onAttachedToWindow();
        try {
            Runnable runnable = this.attachedToWindowCallback;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Log.d("MF sdk", "onDetachedFromWindow");
        try {
            Runnable runnable = this.detachedFromWindowCallback;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
        super.onDetachedFromWindow();
    }

    public Runnable getAttachedToWindowCallback() {
        return this.attachedToWindowCallback;
    }

    public void setAttachedToWindowCallback(Runnable runnable) throws Throwable {
        this.attachedToWindowCallback = runnable;
    }

    public Runnable getDetachedFromWindowCallback() {
        return this.detachedFromWindowCallback;
    }

    public void setDetachedFromWindowCallback(Runnable runnable) {
        this.detachedFromWindowCallback = runnable;
    }
}
