package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes9.dex */
public final class Rj implements InterfaceC5486lb {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;

    public Rj(PluginErrorDetails pluginErrorDetails, String str) {
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.getPluginExtension().reportError(this.a, this.b);
    }
}
