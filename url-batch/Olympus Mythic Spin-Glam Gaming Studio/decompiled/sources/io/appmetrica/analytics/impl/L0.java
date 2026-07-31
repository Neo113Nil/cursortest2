package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class L0 implements AppMetricaPlugins {
    public final N0 a;

    public L0(@NotNull N0 n0) {
        this.a = n0;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        this.a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
        this.a.a(pluginErrorDetails);
    }

    public L0() {
        this(new N0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(@NotNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a.a(str, str2, pluginErrorDetails);
    }
}
