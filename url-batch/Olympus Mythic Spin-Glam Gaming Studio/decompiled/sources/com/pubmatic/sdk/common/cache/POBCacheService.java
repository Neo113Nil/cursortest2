package com.pubmatic.sdk.common.cache;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class POBCacheService {
    private static POBCacheService b;
    private final Map a = Collections.synchronizedMap(new HashMap());

    private POBCacheService() {
    }

    @NonNull
    public static synchronized POBCacheService getInstance() {
        POBCacheService pOBCacheService;
        synchronized (POBCacheService.class) {
            try {
                if (b == null) {
                    b = new POBCacheService();
                }
                pOBCacheService = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pOBCacheService;
    }

    @NonNull
    public <T> Map<String, T> getService(@NonNull String str) {
        Map<String, T> map;
        try {
            map = (Map) this.a.get(str);
        } catch (Exception unused) {
            POBLog.error("POBCacheService", "Couldn't find cache for - %s", str);
            map = null;
        }
        if (map != null) {
            return map;
        }
        Map<String, T> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.a.put(str, synchronizedMap);
        return synchronizedMap;
    }
}
