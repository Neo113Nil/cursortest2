package com.unity3d.player;

/* loaded from: classes15.dex */
final class M0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    M0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C5146i0 c5146i0;
        C5146i0 c5146i02;
        C5146i0 c5146i03;
        UnityPlayer unityPlayer = this.a;
        z = unityPlayer.mMainDisplayOverride;
        if (z) {
            c5146i03 = unityPlayer.mGlView;
            unityPlayer.removeView(c5146i03);
            return;
        }
        c5146i0 = unityPlayer.mGlView;
        if (c5146i0.getParent() != null) {
            AbstractC5179z.Log(5, "Couldn't add view, because it's already assigned to another parent");
            return;
        }
        UnityPlayer unityPlayer2 = this.a;
        c5146i02 = unityPlayer2.mGlView;
        unityPlayer2.addView(c5146i02);
    }
}
