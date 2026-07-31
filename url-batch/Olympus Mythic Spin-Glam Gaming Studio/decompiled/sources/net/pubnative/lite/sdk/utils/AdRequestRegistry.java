package net.pubnative.lite.sdk.utils;

/* loaded from: classes.dex */
public class AdRequestRegistry {
    private static final AdRequestRegistry INSTANCE = new AdRequestRegistry();
    private RequestItem mLastAdRequest;

    public static final class RequestItem {
        private final long mLatency;
        private final String mPostParams;
        private final String mResponse;
        private final String mUrl;

        public RequestItem(String str, String str2, long j) {
            this(str, null, str2, j);
        }

        public long getLatency() {
            return this.mLatency;
        }

        public String getPostParams() {
            return this.mPostParams;
        }

        public String getResponse() {
            return this.mResponse;
        }

        public String getUrl() {
            return this.mUrl;
        }

        public RequestItem(String str, String str2, String str3, long j) {
            this.mUrl = str;
            this.mPostParams = str2;
            this.mResponse = str3;
            this.mLatency = j;
        }
    }

    private AdRequestRegistry() {
    }

    public static AdRequestRegistry getInstance() {
        return INSTANCE;
    }

    public RequestItem getLastAdRequest() {
        return this.mLastAdRequest;
    }

    public void setLastAdRequest(String str, String str2, long j) {
        this.mLastAdRequest = new RequestItem(str, str2, j);
    }

    public void setLastAdRequest(String str, String str2, String str3, long j) {
        this.mLastAdRequest = new RequestItem(str, str3, str2, j);
    }
}
