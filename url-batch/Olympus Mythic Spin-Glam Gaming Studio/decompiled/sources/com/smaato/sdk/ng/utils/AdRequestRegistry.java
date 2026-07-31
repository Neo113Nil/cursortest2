package com.smaato.sdk.ng.utils;

/* loaded from: classes10.dex */
public class AdRequestRegistry {
    private static final AdRequestRegistry b = new AdRequestRegistry();
    private RequestItem a;

    public static final class RequestItem {
        private final String a;
        private final String b;
        private final String c;
        private final long d;

        public RequestItem(String str, String str2, long j) {
            this(str, null, str2, j);
        }

        public long getLatency() {
            return this.d;
        }

        public String getPostParams() {
            return this.b;
        }

        public String getResponse() {
            return this.c;
        }

        public String getUrl() {
            return this.a;
        }

        public RequestItem(String str, String str2, String str3, long j) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
        }
    }

    private AdRequestRegistry() {
    }

    public static AdRequestRegistry getInstance() {
        return b;
    }

    public RequestItem getLastAdRequest() {
        return this.a;
    }

    public void setLastAdRequest(String str, String str2, long j) {
        this.a = new RequestItem(str, str2, j);
    }

    public void setLastAdRequest(String str, String str2, String str3, long j) {
        this.a = new RequestItem(str, str3, str2, j);
    }
}
