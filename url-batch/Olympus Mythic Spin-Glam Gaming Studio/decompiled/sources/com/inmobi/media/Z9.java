package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Z9 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CrashConfig) {
            Xa xa = AbstractC3861aa.d;
            CrashConfig crashConfig = (CrashConfig) config;
            xa.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
            xa.a = crashConfig;
            C3913ca c3913ca = xa.c;
            c3913ca.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "config");
            c3913ca.a.a = crashConfig.getCrashConfig().getSamplingPercent();
            c3913ca.b.a = crashConfig.getCatchConfig().getSamplingPercent();
            c3913ca.c.a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            c3913ca.d.a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            C4358t6 c4358t6 = xa.b;
            if (c4358t6 != null) {
                C4121k6 eventConfig = crashConfig.getEventConfig();
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c4358t6.i = eventConfig;
            }
            C5 c5 = AbstractC3861aa.c;
            if (c5 != null) {
                Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
                c5.a = crashConfig;
            }
        }
    }
}
