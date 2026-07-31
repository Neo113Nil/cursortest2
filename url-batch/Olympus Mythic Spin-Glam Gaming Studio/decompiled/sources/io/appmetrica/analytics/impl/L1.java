package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes11.dex */
public final class L1 extends SafeRunnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ N1 b;

    public L1(N1 n1, Bundle bundle) {
        this.b = n1;
        this.a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.resumeUserSession(this.a);
    }
}
