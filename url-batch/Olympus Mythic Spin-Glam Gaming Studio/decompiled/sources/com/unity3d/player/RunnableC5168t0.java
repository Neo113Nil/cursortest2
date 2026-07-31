package com.unity3d.player;

/* renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class RunnableC5168t0 implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ UnityPlayer b;

    RunnableC5168t0(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S s = this.b.mSoftInput;
        if (s != null) {
            s.a(this.a);
        }
    }
}
