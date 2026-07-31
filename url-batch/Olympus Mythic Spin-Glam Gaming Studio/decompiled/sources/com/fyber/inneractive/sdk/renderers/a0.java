package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes3.dex */
public final class a0 implements com.fyber.inneractive.sdk.ui.controller.c {
    public final /* synthetic */ c0 a;

    public a0(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        c0 c0Var = this.a;
        boolean z = c0Var.m;
        if (z) {
            return;
        }
        if (c0Var.b != null && !z) {
            c0Var.m = true;
            IAlog.a("%sTracking impression", IAlog.a(c0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) c0Var.b);
            c0Var.n = aVar;
            aVar.a(c0Var);
        }
        c0Var.E();
    }
}
