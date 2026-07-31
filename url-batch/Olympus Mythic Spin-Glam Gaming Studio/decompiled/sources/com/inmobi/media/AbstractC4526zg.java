package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4526zg {
    public static final C3922cj a;

    static {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        a = new C3922cj(1 - ((TelemetryConfig) AbstractC4015g4.a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (Intrinsics.areEqual(eventType, "PingDBMaxLimitReached")) {
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(eventType, keyValueMap, EnumC4530zk.a);
            return;
        }
        if (a.a()) {
            double d = 1;
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            C4277q4 c4277q42 = AbstractC4015g4.a;
            double pingSamplingFactor = d - ((TelemetryConfig) c4277q42.a(TelemetryConfig.class)).getPingSamplingFactor();
            Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d - ((TelemetryConfig) c4277q42.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * 100)));
            C4425vk c4425vk2 = C4425vk.a;
            C4425vk.b(eventType, keyValueMap, EnumC4530zk.a);
        }
    }
}
