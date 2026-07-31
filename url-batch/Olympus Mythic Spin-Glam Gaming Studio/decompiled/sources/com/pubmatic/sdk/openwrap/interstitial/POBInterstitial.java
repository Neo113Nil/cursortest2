package com.pubmatic.sdk.openwrap.interstitial;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.ironsource.X3;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidding;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.ui.POBFullScreenRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventHelper;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@MainThread
/* loaded from: classes14.dex */
public class POBInterstitial implements POBBidEvent {
    private final Context a;
    private final POBFullScreenRendererListener b;
    private final Map c;
    private POBBaseBidder d;
    private POBInterstitialEvent e;
    private POBFullScreenAdInteractionListener f;
    private POBInterstitialListener g;
    private POBVideoListener h;
    private POBInterstitialRendering i;
    private POBDataType.POBAdState j;
    private int k;
    private POBVideoAdEventListener l;
    private POBRequest m;
    private POBTimeoutHandler n;
    private POBBidEventListener o;
    private boolean p;
    private POBAdResponse q;
    private POBCacheManager r;
    private Map s;
    private boolean t;
    private POBBiddingHost u;

    @MainThread
    public static class POBInterstitialListener {
        public void onAdClicked(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdClosed(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdExpired(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdFailedToLoad(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
        }

        public void onAdFailedToShow(@NonNull POBInterstitial pOBInterstitial, @NonNull POBError pOBError) {
        }

        public void onAdImpression(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdOpened(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAdReceived(@NonNull POBInterstitial pOBInterstitial) {
        }

        public void onAppLeaving(@NonNull POBInterstitial pOBInterstitial) {
        }
    }

    public static class POBVideoListener {
        public void onVideoPlaybackCompleted(@NonNull POBInterstitial pOBInterstitial) {
        }
    }

    class a implements OpenWrapSDKInitializer.Listener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBInterstitial.this.p = true;
            POBLog.error("POBInterstitial", "%s%s", POBLogConstants.SDK_INITIALIZATION_FAILED, pOBError);
            if (POBInterstitial.this.j == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.a(pOBError, true);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBInterstitial.this.p = true;
            POBLog.verbose("POBInterstitial", POBLogConstants.SDK_INITIALIZATION_SUCCESS, new Object[0]);
            if (POBInterstitial.this.j == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.k();
                POBInterstitial.this.d();
            }
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBInterstitial.this.j == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBInterstitial.this.d();
            }
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBDataType.POBAdState.values().length];
            a = iArr;
            try {
                iArr[POBDataType.POBAdState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBDataType.POBAdState.LOAD_DEFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBDataType.POBAdState.SHOWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBDataType.POBAdState.READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBDataType.POBAdState.AD_SERVER_READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[POBDataType.POBAdState.BID_RECEIVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[POBDataType.POBAdState.BID_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class d implements POBBidderListener {
        private d() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.debug("POBInterstitial", POBLogConstants.MSG_DEBUG_BIDS_FAILED, pOBError);
            if (POBInterstitial.this.o != null) {
                POBInterstitial.this.j = POBDataType.POBAdState.BID_FAILED;
                POBLog.info("POBInterstitial", POBLogConstants.MSG_FMT_BID_EVENT_ERROR, pOBError.getErrorMessage());
                POBInterstitial.this.o.onBidFailed(POBInterstitial.this, pOBError);
                return;
            }
            if (POBInterstitial.this.e instanceof POBDefaultInterstitialEventHandler) {
                POBInterstitial.this.a(pOBError, true);
            } else {
                POBInterstitial.this.b((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBInterstitial.this.q = POBAdsHelper.updateResponseUsingAdFormatType(pOBAdResponse, POBAdFormat.INTERSTITIAL);
            POBBid pOBBid = (POBBid) POBInterstitial.this.q.getWinningBid();
            if (pOBBid != null) {
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_DEBUG_BIDS_FETCHED, pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBInterstitial.this.a).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            if (POBInterstitial.this.o == null) {
                POBInterstitial.this.b(pOBBid);
                return;
            }
            if (pOBBid != null && pOBBid.getStatus() == 1) {
                POBInterstitial.this.j = POBDataType.POBAdState.BID_RECEIVED;
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_BID_EVENT_SHARING_BIDS, new Object[0]);
                POBInterstitial.this.o.onBidReceived(POBInterstitial.this, pOBBid);
                return;
            }
            POBInterstitial.this.j = POBDataType.POBAdState.BID_FAILED;
            POBError pOBError = new POBError(1002, "No ads available");
            POBLog.info("POBInterstitial", POBLogConstants.MSG_FMT_BID_EVENT_ERROR, pOBError.getErrorMessage());
            POBInterstitial.this.o.onBidFailed(POBInterstitial.this, pOBError);
        }

        /* synthetic */ d(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class e implements POBFullScreenRendererListener {
        private e() {
        }

        private void a(POBError pOBError) {
            if (POBInterstitial.this.f != null) {
                POBInterstitial.this.f.trackAdFailed(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdClicked() {
            POBInterstitial.this.e();
            if (POBInterstitial.this.f != null) {
                POBInterstitial.this.f.trackClick();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdExpired() {
            POBError pOBError = new POBError(1011, "Ad Expired");
            POBInterstitial.this.a();
            a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdImpression() {
            if (POBInterstitial.this.t) {
                return;
            }
            POBAdsHelper.recordImpressionDepth(POBInterstitial.this.a, POBAdFormat.INTERSTITIAL);
            POBInterstitial.this.g();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdInteractionStarted() {
            POBInterstitial.this.h();
            if (POBInterstitial.this.t) {
                POBAdsHelper.recordImpressionDepth(POBInterstitial.this.a, POBAdFormat.INTERSTITIAL);
                POBInterstitial.this.g();
            }
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.q);
            if (POBInterstitial.this.f != null) {
                if (winningBid != null && winningBid.isVideo()) {
                    POBInterstitial.this.f.trackImpression();
                }
                POBInterstitial.this.f.trackAdShown();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdInteractionStopped() {
            POBInterstitial.this.f();
            if (POBInterstitial.this.f != null) {
                POBInterstitial.this.f.trackAdDismissed();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdRender(POBAdDescriptor pOBAdDescriptor) {
            POBLog.info("POBInterstitial", hashCode() + " : ******** onAdRender() ********", new Object[0]);
            POBInterstitial.this.b();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.q);
            if (POBInterstitial.this.f == null || winningBid == null || winningBid.isVideo()) {
                return;
            }
            POBInterstitial.this.f.trackImpression();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdRenderingFailed(POBError pOBError) {
            boolean z = (POBInterstitial.this.j == POBDataType.POBAdState.SHOWING || POBInterstitial.this.j == POBDataType.POBAdState.SHOWN) ? false : true;
            a(pOBError);
            POBInterstitial.this.a(pOBError, z);
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdUnload() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onLeavingApplication() {
            POBInterstitial.this.j();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onRenderProcessGone() {
            POBInterstitial.this.j = POBDataType.POBAdState.DEFAULT;
        }

        /* synthetic */ e(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class f implements POBInterstitialEventListener {
        private f() {
        }

        private void a() {
            POBLog.debug("POBInterstitial", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.q);
            if (winningBid != null) {
                winningBid.setHasWon(true);
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
                String partnerName = winningBid.getPartnerName();
                if (POBInterstitial.this.e != null && partnerName != null) {
                    POBInterstitial pOBInterstitial = POBInterstitial.this;
                    pOBInterstitial.i = pOBInterstitial.e.getRenderer(partnerName);
                }
                if (POBInterstitial.this.i == null) {
                    POBInterstitial pOBInterstitial2 = POBInterstitial.this;
                    pOBInterstitial2.i = pOBInterstitial2.a(winningBid);
                }
                if (POBInterstitial.this.u == POBBiddingHost.ADMOB && (POBInterstitial.this.s.get(POBConstants.KEY_POB_ADMOB_WATERMARK) instanceof String)) {
                    POBInterstitial.this.i.setWatermark(POBInterstitial.this.s.get(POBConstants.KEY_POB_ADMOB_WATERMARK).toString());
                }
                POBInterstitial.this.i.setAdRendererListener(POBInterstitial.this.b);
                POBInterstitial.this.i.setVideoAdEventListener(POBInterstitial.this.l);
                if (winningBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBInterstitial.this.a).saveRenderedBid(winningBid.getRawBid());
                }
                POBInterstitial.this.i.renderAd(winningBid);
            }
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public POBBidsProvider getBidsProvider() {
            return POBInterstitial.this.q;
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public Map getCustomData() {
            return POBInterstitial.this.c;
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBInterstitial.this.e();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBInterstitial.this.f();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onAdExpired() {
            POBInterstitial.this.a();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBInterstitial.this.g();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBInterstitial.this.j();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBInterstitial.this.h();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onAdServerWin() {
            Trace.endSection();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBInterstitial.this.q);
            if (winningBid != null) {
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            } else {
                POBLog.debug("POBInterstitial", "AdServerWin", new Object[0]);
            }
            POBInterstitial.this.j = POBDataType.POBAdState.AD_SERVER_READY;
            POBInterstitial.this.b();
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onFailedToLoad(POBError pOBError) {
            POBInterstitial.this.a(pOBError, true);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onFailedToShow(POBError pOBError) {
            POBInterstitial.this.j = POBDataType.POBAdState.DEFAULT;
            POBInterstitial.this.b(pOBError);
        }

        @Override // com.pubmatic.sdk.openwrap.interstitial.POBInterstitialEventListener
        public void onOpenWrapPartnerWin(String str) {
            if (POBInterstitial.this.q != null) {
                POBBid pOBBid = (POBBid) POBInterstitial.this.q.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder updateWinningBid = new POBAdResponse.Builder(POBInterstitial.this.q).updateWinningBid(pOBBid);
                    POBInterstitial.this.q = updateWinningBid.build();
                } else {
                    POBLog.debug("POBInterstitial", POBLogConstants.MSG_INVALID_BIDID, new Object[0]);
                }
            }
            a();
        }

        /* synthetic */ f(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    private class g implements POBVideoAdEventListener {
        private g() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBVideoAdEventListener
        public void onVideoAdEvent(POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
            POBLog.debug("POBInterstitial", "Interstitial Video Ad event: " + pOBVideoAdEventType, new Object[0]);
            if (POBInterstitial.this.h == null || POBDataType.POBVideoAdEventType.COMPLETE != pOBVideoAdEventType) {
                return;
            }
            POBInterstitial.this.h.onVideoPlaybackCompleted(POBInterstitial.this);
        }

        /* synthetic */ g(POBInterstitial pOBInterstitial, a aVar) {
            this();
        }
    }

    public POBInterstitial(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        this(context, str, i, str2, new POBDefaultInterstitialEventHandler());
    }

    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (POBConstants.KEY_POB_ADMOB_WATERMARK.equals(str) && (obj instanceof String)) {
            this.s.put(str, obj);
        } else {
            POBLog.warn("POBInterstitial", "Received invalid key %s for extra info", str);
        }
    }

    public void destroy() {
        POBBaseBidder pOBBaseBidder = this.d;
        if (pOBBaseBidder != null) {
            pOBBaseBidder.destroy();
            this.d = null;
        }
        k();
        this.j = POBDataType.POBAdState.DEFAULT;
        POBInterstitialRendering pOBInterstitialRendering = this.i;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
        }
        POBInterstitialEvent pOBInterstitialEvent = this.e;
        if (pOBInterstitialEvent != null) {
            pOBInterstitialEvent.destroy();
        }
        this.h = null;
        this.g = null;
        this.l = null;
    }

    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.m;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBInterstitial", POBLogConstants.MSG_AD_OBJECT_INVALID, new Object[0]);
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.q);
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.m);
    }

    public boolean isReady() {
        return this.j.equals(POBDataType.POBAdState.READY) || this.j.equals(POBDataType.POBAdState.AD_SERVER_READY);
    }

    @RequiresPermission
    public void loadAd() {
        Trace.beginSection("POB Interstitial Load Ad");
        Trace.beginSection("POB Request Building");
        POBImpression impression = getImpression();
        if (this.m == null || impression == null) {
            a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
            POBLog.error("POBInterstitial", POBLogConstants.MSG_MISSING_INPUT_PARAMS, new Object[0]);
            return;
        }
        switch (c.a[this.j.ordinal()]) {
            case 1:
            case 2:
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
                return;
            case 3:
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_AD_SHOWING, new Object[0]);
                return;
            case 4:
            case 5:
                POBLog.error("POBInterstitial", POBLogConstants.MSG_AD_LOADED_ERROR, new Object[0]);
                b();
                return;
            case 6:
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_BID_EVENT_SHARING_BIDS, new Object[0]);
                POBBid bid = getBid();
                if (this.o != null && bid != null && !bid.isExpired()) {
                    this.o.onBidReceived(this, bid);
                    return;
                } else {
                    POBLog.info("POBInterstitial", POBLogConstants.MSG_AD_EXPIRED_ERROR, new Object[0]);
                    break;
                }
        }
        if (this.p) {
            d();
        } else {
            this.j = POBDataType.POBAdState.LOAD_DEFERRED;
            l();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        if (this.o == null) {
            POBLog.warn("POBInterstitial", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return;
        }
        POBDataType.POBAdState pOBAdState = this.j;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBInterstitial", POBLogConstants.WARN_MSG_BID_EVENT_INVALID_STATE, new Object[0]);
            return;
        }
        POBLog.info("POBInterstitial", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_ON_ERROR, new Object[0]);
        if (!(this.e instanceof POBDefaultInterstitialEventHandler)) {
            c();
        } else {
            POBLog.info("POBInterstitial", POBVideoLogConstants.INFO_MSG_BID_EVENT_PROCEED_ON_ERROR_CODE_AND_MSG, bidEventError, str);
            this.j = POBDataType.POBAdState.DEFAULT;
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        if (this.o == null) {
            POBLog.warn("POBInterstitial", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return false;
        }
        POBDataType.POBAdState pOBAdState = this.j;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBInterstitial", POBLogConstants.MSG_BID_NOT_RECEIVED_WARNING, new Object[0]);
            return false;
        }
        POBLog.info("POBInterstitial", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_TO_LOAD, new Object[0]);
        POBBid winningBid = POBBiddingManager.getWinningBid(this.q);
        if (winningBid == null || !winningBid.isExpired()) {
            POBLog.debug("POBInterstitial", POBLogConstants.MSG_PROCEEDING_WITH_BID, new Object[0]);
            this.j = POBDataType.POBAdState.LOADING;
            b(winningBid);
            return true;
        }
        POBError convertToPOBError = POBBidEventHelper.convertToPOBError(POBBidEvent.BidEventError.BID_EXPIRED);
        if (this.e instanceof POBDefaultInterstitialEventHandler) {
            a(convertToPOBError, true);
            return false;
        }
        POBLog.warn("POBInterstitial", POBLogConstants.MSG_AD_EXPIRED_PROCEEDING_IGNORING_OPENWRAP_BID, new Object[0]);
        c();
        return true;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.o = pOBBidEventListener;
    }

    public void setListener(@Nullable POBInterstitialListener pOBInterstitialListener) {
        this.g = pOBInterstitialListener;
    }

    public void setVideoListener(@Nullable POBVideoListener pOBVideoListener) {
        this.h = pOBVideoListener;
    }

    public void show() {
        POBInterstitialRendering pOBInterstitialRendering;
        if (this.e != null && this.j.equals(POBDataType.POBAdState.AD_SERVER_READY)) {
            this.j = POBDataType.POBAdState.SHOWING;
            this.e.show();
        } else if (!isReady() || (pOBInterstitialRendering = this.i) == null) {
            b(this.j.equals(POBDataType.POBAdState.EXPIRED) ? new POBError(1011, POBLogConstants.MSG_AD_EXPIRED_ERROR) : this.j.equals(POBDataType.POBAdState.SHOWN) ? new POBError(2001, POBLogConstants.MSG_AD_ALREADY_SHOWN_ERROR) : new POBError(2002, POBLogConstants.MSG_AD_NOT_READY_ERROR));
        } else {
            this.j = POBDataType.POBAdState.SHOWING;
            pOBInterstitialRendering.show(this.k);
        }
    }

    public POBInterstitial(@NonNull Context context) {
        this(context, new POBDefaultInterstitialEventHandler());
    }

    private void c() {
        this.j = POBDataType.POBAdState.LOADING;
        POBAdResponse pOBAdResponse = this.q;
        if (pOBAdResponse != null) {
            this.q = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        if (this.e != null) {
            POBLog.info("POBInterstitial", "Proceeding with bid. Ad server integration is " + this.e.getClass().getSimpleName(), new Object[0]);
        }
        b((POBBid) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBLog.info("POBInterstitial", POBLogConstants.MSG_REQUESTING_LOAD, this.j);
        this.q = null;
        if (this.m != null) {
            POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.a.getApplicationContext());
            POBImpression impression = getImpression();
            if (impression != null) {
                this.j = POBDataType.POBAdState.LOADING;
                POBAdsHelper.updateAppInstallStatusSignals(this.a.getApplicationContext(), impression);
                impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
                impression.setBanner(new POBBanner(interstitialAdSize));
                int deviceOrientation = POBUtils.getDeviceOrientation(this.a.getApplicationContext());
                this.k = deviceOrientation;
                this.c.put(X3.i.n, Integer.valueOf(deviceOrientation));
                a(this.m).requestBid();
                return;
            }
        }
        a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.j = POBDataType.POBAdState.SHOWN;
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdClosed(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdOpened(this);
        }
    }

    private void i() {
        Trace.endSection();
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAppLeaving(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.n;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.n = null;
    }

    private void l() {
        POBLog.debug("POBInterstitial", POBLogConstants.MSG_SCHEDULE_LOAD_AD_DELAY, new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.n = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    public POBInterstitial(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBInterstitialEvent pOBInterstitialEvent) {
        this(context, pOBInterstitialEvent);
        a(context, str, i, str2, pOBInterstitialEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBError pOBError) {
        POBLog.error("POBInterstitial", POBLogConstants.MSG_FAILED_TO_SHOW + pOBError, new Object[0]);
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdFailedToShow(this, pOBError);
        }
    }

    private POBInterstitial(Context context, POBInterstitialEvent pOBInterstitialEvent) {
        this.p = false;
        this.s = Collections.synchronizedMap(new HashMap());
        this.u = POBBiddingHost.UNKNOWN;
        this.a = context;
        this.j = POBDataType.POBAdState.DEFAULT;
        this.c = new HashMap();
        a aVar = null;
        this.b = new e(this, aVar);
        this.l = new g(this, aVar);
        if (pOBInterstitialEvent != null) {
            this.e = pOBInterstitialEvent;
            pOBInterstitialEvent.setEventListener(new f(this, aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBBid pOBBid) {
        if (this.e != null) {
            Trace.endSection();
            this.e.requestAd(pOBBid);
            this.f = this.e.getAdInteractionListener();
            return;
        }
        POBLog.warn("POBInterstitial", POBLogConstants.MSG_FAILED_BID_EVENT, new Object[0]);
    }

    private void a(Context context, String str, int i, String str2, POBInterstitialEvent pOBInterstitialEvent) {
        if (POBAdsHelper.validate(context, str, str2, pOBInterstitialEvent)) {
            if (!this.p) {
                OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i)))).build(), new a());
            }
            POBAdFormat pOBAdFormat = POBAdFormat.INTERSTITIAL;
            this.m = POBRequest.createInstance(str, i, pOBAdFormat, POBAdsHelper.createFullScreenImpression(context, str2, pOBAdFormat));
            this.r = POBInstanceProvider.getCacheManager(context.getApplicationContext());
            return;
        }
        POBLog.error("POBInterstitial", "%s", new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.j != POBDataType.POBAdState.AD_SERVER_READY) {
            this.j = POBDataType.POBAdState.READY;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError, boolean z) {
        this.j = POBDataType.POBAdState.DEFAULT;
        if (z) {
            a(pOBError);
        } else {
            b(pOBError);
        }
    }

    private void a(POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBInterstitial", POBLogConstants.MSG_FAILED_TO_LOAD + pOBError, new Object[0]);
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdFailedToLoad(this, pOBError);
        }
    }

    private POBBidding a(POBRequest pOBRequest) {
        POBProfileInfo pOBProfileInfo;
        if (this.d == null) {
            a aVar = null;
            if (this.r != null) {
                pOBProfileInfo = this.r.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
            } else {
                pOBProfileInfo = null;
            }
            this.d = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.a, pOBRequest, pOBProfileInfo));
            this.d.setBidderListener(new d(this, aVar));
        }
        return this.d;
    }

    private POBBaseBidder a(String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.d = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new d(this, null));
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.j = POBDataType.POBAdState.EXPIRED;
        POBInterstitialRendering pOBInterstitialRendering = this.i;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
            this.i = null;
        }
        POBInterstitialListener pOBInterstitialListener = this.g;
        if (pOBInterstitialListener != null) {
            pOBInterstitialListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBInterstitialRendering a(POBBid pOBBid) {
        return POBRenderer.getInterstitialRenderer(this.a.getApplicationContext(), pOBBid);
    }

    @RequiresPermission
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        if (pOBBiddingHost == null) {
            a(new POBError(1001, POBLogConstants.MSG_INVALID_BIDDING_HOST));
            return;
        }
        this.u = pOBBiddingHost;
        this.t = true;
        if (!POBUtils.isNullOrEmpty(str)) {
            Trace.beginSection("POB Interstitial Load Ad");
            Trace.beginSection("POB Response Parsing");
            int i = c.a[this.j.ordinal()];
            if (i == 1) {
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
                return;
            }
            if (i == 3) {
                POBLog.debug("POBInterstitial", POBLogConstants.MSG_AD_SHOWING, new Object[0]);
                return;
            }
            if (i != 4) {
                this.j = POBDataType.POBAdState.LOADING;
                POBBaseBidder a2 = a(str);
                this.d = a2;
                a2.requestBid();
                return;
            }
            POBLog.error("POBInterstitial", POBLogConstants.MSG_AD_LOADED_ERROR, new Object[0]);
            b();
            return;
        }
        a(new POBError(1007, POBLogConstants.MSG_MISSING_BID_RESPONSE));
        POBLog.error("POBInterstitial", POBLogConstants.MSG_MISSING_BID_RESPONSE, new Object[0]);
    }
}
