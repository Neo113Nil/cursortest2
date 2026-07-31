package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5287di implements Provider {
    public final /* synthetic */ B0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public C5287di(B0 b0, Context context, ReporterConfig reporterConfig) {
        this.a = b0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        B0 b0 = this.a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        b0.getClass();
        return A0.a(context).f().c(reporterConfig);
    }
}
