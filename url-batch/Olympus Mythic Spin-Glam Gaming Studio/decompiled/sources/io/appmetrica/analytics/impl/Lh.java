package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes10.dex */
public final class Lh extends AbstractC5700th {
    public Lh(W6 w6) {
        super(w6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5700th, io.appmetrica.analytics.impl.InterfaceC5726uh
    public final boolean a(@Nullable Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
