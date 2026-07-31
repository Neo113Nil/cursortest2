package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;

/* loaded from: classes15.dex */
public final class h implements com.vungle.ads.internal.ui.view.f {
    public final /* synthetic */ l a;
    public final /* synthetic */ Lazy b;

    public h(l lVar, Lazy lazy) {
        this.a = lVar;
        this.b = lazy;
    }

    @Override // com.vungle.ads.internal.ui.view.f
    public final void close() {
        com.vungle.ads.internal.presenter.r rVar = this.a.a;
        Long l = (rVar == null || rVar.j) ? null : 1L;
        if (l != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION, l.longValue(), this.a.e, null, 8);
        }
        r3 r3Var = this.a.b;
        if (r3Var != null) {
            l.a(this.b).b(r3Var);
        }
        this.a.finish();
    }
}
