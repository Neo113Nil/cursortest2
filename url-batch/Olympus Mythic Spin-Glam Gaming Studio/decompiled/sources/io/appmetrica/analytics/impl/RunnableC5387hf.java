package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5387hf implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5438jf c;

    public RunnableC5387hf(C5438jf c5438jf, PluginErrorDetails pluginErrorDetails, String str) {
        this.c = c5438jf;
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC5512mb) this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}
