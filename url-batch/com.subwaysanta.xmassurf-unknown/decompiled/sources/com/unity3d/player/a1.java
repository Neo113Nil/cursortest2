package com.unity3d.player;

/* loaded from: classes.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.a;
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
        this.a.a.onResume();
    }
}
