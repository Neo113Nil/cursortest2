package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1856a;

    public b(ClockFaceView clockFaceView) {
        this.f1856a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1856a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1838v.d) - clockFaceView.f1832D;
        if (height != clockFaceView.f1858t) {
            clockFaceView.f1858t = height;
            clockFaceView.m();
            int i = clockFaceView.f1858t;
            ClockHandView clockHandView = clockFaceView.f1838v;
            clockHandView.f1851l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
