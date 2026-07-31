package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class D1 extends SafeRunnable {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ N1 b;

    public D1(N1 n1, Configuration configuration) {
        this.b = n1;
        this.a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.onConfigurationChanged(this.a);
    }
}
