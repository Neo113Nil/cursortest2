package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2092a;

    public b(ClockFaceView clockFaceView) {
        this.f2092a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2092a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2074v.d) - clockFaceView.f2068D;
        if (height != clockFaceView.f2094t) {
            clockFaceView.f2094t = height;
            clockFaceView.m();
            int i = clockFaceView.f2094t;
            ClockHandView clockHandView = clockFaceView.f2074v;
            clockHandView.f2087l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
