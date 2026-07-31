package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class F1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ N1 c;

    public F1(N1 n1, Intent intent, int i) {
        this.c = n1;
        this.a = intent;
        this.b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.a(this.a, this.b);
    }
}
