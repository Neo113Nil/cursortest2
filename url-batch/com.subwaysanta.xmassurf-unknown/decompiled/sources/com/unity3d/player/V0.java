package com.unity3d.player;

/* loaded from: classes.dex */
public final class V0 implements Runnable {
    public final /* synthetic */ W0 a;

    public V0(W0 w0) {
        this.a = w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.a.a.h;
        VideoPlayer videoPlayer = b1Var.f;
        if (videoPlayer != null) {
            b1Var.a.removeViewFromPlayer(videoPlayer);
            b1Var.i = false;
            b1Var.f.destroyPlayer();
            b1Var.f = null;
            C0135h0 c0135h0 = b1Var.c;
            if (c0135h0 != null) {
                c0135h0.a();
            }
        }
        this.a.a.h.a.onResume();
    }
}
