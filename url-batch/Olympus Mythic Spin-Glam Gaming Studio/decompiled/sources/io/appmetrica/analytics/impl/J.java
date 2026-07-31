package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes15.dex */
public final class J implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Ui b;
    public final /* synthetic */ K c;

    public J(K k, Context context, Ui ui) {
        this.c = k;
        this.a = context;
        this.b = ui;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.c.a.a(this.a, this.b);
    }
}
