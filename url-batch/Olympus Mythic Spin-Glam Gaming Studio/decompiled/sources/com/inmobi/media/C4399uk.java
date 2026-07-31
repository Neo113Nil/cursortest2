package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4399uk implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig b = C4425vk.b();
            C4425vk.h = new Ik(new C4478xk(b.getEnabled(), b.getAssetReporting().isImageEnabled(), b.getAssetReporting().isGifEnabled(), b.getAssetReporting().isVideoEnabled(), b.getDisableAllGeneralEvents(), b.getPriorityEventsList(), b.getSamplingFactor()), CollectionsKt.toList(C4425vk.d));
            Ek ek = C4425vk.j;
            if (ek != null) {
                TelemetryConfig telemetryConfig = C4425vk.b();
                Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                ek.a = telemetryConfig;
            }
        }
    }
}
