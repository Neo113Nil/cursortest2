package com.smaato.sdk.core.ad;

/* loaded from: classes4.dex */
public class AdRequestParams {
    private final String uniqueUBId;

    private AdRequestParams(String str) {
        this.uniqueUBId = str;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUBUniqueId() {
        return this.uniqueUBId;
    }

    public Builder newBuilder() {
        return builder().setUBUniqueId(getUBUniqueId());
    }

    public static class Builder {
        private String uniqueUBId;

        public Builder setUBUniqueId(String str) {
            this.uniqueUBId = str;
            return this;
        }

        public AdRequestParams build() {
            return new AdRequestParams(this.uniqueUBId);
        }
    }
}
