package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdServerSignalingEventListener;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.nativead.POBDefaultNativeEventHandler;
import com.pubmatic.sdk.nativead.datatype.POBNativeTemplateType;
import com.pubmatic.sdk.nativead.response.POBNativeAdParser;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponse;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventHelper;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.video.POBVideoLogConstants;

/* loaded from: classes14.dex */
public class POBNativeAdManager implements POBAdServerSignalingEventListener, POBBidEvent {
    private final Context a;
    private final POBNativeTemplateType b;
    private final POBNativeAdEventBridge c;
    private POBNativeAdManagerListener d;
    private POBBiddingManager e;
    private POBAdResponse f;
    private POBBidEventListener g;
    private POBDataType.POBAdState h = POBDataType.POBAdState.DEFAULT;
    private String i;
    private c j;

    @MainThread
    public interface POBNativeAdManagerListener {
        void onAdReceived(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBNativeAd pOBNativeAd);

        void onFailedToLoad(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBError pOBError);
    }

    private class b implements POBBidderListener {
        private b() {
        }

        private void a(POBError pOBError, POBBidEventListener pOBBidEventListener) {
            POBNativeAdManager.this.h = POBDataType.POBAdState.BID_FAILED;
            POBLog.info("POBNativeAdManager", POBLogConstants.MSG_FMT_BID_EVENT_ERROR, pOBError.getErrorMessage());
            pOBBidEventListener.onBidFailed(POBNativeAdManager.this, pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.error("POBNativeAdManager", POBLogConstants.MSG_DEBUG_BIDS_FAILED, pOBError.getErrorMessage());
            if (POBNativeAdManager.this.g != null) {
                a(pOBError, POBNativeAdManager.this.g);
            } else if (POBNativeAdManager.this.c instanceof POBDefaultNativeEventHandler.POBDefaultNativeAdEventBridge) {
                POBNativeAdManager.this.a(pOBError);
            } else {
                POBNativeAdManager.this.a((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBNativeAdManager.this.f = POBAdsHelper.updateResponseUsingAdFormatType(pOBAdResponse, POBAdFormat.NATIVE);
            POBBid pOBBid = (POBBid) POBNativeAdManager.this.f.getWinningBid();
            if (pOBBid != null) {
                POBLog.debug("POBNativeAdManager", POBLogConstants.MSG_DEBUG_BIDS_FETCHED, pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBNativeAdManager.this.a).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            if (POBNativeAdManager.this.g == null) {
                POBNativeAdManager.this.a(pOBBid);
                return;
            }
            if (pOBBid == null || pOBBid.getStatus() != 1) {
                a(new POBError(1002, "No ads available"), POBNativeAdManager.this.g);
                return;
            }
            POBNativeAdManager.this.h = POBDataType.POBAdState.BID_RECEIVED;
            POBLog.debug("POBNativeAdManager", POBLogConstants.MSG_BID_EVENT_SHARING_BIDS, new Object[0]);
            POBNativeAdManager.this.g.onBidReceived(POBNativeAdManager.this, pOBBid);
        }
    }

    interface c {
        void onBidFailure(POBNativeAdManager pOBNativeAdManager);
    }

    public POBNativeAdManager(@NonNull Context context, @NonNull POBNativeTemplateType pOBNativeTemplateType, @NonNull POBNativeAdEventBridge pOBNativeAdEventBridge) {
        this.a = context;
        this.b = pOBNativeTemplateType;
        this.c = pOBNativeAdEventBridge;
        pOBNativeAdEventBridge.setSignalingEventListener(this);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.f);
    }

    @Override // com.pubmatic.sdk.common.POBAdServerSignalingEventListener
    @Nullable
    public POBBidsProvider getBidsProvider() {
        return this.f;
    }

    public void loadAd(@NonNull POBRequest pOBRequest, @Nullable POBProfileInfo pOBProfileInfo) {
        a(pOBRequest, pOBProfileInfo).requestBid();
    }

    @Override // com.pubmatic.sdk.common.POBAdServerSignalingEventListener
    public void onAdServerWin() {
        a((POBNativeAdResponse) null);
    }

    @Override // com.pubmatic.sdk.common.POBAdServerSignalingEventListener
    public void onFailed(@NonNull POBError pOBError) {
        a(pOBError);
    }

    @Override // com.pubmatic.sdk.common.POBAdServerSignalingEventListener
    public void onOpenWrapPartnerWin(@Nullable String str) {
        POBAdResponse pOBAdResponse = this.f;
        if (pOBAdResponse != null) {
            POBBid pOBBid = (POBBid) pOBAdResponse.getBid(str);
            if (pOBBid == null) {
                POBLog.debug("POBNativeAdManager", "bidId is invalid in onOpenWrapPartnerWin", new Object[0]);
            } else if (pOBBid != this.f.getWinningBid()) {
                POBAdResponse.Builder builder = new POBAdResponse.Builder(this.f);
                builder.updateWinningBid(pOBBid);
                this.f = builder.build();
            }
            a();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        if (this.g == null) {
            POBLog.warn("POBNativeAdManager", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return;
        }
        POBDataType.POBAdState pOBAdState = this.h;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBNativeAdManager", POBLogConstants.MSG_NATIVE_AD_PROCEED_WARNING, new Object[0]);
            return;
        }
        POBLog.info("POBNativeAdManager", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_ON_ERROR, new Object[0]);
        if (!(this.c instanceof POBDefaultNativeEventHandler.POBDefaultNativeAdEventBridge)) {
            b();
            return;
        }
        POBLog.info("POBNativeAdManager", POBVideoLogConstants.INFO_MSG_BID_EVENT_PROCEED_ON_ERROR_CODE_AND_MSG, bidEventError, str);
        this.h = POBDataType.POBAdState.DEFAULT;
        c cVar = this.j;
        if (cVar != null) {
            cVar.onBidFailure(this);
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        if (this.g == null) {
            POBLog.warn("POBNativeAdManager", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return false;
        }
        POBDataType.POBAdState pOBAdState = this.h;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBNativeAdManager", POBLogConstants.MSG_NATIVE_AD_PROCEED_WARNING, new Object[0]);
            return false;
        }
        POBLog.info("POBNativeAdManager", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_TO_LOAD, new Object[0]);
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f);
        if (winningBid == null || !winningBid.isExpired()) {
            POBLog.debug("POBNativeAdManager", POBLogConstants.MSG_PROCEEDING_WITH_BID, new Object[0]);
            a(winningBid);
            return true;
        }
        POBLog.info("POBNativeAdManager", POBVideoLogConstants.MSG_BID_EXPIRED, new Object[0]);
        POBError convertToPOBError = POBBidEventHelper.convertToPOBError(POBBidEvent.BidEventError.BID_EXPIRED);
        if (this.c instanceof POBDefaultNativeEventHandler.POBDefaultNativeAdEventBridge) {
            a(convertToPOBError);
            return false;
        }
        POBLog.warn("POBNativeAdManager", POBLogConstants.MSG_AD_EXPIRED_PROCEEDING_IGNORING_OPENWRAP_BID, new Object[0]);
        b();
        return true;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.g = pOBBidEventListener;
    }

    public void setListener(@Nullable POBNativeAdManagerListener pOBNativeAdManagerListener) {
        this.d = pOBNativeAdManagerListener;
    }

    private void b(POBError pOBError) {
        POBLog.error("POBNativeAdManager", POBLogConstants.MSG_FAILED_TO_LOAD + pOBError, new Object[0]);
        POBNativeAdManagerListener pOBNativeAdManagerListener = this.d;
        if (pOBNativeAdManagerListener != null) {
            pOBNativeAdManagerListener.onFailedToLoad(this, pOBError);
        }
    }

    public void loadAd(@NonNull String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        pOBExtBidHandler.setBidderListener(new b());
        pOBExtBidHandler.requestBid();
    }

    private void b() {
        POBAdResponse pOBAdResponse = this.f;
        if (pOBAdResponse != null) {
            this.f = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        POBLog.info("POBNativeAdManager", "Proceeding with bid. Ad server integration is " + this.c.getClass().getSimpleName(), new Object[0]);
        a((POBBid) null);
    }

    void a(c cVar) {
        this.j = cVar;
    }

    void a(String str) {
        this.i = str;
    }

    private POBBidding a(POBRequest pOBRequest, POBProfileInfo pOBProfileInfo) {
        if (this.e == null) {
            this.e = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.a, pOBRequest, pOBProfileInfo));
            this.e.setBidderListener(new b());
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        this.h = POBDataType.POBAdState.DEFAULT;
        b(pOBError);
    }

    private void a(POBNativeAdResponse pOBNativeAdResponse) {
        this.h = POBDataType.POBAdState.DEFAULT;
        POBNativeAdProvider pOBNativeAdProvider = new POBNativeAdProvider(this.a, this.b, this.c);
        POBAdResponse pOBAdResponse = this.f;
        if (pOBAdResponse != null) {
            pOBNativeAdProvider.setBid((POBBid) pOBAdResponse.getWinningBid());
        }
        pOBNativeAdProvider.a(this.i);
        pOBNativeAdProvider.setNativeAdResponse(pOBNativeAdResponse);
        POBNativeAdManagerListener pOBNativeAdManagerListener = this.d;
        if (pOBNativeAdManagerListener != null) {
            pOBNativeAdManagerListener.onAdReceived(this, pOBNativeAdProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBBid pOBBid) {
        Trace.endSection();
        this.h = POBDataType.POBAdState.LOADING;
        this.c.requestAd(pOBBid);
    }

    private void a() {
        POBError pOBError;
        POBBid winningBid = POBBiddingManager.getWinningBid(this.f);
        if (winningBid != null) {
            winningBid.setHasWon(true);
            POBNativeAdParser pOBNativeAdParser = new POBNativeAdParser();
            String renderableContent = winningBid.getRenderableContent();
            if (renderableContent != null) {
                try {
                    a(pOBNativeAdParser.parseNativeAdResponse(renderableContent));
                    return;
                } catch (Exception e) {
                    pOBError = new POBError(1007, String.format(POBNativeLogConstants.NATIVE_INVALID_RESPONSE, e.getMessage()));
                }
            } else {
                pOBError = new POBError(1007, POBNativeLogConstants.NATIVE_EMPTY_RESPONSE);
            }
        } else {
            pOBError = new POBError(1006, POBLogConstants.MSG_INTERNAL_NATIVE_ERROR);
        }
        a(pOBError);
    }
}
