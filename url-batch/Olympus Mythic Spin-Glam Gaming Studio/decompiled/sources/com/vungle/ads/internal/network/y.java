package com.vungle.ads.internal.network;

/* loaded from: classes6.dex */
public final class y implements a {
    public final /* synthetic */ com.vungle.ads.internal.w a;

    public y(com.vungle.ads.internal.y yVar) {
        this.a = yVar;
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(o oVar) {
        this.a.onSuccess();
    }

    @Override // com.vungle.ads.internal.network.a
    public final void a(Throwable th) {
        this.a.a();
    }
}
