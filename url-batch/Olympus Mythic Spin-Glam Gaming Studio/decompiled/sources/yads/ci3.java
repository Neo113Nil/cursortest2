package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class ci3 implements ai3, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public zh3 b;

    public ci3(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static ci3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new ci3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zh3 zh3Var = this.b;
        if (zh3Var == null || i != 0) {
            return;
        }
        zh3Var.a(this.a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // yads.ai3
    public final void a(zh3 zh3Var) {
        this.b = zh3Var;
        this.a.registerDisplayListener(this, sb3.a((Handler.Callback) null));
        zh3Var.a(this.a.getDisplay(0));
    }

    @Override // yads.ai3
    public final void a() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }
}
