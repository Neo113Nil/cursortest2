package com.unity3d.player.a;

/* loaded from: classes.dex */
public final class P implements Runnable {
    public final /* synthetic */ Q a;

    public P(Q q) {
        this.a = q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().releasePointerCapture();
    }
}
