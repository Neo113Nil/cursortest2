package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class Bd extends SafeRunnable {
    public final /* synthetic */ Hd a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public Bd(Hd hd, AdRevenue adRevenue, boolean z) {
        this.a = hd;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Hd.a(this.a).reportAdRevenue(this.b, this.c);
    }
}
