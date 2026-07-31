package com.pubmatic.sdk.rewardedad;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
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
import com.pubmatic.sdk.common.cache.POBCacheService;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.ui.POBCoreReward;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener;
import com.pubmatic.sdk.common.ui.POBRewardedAdRendering;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBidEvent;
import com.pubmatic.sdk.openwrap.core.POBBidEventHelper;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBReward;
import com.pubmatic.sdk.openwrap.core.POBRewardedAdInteractionListener;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.rewarded.POBSkipConfirmationInfo;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHostKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@MainThread
/* loaded from: classes14.dex */
public class POBRewardedAd implements POBBidEvent {
    private POBBaseBidder a;
    private final POBRewardedAdEvent b;
    private POBRewardedAdInteractionListener c;
    private POBRewardedAdListener d;
    private POBRewardedAdRendering e;
    private POBDataType.POBAdState f;
    private final POBRewardedAdEventListener g;
    private final Context h;
    private POBBidEventListener i;
    private POBRequest j;
    private POBTimeoutHandler k;
    private boolean l;
    private POBAdResponse m;
    private POBSkipConfirmationInfo n;
    private Map o;
    private ConcurrentHashMap p;
    private POBCacheManager q;
    private POBBiddingHost r;

    @MainThread
    public static class POBRewardedAdListener {
        public void onAdClicked(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdClosed(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdExpired(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdFailedToLoad(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
        }

        public void onAdFailedToShow(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBError pOBError) {
        }

        public void onAdImpression(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdOpened(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAdReceived(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onAppLeaving(@NonNull POBRewardedAd pOBRewardedAd) {
        }

        public void onReceiveReward(@NonNull POBRewardedAd pOBRewardedAd, @NonNull POBReward pOBReward) {
        }
    }

    class a implements OpenWrapSDKInitializer.Listener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBRewardedAd.this.l = true;
            POBLog.error("POBRewardedAd", POBLogConstants.SDK_INITIALIZATION_FAILED + pOBError, new Object[0]);
            if (POBRewardedAd.this.f == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBRewardedAd.this.l = true;
            POBLog.verbose("POBRewardedAd", POBLogConstants.SDK_INITIALIZATION_SUCCESS, new Object[0]);
            if (POBRewardedAd.this.f == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.k();
                POBRewardedAd.this.d();
            }
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            if (POBRewardedAd.this.f == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBRewardedAd.this.d();
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
                a[POBDataType.POBAdState.SHOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBDataType.POBAdState.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBDataType.POBAdState.AD_SERVER_READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBDataType.POBAdState.BID_RECEIVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[POBDataType.POBAdState.BID_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[POBDataType.POBAdState.EXPIRED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[POBDataType.POBAdState.SHOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private class d implements POBBidderListener {
        private d() {
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding pOBBidding, POBError pOBError) {
            POBLog.debug("POBRewardedAd", POBLogConstants.MSG_DEBUG_BIDS_FAILED, pOBError);
            if (POBRewardedAd.this.i != null) {
                POBLog.info("POBRewardedAd", POBLogConstants.MSG_FMT_BID_EVENT_ERROR, pOBError.getErrorMessage());
                POBRewardedAd.this.f = POBDataType.POBAdState.BID_FAILED;
                POBRewardedAd.this.i.onBidFailed(POBRewardedAd.this, pOBError);
                return;
            }
            if (POBRewardedAd.this.b instanceof POBDefaultRewardedAdEventHandler) {
                POBRewardedAd.this.a(pOBError);
            } else {
                POBRewardedAd.this.b((POBBid) null);
            }
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFetched(POBBidding pOBBidding, POBAdResponse pOBAdResponse) {
            POBRewardedAd.this.m = POBAdsHelper.updateResponseUsingAdFormatType(pOBAdResponse, POBAdFormat.REWARDEDAD);
            POBBid pOBBid = (POBBid) POBRewardedAd.this.m.getWinningBid();
            if (pOBBid != null) {
                POBLog.debug("POBRewardedAd", POBLogConstants.MSG_DEBUG_BIDS_FETCHED, pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
                if (pOBBid.getRawBid() != null) {
                    POBInstanceProvider.getCacheManager(POBRewardedAd.this.h).saveReceivedBid(pOBBid.getRawBid());
                }
            }
            if (POBRewardedAd.this.i == null) {
                POBRewardedAd.this.b(pOBBid);
                return;
            }
            if (pOBBid == null || pOBBid.getStatus() != 1) {
                POBRewardedAd.this.f = POBDataType.POBAdState.BID_FAILED;
                POBRewardedAd.this.i.onBidFailed(POBRewardedAd.this, new POBError(1002, "No ads available"));
            } else {
                POBRewardedAd.this.f = POBDataType.POBAdState.BID_RECEIVED;
                POBLog.debug("POBRewardedAd", POBLogConstants.MSG_BID_EVENT_SHARING_BIDS, new Object[0]);
                POBRewardedAd.this.i.onBidReceived(POBRewardedAd.this, pOBBid);
            }
        }

        /* synthetic */ d(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private class e implements POBRewardedAdEventListener {
        private e() {
        }

        private void a() {
            POBLog.debug("POBRewardedAd", "PartnerBidWin", new Object[0]);
            POBBid winningBid = POBBiddingManager.getWinningBid(POBRewardedAd.this.m);
            if (winningBid == null || POBRewardedAd.this.b == null) {
                return;
            }
            winningBid.setHasWon(true);
            POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            String partnerName = winningBid.getPartnerName();
            if (partnerName != null) {
                POBRewardedAd pOBRewardedAd = POBRewardedAd.this;
                pOBRewardedAd.e = pOBRewardedAd.b.getRenderer(partnerName);
            }
            if (POBRewardedAd.this.e == null) {
                POBRewardedAd pOBRewardedAd2 = POBRewardedAd.this;
                pOBRewardedAd2.e = pOBRewardedAd2.a(winningBid);
            }
            POBRewardedAd.this.e.setAdRendererListener(new f(POBRewardedAd.this, null));
            if (POBBiddingHostKt.isAdMob(POBRewardedAd.this.r)) {
                Object valueFromMap = POBUtils.getValueFromMap(POBRewardedAd.this.p, POBConstants.KEY_POB_ADMOB_WATERMARK);
                if (valueFromMap instanceof String) {
                    POBRewardedAd.this.e.setWatermark((String) valueFromMap);
                } else {
                    POBLog.warn("POBRewardedAd", POBLogConstants.MSG_WATERMARK_PASSED_ERROR, new Object[0]);
                }
            }
            if (winningBid.getRawBid() != null) {
                POBInstanceProvider.getCacheManager(POBRewardedAd.this.h).saveRenderedBid(winningBid.getRawBid());
            }
            POBRewardedAd.this.e.renderAd(winningBid);
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public POBBidsProvider getBidsProvider() {
            return POBRewardedAd.this.m;
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClick() {
            POBRewardedAd.this.e();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdClosed() {
            POBRewardedAd.this.f();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onAdExpired() {
            POBRewardedAd.this.a();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdImpression() {
            POBRewardedAd.this.g();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdLeftApplication() {
            POBRewardedAd.this.j();
        }

        @Override // com.pubmatic.sdk.openwrap.core.POBAdEventListener
        public void onAdOpened() {
            POBRewardedAd.this.h();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onAdServerWin() {
            POBLog.debug("POBRewardedAd", "AdServerWin", new Object[0]);
            Trace.endSection();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBRewardedAd.this.m);
            if (winningBid != null) {
                POBUtils.logBidWinningStatus(winningBid.hasWon(), winningBid.getPartnerName());
            } else {
                POBLog.debug("POBRewardedAd", "AdServerWin", new Object[0]);
            }
            POBRewardedAd.this.f = POBDataType.POBAdState.AD_SERVER_READY;
            POBRewardedAd.this.b();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onFailedToLoad(POBError pOBError) {
            POBRewardedAd.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onFailedToShow(POBError pOBError) {
            POBRewardedAd.this.c(pOBError);
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onOpenWrapPartnerWin(String str) {
            if (POBRewardedAd.this.m != null) {
                POBBid pOBBid = (POBBid) POBRewardedAd.this.m.getBid(str);
                if (pOBBid != null) {
                    POBAdResponse.Builder builder = new POBAdResponse.Builder(POBRewardedAd.this.m);
                    builder.updateWinningBid(pOBBid);
                    POBRewardedAd.this.m = builder.build();
                } else {
                    POBLog.debug("POBRewardedAd", POBLogConstants.MSG_INVALID_BIDID, new Object[0]);
                }
            }
            a();
        }

        @Override // com.pubmatic.sdk.rewardedad.POBRewardedAdEventListener
        public void onReceiveReward(POBReward pOBReward) {
            POBRewardedAd.this.a(pOBReward);
        }

        /* synthetic */ e(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private class f implements POBRewardedAdRendererListener {
        private f() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdClicked() {
            POBRewardedAd.this.e();
            if (POBRewardedAd.this.c != null) {
                POBRewardedAd.this.c.trackClick();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdExpired() {
            POBRewardedAd.this.a(new POBError(1011, POBLogConstants.MSG_AD_EXPIRED_ERROR), true);
            POBRewardedAd.this.a();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdImpression() {
            POBAdsHelper.recordImpressionDepth(POBRewardedAd.this.h, POBAdFormat.REWARDEDAD);
            POBRewardedAd.this.g();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdInteractionStarted() {
            POBRewardedAd.this.h();
            POBBid winningBid = POBBiddingManager.getWinningBid(POBRewardedAd.this.m);
            if (POBRewardedAd.this.c != null) {
                if (winningBid != null && winningBid.isVideo()) {
                    POBRewardedAd.this.c.trackImpression();
                }
                POBRewardedAd.this.c.trackAdShown();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdInteractionStopped() {
            POBRewardedAd.this.f();
            if (POBRewardedAd.this.c != null) {
                POBRewardedAd.this.c.trackAdDismissed();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdRender(POBAdDescriptor pOBAdDescriptor) {
            POBLog.info("POBRewardedAd", hashCode() + " : ******** onAdRender() ********", new Object[0]);
            POBRewardedAd.this.b();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onAdRenderingFailed(POBError pOBError) {
            boolean z = (POBRewardedAd.this.f == POBDataType.POBAdState.SHOWING || POBRewardedAd.this.f == POBDataType.POBAdState.SHOWN) ? false : true;
            POBRewardedAd.this.a(pOBError, z);
            if (z) {
                POBRewardedAd.this.a(pOBError);
            } else {
                POBRewardedAd.this.c(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onLeavingApplication() {
            POBRewardedAd.this.j();
        }

        @Override // com.pubmatic.sdk.common.ui.POBRewardedAdRendererListener
        public void onReceiveReward(POBCoreReward pOBCoreReward) {
            POBReward pOBReward = pOBCoreReward != null ? new POBReward(pOBCoreReward.getCurrencyType(), pOBCoreReward.getAmount()) : null;
            if ((pOBReward == null || !(POBRewardedAd.this.b instanceof POBDefaultRewardedAdEventHandler)) && POBRewardedAd.this.b != null) {
                pOBReward = POBRewardedAd.this.b.getSelectedReward();
            }
            if (POBRewardedAd.this.c != null) {
                POBRewardedAd.this.c.trackAdComplete(pOBReward);
                return;
            }
            if (pOBReward == null) {
                POBLog.warn("POBRewardedAd", POBLogConstants.MSG_SENDING_DEFAULT_REWARD, new Object[0]);
                pOBReward = new POBReward("", 0);
            }
            POBRewardedAd.this.a(pOBReward);
            POBLog.debug("POBRewardedAd", "Unable to notify completion event as interaction listener is null.", new Object[0]);
        }

        /* synthetic */ f(POBRewardedAd pOBRewardedAd, a aVar) {
            this();
        }
    }

    private POBRewardedAd(Context context, String str, int i, String str2, POBRewardedAdEvent pOBRewardedAdEvent) {
        this(context, pOBRewardedAdEvent);
        if (!this.l) {
            OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i)))).build(), new a());
        }
        POBAdFormat pOBAdFormat = POBAdFormat.REWARDEDAD;
        this.j = POBRequest.createInstance(str, i, pOBAdFormat, POBAdsHelper.createFullScreenImpression(context, str2, pOBAdFormat));
        this.q = POBInstanceProvider.getCacheManager(context.getApplicationContext());
    }

    @Nullable
    public static POBRewardedAd getRewardedAd(@NonNull Context context, @NonNull String str, int i, @NonNull String str2) {
        return getRewardedAd(context, str, i, str2, new POBDefaultRewardedAdEventHandler());
    }

    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (this.p == null) {
            this.p = new ConcurrentHashMap();
        }
        if (str == null || obj == null) {
            return;
        }
        this.p.put(str, obj);
    }

    public void destroy() {
        Map<String, String> adServerConfig;
        String str;
        boolean z;
        POBRewardedAdEvent pOBRewardedAdEvent = this.b;
        if (pOBRewardedAdEvent == null || (adServerConfig = pOBRewardedAdEvent.getAdServerConfig()) == null || (str = adServerConfig.get(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID)) == null) {
            return;
        }
        try {
            z = Boolean.parseBoolean(str);
        } catch (ClassCastException unused) {
            POBLog.debug("POBRewardedAd", "Unable to parse %s key", POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID);
            z = false;
        }
        if (z) {
            POBLog.debug("POBRewardedAd", "Clean up initiated.", new Object[0]);
            POBBaseBidder pOBBaseBidder = this.a;
            if (pOBBaseBidder != null) {
                pOBBaseBidder.destroy();
                this.a = null;
            }
            POBRewardedAdRendering pOBRewardedAdRendering = this.e;
            if (pOBRewardedAdRendering != null) {
                pOBRewardedAdRendering.destroy();
                this.e = null;
            }
            k();
            this.f = POBDataType.POBAdState.DEFAULT;
            this.d = null;
            this.i = null;
            this.m = null;
            this.b.destroy();
            this.n = null;
        }
    }

    @Nullable
    public POBRequest getAdRequest() {
        if (this.j == null) {
            POBLog.warn("POBRewardedAd", POBLogConstants.MSG_AD_OBJECT_INVALID, new Object[0]);
        }
        return this.j;
    }

    @Nullable
    public List<POBReward> getAvailableRewards() {
        POBRewardedAdEvent pOBRewardedAdEvent = this.b;
        if (pOBRewardedAdEvent != null) {
            return pOBRewardedAdEvent.getAdServerRewards();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    @Nullable
    public POBBid getBid() {
        return POBBiddingManager.getWinningBid(this.m);
    }

    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.j);
    }

    public boolean isReady() {
        return this.f.equals(POBDataType.POBAdState.READY) || this.f.equals(POBDataType.POBAdState.AD_SERVER_READY);
    }

    @RequiresPermission
    public void loadAd() {
        Trace.beginSection("POB Rewarded Load Ad");
        Trace.beginSection("POB Request Building");
        if (this.j == null) {
            b(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
            POBLog.error("POBRewardedAd", POBLogConstants.MSG_MISSING_INPUT_PARAMS, new Object[0]);
            return;
        }
        int i = c.a[this.f.ordinal()];
        if (i == 1) {
            POBLog.debug("POBRewardedAd", POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
            return;
        }
        if (i == 2) {
            POBLog.debug("POBRewardedAd", POBLogConstants.MSG_AD_SHOWING, new Object[0]);
            return;
        }
        if (i == 3 || i == 4) {
            b();
            return;
        }
        if (i == 5) {
            POBLog.debug("POBRewardedAd", POBLogConstants.MSG_BID_EVENT_SHARING_BIDS, new Object[0]);
            POBBid bid = getBid();
            if (this.i != null && bid != null && !bid.isExpired()) {
                this.i.onBidReceived(this, bid);
                return;
            }
            POBLog.info("POBRewardedAd", POBLogConstants.MSG_AD_EXPIRED_ERROR, new Object[0]);
        }
        if (this.l) {
            d();
        } else {
            this.f = POBDataType.POBAdState.LOAD_DEFERRED;
            l();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void proceedOnError(@NonNull POBBidEvent.BidEventError bidEventError, @NonNull String str) {
        if (this.i == null) {
            POBLog.warn("POBRewardedAd", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return;
        }
        POBDataType.POBAdState pOBAdState = this.f;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBRewardedAd", POBLogConstants.WARN_MSG_BID_EVENT_INVALID_STATE, new Object[0]);
            return;
        }
        POBLog.info("POBRewardedAd", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_ON_ERROR, new Object[0]);
        if (this.b instanceof POBDefaultRewardedAdEventHandler) {
            this.f = POBDataType.POBAdState.DEFAULT;
        } else {
            c();
        }
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public boolean proceedToLoadAd() {
        if (this.i == null) {
            POBLog.warn("POBRewardedAd", POBLogConstants.WARN_MSG_BID_EVENT_NOT_IMPLEMENTED, new Object[0]);
            return false;
        }
        POBDataType.POBAdState pOBAdState = this.f;
        if (pOBAdState != POBDataType.POBAdState.BID_RECEIVED && pOBAdState != POBDataType.POBAdState.BID_FAILED) {
            POBLog.warn("POBRewardedAd", POBLogConstants.WARN_MSG_BID_EVENT_INVALID_STATE, new Object[0]);
            return false;
        }
        POBLog.info("POBRewardedAd", POBLogConstants.INFO_MSG_BID_EVENT_PROCEED_TO_LOAD, new Object[0]);
        POBBid winningBid = POBBiddingManager.getWinningBid(this.m);
        if (winningBid == null || !winningBid.isExpired()) {
            POBLog.debug("POBRewardedAd", POBLogConstants.MSG_PROCEEDING_WITH_BID, new Object[0]);
            this.f = POBDataType.POBAdState.LOADING;
            b(winningBid);
            return true;
        }
        if (this.b instanceof POBDefaultRewardedAdEventHandler) {
            a(POBBidEventHelper.convertToPOBError(POBBidEvent.BidEventError.BID_EXPIRED));
            return false;
        }
        POBLog.warn("POBRewardedAd", POBLogConstants.MSG_AD_EXPIRED_PROCEEDING_IGNORING_OPENWRAP_BID, new Object[0]);
        c();
        return true;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBidEvent
    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.i = pOBBidEventListener;
    }

    public void setListener(@Nullable POBRewardedAdListener pOBRewardedAdListener) {
        this.d = pOBRewardedAdListener;
    }

    public void setSkipAlertDialogInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        if (POBUtils.isNullOrEmpty(str) || POBUtils.isNullOrEmpty(str2) || POBUtils.isNullOrEmpty(str3) || POBUtils.isNullOrEmpty(str4)) {
            return;
        }
        this.n = new POBSkipConfirmationInfo(str, str2, str3, str4);
    }

    public void show() {
        show(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(POBError pOBError) {
        POBLog.error("POBRewardedAd", POBLogConstants.MSG_FAILED_TO_SHOW + pOBError, new Object[0]);
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdFailedToShow(this, pOBError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.m = null;
        if (this.j != null) {
            POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.h.getApplicationContext());
            POBImpression impression = getImpression();
            if (impression != null) {
                POBAdsHelper.updateAppInstallStatusSignals(this.h.getApplicationContext(), impression);
                impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
                this.f = POBDataType.POBAdState.LOADING;
                a(this.j).requestBid();
                return;
            }
        }
        a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f = POBDataType.POBAdState.SHOWN;
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdClosed(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdOpened(this);
        }
    }

    private void i() {
        Trace.endSection();
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAppLeaving(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.k;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.k = null;
    }

    private void l() {
        POBLog.debug("POBRewardedAd", POBLogConstants.MSG_SCHEDULE_LOAD_AD_DELAY, new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.k = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    public void show(@Nullable Map<String, Object> map) {
        POBError pOBError;
        POBRewardedAdRendering pOBRewardedAdRendering;
        POBRewardedAdEvent pOBRewardedAdEvent;
        if (isReady() && map != null) {
            List<POBReward> availableRewards = getAvailableRewards();
            Object obj = map.get(OpenWrapSDK.KEY_SELECTED_REWARD);
            if (obj instanceof POBReward) {
                POBReward pOBReward = (POBReward) obj;
                if (availableRewards != null && !availableRewards.isEmpty() && !availableRewards.contains(pOBReward)) {
                    c(new POBError(5001, POBLogConstants.MSG_INVALID_REWARD_SELECTED));
                    return;
                }
            }
            this.o = map;
        }
        POBRewardedAdEvent pOBRewardedAdEvent2 = this.b;
        if (pOBRewardedAdEvent2 != null) {
            pOBRewardedAdEvent2.setCustomData(map);
        }
        if (this.f.equals(POBDataType.POBAdState.AD_SERVER_READY) && (pOBRewardedAdEvent = this.b) != null) {
            this.f = POBDataType.POBAdState.SHOWING;
            pOBRewardedAdEvent.show();
            return;
        }
        if (isReady() && (pOBRewardedAdRendering = this.e) != null) {
            this.f = POBDataType.POBAdState.SHOWING;
            pOBRewardedAdRendering.show();
            return;
        }
        int i = c.a[this.f.ordinal()];
        if (i != 2) {
            if (i == 7) {
                pOBError = new POBError(1011, POBLogConstants.MSG_AD_EXPIRED_ERROR);
            } else if (i != 8) {
                pOBError = new POBError(2002, POBLogConstants.MSG_AD_NOT_READY_ERROR);
            }
            c(pOBError);
        }
        pOBError = new POBError(2001, POBLogConstants.MSG_AD_ALREADY_SHOWN_ERROR);
        c(pOBError);
    }

    @NonNull
    public static POBRewardedAd getRewardedAd(@NonNull Context context) {
        return new POBRewardedAd(context, new POBDefaultRewardedAdEventHandler());
    }

    private void b(POBError pOBError) {
        Trace.endSection();
        POBLog.error("POBRewardedAd", POBLogConstants.MSG_FAILED_TO_LOAD + pOBError, new Object[0]);
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdFailedToLoad(this, pOBError);
        }
    }

    private void c() {
        String str;
        this.f = POBDataType.POBAdState.LOADING;
        POBAdResponse pOBAdResponse = this.m;
        if (pOBAdResponse != null) {
            this.m = new POBAdResponse.Builder(pOBAdResponse).setWinningBid(null).build();
        }
        POBRewardedAdEvent pOBRewardedAdEvent = this.b;
        if (pOBRewardedAdEvent == null) {
            str = "";
        } else {
            str = pOBRewardedAdEvent.getClass().getSimpleName();
        }
        POBLog.info("POBRewardedAd", "Proceeding with bid. Ad server integration is " + str, new Object[0]);
        b((POBBid) null);
    }

    @Nullable
    public static synchronized POBRewardedAd getRewardedAd(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBRewardedAdEvent pOBRewardedAdEvent) {
        synchronized (POBRewardedAd.class) {
            POBRewardedAd pOBRewardedAd = null;
            if (!POBAdsHelper.validate(context, str, str2, pOBRewardedAdEvent)) {
                POBLog.error("POBRewardedAd", POBLogConstants.MSG_INVALID_INPUT_PARAMS, str, Integer.valueOf(i), str2, pOBRewardedAdEvent == null ? null : pOBRewardedAdEvent.getClass().getName());
                return null;
            }
            Map<String, String> adServerConfig = pOBRewardedAdEvent.getAdServerConfig();
            if (adServerConfig != null) {
                try {
                    String str3 = adServerConfig.get(POBRewardedAdEvent.KEY_ALLOW_MULTIPLE_INSTANCES_FOR_ADUNIT_ID);
                    if (str3 != null ? Boolean.parseBoolean(str3) : false) {
                        return new POBRewardedAd(context, str, i, str2, pOBRewardedAdEvent);
                    }
                    String str4 = adServerConfig.get(POBRewardedAdEvent.KEY_IDENTIFER);
                    if (!POBUtils.isNullOrEmpty(str4)) {
                        Map service = POBCacheService.getInstance().getService("RewardedAdCache");
                        POBRewardedAd pOBRewardedAd2 = (POBRewardedAd) service.get(str4);
                        try {
                            if (pOBRewardedAd2 == null) {
                                POBRewardedAd pOBRewardedAd3 = new POBRewardedAd(context, str, i, str2, pOBRewardedAdEvent);
                                service.put(str4, pOBRewardedAd3);
                                POBLog.info("POBRewardedAd", POBLogConstants.MSG_FMT_REWARDED_AD_CREATED, Integer.valueOf(pOBRewardedAd3.hashCode()));
                                return pOBRewardedAd3;
                            }
                            POBLog.info("POBRewardedAd", POBLogConstants.MSG_FMT_REWARDED_AD_EXISTS, Integer.valueOf(pOBRewardedAd2.hashCode()));
                            return pOBRewardedAd2;
                        } catch (Exception e2) {
                            e = e2;
                            pOBRewardedAd = pOBRewardedAd2;
                            POBLog.error("POBRewardedAd", "Unable to get rewarded ad instance - " + e.getMessage(), new Object[0]);
                            return pOBRewardedAd;
                        }
                    }
                    POBLog.error("POBRewardedAd", POBLogConstants.MSG_INVALID_HANDLER_ID, new Object[0]);
                    return null;
                } catch (Exception e3) {
                    e = e3;
                }
            } else {
                POBLog.error("POBRewardedAd", "Missing ad server specific config properties in handler.", new Object[0]);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(POBBid pOBBid) {
        if (this.b != null) {
            Trace.endSection();
            this.b.requestAd(pOBBid);
            this.c = this.b.getAdInteractionListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        this.f = POBDataType.POBAdState.DEFAULT;
        b(pOBError);
    }

    private POBBidding a(POBRequest pOBRequest) {
        POBProfileInfo pOBProfileInfo;
        if (this.a == null) {
            a aVar = null;
            if (this.q != null) {
                pOBProfileInfo = this.q.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
            } else {
                pOBProfileInfo = null;
            }
            this.a = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.h.getApplicationContext(), pOBRequest, pOBProfileInfo));
            this.a.setBidderListener(new d(this, aVar));
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f != POBDataType.POBAdState.AD_SERVER_READY) {
            this.f = POBDataType.POBAdState.READY;
        }
        i();
    }

    private POBBaseBidder a(String str) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(str);
        this.a = pOBExtBidHandler;
        pOBExtBidHandler.setBidderListener(new d(this, null));
        return this.a;
    }

    private POBRewardedAd(Context context, POBRewardedAdEvent pOBRewardedAdEvent) {
        this.l = false;
        this.r = POBBiddingHost.UNKNOWN;
        this.h = context;
        this.f = POBDataType.POBAdState.DEFAULT;
        this.b = pOBRewardedAdEvent;
        e eVar = new e(this, null);
        this.g = eVar;
        pOBRewardedAdEvent.setEventListener(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f = POBDataType.POBAdState.EXPIRED;
        POBRewardedAdRendering pOBRewardedAdRendering = this.e;
        if (pOBRewardedAdRendering != null) {
            pOBRewardedAdRendering.destroy();
            this.e = null;
        }
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onAdExpired(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBReward pOBReward) {
        POBRewardedAdListener pOBRewardedAdListener = this.d;
        if (pOBRewardedAdListener != null) {
            pOBRewardedAdListener.onReceiveReward(this, pOBReward);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBRewardedAdRendering a(POBBid pOBBid) {
        if (this.n == null) {
            POBLog.info("POBRewardedAd", "Invalid value for skip alert. SDK will use default skip alert.", new Object[0]);
            this.n = new POBSkipConfirmationInfo(this.h.getString(R.string.openwrap_skip_dialog_title), this.h.getString(R.string.openwrap_skip_dialog_message), this.h.getString(R.string.openwrap_skip_dialog_resume_btn), this.h.getString(R.string.openwrap_skip_dialog_close_btn));
        }
        return POBRewardedUtil.getRewardedRenderer(this.h.getApplicationContext(), pOBBid.getRemainingExpirationTime(), this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError, boolean z) {
        POBRewardedAdEvent pOBRewardedAdEvent = this.b;
        if (pOBRewardedAdEvent != null && z) {
            pOBRewardedAdEvent.setCustomData(this.o);
        }
        POBBid winningBid = POBBiddingManager.getWinningBid(this.m);
        if (this.c == null || winningBid == null || !winningBid.isVideo()) {
            return;
        }
        this.c.trackAdFailed(pOBError);
    }

    @RequiresPermission
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        if (pOBBiddingHost == null) {
            a(new POBError(1001, POBLogConstants.MSG_INVALID_BIDDING_HOST));
            return;
        }
        this.r = pOBBiddingHost;
        if (!POBUtils.isNullOrEmpty(str)) {
            Trace.beginSection("POB Rewarded Load Ad");
            Trace.beginSection("POB Response Parsing");
            int i = c.a[this.f.ordinal()];
            if (i == 1) {
                POBLog.debug("POBRewardedAd", POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
                return;
            }
            if (i == 2) {
                POBLog.debug("POBRewardedAd", POBLogConstants.MSG_AD_SHOWING, new Object[0]);
                return;
            }
            if (i != 3) {
                this.f = POBDataType.POBAdState.LOADING;
                POBBaseBidder a2 = a(str);
                this.a = a2;
                a2.requestBid();
                return;
            }
            POBLog.error("POBRewardedAd", POBLogConstants.MSG_AD_LOADED_ERROR, new Object[0]);
            b();
            return;
        }
        a(new POBError(1007, POBLogConstants.MSG_MISSING_BID_RESPONSE));
    }
}
