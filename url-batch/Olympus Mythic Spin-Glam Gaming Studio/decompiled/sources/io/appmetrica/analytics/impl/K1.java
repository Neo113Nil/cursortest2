package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes11.dex */
public final class K1 extends SafeRunnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ N1 c;

    public K1(N1 n1, int i, Bundle bundle) {
        this.c = n1;
        this.a = i;
        this.b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.reportData(this.a, this.b);
    }
}
