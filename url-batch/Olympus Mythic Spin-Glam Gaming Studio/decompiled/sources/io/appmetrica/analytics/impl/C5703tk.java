package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycle;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.ActiveNetworkTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5703tk implements ServiceContext {
    public final ModuleServiceLifecycleController a;
    public final C5541ne b = new C5541ne(getContext());
    public final C5696td c = new C5696td();
    public final Tk d = new Tk(getContext(), new Sk(new Z1()));
    public final Qk e = new Qk(getContext(), Ka.k().y(), Ka.k().B().f(getContext()));
    public final S9 f = new S9();
    public final H6 g = new H6();

    public C5703tk(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.a = moduleServiceLifecycleController;
    }

    @NotNull
    public final C5541ne a() {
        return this.b;
    }

    @NotNull
    public final C5696td b() {
        return this.c;
    }

    @NotNull
    public final Qk c() {
        return this.e;
    }

    @NotNull
    public final Tk d() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return Ka.I.B.getActivationBarrier();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ActiveNetworkTypeProvider getActiveNetworkTypeProvider() {
        return Ka.I.G;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return Ka.I.l().b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        Ka ka = Ka.I;
        C5297e3 c5297e3 = ka.e;
        if (c5297e3 == null) {
            synchronized (ka) {
                try {
                    c5297e3 = ka.e;
                    if (c5297e3 == null) {
                        c5297e3 = new C5297e3(ka.d.a(), ka.l().a);
                        ka.e = c5297e3;
                    }
                } finally {
                }
            }
        }
        return c5297e3;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final Context getContext() {
        return Ka.I.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return Ka.I.h();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return Ka.I.B.getFirstExecutionService();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return Ka.I.m();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceNetworkContext getNetworkContext() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return Ka.I.j();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return Ka.I.s();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return Ka.I.v();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ModuleSelfReporter getSelfReporter() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    @NotNull
    public final ServiceModuleReporterComponentLifecycle getServiceModuleReporterComponentLifecycle() {
        return Ka.I.F;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceContext
    public final ServiceWakeLock getServiceWakeLock() {
        return this.d;
    }
}
