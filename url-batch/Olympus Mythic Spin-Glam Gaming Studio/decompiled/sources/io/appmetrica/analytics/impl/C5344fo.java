package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.fo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5344fo extends Kh {
    public final int e;
    public final Bundle f;

    public C5344fo(@NotNull C5631r0 c5631r0, @Nullable InterfaceC5704tl interfaceC5704tl, int i, @NotNull Bundle bundle) {
        super(c5631r0, interfaceC5704tl);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}
