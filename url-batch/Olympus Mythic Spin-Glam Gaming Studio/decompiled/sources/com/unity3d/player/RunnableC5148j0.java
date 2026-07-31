package com.unity3d.player;

/* renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class RunnableC5148j0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    RunnableC5148j0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.nativeLowMemory();
    }
}
