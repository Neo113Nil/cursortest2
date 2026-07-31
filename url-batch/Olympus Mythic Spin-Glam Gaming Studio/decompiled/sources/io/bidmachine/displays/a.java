package io.bidmachine.displays;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;

/* loaded from: classes3.dex */
class a extends AdObjectParams {
    a(Ad ad, HeaderBiddingAd headerBiddingAd) {
        super(ad);
        getData().putAll(headerBiddingAd.getClientParamsMap());
        getData().putAll(headerBiddingAd.getServerParamsMap());
    }

    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        return true;
    }
}
