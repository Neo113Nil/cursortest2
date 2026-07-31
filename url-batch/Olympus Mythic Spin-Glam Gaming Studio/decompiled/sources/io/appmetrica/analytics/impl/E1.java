package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class E1 extends SafeRunnable {
    public final /* synthetic */ N1 a;

    public E1(N1 n1) {
        this.a = n1;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.a) {
            try {
                N1 n1 = this.a;
                if (n1.c) {
                    n1.b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
