package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.j
    public final com.vungle.ads.internal.network.m a(String placement, VungleAdSize vungleAdSize) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return h().a(placement, vungleAdSize, b().b());
    }

    @Override // com.vungle.ads.internal.load.j
    public final String l() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.g
    public final VungleError a(h0 adPayload) {
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        VungleError a = super.a(adPayload);
        if (a != null) {
            return a;
        }
        if (adPayload.m() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }
}
