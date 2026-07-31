package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public final class b implements Runnable {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.a(this.a));
        this.a.b.a();
    }
}
