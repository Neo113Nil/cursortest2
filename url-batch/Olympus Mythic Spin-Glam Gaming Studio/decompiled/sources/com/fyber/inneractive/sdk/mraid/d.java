package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.factories.a {
    public final /* synthetic */ IAMraidKit a;

    public d(IAMraidKit iAMraidKit) {
        this.a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final boolean a(InneractiveAdSpot inneractiveAdSpot) {
        boolean isMRaidSpotContent;
        isMRaidSpotContent = this.a.isMRaidSpotContent(inneractiveAdSpot);
        return isMRaidSpotContent;
    }

    @Override // com.fyber.inneractive.sdk.factories.a
    public final com.fyber.inneractive.sdk.interfaces.d a() {
        return new com.fyber.inneractive.sdk.renderers.n();
    }
}
