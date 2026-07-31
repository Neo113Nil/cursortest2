package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3913ca {
    public final C3922cj a;
    public final C3922cj b;
    public final C3922cj c;
    public final C3922cj d;

    public C3913ca(CrashConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = new C3922cj(config.getCrashConfig().getSamplingPercent());
        this.b = new C3922cj(config.getCatchConfig().getSamplingPercent());
        this.c = new C3922cj(config.getAnr().getWatchdog().getSamplingPercent());
        this.d = new C3922cj(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
