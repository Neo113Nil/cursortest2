package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Bo implements Bm {
    public final UtilityServiceProvider a;

    public Bo(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.Bm
    public final void a(@NotNull C5783wm c5783wm) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(c5783wm.v, c5783wm.u));
    }
}
