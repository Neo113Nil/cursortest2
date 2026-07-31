package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5316em implements S6 {
    public final /* synthetic */ StartupParamsCallback a;
    public final /* synthetic */ C5342fm b;

    public C5316em(C5342fm c5342fm, StartupParamsCallback startupParamsCallback) {
        this.b = c5342fm;
        this.a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.S6
    public final void a(int i, Bundle bundle) {
        this.b.b(bundle, this.a);
    }
}
