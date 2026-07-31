package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.p0;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.g
    public final void i() {
        com.vungle.ads.internal.model.i k;
        h0 h0Var = this.n;
        List list = (h0Var == null || (k = h0Var.k()) == null) ? null : k.q;
        if (list == null || !list.isEmpty()) {
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new m(d()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) lazy.getValue()).a(new p((String) it.next()).b("win-notification").a(e()).a(), false);
                }
            }
        }
    }

    @Override // com.vungle.ads.internal.load.g
    public final void k() {
        p0 a = b().a();
        if (a == null) {
            a(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.q()) {
            try {
                String b = a.b();
                boolean z = u.a;
                t.a("RTA_DEBUGGER", String.valueOf(b));
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new l(d()));
                if (b != null) {
                    new k((VungleApiClient) lazy.getValue()).a(b);
                }
            } catch (Throwable unused) {
            }
        }
        h0 a2 = a.a();
        Integer c = a.c();
        if (c == null || c.intValue() != 2 || a2 == null) {
            a(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
        } else {
            a(a2, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
