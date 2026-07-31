package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5390hi implements Runnable {
    public final /* synthetic */ ReporterConfig a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5390hi(C5701ti c5701ti, ReporterConfig reporterConfig) {
        this.b = c5701ti;
        this.a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        ReporterConfig reporterConfig = this.a;
        B0 b0 = c5701ti.a;
        Context context = c5701ti.d;
        b0.getClass();
        A0.a(context).f().a(reporterConfig);
    }
}
