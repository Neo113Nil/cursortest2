package com.pubmatic.sdk.webrendering.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;

/* loaded from: classes9.dex */
public class POBViewabilityTracker implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnWindowFocusChangeListener, View.OnAttachStateChangeListener {
    private View a;
    private OnViewabilityChangedListener b;
    private float c;
    private int d;
    private boolean e;
    private boolean f;

    public interface OnViewabilityChangedListener {
        void onViewabilityChanged(boolean z);
    }

    public POBViewabilityTracker(@NonNull View view) {
        this.a = view;
        this.f = false;
        this.e = false;
        view.addOnAttachStateChangeListener(this);
    }

    private void a() {
        if (this.a.getViewTreeObserver().isAlive()) {
            this.a.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        }
    }

    private void b() {
        if (this.a.getViewTreeObserver().isAlive()) {
            this.a.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a.getViewTreeObserver().addOnScrollChangedListener(this);
        }
    }

    private void c() {
        if (this.a.getViewTreeObserver().isAlive()) {
            this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    private void d() {
        if (this.a.getViewTreeObserver().isAlive()) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    private void e() {
        int i = this.d;
        boolean z = false;
        if (i != 0) {
            if (POBUtils.isViewVisible(this.a, i) && this.a.hasWindowFocus()) {
                z = true;
            }
            OnViewabilityChangedListener onViewabilityChangedListener = this.b;
            if (onViewabilityChangedListener != null) {
                onViewabilityChangedListener.onViewabilityChanged(z);
            }
            this.f = z;
            return;
        }
        if (POBUtils.getVisiblePercent(this.a) >= this.c && this.a.hasWindowFocus()) {
            z = true;
        }
        if (this.f != z) {
            OnViewabilityChangedListener onViewabilityChangedListener2 = this.b;
            if (onViewabilityChangedListener2 != null) {
                onViewabilityChangedListener2.onViewabilityChanged(z);
            }
            this.f = z;
        }
    }

    public void destroy() {
        d();
        c();
        this.a.removeOnAttachStateChangeListener(this);
    }

    public boolean isViewable() {
        return this.f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        a();
        if (this.e) {
            b();
        }
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        d();
        c();
        e();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        e();
    }

    public void setAllowViewTreeObserverRegistration(boolean z) {
        this.e = z;
    }

    public void setOnExposureChangeWithThresholdListener(@Nullable OnViewabilityChangedListener onViewabilityChangedListener) {
        this.b = onViewabilityChangedListener;
    }

    public POBViewabilityTracker(@NonNull View view, float f) {
        this(view);
        this.c = f;
    }

    public POBViewabilityTracker(@NonNull View view, int i) {
        this(view);
        this.d = i;
    }
}
