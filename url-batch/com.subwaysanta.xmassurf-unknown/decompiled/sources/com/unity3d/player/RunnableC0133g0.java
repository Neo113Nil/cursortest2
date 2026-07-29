package com.unity3d.player;

/* renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0133g0 implements Runnable {
    public final /* synthetic */ String a;

    public RunnableC0133g0(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer.nativeSetLaunchURL(this.a);
    }
}
