package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Me extends Kh {
    public final Wf e;

    public Me(@NotNull C5631r0 c5631r0, @Nullable InterfaceC5704tl interfaceC5704tl, @NotNull Wf wf) {
        super(c5631r0, interfaceC5704tl);
        this.e = wf;
    }

    @Override // io.appmetrica.analytics.impl.Kh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Wf wf = this.e;
        synchronized (wf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", wf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
