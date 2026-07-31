package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes15.dex */
public final class I implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ K b;

    public I(K k, Context context) {
        this.b = k;
        this.a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.b.a.a(this.a);
    }
}
