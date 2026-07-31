package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;

/* loaded from: classes4.dex */
public final class z extends a {
    public z(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.b == null) {
            this.b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.a;
        if (zVar != null) {
            return zVar;
        }
        this.a = new com.fyber.inneractive.sdk.player.controller.c0(this.c, (com.fyber.inneractive.sdk.player.ui.t) this.b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b.m), t0Var.c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
