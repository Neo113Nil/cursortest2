package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5243c0 extends SafeRunnable {
    public final /* synthetic */ C5269d0 a;
    public final /* synthetic */ Context b;

    public C5243c0(C5269d0 c5269d0, Context context) {
        this.a = c5269d0;
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5269d0 c5269d0 = this.a;
        Context context = this.b;
        c5269d0.getClass();
        c5269d0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
