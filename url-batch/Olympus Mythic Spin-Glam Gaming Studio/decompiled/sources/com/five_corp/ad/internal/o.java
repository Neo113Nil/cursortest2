package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;

/* loaded from: classes3.dex */
public final class o implements p {
    public final /* synthetic */ FiveAdVideoRewardEventListener a;
    public final /* synthetic */ FiveAdVideoReward b;

    public o(FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener, FiveAdVideoReward fiveAdVideoReward) {
        this.a = fiveAdVideoRewardEventListener;
        this.b = fiveAdVideoReward;
    }

    @Override // com.five_corp.ad.internal.p
    public final void a() {
        this.a.onReward(this.b);
    }

    @Override // com.five_corp.ad.internal.p
    public final void b() {
        this.a.onFullScreenOpen(this.b);
    }

    @Override // com.five_corp.ad.internal.p
    public final void c() {
        this.a.onFullScreenClose(this.b);
    }
}
