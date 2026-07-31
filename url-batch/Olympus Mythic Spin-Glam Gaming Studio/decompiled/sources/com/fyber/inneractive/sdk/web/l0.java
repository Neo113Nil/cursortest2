package com.fyber.inneractive.sdk.web;

/* loaded from: classes5.dex */
public final class l0 implements Runnable {
    public final /* synthetic */ m0 a;

    public l0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v0 v0Var = this.a.a;
        if (v0Var.y) {
            return;
        }
        v0Var.e(v0Var.k);
    }
}
