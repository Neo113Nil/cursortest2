package io.appmetrica.analytics.impl;

import android.app.Activity;

/* renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5448k implements Runnable {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ C5500m b;

    public RunnableC5448k(C5500m c5500m, Activity activity) {
        this.b = c5500m;
        this.a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
