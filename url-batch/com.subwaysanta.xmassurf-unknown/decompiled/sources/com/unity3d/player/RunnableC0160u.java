package com.unity3d.player;

/* renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0160u implements Runnable {
    public final long a;
    public final long b;

    public RunnableC0160u(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ReflectionHelper.beginProxyCall(this.a)) {
            try {
                ReflectionHelper.nativeProxyFinalize(this.b);
            } finally {
                ReflectionHelper.endProxyCall();
            }
        }
    }
}
