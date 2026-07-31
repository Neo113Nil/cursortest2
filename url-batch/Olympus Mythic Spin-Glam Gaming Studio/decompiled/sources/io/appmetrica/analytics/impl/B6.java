package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class B6 implements InterfaceC5617qb {
    public final C6 a;
    public final Sh b;

    public B6(@NotNull C6 c6) {
        this.a = c6;
        this.b = c6.a();
        C5661s4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5617qb
    public final void a(@NotNull C5421io c5421io) {
        Ji ji = this.a.a;
        Ih a = ji.a(c5421io, this.b);
        Sh sh = a.e;
        InterfaceC5368gm interfaceC5368gm = ji.e;
        if (interfaceC5368gm != null) {
            sh.b.setUuid(((C5342fm) interfaceC5368gm).g());
        } else {
            sh.getClass();
        }
        ji.c.b(a);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + c5421io, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Sh sh = this.b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (sh) {
                    W8 w8 = sh.c;
                    w8.b.b(w8.a, key, value);
                }
            }
        }
    }
}
