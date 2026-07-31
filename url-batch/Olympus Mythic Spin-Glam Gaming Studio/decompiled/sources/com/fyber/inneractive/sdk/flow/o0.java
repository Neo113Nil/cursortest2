package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* loaded from: classes4.dex */
public final class o0 implements u1 {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.a.n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.b.post(runnable);
        }
        p0 p0Var = this.a;
        v1 v1Var = p0Var.o;
        if (v1Var != null) {
            v1Var.e = null;
            p0Var.o = null;
        }
    }
}
