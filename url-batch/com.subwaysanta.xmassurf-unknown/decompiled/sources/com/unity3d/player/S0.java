package com.unity3d.player;

/* loaded from: classes.dex */
public final class S0 implements Runnable {
    public final /* synthetic */ VideoPlayer a;

    public S0(VideoPlayer videoPlayer) {
        this.a = videoPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroyPlayer();
        this.a.changeState(3);
    }
}
