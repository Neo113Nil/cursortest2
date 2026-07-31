package com.vungle.ads.internal.load;

import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.o;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i implements com.vungle.ads.internal.network.a {
    public final /* synthetic */ j a;
    public final /* synthetic */ i3 b;

    public i(j jVar, i3 i3Var) {
        this.a = jVar;
        this.b = i3Var;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(final o oVar) {
        final j jVar = this.a;
        com.vungle.ads.internal.executor.j jVar2 = ((com.vungle.ads.internal.executor.d) jVar.c).b;
        final i3 i3Var = this.b;
        jVar2.execute(new Runnable() { // from class: com.vungle.ads.internal.load.i$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                i.a(j.this, i3Var, oVar);
            }
        });
    }

    public static final void a(j this$0, i3 placement, o oVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placement, "$placement");
        if (this$0.h().b(placement.b()) > 0) {
            this$0.a(new AdRetryError().setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        if (oVar != null && !oVar.c()) {
            this$0.a(new APIFailedStatusCodeError(this$0.l() + " API: " + oVar.b()).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        h0 h0Var = oVar != null ? (h0) oVar.a() : null;
        if ((h0Var != null ? h0Var.c() : null) == null) {
            this$0.a(new AdResponseEmptyError(this$0.l() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
            return;
        }
        this$0.a(h0Var, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(final Throwable th) {
        final j jVar = this.a;
        ((com.vungle.ads.internal.executor.d) jVar.c).b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.a(j.this, th);
            }
        });
    }

    public static final void a(j this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(j.a(this$0, th).setLogEntry$vungle_ads_release(this$0.e()).logError$vungle_ads_release());
    }
}
