package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5366gk extends AbstractC5700th {
    public C5366gk(@NonNull W6 w6) {
        super(w6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5700th, io.appmetrica.analytics.impl.InterfaceC5726uh
    public final boolean a(@Nullable Boolean bool) {
        return !this.a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
