package com.pubmatic.sdk.common.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBNetworkResult;

/* loaded from: classes6.dex */
public class POBBidderResult<T extends POBAdDescriptor> {
    private POBAdResponse a;
    private POBError b;
    private POBNetworkResult c;

    @Nullable
    public POBAdResponse<T> getAdResponse() {
        return this.a;
    }

    @Nullable
    public POBError getError() {
        return this.b;
    }

    @Nullable
    public POBNetworkResult getNetworkResult() {
        return this.c;
    }

    public void setAdResponse(@Nullable POBAdResponse<T> pOBAdResponse) {
        this.a = pOBAdResponse;
    }

    public void setError(@Nullable POBError pOBError) {
        this.b = pOBError;
    }

    public void setNetworkResult(@Nullable POBNetworkResult pOBNetworkResult) {
        this.c = pOBNetworkResult;
    }

    @NonNull
    public String toString() {
        return "POBBidderResult{adResponse=" + this.a + ", error=" + this.b + ", networkResult=" + this.c + '}';
    }
}
