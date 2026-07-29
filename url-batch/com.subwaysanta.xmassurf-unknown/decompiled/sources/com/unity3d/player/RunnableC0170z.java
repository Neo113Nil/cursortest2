package com.unity3d.player;

/* renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0170z implements Runnable {
    public final /* synthetic */ B a;

    public RunnableC0170z(B b) {
        this.a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.c();
    }
}
