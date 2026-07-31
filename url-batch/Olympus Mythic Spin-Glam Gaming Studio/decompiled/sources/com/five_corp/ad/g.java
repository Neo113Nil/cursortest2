package com.five_corp.ad;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class g implements com.five_corp.ad.internal.adselector.b {
    public final /* synthetic */ h a;
    public final /* synthetic */ i b;
    public final /* synthetic */ AdLoader c;

    public g(AdLoader adLoader, h hVar, i iVar) {
        this.c = adLoader;
        this.a = hVar;
        this.b = iVar;
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(com.five_corp.ad.internal.context.h hVar) {
        this.c.a(this.a, hVar);
    }

    @Override // com.five_corp.ad.internal.adselector.b
    public final void a(final FiveAdErrorCode fiveAdErrorCode) {
        Handler handler = this.c.h;
        final i iVar = this.b;
        handler.post(new Runnable() { // from class: com.five_corp.ad.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.this.onError(fiveAdErrorCode);
            }
        });
    }
}
