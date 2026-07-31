package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class G0 implements InterfaceC5228bb {
    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.S6
    public final void a(int i, @NonNull Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void a(@Nullable Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void a(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void a(@NonNull ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void a(boolean z, boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void b(@NonNull AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @NonNull
    public final InterfaceC5512mb c(@NonNull ReporterConfig reporterConfig) {
        return new C5727ui();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @NonNull
    public final C5667sa d() {
        return new C5667sa();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @Nullable
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @Nullable
    public final Map<String, String> g() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @NonNull
    public final AdvIdentifiersResult h() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    @Nullable
    public final Fc i() {
        Sc sc = new Sc();
        return new Fc(sc, new Q7(sc));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5256cd
    public final void setUserProfileID(@Nullable String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb
    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5228bb, io.appmetrica.analytics.impl.InterfaceC5564ob
    @NonNull
    public final InterfaceC5538nb a() {
        return new C5805xi();
    }
}
