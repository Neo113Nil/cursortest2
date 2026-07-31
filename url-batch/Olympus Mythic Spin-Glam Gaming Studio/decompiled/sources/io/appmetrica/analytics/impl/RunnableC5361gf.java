package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5361gf implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ C5438jf b;

    public RunnableC5361gf(C5438jf c5438jf, PluginErrorDetails pluginErrorDetails) {
        this.b = c5438jf;
        this.a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC5512mb) this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}
