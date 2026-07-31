package com.fyber.inneractive.sdk.web;

/* loaded from: classes4.dex */
public final class g1 implements Runnable {
    public final /* synthetic */ i1 a;

    public g1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        i1 i1Var = this.a;
        if (i1Var.H == null || (eVar = i1Var.I) == null) {
            return;
        }
        eVar.c();
    }
}
