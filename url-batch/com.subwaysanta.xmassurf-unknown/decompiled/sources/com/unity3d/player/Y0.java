package com.unity3d.player;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {
    public final /* synthetic */ b1 a;

    public Y0(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.onPause();
    }
}
