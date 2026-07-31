package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public class Yg extends Kh {
    public final Ih e;

    public Yg(@NotNull C5631r0 c5631r0, @Nullable InterfaceC5704tl interfaceC5704tl, @NotNull Ih ih) {
        super(c5631r0, interfaceC5704tl);
        this.e = ih;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@Nullable Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Ih ih = this.e;
        iAppMetricaService.reportData(ih.c, ih.a.d(ih.e.c()));
    }
}
