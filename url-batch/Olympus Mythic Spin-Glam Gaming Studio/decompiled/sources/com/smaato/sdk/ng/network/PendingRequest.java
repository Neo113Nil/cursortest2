package com.smaato.sdk.ng.network;

import java.util.Map;

/* loaded from: classes6.dex */
public class PendingRequest {
    private final String a;
    private final Map<String, String> b;
    private final String c;
    private final int d;
    private final int e;
    private int f = 1;
    private int g = 0;

    public PendingRequest(String str, String str2, Map<String, String> map, int i, int i2) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = i;
        this.e = i2;
    }

    public synchronized void countAttempt() {
        this.g--;
    }

    public synchronized void countRetry() {
        int i = this.e;
        int i2 = this.f;
        this.g = i * i2;
        this.f = i2 + 1;
    }

    public Map<String, String> getHeaders() {
        return this.b;
    }

    public String getPostBody() {
        return this.c;
    }

    public String getUrl() {
        return this.a;
    }

    public synchronized boolean isLimitReached() {
        return this.f > this.d;
    }

    public synchronized boolean shouldRetry() {
        return this.g <= 0;
    }
}
