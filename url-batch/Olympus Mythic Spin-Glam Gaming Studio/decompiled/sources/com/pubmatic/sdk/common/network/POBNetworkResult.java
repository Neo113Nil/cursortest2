package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes4.dex */
public class POBNetworkResult {
    private final Map a;
    private final long b;

    public POBNetworkResult(@NonNull Map<String, String> map, long j) {
        this.a = map;
        this.b = j;
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.a;
    }

    public long getNetworkTimeMs() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "POBNetworkResult{ networkTimeMs=" + this.b + '}';
    }
}
