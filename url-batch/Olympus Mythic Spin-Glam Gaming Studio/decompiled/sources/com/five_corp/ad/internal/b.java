package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdCustomLayoutEventListener;
import com.five_corp.ad.FiveAdErrorCode;

/* loaded from: classes3.dex */
public final class b implements f {
    public final /* synthetic */ FiveAdCustomLayoutEventListener a;
    public final /* synthetic */ FiveAdCustomLayout b;

    public b(FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener, FiveAdCustomLayout fiveAdCustomLayout) {
        this.a = fiveAdCustomLayoutEventListener;
        this.b = fiveAdCustomLayout;
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
