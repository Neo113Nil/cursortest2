package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes10.dex */
public final class I1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ N1 b;

    public I1(N1 n1, Intent intent) {
        this.b = n1;
        this.a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.c(this.a);
    }
}
