package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1867a;

    public b(ClockFaceView clockFaceView) {
        this.f1867a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1867a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1849v.d) - clockFaceView.f1843D;
        if (height != clockFaceView.f1869t) {
            clockFaceView.f1869t = height;
            clockFaceView.m();
            int i = clockFaceView.f1869t;
            ClockHandView clockHandView = clockFaceView.f1849v;
            clockHandView.f1862l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
