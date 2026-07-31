package com.vungle.ads.internal.load;

import com.vungle.ads.internal.network.VungleApiClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class k {
    public final VungleApiClient a;

    public k(VungleApiClient apiClient) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        this.a = apiClient;
    }

    public final void a(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.a.d(adm);
    }
}
