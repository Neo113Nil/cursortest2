package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes9.dex */
public final class Sj implements InterfaceC5486lb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;

    public Sj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
