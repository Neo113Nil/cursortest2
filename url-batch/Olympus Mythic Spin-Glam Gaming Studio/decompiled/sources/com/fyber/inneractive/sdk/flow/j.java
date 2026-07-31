package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public final class j implements Runnable {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.a;
        kVar.getClass();
        IAlog.a("%s : IAAdContentLoaderImpl : retry load ad task started execution", IAlog.a(kVar));
        this.a.b();
    }
}
