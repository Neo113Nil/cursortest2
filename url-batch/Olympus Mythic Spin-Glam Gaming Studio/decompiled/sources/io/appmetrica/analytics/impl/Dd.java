package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes6.dex */
public final class Dd extends SafeRunnable {
    public final /* synthetic */ Hd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public Dd(Hd hd, int i, String str) {
        this.a = hd;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Hd.a(this.a).a(new C5201aa(this.b, this.c));
    }
}
