package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5269d0 {
    public final B0 a;
    public final C5627ql b;
    public final C5402i4 c;
    public final long d = TimeUnit.SECONDS.toMillis(10);

    public C5269d0(B0 b0, C5627ql c5627ql, C5402i4 c5402i4) {
        this.a = b0;
        this.b = c5627ql;
        this.c = c5402i4;
    }

    public final synchronized void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.a.getClass();
        if (B0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.b.a();
        this.a.getClass();
        A0 a = A0.a(context);
        a.d.a(null, a);
        IHandlerExecutor a2 = this.c.a();
        ((U9) a2).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.d0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C5269d0.a(C5269d0.this, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.a.getClass();
        B0.b();
    }

    public static final void a(C5269d0 c5269d0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c5269d0.a.getClass();
        A0 a = A0.a(context);
        a.f().a(appMetricaLibraryAdapterConfig);
        C5661s4.l().c.a().execute(new RunnableC5814y1(a.a));
    }
}
