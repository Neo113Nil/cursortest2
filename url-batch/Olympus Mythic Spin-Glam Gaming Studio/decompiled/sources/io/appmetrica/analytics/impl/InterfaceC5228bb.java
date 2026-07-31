package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC5228bb extends InterfaceC5256cd, S6, InterfaceC5564ob {
    @NonNull
    /* synthetic */ InterfaceC5538nb a();

    /* synthetic */ void a(int i, @NonNull Bundle bundle);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(@Nullable Location location);

    @WorkerThread
    void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    @WorkerThread
    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    @WorkerThread
    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    @WorkerThread
    void a(@NonNull ReporterConfig reporterConfig);

    @WorkerThread
    void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(boolean z, boolean z2);

    @WorkerThread
    void b(@NonNull AppMetricaConfig appMetricaConfig);

    @NonNull
    @WorkerThread
    InterfaceC5512mb c(@NonNull ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void clearAppEnvironment();

    @NonNull
    @AnyThread
    C5667sa d();

    @Nullable
    @AnyThread
    String e();

    @Nullable
    @AnyThread
    Map<String, String> g();

    @NonNull
    @AnyThread
    AdvIdentifiersResult h();

    @Nullable
    @AnyThread
    Fc i();

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void setUserProfileID(@Nullable String str);
}
