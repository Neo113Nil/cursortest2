package com.fyber.inneractive.sdk.flow;

/* loaded from: classes15.dex */
public final class c implements Runnable {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.r.b.post(this.a.c);
    }
}
