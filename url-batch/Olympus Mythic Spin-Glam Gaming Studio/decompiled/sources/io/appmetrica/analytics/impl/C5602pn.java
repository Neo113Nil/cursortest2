package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5602pn extends K4 {
    public final Cdo g;

    public C5602pn(@NonNull String str, @NonNull String str2, @NonNull Cdo cdo, @NonNull Ko ko, @NonNull W2 w2) {
        super(0, str, str2, ko, w2);
        this.g = cdo;
    }

    @Override // io.appmetrica.analytics.impl.K4
    public final void a(@NonNull C5811xo c5811xo) {
        String str = (String) this.g.a((String) this.f);
        c5811xo.d.a = str == null ? new byte[0] : str.getBytes();
    }

    @VisibleForTesting
    public final Cdo h() {
        return this.g;
    }
}
