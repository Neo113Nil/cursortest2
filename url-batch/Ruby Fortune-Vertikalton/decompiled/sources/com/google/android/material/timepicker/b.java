package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1853a;

    public b(ClockFaceView clockFaceView) {
        this.f1853a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1853a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1835v.d) - clockFaceView.f1829D;
        if (height != clockFaceView.f1855t) {
            clockFaceView.f1855t = height;
            clockFaceView.m();
            int i = clockFaceView.f1855t;
            ClockHandView clockHandView = clockFaceView.f1835v;
            clockHandView.f1848l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
