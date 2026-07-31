package com.fyber.inneractive.sdk.web;

/* loaded from: classes4.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ b1 a;

    public a1(b1 b1Var) {
        this.a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
