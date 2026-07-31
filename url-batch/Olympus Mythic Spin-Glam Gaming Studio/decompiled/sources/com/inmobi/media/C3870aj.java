package com.inmobi.media;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3870aj {
    public final C4478xk a;
    public final double b;
    public final List c;

    public C3870aj(C4478xk telemetryConfigMetaData, double d, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.a = telemetryConfigMetaData;
        this.b = d;
        this.c = samplingEvents;
        Intrinsics.checkNotNullExpressionValue(C3870aj.class.getSimpleName(), "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C4478xk c4478xk = this.a;
        if (c4478xk.e && !c4478xk.f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !Intrinsics.areEqual(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (Intrinsics.areEqual("image", keyValueMap.get("assetType")) && !this.a.b) {
            C4425vk c4425vk = C4425vk.a;
            return false;
        }
        if (Intrinsics.areEqual("gif", keyValueMap.get("assetType")) && !this.a.c) {
            C4425vk c4425vk2 = C4425vk.a;
            return false;
        }
        if (!Intrinsics.areEqual("video", keyValueMap.get("assetType")) || this.a.d) {
            return true;
        }
        C4425vk c4425vk3 = C4425vk.a;
        return false;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (!this.c.contains(eventType)) {
            return 1;
        }
        if (this.b < this.a.g) {
            C4425vk c4425vk = C4425vk.a;
            return 2;
        }
        C4425vk c4425vk2 = C4425vk.a;
        return 0;
    }
}
