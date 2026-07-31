package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ MarketplaceAdLoadListener a;
    public final /* synthetic */ com.fyber.inneractive.sdk.response.a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ InneractiveUnitController e;
    public final /* synthetic */ e f;

    public a(e eVar, MarketplaceAdLoadListener marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar, String str, Map map, InneractiveUnitController inneractiveUnitController) {
        this.f = eVar;
        this.a = marketplaceAdLoadListener;
        this.b = aVar;
        this.c = str;
        this.d = map;
        this.e = inneractiveUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.access$000(this.f, this.e, this.a, this.f.parseResponseData(this.a, this.b, this.c, this.d), this.f.getAdContentLoader(this.a, this.b));
    }
}
