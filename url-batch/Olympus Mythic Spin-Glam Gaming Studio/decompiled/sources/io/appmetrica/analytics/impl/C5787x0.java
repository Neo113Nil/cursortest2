package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5787x0 implements InterfaceC5202ab {
    public final Handler a;
    public final IHandlerExecutor b;
    public final C5739v4 c;

    public C5787x0() {
        IHandlerExecutor a = C5661s4.l().g().a();
        this.b = a;
        this.a = a.getHandler();
        this.c = new C5739v4();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull InterfaceC5564ob interfaceC5564ob) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NonNull
    public final Handler b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NonNull
    public final C5322f2 c() {
        return new C5322f2();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NonNull
    public final Gb d() {
        return new Gb();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5202ab
    @NonNull
    public final C5739v4 a() {
        return this.c;
    }
}
