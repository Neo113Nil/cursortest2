package com.vungle.ads.internal.network;

/* loaded from: classes6.dex */
public final class h {
    public static final void a(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw th;
        }
        if (th instanceof LinkageError) {
            throw th;
        }
    }
}
