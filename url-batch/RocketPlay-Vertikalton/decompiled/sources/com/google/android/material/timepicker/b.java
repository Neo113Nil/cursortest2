package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2458a;

    public b(ClockFaceView clockFaceView) {
        this.f2458a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2458a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2440v.d) - clockFaceView.f2434D;
        if (height != clockFaceView.f2460t) {
            clockFaceView.f2460t = height;
            clockFaceView.m();
            int i = clockFaceView.f2460t;
            ClockHandView clockHandView = clockFaceView.f2440v;
            clockHandView.f2453l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
