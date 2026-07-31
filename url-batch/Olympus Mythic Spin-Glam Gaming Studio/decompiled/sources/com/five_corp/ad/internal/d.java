package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;

/* loaded from: classes3.dex */
public final class d implements f {
    public final /* synthetic */ FiveAdVideoRewardEventListener a;
    public final /* synthetic */ FiveAdVideoReward b;

    public d(FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener, FiveAdVideoReward fiveAdVideoReward) {
        this.a = fiveAdVideoRewardEventListener;
        this.b = fiveAdVideoReward;
    }

    @Override // com.five_corp.ad.internal.f
    public final void a() {
        this.a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void b() {
        this.a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void c() {
        this.a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void d() {
        this.a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void e() {
        this.a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.f
    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        this.a.onViewError(this.b, fiveAdErrorCode);
    }
}
