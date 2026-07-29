package o;

import android.view.Window;

/* loaded from: classes.dex */
public abstract class M00 {
    public static void a(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }
}
