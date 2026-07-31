package com.fyber.inneractive.sdk.web;

/* loaded from: classes14.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ v0 a;

    public s0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.u.compareAndSet(false, true)) {
            this.a.d("onCancelResult(true);");
            this.a.v.set(false);
        }
    }
}
