package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC5358gc extends InterfaceC5435jc, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.InterfaceC5435jc
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.InterfaceC5435jc
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.InterfaceC5435jc
    /* synthetic */ void a(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5435jc
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.InterfaceC5435jc
    /* synthetic */ void init();
}
