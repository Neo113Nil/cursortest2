package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1859a;

    public b(ClockFaceView clockFaceView) {
        this.f1859a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f1859a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f1841v.d) - clockFaceView.f1835D;
        if (height != clockFaceView.f1861t) {
            clockFaceView.f1861t = height;
            clockFaceView.m();
            int i = clockFaceView.f1861t;
            ClockHandView clockHandView = clockFaceView.f1841v;
            clockHandView.f1854l = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
