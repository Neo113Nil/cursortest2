package io.bidmachine.media3.datasource.cache;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.cache.Cache;

@UnstableApi
/* loaded from: classes9.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j, long j2);

    boolean requiresCacheSpanTouches();
}
