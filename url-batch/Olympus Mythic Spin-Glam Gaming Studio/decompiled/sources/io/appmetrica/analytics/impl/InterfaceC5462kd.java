package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC5462kd extends Id {
    @NotNull
    List<ModuleServicesDatabase> a();

    @NotNull
    /* synthetic */ Map b();

    @NotNull
    /* synthetic */ Map c();

    @NotNull
    List<Consumer<Location>> d();

    @Nullable
    ModuleLocationSourcesServiceController e();

    @Nullable
    Toggle f();

    @NotNull
    /* synthetic */ List g();
}
