package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class POBBiddingManager extends POBBaseBidder<POBBid> implements POBBidderListener<POBBid> {
    private final POBBidding b;
    private POBAdResponse c;

    public POBBiddingManager(@NonNull POBBidding<POBBid> pOBBidding) {
        this.b = pOBBidding;
        pOBBidding.setBidderListener(this);
    }

    private void a(POBBidding pOBBidding) {
        String identifier = pOBBidding.getIdentifier();
        POBBidderResult pOBBidderResult = (POBBidderResult) pOBBidding.getBidderResults().get(identifier);
        ArrayList arrayList = new ArrayList();
        if (pOBBidderResult != null) {
            POBNetworkResult networkResult = pOBBidderResult.getNetworkResult();
            if (networkResult != null) {
                POBLog.info("POBBiddingManager", "Network result for bidder %s is : %s", identifier, networkResult);
            }
            POBAdResponse adResponse = pOBBidderResult.getAdResponse();
            if (adResponse != null) {
                arrayList.addAll(adResponse.getBids());
            }
        }
        if (this.bidderListener != null) {
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            POBAdResponse adResponse2 = this.b.getAdResponse() != null ? this.b.getAdResponse() : POBAdResponse.defaultResponse();
            List bids = adResponse2.getBids();
            POBBid pOBBid = null;
            if (adResponse2.isSendAllBidsEnabled()) {
                Iterator it = bids.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    POBBid pOBBid2 = (POBBid) it.next();
                    if (pOBBid2.isServerSideAuctionWinner()) {
                        pOBBid = pOBBid2;
                        break;
                    }
                }
                if (pOBBid == null && !bids.isEmpty()) {
                    pOBBid = (POBBid) bids.get(0);
                }
            } else if (!arrayList.isEmpty()) {
                pOBBid = (POBBid) arrayList.get(0);
            }
            if (pOBBid != null) {
                this.bidderListener.onBidsFetched(this, a(pOBBid, bids));
            } else {
                a();
            }
            arrayList.clear();
        }
    }

    @Nullable
    public static POBBid getWinningBid(@Nullable POBAdResponse<POBBid> pOBAdResponse) {
        if (pOBAdResponse != null) {
            return pOBAdResponse.getWinningBid();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.b.destroy();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        return this.b.getBidderResults();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFailed(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBError pOBError) {
        a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBidderListener
    public void onBidsFetched(@NonNull POBBidding<POBBid> pOBBidding, @NonNull POBAdResponse<POBBid> pOBAdResponse) {
        a(pOBBidding);
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.b.requestBid();
    }

    private POBAdResponse a(POBBid pOBBid, List list) {
        POBAdResponse.Builder builder = new POBAdResponse.Builder(list);
        builder.setWinningBid(pOBBid);
        POBAdResponse adResponse = this.b.getAdResponse();
        if (adResponse != null) {
            builder.setRefreshInterval(adResponse.getRefreshInterval());
            builder.setSendAllBidsState(adResponse.isSendAllBidsEnabled());
            builder.setNbrCode(adResponse.getNbrCode());
        } else {
            builder.setRefreshInterval(30);
        }
        builder.setServerSidePartnerBids(list);
        POBAdResponse build = builder.build();
        this.c = build;
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a() {
        String str;
        POBBidderListener<T> pOBBidderListener;
        POBBidderResult pOBBidderResult = (POBBidderResult) this.b.getBidderResults().get(this.b.getIdentifier());
        if (pOBBidderResult != null) {
            POBAdResponse adResponse = pOBBidderResult.getAdResponse();
            if (adResponse != null && adResponse.getNbrCode() != null) {
                str = POBLogConstants.MSG_NBR_ERROR_MESSAGE + adResponse.getNbrCode();
            } else if (pOBBidderResult.getError() != null) {
                str = String.format(" %s : %s", this.b.getIdentifier(), pOBBidderResult.getError().toString());
            }
            pOBBidderListener = this.bidderListener;
            if (pOBBidderListener == 0) {
                pOBBidderListener.onBidsFailed(this, new POBError(1002, str));
                return;
            }
            return;
        }
        str = POBLogConstants.MSG_NO_ADS_AVAILABLE_FROM_BIDDER_ERROR;
        pOBBidderListener = this.bidderListener;
        if (pOBBidderListener == 0) {
        }
    }
}
