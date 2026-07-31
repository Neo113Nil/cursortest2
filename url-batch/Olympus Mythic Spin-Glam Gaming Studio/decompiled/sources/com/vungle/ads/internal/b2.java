package com.vungle.ads.internal;

/* loaded from: classes15.dex */
public final class b2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public b2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.signals.j(this.b.a);
    }
}
