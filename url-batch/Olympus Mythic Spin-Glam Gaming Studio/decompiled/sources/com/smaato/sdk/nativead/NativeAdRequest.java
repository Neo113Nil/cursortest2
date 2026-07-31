package com.smaato.sdk.nativead;

/* loaded from: classes12.dex */
public class NativeAdRequest {
    private final String adSpaceId;
    private final String mediationAdapterVersion;
    private final String mediationNetworkName;
    private final String mediationNetworkSdkVersion;
    private final boolean shouldFetchPrivacy;
    private final boolean shouldReturnUrlsForImageAssets;
    private final String uniqueUBId;

    private NativeAdRequest(String str, boolean z, String str2, boolean z2, String str3, String str4, String str5) {
        this.adSpaceId = str;
        this.shouldFetchPrivacy = z;
        this.uniqueUBId = str2;
        this.shouldReturnUrlsForImageAssets = z2;
        this.mediationAdapterVersion = str3;
        this.mediationNetworkName = str4;
        this.mediationNetworkSdkVersion = str5;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String adSpaceId() {
        return this.adSpaceId;
    }

    public boolean shouldFetchPrivacy() {
        return this.shouldFetchPrivacy;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.shouldReturnUrlsForImageAssets;
    }

    public String mediationAdapterVersion() {
        return this.mediationAdapterVersion;
    }

    public String mediationNetworkName() {
        return this.mediationNetworkName;
    }

    public String mediationNetworkSdkVersion() {
        return this.mediationNetworkSdkVersion;
    }

    public String uniqueUBId() {
        return this.uniqueUBId;
    }

    public static class Builder {
        private String adSpaceId;
        private String mediationAdapterVersion;
        private String mediationNetworkName;
        private String mediationNetworkSdkVersion;
        private boolean shouldFetchPrivacy;
        private boolean shouldReturnUrlsForImageAssets;
        private String uniqueUBId;

        public Builder adSpaceId(String str) {
            this.adSpaceId = str;
            return this;
        }

        public Builder shouldFetchPrivacy(boolean z) {
            this.shouldFetchPrivacy = z;
            return this;
        }

        public Builder uniqueUBId(String str) {
            this.uniqueUBId = str;
            return this;
        }

        public Builder shouldReturnUrlsForImageAssets(boolean z) {
            this.shouldReturnUrlsForImageAssets = z;
            return this;
        }

        public Builder mediationAdapterVersion(String str) {
            this.mediationAdapterVersion = str;
            return this;
        }

        public Builder mediationNetworkName(String str) {
            this.mediationNetworkName = str;
            return this;
        }

        public Builder mediationNetworkSdkVersion(String str) {
            this.mediationNetworkSdkVersion = str;
            return this;
        }

        public NativeAdRequest build() {
            return new NativeAdRequest(this.adSpaceId, this.shouldFetchPrivacy, this.uniqueUBId, this.shouldReturnUrlsForImageAssets, this.mediationAdapterVersion, this.mediationNetworkName, this.mediationNetworkSdkVersion);
        }
    }
}
