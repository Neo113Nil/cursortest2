package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes6.dex */
public final class A0 implements InterfaceC5564ob {
    public static volatile A0 e;
    public static volatile boolean f;
    public static volatile boolean g;
    public final Context a;
    public final C5683t0 b;
    public final FutureTask c;
    public final InterfaceC5202ab d;

    @AnyThread
    public A0(@NonNull Context context) {
        this.a = context;
        C5683t0 c = C5661s4.l().c();
        this.b = c;
        this.d = c.a(context, C5661s4.l().g());
        this.c = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.A0$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return A0.this.p();
            }
        });
    }

    @NonNull
    @AnyThread
    public static A0 a(@NonNull Context context) {
        A0 a0 = e;
        if (a0 == null) {
            synchronized (A0.class) {
                try {
                    a0 = e;
                    if (a0 == null) {
                        a0 = new A0(context);
                        a0.j();
                        C5661s4.l().c.a().execute(new RunnableC5839z0(a0));
                        e = a0;
                    }
                } finally {
                }
            }
        }
        return a0;
    }

    @WorkerThread
    public static void b(boolean z) {
        c().a(z, true);
    }

    @WorkerThread
    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    @AnyThread
    public static synchronized boolean k() {
        boolean z;
        synchronized (A0.class) {
            z = f;
        }
        return z;
    }

    @AnyThread
    public static boolean l() {
        return g;
    }

    @AnyThread
    public static synchronized boolean m() {
        boolean z;
        synchronized (A0.class) {
            A0 a0 = e;
            if (a0 != null && a0.c.isDone()) {
                z = a0.f().i() != null;
            }
        }
        return z;
    }

    @VisibleForTesting
    public static synchronized void n() {
        synchronized (A0.class) {
            e = null;
            f = false;
            g = false;
        }
    }

    @WorkerThread
    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    @AnyThread
    public static synchronized void q() {
        synchronized (A0.class) {
            f = true;
        }
    }

    @AnyThread
    public static void r() {
        g = true;
    }

    @Nullable
    @AnyThread
    public static A0 s() {
        return e;
    }

    @WorkerThread
    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    @WorkerThread
    public static void setUserProfileID(@Nullable String str) {
        c().setUserProfileID(str);
    }

    @AnyThread
    public final void c(@Nullable AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    @WorkerThread
    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C5661s4.l().c.a().execute(new RunnableC5814y1(this.a));
    }

    @Nullable
    @AnyThread
    public final String e() {
        return f().e();
    }

    public final InterfaceC5228bb f() {
        try {
            return (InterfaceC5228bb) this.c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Nullable
    @AnyThread
    public final Map<String, String> g() {
        return f().g();
    }

    @NonNull
    @AnyThread
    public final AdvIdentifiersResult h() {
        return f().h();
    }

    @Nullable
    @WorkerThread
    public final Fc i() {
        return f().i();
    }

    public final void j() {
        C5402i4 c5402i4 = C5661s4.l().c;
        Runnable runnable = new Runnable() { // from class: io.appmetrica.analytics.impl.A0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                A0.this.o();
            }
        };
        c5402i4.a.getClass();
        new InterruptionSafeThread(runnable, "IAA-INIT_CORE-" + Td.a.incrementAndGet()).start();
    }

    public final void o() {
        C5661s4.l().s.a(this.a);
        C5661s4.l().a(this.a).a();
        this.c.run();
    }

    public final InterfaceC5228bb p() {
        InterfaceC5228bb interfaceC5228bb;
        C5683t0 c5683t0 = this.b;
        Context context = this.a;
        InterfaceC5202ab interfaceC5202ab = this.d;
        synchronized (c5683t0) {
            try {
                if (c5683t0.d == null) {
                    if (c5683t0.a(context)) {
                        c5683t0.d = new G0();
                    } else {
                        c5683t0.d = new E0(context, interfaceC5202ab);
                    }
                }
                interfaceC5228bb = c5683t0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5228bb;
    }

    @WorkerThread
    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C5661s4.l().c.a().execute(new RunnableC5814y1(this.a));
    }

    @NonNull
    @WorkerThread
    public final InterfaceC5512mb c(@NonNull ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static InterfaceC5256cd c() {
        if (m()) {
            return e.f();
        }
        return C5661s4.l().b;
    }

    @NonNull
    @AnyThread
    public final C5667sa d() {
        return f().d();
    }

    @NonNull
    @AnyThread
    public final C5739v4 b() {
        return this.d.a();
    }

    @WorkerThread
    public static void a(@Nullable Location location) {
        c().a(location);
    }

    @WorkerThread
    public static void a(boolean z) {
        c().a(z);
    }

    @WorkerThread
    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    @WorkerThread
    public static void a(@NonNull String str) {
        c().a(str);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    @WorkerThread
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    @WorkerThread
    public final void a(@NonNull ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    @WorkerThread
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        f().a(startupParamsCallback, list);
    }

    @VisibleForTesting
    public static synchronized void a(@Nullable A0 a0) {
        synchronized (A0.class) {
            e = a0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5564ob
    @NonNull
    public final InterfaceC5538nb a() {
        return f().a();
    }
}
