package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.interfaces.a {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveAdRequest inneractiveAdRequest) {
        c cVar = this.a;
        cVar.e.adSpot = new k(cVar.c, ((com.fyber.inneractive.sdk.flow.k) cVar.b).c);
        e eVar = this.a.e;
        eVar.internalOnAdLoaded(eVar, eVar.adSpot);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.a.d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
    }
}
