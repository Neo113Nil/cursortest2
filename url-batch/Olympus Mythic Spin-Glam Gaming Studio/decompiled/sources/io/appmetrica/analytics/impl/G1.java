package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes10.dex */
public final class G1 extends SafeRunnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ N1 d;

    public G1(N1 n1, Intent intent, int i, int i2) {
        this.d = n1;
        this.a = intent;
        this.b = i;
        this.c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.d.b.a(this.a, this.b, this.c);
    }
}
