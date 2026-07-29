package o;

import android.os.Build;
import android.view.SurfaceHolder;

/* renamed from: o.uU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallback2C2027uU implements SurfaceHolder.Callback2 {
    public final C2046un a;
    public io.flutter.embedding.engine.renderer.e b;
    public final SurfaceHolderCallbackC1980tn c;
    public final C0586Wm d = new C0586Wm(3, this);
    public final C1961tU e;

    public SurfaceHolderCallback2C2027uU(SurfaceHolderCallbackC1980tn surfaceHolderCallbackC1980tn, C2046un c2046un, io.flutter.embedding.engine.renderer.e eVar) {
        boolean z = Build.VERSION.SDK_INT < 26;
        this.e = z ? new C1961tU(this, 1) : new C1961tU(this, 0);
        this.c = surfaceHolderCallbackC1980tn;
        this.b = eVar;
        this.a = c2046un;
        if (z) {
            c2046un.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolderCallbackC1980tn surfaceHolderCallbackC1980tn = this.c;
        if (surfaceHolderCallbackC1980tn != null) {
            surfaceHolderCallbackC1980tn.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1980tn surfaceHolderCallbackC1980tn = this.c;
        if (surfaceHolderCallbackC1980tn != null) {
            surfaceHolderCallbackC1980tn.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC1980tn surfaceHolderCallbackC1980tn = this.c;
        if (surfaceHolderCallbackC1980tn != null) {
            surfaceHolderCallbackC1980tn.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.a(new C1895sU(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
