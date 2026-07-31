package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes12.dex */
public final class Z0 implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ C5736v1 b;

    public Z0(C5736v1 c5736v1, AdRevenue adRevenue) {
        this.b = c5736v1;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportAdRevenue(this.a);
    }
}
