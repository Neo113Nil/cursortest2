package com.unity3d.player.a;

/* loaded from: classes.dex */
public final class O implements Runnable {
    public final /* synthetic */ Q a;

    public O(Q q) {
        this.a = q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().requestPointerCapture();
    }
}
