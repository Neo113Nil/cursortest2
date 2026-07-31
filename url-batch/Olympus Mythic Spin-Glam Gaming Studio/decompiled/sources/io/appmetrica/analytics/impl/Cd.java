package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class Cd extends SafeRunnable {
    public final /* synthetic */ Hd a;
    public final /* synthetic */ ModuleEvent b;

    public Cd(Hd hd, ModuleEvent moduleEvent) {
        this.a = hd;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Hd.a(this.a).reportEvent(this.b);
    }
}
