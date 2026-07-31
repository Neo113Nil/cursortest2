package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.POBBid;

/* loaded from: classes15.dex */
public class POBDefaultInterstitialEventHandler extends POBInterstitialEvent {
    private POBInterstitialEventListener a;

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void destroy() {
        this.a = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseEvent
    public void requestAd(@Nullable POBBid pOBBid) {
        if (this.a != null) {
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                this.a.onOpenWrapPartnerWin(pOBBid.getId());
            } else {
                this.a.onFailedToLoad(prepareErrorFromResponse(this.a.getBidsProvider()));
            }
        }
    }

    @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEvent
    public void setEventListener(@NonNull POBInterstitialEventListener pOBInterstitialEventListener) {
        this.a = pOBInterstitialEventListener;
    }
}
