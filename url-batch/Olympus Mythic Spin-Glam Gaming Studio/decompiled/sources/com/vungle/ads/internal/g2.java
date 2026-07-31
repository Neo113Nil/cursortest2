package com.vungle.ads.internal;

/* loaded from: classes15.dex */
public final class g2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public g2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.platform.c(this.b.a, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).e);
    }
}
