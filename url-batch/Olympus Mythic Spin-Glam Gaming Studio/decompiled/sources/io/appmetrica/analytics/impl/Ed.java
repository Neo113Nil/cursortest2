package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes10.dex */
public final class Ed extends SafeRunnable {
    public final /* synthetic */ Hd a;
    public final /* synthetic */ boolean b;

    public Ed(Hd hd, boolean z) {
        this.a = hd;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Hd.a(this.a).a(this.b, false);
    }
}
