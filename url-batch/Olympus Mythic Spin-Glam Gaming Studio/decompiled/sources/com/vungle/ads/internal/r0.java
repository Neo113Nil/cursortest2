package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class r0 implements com.vungle.ads.internal.network.a {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Context b;

    public r0(Context context, q2 q2Var) {
        this.a = q2Var;
        this.b = context;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(com.vungle.ads.internal.network.o oVar) {
        if (oVar != null && oVar.c() && oVar.a() != null) {
            ConfigManager.INSTANCE.a(this.b, (com.vungle.ads.internal.model.v2) oVar.a(), false, new m2(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
            this.a.invoke(Boolean.TRUE);
        } else {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("config API: ");
            a.append(oVar != null ? Integer.valueOf(oVar.b()) : null);
            new APIFailedStatusCodeError(a.toString()).logErrorNoReturnValue$vungle_ads_release();
            this.a.invoke(Boolean.FALSE);
        }
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Error while fetching config: ");
        a.append(th != null ? th.getMessage() : null);
        new NetworkUnreachable(a.toString()).logErrorNoReturnValue$vungle_ads_release();
        this.a.invoke(Boolean.FALSE);
    }
}
