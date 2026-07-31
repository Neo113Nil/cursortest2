package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes3.dex */
public final class y1 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public y1(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new PathProvider(this.b.a);
    }
}
