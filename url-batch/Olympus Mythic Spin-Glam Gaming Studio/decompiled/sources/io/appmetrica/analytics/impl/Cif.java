package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes14.dex */
public final class Cif implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;
    public final /* synthetic */ C5438jf d;

    public Cif(C5438jf c5438jf, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.d = c5438jf;
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC5512mb) this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
