package o;

import android.view.SurfaceHolder;

/* renamed from: o.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC1980tn implements SurfaceHolder.Callback {
    public final /* synthetic */ C2046un a;

    public SurfaceHolderCallbackC1980tn(C2046un c2046un) {
        this.a = c2046un;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C2046un c2046un = this.a;
        io.flutter.embedding.engine.renderer.e eVar = c2046un.j;
        if (eVar == null || c2046un.i) {
            return;
        }
        if (eVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        eVar.a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2046un c2046un = this.a;
        c2046un.h = true;
        if (c2046un.j == null || c2046un.i) {
            return;
        }
        c2046un.c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2046un c2046un = this.a;
        c2046un.h = false;
        io.flutter.embedding.engine.renderer.e eVar = c2046un.j;
        if (eVar == null || c2046un.i) {
            return;
        }
        if (eVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        eVar.e();
    }
}
