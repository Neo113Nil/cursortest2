package com.unity3d.player;

import android.view.SurfaceHolder;

/* renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class SurfaceHolderCallbackC5144h0 implements SurfaceHolder.Callback {
    final /* synthetic */ C5146i0 a;

    SurfaceHolderCallbackC5144h0(C5146i0 c5146i0) {
        this.a = c5146i0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        UnityPlayer unityPlayer;
        UnityPlayer unityPlayer2;
        unityPlayer = this.a.b;
        unityPlayer.updateGLDisplay(0, surfaceHolder.getSurface());
        unityPlayer2 = this.a.b;
        unityPlayer2.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        UnityPlayer unityPlayer;
        K k;
        UnityPlayer unityPlayer2;
        unityPlayer = this.a.b;
        unityPlayer.updateGLDisplay(0, surfaceHolder.getSurface());
        C5146i0 c5146i0 = this.a;
        k = c5146i0.c;
        unityPlayer2 = c5146i0.b;
        J j = k.b;
        if (j == null || j.getParent() != null) {
            return;
        }
        unityPlayer2.addView(k.b);
        unityPlayer2.bringChildToFront(k.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        K k;
        C5139f c5139f;
        UnityPlayer unityPlayer;
        C5146i0 c5146i0 = this.a;
        k = c5146i0.c;
        c5139f = c5146i0.a;
        k.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && k.a != null) {
            if (k.b == null) {
                k.b = new J(k.a);
            }
            k.b.a(c5139f);
        }
        unityPlayer = this.a.b;
        unityPlayer.updateGLDisplay(0, null);
    }
}
