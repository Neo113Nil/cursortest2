package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class q implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f813b;

    public q(s sVar, DisplayManager displayManager) {
        this.f813b = sVar;
        this.f812a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f812a.getDisplay(0).getRefreshRate();
            s sVar = this.f813b;
            sVar.f818a = (long) (1.0E9d / refreshRate);
            sVar.f819b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
