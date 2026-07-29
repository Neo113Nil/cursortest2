package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.unity3d.player.a.C0108g;

/* loaded from: classes.dex */
public final class S implements SurfaceHolder.Callback {
    public final /* synthetic */ T a;

    public S(T t) {
        this.a = t;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        T t = this.a;
        com.unity3d.player.a.C c = t.c;
        FrameLayout frameLayout = t.b.getFrameLayout();
        com.unity3d.player.a.B b = c.b;
        if (b == null || b.getParent() != null) {
            return;
        }
        frameLayout.addView(c.b);
        frameLayout.bringChildToFront(c.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        T t = this.a;
        com.unity3d.player.a.C c = t.c;
        C0108g c0108g = t.a;
        if (c.a != null) {
            if (c.b == null) {
                c.b = new com.unity3d.player.a.B(c, c.a);
            }
            c.b.a(c0108g);
        }
        this.a.b.updateGLDisplay(0, null);
    }
}
