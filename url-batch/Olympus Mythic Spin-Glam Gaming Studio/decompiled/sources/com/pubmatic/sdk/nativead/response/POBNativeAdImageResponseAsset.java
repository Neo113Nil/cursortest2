package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;

/* loaded from: classes5.dex */
public class POBNativeAdImageResponseAsset extends POBNativeAdResponseAsset {
    private final String d;
    private final int e;
    private final int f;
    private final POBNativeImageAssetType g;

    public POBNativeAdImageResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse, @NonNull String str, int i2, int i3, @Nullable POBNativeImageAssetType pOBNativeImageAssetType) {
        super(i, z, pOBNativeAdLinkResponse);
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = pOBNativeImageAssetType;
    }

    public int getHeight() {
        return this.f;
    }

    @NonNull
    public String getImageURL() {
        return this.d;
    }

    @Nullable
    public POBNativeImageAssetType getType() {
        return this.g;
    }

    public int getWidth() {
        return this.e;
    }

    @Override // com.pubmatic.sdk.nativead.response.POBNativeAdResponseAsset
    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink() + "\nImageUrl: " + this.d + "\nWidth: " + this.e + "\nHeight: " + this.f + "\nType: " + this.g;
    }
}
