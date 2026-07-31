package com.unity3d.player;

/* renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class RunnableC5156n0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    RunnableC5156n0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5146i0 c5146i0;
        c5146i0 = this.a.mGlView;
        if (c5146i0 != null) {
            c5146i0.b();
        }
    }
}
