package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5722ud implements ModuleServiceLifecycleController {
    public final W1 a;

    public C5722ud(@NotNull W1 w1) {
        this.a = w1;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.a.b(new V1() { // from class: io.appmetrica.analytics.impl.ud$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.V1
            public final void a(Intent intent) {
                C5722ud.a(ModuleServiceLifecycleObserver.this, intent);
            }
        });
        this.a.a(new V1() { // from class: io.appmetrica.analytics.impl.ud$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.V1
            public final void a(Intent intent) {
                C5722ud.b(ModuleServiceLifecycleObserver.this, intent);
            }
        });
    }
}
