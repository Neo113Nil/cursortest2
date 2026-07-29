package com.unity3d.player;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {
    public final /* synthetic */ b1 a;

    public Z0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.a;
        VideoPlayer videoPlayer = b1Var.f;
        if (videoPlayer != null) {
            b1Var.a.addViewToPlayer(videoPlayer, true);
            b1 b1Var2 = this.a;
            b1Var2.i = true;
            b1Var2.f.requestFocus();
        }
    }
}
