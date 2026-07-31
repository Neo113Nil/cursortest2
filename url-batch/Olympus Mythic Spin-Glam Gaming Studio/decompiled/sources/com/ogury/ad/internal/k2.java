package com.ogury.ad.internal;

import com.ogury.core.internal.network.HeadersLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class k2 implements HeadersLoader {
    @Override // com.ogury.core.internal.network.HeadersLoader
    @NotNull
    public Map<String, String> loadHeaders() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Accept-Encoding", "gzip");
        linkedHashMap.put("Content-Encoding", "gzip");
        return linkedHashMap;
    }
}
