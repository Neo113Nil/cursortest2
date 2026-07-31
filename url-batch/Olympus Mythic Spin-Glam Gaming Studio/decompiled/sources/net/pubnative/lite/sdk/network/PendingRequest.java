package net.pubnative.lite.sdk.network;

import java.util.Map;

/* loaded from: classes15.dex */
public class PendingRequest {
    private final Map<String, String> headers;
    private final int maxRetries;
    private final int multiplier;
    private final String postBody;
    private final String url;
    private int retryCount = 1;
    private int offset = 0;

    public PendingRequest(String str, String str2, Map<String, String> map, int i, int i2) {
        this.url = str;
        this.headers = map;
        this.postBody = str2;
        this.maxRetries = i;
        this.multiplier = i2;
    }

    public synchronized void countAttempt() {
        this.offset--;
    }

    public synchronized void countRetry() {
        int i = this.multiplier;
        int i2 = this.retryCount;
        this.offset = i * i2;
        this.retryCount = i2 + 1;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getPostBody() {
        return this.postBody;
    }

    public String getUrl() {
        return this.url;
    }

    public synchronized boolean isLimitReached() {
        return this.retryCount > this.maxRetries;
    }

    public synchronized boolean shouldRetry() {
        return this.offset <= 0;
    }
}
