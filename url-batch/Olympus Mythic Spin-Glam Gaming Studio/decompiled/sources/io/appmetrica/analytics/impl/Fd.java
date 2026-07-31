package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes10.dex */
public final class Fd extends SafeRunnable {
    public final /* synthetic */ Hd a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public Fd(Hd hd, String str, byte[] bArr) {
        this.a = hd;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Hd.a(this.a).setSessionExtra(this.b, this.c);
    }
}
