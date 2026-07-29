package com.unity3d.player;

import com.unity3d.player.a.AbstractC0104c;
import com.unity3d.player.a.AbstractC0120t;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0121a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC0121a0(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.b;
            AbstractC0104c.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a);
        } catch (Exception e) {
            AbstractC0120t.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
