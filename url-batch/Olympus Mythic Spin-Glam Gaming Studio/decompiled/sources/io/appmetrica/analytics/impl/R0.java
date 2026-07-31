package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class R0 implements Runnable {
    public final /* synthetic */ Location a;
    public final /* synthetic */ C5736v1 b;

    public R0(C5736v1 c5736v1, Location location) {
        this.b = c5736v1;
        this.a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.b.a;
        Location location = this.a;
        b0.getClass();
        A0.c().a(location);
    }
}
