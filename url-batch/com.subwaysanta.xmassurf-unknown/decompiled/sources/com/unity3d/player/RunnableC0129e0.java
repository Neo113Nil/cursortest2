package com.unity3d.player;

import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0129e0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0129e0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.L l;
        FrameLayout frameLayout = this.a.getFrameLayout();
        l = this.a.m_SplashScreen;
        frameLayout.removeView(l);
        this.a.m_SplashScreen = null;
    }
}
