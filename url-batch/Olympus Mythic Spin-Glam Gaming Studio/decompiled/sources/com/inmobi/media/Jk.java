package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Jk {
    public final C4478xk a;
    public final double b;

    public Jk(C4478xk telemetryConfigMetaData, double d) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.a = telemetryConfigMetaData;
        this.b = d;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.b >= this.a.g) {
            return 0;
        }
        C4425vk c4425vk = C4425vk.a;
        return 2;
    }
}
