package com.unity3d.player;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C5160p0 implements G {
    final /* synthetic */ RunnableC5162q0 a;

    C5160p0(RunnableC5162q0 runnableC5162q0) {
        this.a = runnableC5162q0;
    }

    public final void a() {
        RunnableC5162q0 runnableC5162q0 = this.a;
        runnableC5162q0.a = true;
        if (runnableC5162q0.b) {
            runnableC5162q0.c.release();
        }
    }
}
