package o;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class A00 implements DisplayManager.DisplayListener {
    public final DisplayManager a;
    public final /* synthetic */ QL b;

    public A00(QL ql, DisplayManager displayManager) {
        this.b = ql;
        this.a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            float refreshRate = this.a.getDisplay(0).getRefreshRate();
            QL ql = this.b;
            ql.a = (long) (1.0E9d / refreshRate);
            ((FlutterJNI) ql.b).setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
