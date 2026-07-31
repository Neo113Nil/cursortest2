package com.smaato.sdk.ng.vpaid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes.dex */
public class VideoAdView extends FrameLayout {
    private VisibilityListener a;
    private GestureDetector b;
    private int c;

    public interface VisibilityListener {
        void onVisibilityChanged(int i);
    }

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    }

    public VideoAdView(Context context) {
        super(context);
        this.c = 0;
        a();
    }

    private void a() {
        this.b = new GestureDetector(getContext(), new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VisibilityListener visibilityListener = this.a;
        if (visibilityListener != null) {
            visibilityListener.onVisibilityChanged(4);
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

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.c = i;
        VisibilityListener visibilityListener = this.a;
        if (visibilityListener != null) {
            visibilityListener.onVisibilityChanged(i);
        }
    }

    public void setVisibilityListener(VisibilityListener visibilityListener) {
        if (visibilityListener != null) {
            this.a = visibilityListener;
            visibilityListener.onVisibilityChanged(this.c);
        }
    }

    public VideoAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        a();
    }

    public VideoAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        a();
    }
}
