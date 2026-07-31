package com.fyber.inneractive.sdk.network;

import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class n1 {
    public final WeakReference a;
    public final WeakReference b;
    public final int c;
    public final m1 d = new m1(this);

    public n1(t0 t0Var, Thread thread, int i) {
        this.b = new WeakReference(t0Var);
        this.a = new WeakReference(thread);
        this.c = i;
    }
}
