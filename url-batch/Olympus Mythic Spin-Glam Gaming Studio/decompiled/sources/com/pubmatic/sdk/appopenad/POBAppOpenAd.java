package com.pubmatic.sdk.appopenad;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresPermission;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.Zf;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.appopenad.POBAppOpenAd;
import com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer;
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
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.ui.POBBannerRendering;
import com.pubmatic.sdk.common.ui.POBFullScreenRendererListener;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.common.ui.POBVideoAdEventListener;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBanner;
import com.pubmatic.sdk.openwrap.core.POBBaseAd;
import com.pubmatic.sdk.openwrap.core.POBBid;
import com.pubmatic.sdk.openwrap.core.POBBiddingManager;
import com.pubmatic.sdk.openwrap.core.POBExtBidHandler;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBOWPartnerHelper;
import com.pubmatic.sdk.openwrap.core.POBRenderer;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.POBVideo;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 n2\u00020\u0001:\u0005no\r\u0016pB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\r\u0010\u001cJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\r\u0010!J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010#J\u001f\u0010\r\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b\r\u0010&J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0012J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0012J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0012J\u000f\u0010-\u001a\u00020\fH\u0007¢\u0006\u0004\b-\u0010\u0012J\r\u0010.\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u000f\u00102\u001a\u00020\fH\u0017¢\u0006\u0004\b2\u0010\u0012J\u0011\u0010<\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0017¢\u0006\u0004\b@\u0010\u0012J\u001f\u0010D\u001a\u00020\f2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010IR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0016\u0010N\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010MR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010QR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020B0S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010WR\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010MR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006q"}, d2 = {"Lcom/pubmatic/sdk/appopenad/POBAppOpenAd;", "Lcom/pubmatic/sdk/openwrap/core/POBBaseAd;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "publisherId", "", "profileId", "adUnitId", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V", "", "a", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "(Ljava/lang/String;)Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "c", "()V", "Lcom/pubmatic/sdk/common/POBError;", "error", "(Lcom/pubmatic/sdk/common/POBError;)V", "b", "i", "l", CampaignEx.JSON_KEY_AD_K, "", "isLoadTimeError", "(Lcom/pubmatic/sdk/common/POBError;Z)V", "Lcom/pubmatic/sdk/openwrap/core/POBRequest;", "request", "Lcom/pubmatic/sdk/common/base/POBBaseBidder;", "Lcom/pubmatic/sdk/openwrap/core/POBBid;", "(Lcom/pubmatic/sdk/openwrap/core/POBRequest;)Lcom/pubmatic/sdk/common/base/POBBaseBidder;", "bidResponse", "(Ljava/lang/String;)Lcom/pubmatic/sdk/common/base/POBBaseBidder;", "bid", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer;", "(Landroid/content/Context;Lcom/pubmatic/sdk/openwrap/core/POBBid;)Lcom/pubmatic/sdk/appopenad/POBAppOpenAdRenderer;", "h", "g", EidRequestBuilder.REQUEST_FIELD_EMAIL, j.b, "d", InneractiveMediationDefs.GENDER_FEMALE, h.aj, "isReady", "()Z", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;", "biddingHost", "loadAd", "(Ljava/lang/String;Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;)V", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBAppOpenAdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBAppOpenAdListener;)V", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBVideoListener;", "videoListener", "setVideoListener", "(Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBVideoListener;)V", "getImpression", "()Lcom/pubmatic/sdk/openwrap/core/POBImpression;", "getAdRequest", "()Lcom/pubmatic/sdk/openwrap/core/POBRequest;", "destroy", "key", "", "value", "addExtraInfo", "(Ljava/lang/String;Ljava/lang/Object;)V", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/pubmatic/sdk/common/POBDataType$POBAdState;", "Ljava/util/concurrent/atomic/AtomicReference;", "adState", "Lcom/pubmatic/sdk/common/base/POBBaseBidder;", "bidderManager", "Z", "isSDKInitialized", "Lcom/pubmatic/sdk/openwrap/core/POBRequest;", "Lcom/pubmatic/sdk/common/cache/POBCacheManager;", "Lcom/pubmatic/sdk/common/cache/POBCacheManager;", "cacheManager", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "extraInfo", "Lcom/pubmatic/sdk/common/utility/POBTimeoutHandler;", "Lcom/pubmatic/sdk/common/utility/POBTimeoutHandler;", "scheduleAdLoadTimer", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;", "I", "adOrientation", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBAppOpenAdListener;", "appOpenAdListener", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBVideoListener;", "appOpenAdVideoListener", "Lcom/pubmatic/sdk/common/ui/POBInterstitialRendering;", "m", "Lcom/pubmatic/sdk/common/ui/POBInterstitialRendering;", "appOpenAdRenderer", "n", "notifyImpressionOnAdShow", "Lcom/pubmatic/sdk/common/ui/POBFullScreenRendererListener;", "o", "Lcom/pubmatic/sdk/common/ui/POBFullScreenRendererListener;", "pobFullScreenRendererListener", "Lcom/pubmatic/sdk/common/models/POBAdResponse;", "p", "Lcom/pubmatic/sdk/common/models/POBAdResponse;", "adResponse", "Companion", "POBAppOpenAdListener", "POBVideoListener", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MainThread
/* loaded from: classes8.dex */
public final class POBAppOpenAd implements POBBaseAd {
    private static final String q;

    /* renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    private final AtomicReference adState;

    /* renamed from: c, reason: from kotlin metadata */
    private POBBaseBidder bidderManager;

    /* renamed from: d, reason: from kotlin metadata */
    private boolean isSDKInitialized;

    /* renamed from: e, reason: from kotlin metadata */
    private POBRequest request;

    /* renamed from: f, reason: from kotlin metadata */
    private POBCacheManager cacheManager;

    /* renamed from: g, reason: from kotlin metadata */
    private ConcurrentHashMap extraInfo;

    /* renamed from: h, reason: from kotlin metadata */
    private POBTimeoutHandler scheduleAdLoadTimer;

    /* renamed from: i, reason: from kotlin metadata */
    private POBBiddingHost biddingHost;

    /* renamed from: j, reason: from kotlin metadata */
    private int adOrientation;

    /* renamed from: k, reason: from kotlin metadata */
    private POBAppOpenAdListener appOpenAdListener;

    /* renamed from: l, reason: from kotlin metadata */
    private POBVideoListener appOpenAdVideoListener;

    /* renamed from: m, reason: from kotlin metadata */
    private POBInterstitialRendering appOpenAdRenderer;

    /* renamed from: n, reason: from kotlin metadata */
    private boolean notifyImpressionOnAdShow;

    /* renamed from: o, reason: from kotlin metadata */
    private POBFullScreenRendererListener pobFullScreenRendererListener;

    /* renamed from: p, reason: from kotlin metadata */
    private POBAdResponse adResponse;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBAppOpenAdListener;", "", "()V", Zf.f, "", "ad", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd;", Zf.g, "onAdExpired", "onAdFailedToLoad", "error", "Lcom/pubmatic/sdk/common/POBError;", "onAdFailedToShow", "onAdImpression", Zf.c, "onAdReceived", "onAppLeaving", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MainThread
    public static class POBAppOpenAdListener {
        public void onAdClicked(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAdClosed(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAdExpired(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAdFailedToLoad(@NotNull POBAppOpenAd ad, @NotNull POBError error) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(error, "error");
        }

        public void onAdFailedToShow(@NotNull POBAppOpenAd ad, @NotNull POBError error) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(error, "error");
        }

        public void onAdImpression(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAdOpened(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAdReceived(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }

        public void onAppLeaving(@NotNull POBAppOpenAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/pubmatic/sdk/appopenad/POBAppOpenAd$POBVideoListener;", "", "onVideoPlaybackCompleted", "", "ad", "Lcom/pubmatic/sdk/appopenad/POBAppOpenAd;", "appopenad_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MainThread
    public interface POBVideoListener {
        void onVideoPlaybackCompleted(@NotNull POBAppOpenAd ad);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[POBDataType.POBAdState.values().length];
            iArr[POBDataType.POBAdState.EXPIRED.ordinal()] = 1;
            iArr[POBDataType.POBAdState.SHOWN.ordinal()] = 2;
            iArr[POBDataType.POBAdState.SHOWING.ordinal()] = 3;
            iArr[POBDataType.POBAdState.LOADING.ordinal()] = 4;
            iArr[POBDataType.POBAdState.READY.ordinal()] = 5;
            iArr[POBDataType.POBAdState.LOAD_DEFERRED.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements POBBidderListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(POBAppOpenAd this$0, POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
            POBVideoListener pOBVideoListener;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            POBLog.debug(POBAppOpenAd.q, POBLogConstants.MSG_APP_OPEN_AD_VIDEO_EVENT + pOBVideoAdEventType, new Object[0]);
            if (pOBVideoAdEventType != POBDataType.POBVideoAdEventType.COMPLETE || (pOBVideoListener = this$0.appOpenAdVideoListener) == null) {
                return;
            }
            pOBVideoListener.onVideoPlaybackCompleted(this$0);
        }

        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        public void onBidsFailed(POBBidding bidder, POBError error) {
            Intrinsics.checkNotNullParameter(bidder, "bidder");
            Intrinsics.checkNotNullParameter(error, "error");
            POBLog.debug(POBAppOpenAd.q, POBLogConstants.MSG_DEBUG_BIDS_FAILED, error);
            POBAppOpenAd.this.a(error, true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
        
            if (r6 == null) goto L17;
         */
        @Override // com.pubmatic.sdk.common.base.POBBidderListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBidsFetched(POBBidding bidder, POBAdResponse response) {
            POBBid pOBBid;
            String str;
            Integer nbrCode;
            Intrinsics.checkNotNullParameter(bidder, "bidder");
            Intrinsics.checkNotNullParameter(response, "response");
            POBAppOpenAd.this.adResponse = POBAdsHelper.updateResponseUsingAdFormatType(response, POBAdFormat.APP_OPEN_AD);
            POBAdResponse pOBAdResponse = POBAppOpenAd.this.adResponse;
            if (pOBAdResponse == null || (pOBBid = (POBBid) pOBAdResponse.getWinningBid()) == null) {
                return;
            }
            final POBAppOpenAd pOBAppOpenAd = POBAppOpenAd.this;
            pOBBid.setHasWon(true);
            POBLog.debug(POBAppOpenAd.q, POBLogConstants.MSG_DEBUG_BIDS_FETCHED, pOBBid.getImpressionId(), Double.valueOf(pOBBid.getPrice()));
            JSONObject rawBid = pOBBid.getRawBid();
            if (rawBid != null) {
                POBInstanceProvider.getCacheManager(pOBAppOpenAd.context.getApplicationContext()).saveReceivedBid(rawBid);
            }
            if (pOBBid.getStatus() == 0) {
                POBAdResponse pOBAdResponse2 = pOBAppOpenAd.adResponse;
                if (pOBAdResponse2 != null && (nbrCode = pOBAdResponse2.getNbrCode()) != null) {
                    str = "No ads available, reason(NBR):  " + nbrCode.intValue();
                }
                str = "No ads available";
                pOBAppOpenAd.a(new POBError(1002, str), true);
                return;
            }
            POBLog.debug(POBAppOpenAd.q, "PartnerBidWin", new Object[0]);
            POBUtils.logBidWinningStatus(pOBBid.hasWon(), pOBBid.getPartnerName());
            POBAppOpenAdRenderer a = pOBAppOpenAd.a(pOBAppOpenAd.context, pOBBid);
            a.setAdRendererListener(pOBAppOpenAd.pobFullScreenRendererListener);
            a.setVideoAdEventListener(new POBVideoAdEventListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAd$a$$ExternalSyntheticLambda0
                @Override // com.pubmatic.sdk.common.ui.POBVideoAdEventListener
                public final void onVideoAdEvent(POBDataType.POBVideoAdEventType pOBVideoAdEventType) {
                    POBAppOpenAd.a.a(POBAppOpenAd.this, pOBVideoAdEventType);
                }
            });
            pOBAppOpenAd.appOpenAdRenderer = a;
            JSONObject rawBid2 = pOBBid.getRawBid();
            if (rawBid2 != null) {
                POBInstanceProvider.getCacheManager(pOBAppOpenAd.context).saveRenderedBid(rawBid2);
            }
            POBInterstitialRendering pOBInterstitialRendering = pOBAppOpenAd.appOpenAdRenderer;
            if (pOBInterstitialRendering != null) {
                pOBInterstitialRendering.renderAd(pOBBid);
            }
        }
    }

    private final class b implements POBFullScreenRendererListener {
        public b() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdClicked() {
            POBAppOpenAd.this.d();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdExpired() {
            POBAppOpenAd.this.a();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdImpression() {
            if (POBAppOpenAd.this.notifyImpressionOnAdShow) {
                return;
            }
            POBAdsHelper.recordImpressionDepth(POBAppOpenAd.this.context, POBAdFormat.APP_OPEN_AD);
            POBAppOpenAd.this.f();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdInteractionStarted() {
            POBAppOpenAd.this.g();
            if (POBAppOpenAd.this.notifyImpressionOnAdShow) {
                POBAdsHelper.recordImpressionDepth(POBAppOpenAd.this.context, POBAdFormat.APP_OPEN_AD);
                POBAppOpenAd.this.f();
            }
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdInteractionStopped() {
            POBAppOpenAd.this.e();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdRender(POBAdDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            POBLog.info(POBAppOpenAd.q, hashCode() + " : ******** onAdRender() ********", new Object[0]);
            POBAppOpenAd.this.b();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdRenderingFailed(POBError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            POBAppOpenAd.this.a(error, (POBAppOpenAd.this.adState.get() == POBDataType.POBAdState.SHOWING || POBAppOpenAd.this.adState.get() == POBDataType.POBAdState.SHOWN) ? false : true);
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onAdUnload() {
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onLeavingApplication() {
            POBAppOpenAd.this.j();
        }

        @Override // com.pubmatic.sdk.common.ui.POBFullScreenRendererListener
        public void onRenderProcessGone() {
            POBAppOpenAd.this.adState.set(POBDataType.POBAdState.DEFAULT);
            POBAppOpenAd.this.b(new POBError(1009, "Render process gone"));
        }
    }

    static {
        String simpleName = POBAppOpenAd.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "POBAppOpenAd::class.java.simpleName");
        q = simpleName;
    }

    public POBAppOpenAd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.adState = new AtomicReference(POBDataType.POBAdState.DEFAULT);
        this.extraInfo = new ConcurrentHashMap();
        this.biddingHost = POBBiddingHost.UNKNOWN;
        this.pobFullScreenRendererListener = new b();
    }

    private final void a(String publisherId, int profileId, String adUnitId) {
        if (!POBAdsHelper.validate(this.context, publisherId, adUnitId)) {
            POBLog.error(q, new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS).toString(), new Object[0]);
        } else {
            OpenWrapSDK.initialize(this.context.getApplicationContext(), new OpenWrapSDKConfig.Builder(publisherId, new ArrayList(CollectionsKt.listOf(Integer.valueOf(profileId)))).build(), new OpenWrapSDKInitializer.Listener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAd$initialize$1
                @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
                public void onFailure(@NotNull POBError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    POBAppOpenAd.this.isSDKInitialized = true;
                    POBLog.error(POBAppOpenAd.q, POBLogConstants.SDK_INITIALIZATION_FAILED + error, new Object[0]);
                    if (POBAppOpenAd.this.adState.get() == POBDataType.POBAdState.LOAD_DEFERRED) {
                        POBAppOpenAd.this.a(error, true);
                    }
                }

                @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
                public void onSuccess() {
                    POBAppOpenAd.this.isSDKInitialized = true;
                    POBLog.verbose(POBAppOpenAd.q, POBLogConstants.SDK_INITIALIZATION_SUCCESS, new Object[0]);
                    if (POBAppOpenAd.this.adState.get() == POBDataType.POBAdState.LOAD_DEFERRED) {
                        POBAppOpenAd.this.k();
                        POBAppOpenAd.this.c();
                    }
                }
            });
            this.request = POBRequest.createInstance(publisherId, profileId, POBAdFormat.APP_OPEN_AD, a(adUnitId));
            this.cacheManager = POBInstanceProvider.getCacheManager(this.context.getApplicationContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(POBError error) {
        POBLog.error(q, POBLogConstants.MSG_FAILED_TO_SHOW + error, new Object[0]);
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdFailedToShow(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        POBLog.info(q, POBLogConstants.MSG_REQUESTING_LOAD, this.adState.get());
        this.adResponse = null;
        POBRequest pOBRequest = this.request;
        POBImpression impression = getImpression();
        if (pOBRequest == null || impression == null) {
            a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS), true);
            return;
        }
        POBAdSize interstitialAdSize = POBUtils.getInterstitialAdSize(this.context.getApplicationContext());
        this.adState.set(POBDataType.POBAdState.LOADING);
        POBAdsHelper.updateAppInstallStatusSignals(this.context.getApplicationContext(), impression);
        impression.setVideo(new POBVideo(POBVideo.Placement.INTERSTITIAL, POBVideo.Plcmt.INTERSTITIAL, POBVideo.Linearity.LINEAR, interstitialAdSize));
        impression.setBanner(new POBBanner(interstitialAdSize));
        this.adOrientation = POBUtils.getDeviceOrientation(this.context.getApplicationContext());
        POBBaseBidder a2 = a(pOBRequest);
        this.bidderManager = a2;
        a2.requestBid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        this.adState.set(POBDataType.POBAdState.SHOWN);
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdClosed(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdImpression(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdOpened(this);
        }
    }

    private final void h() {
        Trace.endSection();
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdReceived(this);
        }
    }

    private final void i() {
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdReceived(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAppLeaving(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        POBTimeoutHandler pOBTimeoutHandler = this.scheduleAdLoadTimer;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.scheduleAdLoadTimer = null;
    }

    private final void l() {
        POBLog.debug(q, POBLogConstants.MSG_SCHEDULE_LOAD_AD_DELAY, new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new POBTimeoutHandler.POBTimeoutHandlerListener() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAd$$ExternalSyntheticLambda0
            @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
            public final void onTimeout() {
                POBAppOpenAd.a(POBAppOpenAd.this);
            }
        });
        pOBTimeoutHandler.start(500L);
        this.scheduleAdLoadTimer = pOBTimeoutHandler;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    public void addExtraInfo(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.extraInfo.put(key, value);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @MainThread
    public void destroy() {
        POBBaseBidder pOBBaseBidder = this.bidderManager;
        if (pOBBaseBidder != null) {
            pOBBaseBidder.destroy();
        }
        this.bidderManager = null;
        k();
        this.appOpenAdListener = null;
        this.appOpenAdVideoListener = null;
        this.adState.set(POBDataType.POBAdState.DEFAULT);
        POBInterstitialRendering pOBInterstitialRendering = this.appOpenAdRenderer;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
        }
        this.appOpenAdRenderer = null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.request;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn(q, POBLogConstants.MSG_AD_OBJECT_INVALID, new Object[0]);
        return null;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.request);
    }

    public final boolean isReady() {
        return this.adState.get() == POBDataType.POBAdState.READY;
    }

    @RequiresPermission
    @MainThread
    public final void loadAd(@NotNull String bidResponse, @NotNull POBBiddingHost biddingHost) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(biddingHost, "biddingHost");
        StringBuilder sb = new StringBuilder();
        String str = q;
        sb.append(str);
        sb.append(".loadAd(String, POBBiddingHost)");
        POBUtils.assertMainThread(sb.toString());
        this.biddingHost = biddingHost;
        if (bidResponse.length() == 0) {
            a(new POBError(1007, POBLogConstants.MSG_MISSING_BID_RESPONSE));
            POBLog.error(str, POBLogConstants.MSG_MISSING_BID_RESPONSE, new Object[0]);
            return;
        }
        POBDataType.POBAdState pOBAdState = (POBDataType.POBAdState) this.adState.get();
        int i = pOBAdState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pOBAdState.ordinal()];
        if (i == 3) {
            POBLog.debug(str, POBLogConstants.MSG_AD_SHOWING, new Object[0]);
            return;
        }
        if (i == 4) {
            POBLog.debug(str, POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
            return;
        }
        if (i == 5) {
            POBLog.error(str, POBLogConstants.MSG_AD_LOADED_ERROR, new Object[0]);
            i();
        } else {
            this.adState.set(POBDataType.POBAdState.LOADING);
            POBBaseBidder b2 = b(bidResponse);
            this.bidderManager = b2;
            b2.requestBid();
        }
    }

    public final void setListener(@Nullable POBAppOpenAdListener listener) {
        this.appOpenAdListener = listener;
    }

    public final void setVideoListener(@Nullable POBVideoListener videoListener) {
        this.appOpenAdVideoListener = videoListener;
    }

    @MainThread
    public final void showAd() {
        POBUtils.assertMainThread(q + ".showAd()");
        if (!isReady() || this.appOpenAdRenderer == null) {
            POBDataType.POBAdState pOBAdState = (POBDataType.POBAdState) this.adState.get();
            int i = pOBAdState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pOBAdState.ordinal()];
            b(i != 1 ? (i == 2 || i == 3) ? new POBError(2001, POBLogConstants.MSG_AD_ALREADY_SHOWN_ERROR) : new POBError(2002, POBLogConstants.MSG_AD_NOT_READY_ERROR) : new POBError(1011, POBLogConstants.MSG_AD_EXPIRED_ERROR));
        } else {
            this.adState.set(POBDataType.POBAdState.SHOWING);
            POBInterstitialRendering pOBInterstitialRendering = this.appOpenAdRenderer;
            if (pOBInterstitialRendering != null) {
                pOBInterstitialRendering.show(this.adOrientation);
            }
        }
    }

    private final POBBaseBidder b(String bidResponse) {
        POBExtBidHandler pOBExtBidHandler = new POBExtBidHandler(bidResponse);
        pOBExtBidHandler.setBidderListener(new a());
        return pOBExtBidHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.adState.get() != POBDataType.POBAdState.AD_SERVER_READY) {
            this.adState.set(POBDataType.POBAdState.READY);
        }
        h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public POBAppOpenAd(@NotNull Context context, @NotNull String publisherId, int i, @NotNull String adUnitId) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publisherId, "publisherId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        a(publisherId, i, adUnitId);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @RequiresPermission
    @MainThread
    public void loadAd() {
        StringBuilder sb = new StringBuilder();
        String str = q;
        sb.append(str);
        sb.append(".loadAd()");
        POBUtils.assertMainThread(sb.toString());
        if (this.request == null) {
            a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
            POBLog.error(str, POBLogConstants.MSG_MISSING_INPUT_PARAMS, new Object[0]);
            return;
        }
        POBDataType.POBAdState pOBAdState = (POBDataType.POBAdState) this.adState.get();
        int i = pOBAdState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pOBAdState.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    POBLog.error(str, POBLogConstants.MSG_AD_LOADED_ERROR, new Object[0]);
                    i();
                    return;
                } else if (i != 6) {
                    if (this.isSDKInitialized) {
                        c();
                        return;
                    } else {
                        this.adState.set(POBDataType.POBAdState.LOAD_DEFERRED);
                        l();
                        return;
                    }
                }
            }
            POBLog.debug(str, POBLogConstants.MSG_AD_LOADING_ERROR, new Object[0]);
            return;
        }
        POBLog.debug(str, POBLogConstants.MSG_AD_SHOWING, new Object[0]);
    }

    private final POBImpression a(String adUnitId) {
        POBImpression pOBImpression = new POBImpression(getImpressionId(), adUnitId);
        pOBImpression.setInterstitial(true);
        pOBImpression.setAppOpenAd(true);
        pOBImpression.setAdPosition(POBRequest.AdPosition.FULL_SCREEN);
        pOBImpression.setCtaOverlayEnabled(true);
        return pOBImpression;
    }

    private final void a(POBError error) {
        POBLog.error(q, POBLogConstants.MSG_FAILED_TO_LOAD + error, new Object[0]);
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdFailedToLoad(this, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBAppOpenAd this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.adState.get() == POBDataType.POBAdState.LOAD_DEFERRED) {
            this$0.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(POBError error, boolean isLoadTimeError) {
        this.adState.set(POBDataType.POBAdState.DEFAULT);
        if (isLoadTimeError) {
            a(error);
        } else {
            b(error);
        }
    }

    private final POBBaseBidder a(POBRequest request) {
        POBBaseBidder pOBBaseBidder = this.bidderManager;
        if (pOBBaseBidder != null) {
            return pOBBaseBidder;
        }
        POBCacheManager pOBCacheManager = this.cacheManager;
        POBBiddingManager pOBBiddingManager = new POBBiddingManager(POBOWPartnerHelper.createPOBManager(this.context.getApplicationContext(), request, pOBCacheManager != null ? pOBCacheManager.getProfileInfo(String.valueOf(request.getProfileId())) : null));
        pOBBiddingManager.setBidderListener(new a());
        return pOBBiddingManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final POBAppOpenAdRenderer a(final Context context, final POBBid bid) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        return new POBAppOpenAdRenderer(applicationContext, new POBAppOpenAdRenderer.RendererBuilder() { // from class: com.pubmatic.sdk.appopenad.POBAppOpenAd$getAppOpenAdRenderer$1
            @Override // com.pubmatic.sdk.appopenad.POBAppOpenAdRenderer.RendererBuilder
            @Nullable
            public POBBannerRendering build(@NotNull POBAdDescriptor descriptor, int rendererId) {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return descriptor.isVideo() ? POBRenderer.videoRenderer(context, descriptor, bid.getRemainingExpirationTime(), POBAdFormat.APP_OPEN_AD) : POBRenderer.bannerRenderer(context, "interstitial", 15, rendererId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.adState.set(POBDataType.POBAdState.EXPIRED);
        POBInterstitialRendering pOBInterstitialRendering = this.appOpenAdRenderer;
        if (pOBInterstitialRendering != null) {
            pOBInterstitialRendering.destroy();
        }
        this.appOpenAdRenderer = null;
        POBAppOpenAdListener pOBAppOpenAdListener = this.appOpenAdListener;
        if (pOBAppOpenAdListener != null) {
            pOBAppOpenAdListener.onAdExpired(this);
        }
    }
}
