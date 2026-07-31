package com.five_corp.ad.internal;

import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.FiveAdNative;
import com.five_corp.ad.FiveAdNativeEventListener;

/* loaded from: classes3.dex */
public final class e implements f {
    public final /* synthetic */ FiveAdNativeEventListener a;
    public final /* synthetic */ FiveAdNative b;

    public e(FiveAdNativeEventListener fiveAdNativeEventListener, FiveAdNative fiveAdNative) {
        this.a = fiveAdNativeEventListener;
        this.b = fiveAdNative;
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
