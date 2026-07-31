package com.unity3d.player;

/* loaded from: classes4.dex */
final class E0 implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ UnityPlayer b;

    E0(UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5146i0 c5146i0;
        c5146i0 = this.b.mGlView;
        c5146i0.a(this.a);
    }
}
