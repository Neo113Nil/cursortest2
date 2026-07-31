package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes13.dex */
public final class Zo implements Consumer {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ String b = "WebView interface setup failed because of an exception.";

    public Zo(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.a, this.b, new Object[0]);
    }
}
