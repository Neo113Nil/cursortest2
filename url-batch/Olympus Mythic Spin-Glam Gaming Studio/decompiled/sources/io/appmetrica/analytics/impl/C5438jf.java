package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5438jf implements IPluginReporter {
    public final C5516mf a = new C5516mf();
    public final C5542nf b = new C5542nf();
    public final IHandlerExecutor c = C5661s4.l().g().a();
    public final Provider d;

    public C5438jf(@NonNull Provider<InterfaceC5512mb> provider) {
        this.d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        C5516mf c5516mf = this.a;
        c5516mf.a.a(pluginErrorDetails);
        if (c5516mf.c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            this.b.getClass();
            this.c.execute(new RunnableC5387hf(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.a.a.a(pluginErrorDetails);
        this.b.getClass();
        this.c.execute(new RunnableC5361gf(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a.b.a(str);
        this.b.getClass();
        this.c.execute(new Cif(this, str, str2, pluginErrorDetails));
    }
}
