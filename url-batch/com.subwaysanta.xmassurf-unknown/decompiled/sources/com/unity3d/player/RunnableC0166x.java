package com.unity3d.player;

/* renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0166x implements Runnable {
    public final /* synthetic */ DialogC0168y a;

    public RunnableC0166x(DialogC0168y dialogC0168y) {
        this.a = dialogC0168y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c = this.a.d;
        c.a(c.b(), true);
    }
}
