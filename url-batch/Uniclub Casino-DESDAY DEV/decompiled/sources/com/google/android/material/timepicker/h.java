package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f1873a;

    public h(TimePickerView timePickerView) {
        this.f1873a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i = TimePickerView.f1864t;
        this.f1873a.getClass();
        return false;
    }
}
