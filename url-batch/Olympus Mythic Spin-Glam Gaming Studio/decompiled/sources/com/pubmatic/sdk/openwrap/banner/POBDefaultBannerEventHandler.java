package com.pubmatic.sdk.openwrap.banner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.openwrap.core.POBBid;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class POBDefaultBannerEventHandler extends POBBannerEvent {
    private POBAdSize[] a;
    private POBBannerEventListener b;

    public POBDefaultBannerEventHandler(@NonNull POBAdSize... pOBAdSizeArr) {
        this.a = pOBAdSizeArr;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.b = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.b != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.b.onOpenWrapPartnerWin(pOBBid.getId());
            } else {
                this.b.onFailed(prepareErrorFromResponse(this.b.getBidsProvider()));
            }
        }
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    @Nullable
    public POBAdSize[] requestedAdSizes() {
        POBAdSize[] pOBAdSizeArr = this.a;
        if (pOBAdSizeArr != null) {
            return (POBAdSize[]) Arrays.copyOf(pOBAdSizeArr, pOBAdSizeArr.length);
        }
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.banner.POBBannerEvent
    public void setEventListener(@NonNull POBBannerEventListener pOBBannerEventListener) {
        this.b = pOBBannerEventListener;
    }

    public POBDefaultBannerEventHandler() {
    }
}
