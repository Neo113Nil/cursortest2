package com.pubmatic.sdk.nativead.response;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public class POBNativeAdResponseAsset {
    private final int a;
    private final boolean b;
    private final POBNativeAdLinkResponse c;

    public POBNativeAdResponseAsset(int i, boolean z, @Nullable POBNativeAdLinkResponse pOBNativeAdLinkResponse) {
        this.a = i;
        this.b = z;
        this.c = pOBNativeAdLinkResponse;
    }

    public int getAssetId() {
        return this.a;
    }

    @Nullable
    public POBNativeAdLinkResponse getLink() {
        return this.c;
    }

    public boolean isRequired() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "Asset-Id: " + getAssetId() + "\nRequired: " + isRequired() + "\nLink: " + getLink();
    }
}
