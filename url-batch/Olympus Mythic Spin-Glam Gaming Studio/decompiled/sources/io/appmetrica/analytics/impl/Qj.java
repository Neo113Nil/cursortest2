package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Qj implements InterfaceC5486lb {
    public final /* synthetic */ PluginErrorDetails a;

    public Qj(PluginErrorDetails pluginErrorDetails) {
        this.a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.getPluginExtension().reportUnhandledException(this.a);
    }
}
