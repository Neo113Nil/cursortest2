package com.ysocorp.ysonetwork.device.metricsCollectors;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public class YNSessionUuidCollector {

    @NonNull
    private final UUID uuid = UUID.randomUUID();

    public String getSessionUuid() {
        return this.uuid.toString().toLowerCase(Locale.ROOT);
    }
}
