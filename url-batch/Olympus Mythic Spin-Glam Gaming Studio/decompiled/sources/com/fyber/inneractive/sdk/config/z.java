package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* loaded from: classes5.dex */
public final class z implements Runnable {
    public final /* synthetic */ a0 a;

    public z(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.J = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.a.J;
        Context context = a0Var.b;
        if (eVar.a) {
            return;
        }
        eVar.a = true;
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
