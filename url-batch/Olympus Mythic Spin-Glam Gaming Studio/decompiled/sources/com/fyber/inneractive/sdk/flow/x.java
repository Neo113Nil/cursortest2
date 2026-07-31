package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes15.dex */
public abstract class x {
    public InneractiveAdRequest a;
    public com.fyber.inneractive.sdk.response.e b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.config.s0 d;
    public boolean e = false;
    public boolean f = false;

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.d = s0Var;
        this.c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public void a(String str) {
    }

    public boolean a(boolean z, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public boolean b() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public boolean c() {
        return false;
    }

    public abstract boolean d();

    public abstract void destroy();

    public void e() {
    }

    public abstract boolean isVideoAd();
}
