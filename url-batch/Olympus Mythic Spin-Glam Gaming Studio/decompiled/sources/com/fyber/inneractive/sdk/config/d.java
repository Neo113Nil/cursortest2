package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* loaded from: classes5.dex */
public final class d implements u1 {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        IAlog.a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
        this.a.c = true;
    }
}
