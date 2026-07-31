package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5221b4 implements X5 {
    public final Context a;
    public final C5197a6 b = new C5197a6(new C5818y5());
    public final C5713u4 c = new C5713u4(C5661s4.l().b(getContext()));
    public final C5772wb d = new C5772wb();
    public final C5552o e = C5661s4.l().a();
    public final Z3 f = new Z3();
    public final C5488ld g = new C5488ld();
    public final C5195a4 h = new C5195a4();

    public C5221b4(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.X5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final Z5 getModuleAdRevenueContext() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.b;
    }
}
