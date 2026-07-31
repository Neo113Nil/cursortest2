package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes10.dex */
public final class Gd extends SafeRunnable {
    public final /* synthetic */ String a;

    public Gd(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        B0 b0 = C5661s4.l().q;
        String str = this.a;
        b0.getClass();
        A0.c().a(str);
    }
}
