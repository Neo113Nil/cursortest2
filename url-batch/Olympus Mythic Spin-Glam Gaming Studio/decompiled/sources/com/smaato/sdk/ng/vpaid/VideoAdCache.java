package com.smaato.sdk.ng.vpaid;

import com.smaato.sdk.ng.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class VideoAdCache {
    private static final String c = "VideoAdCache";
    private final String b = "latestZoneId";
    private final Map<String, VideoAdCacheItem> a = new HashMap();

    public VideoAdCacheItem inspect(String str) {
        return this.a.get(str);
    }

    public VideoAdCacheItem inspectLatest() {
        return this.a.get("latestZoneId");
    }

    public void put(String str, VideoAdCacheItem videoAdCacheItem) {
        Logger.d(c, "VideoAdCache putting video for key: " + str);
        this.a.put(str, videoAdCacheItem);
        this.a.put("latestZoneId", videoAdCacheItem);
    }

    public VideoAdCacheItem remove(String str) {
        return this.a.remove(str);
    }
}
