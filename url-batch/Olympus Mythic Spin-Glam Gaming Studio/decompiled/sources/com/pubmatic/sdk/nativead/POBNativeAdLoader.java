package com.pubmatic.sdk.nativead;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.pubmatic.sdk.common.OpenWrapSDK;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.OpenWrapSDKInitializer;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBTimeoutHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeAdManager;
import com.pubmatic.sdk.nativead.datatype.POBNativeTemplateType;
import com.pubmatic.sdk.nativead.request.POBBaseNativeRequestAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestDataAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestEventTracker;
import com.pubmatic.sdk.nativead.request.POBNativeRequestImageAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestTitleAsset;
import com.pubmatic.sdk.nativead.request.POBNativeRequestVideoAsset;
import com.pubmatic.sdk.openwrap.core.POBAdsHelper;
import com.pubmatic.sdk.openwrap.core.POBBaseAd;
import com.pubmatic.sdk.openwrap.core.POBBidEventListener;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeDataAssetType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventTrackingMethod;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeEventType;
import com.pubmatic.sdk.openwrap.core.nativead.POBNativeImageAssetType;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHost;
import com.pubmatic.sdk.openwrap.core.signal.POBBiddingHostKt;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class POBNativeAdLoader implements POBBaseAd, POBNativeAdManager.POBNativeAdManagerListener, POBNativeAdManager.c {
    private final Context a;
    private final POBNativeTemplateType b;
    private POBNativeAdEvent c;
    private POBNativeAdLoaderListener d;
    private POBRequest e;
    private POBCacheManager f;
    private POBTimeoutHandler g;
    private final Set h;
    private int i;
    private boolean j;
    private boolean k;
    private final POBNativeAdLoaderConfig l;
    private POBNativeBuilder m;
    private POBBidEventListener n;
    private POBDataType.POBAdState o;
    private POBBiddingHost p;
    private Map q;

    class a implements Runnable {
        final /* synthetic */ POBError a;

        a(POBError pOBError) {
            this.a = pOBError;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBNativeAdLoader.this.a(this.a);
        }
    }

    class b implements POBTimeoutHandler.POBTimeoutHandlerListener {
        b() {
        }

        @Override // com.pubmatic.sdk.common.utility.POBTimeoutHandler.POBTimeoutHandlerListener
        public void onTimeout() {
            POBNativeAdLoader.this.c();
        }
    }

    class c implements OpenWrapSDKInitializer.Listener {
        c() {
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onFailure(POBError pOBError) {
            POBNativeAdLoader.this.j = true;
            POBLog.error("POBNativeAdLoader", POBLogConstants.SDK_INITIALIZATION_FAILED + pOBError, new Object[0]);
            if (POBNativeAdLoader.this.o == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBNativeAdLoader.this.a(pOBError);
            }
        }

        @Override // com.pubmatic.sdk.common.OpenWrapSDKInitializer.Listener
        public void onSuccess() {
            POBNativeAdLoader.this.j = true;
            POBLog.verbose("POBNativeAdLoader", POBLogConstants.SDK_INITIALIZATION_SUCCESS, new Object[0]);
            if (POBNativeAdLoader.this.o == POBDataType.POBAdState.LOAD_DEFERRED) {
                POBNativeAdLoader.this.d();
                POBNativeAdLoader.this.c();
            }
        }
    }

    public POBNativeAdLoader(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBNativeTemplateType pOBNativeTemplateType, @NonNull POBNativeAdEvent pOBNativeAdEvent) {
        this(context, pOBNativeTemplateType);
        a(context, str, i, str2, pOBNativeTemplateType, pOBNativeAdEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        POBTimeoutHandler pOBTimeoutHandler = this.g;
        if (pOBTimeoutHandler != null) {
            pOBTimeoutHandler.cancel();
        }
        this.g = null;
    }

    private void e() {
        POBLog.debug("POBNativeAdLoader", POBLogConstants.MSG_SCHEDULE_LOAD_AD_DELAY, new Object[0]);
        POBTimeoutHandler pOBTimeoutHandler = new POBTimeoutHandler(new b());
        this.g = pOBTimeoutHandler;
        pOBTimeoutHandler.start(500L);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    public void addExtraInfo(@NonNull String str, @NonNull Object obj) {
        if (this.q == null) {
            this.q = new ConcurrentHashMap();
        }
        if (str == null || obj == null) {
            return;
        }
        this.q.put(str, obj);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    public void destroy() {
        this.o = POBDataType.POBAdState.DEFAULT;
        this.k = false;
        d();
        this.h.clear();
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBRequest getAdRequest() {
        POBRequest pOBRequest = this.e;
        if (pOBRequest != null) {
            return pOBRequest;
        }
        POBLog.warn("POBNativeAdLoader", POBLogConstants.MSG_AD_OBJECT_INVALID, new Object[0]);
        return null;
    }

    @NonNull
    public POBNativeAdLoaderConfig getConfig() {
        return this.l;
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @Nullable
    public POBImpression getImpression() {
        return POBAdsHelper.getImpression(this.e);
    }

    @Override // com.pubmatic.sdk.openwrap.core.POBBaseAd
    @RequiresPermission
    @SuppressLint({"UnclosedTrace"})
    public void loadAd() {
        Trace.beginSection("POB Native Load Ad");
        Trace.beginSection("POB Request Building");
        if (this.m == null) {
            a(new POBError(1001, "Please set assets for specified template type as custom."));
            return;
        }
        if (getAdRequest() == null || this.c == null) {
            a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
            return;
        }
        int i = this.i;
        if (i >= 5) {
            POBTaskHandler.getInstance().runOnMainThread(new a(new POBError(1012, String.format(Locale.ENGLISH, POBLogConstants.AD_LOAD_THRESHOLD_MSG, 5))));
            return;
        }
        this.i = i + 1;
        if (this.j) {
            b();
            return;
        }
        this.o = POBDataType.POBAdState.LOAD_DEFERRED;
        if (this.k) {
            return;
        }
        e();
        this.k = true;
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.POBNativeAdManagerListener
    public void onAdReceived(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBNativeAd pOBNativeAd) {
        Trace.endSection();
        a(pOBNativeAdManager);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onAdReceived(this, pOBNativeAd);
        }
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.c
    public void onBidFailure(@NonNull POBNativeAdManager pOBNativeAdManager) {
        this.o = POBDataType.POBAdState.BID_FAILED;
        a(pOBNativeAdManager);
    }

    @Override // com.pubmatic.sdk.nativead.POBNativeAdManager.POBNativeAdManagerListener
    public void onFailedToLoad(@NonNull POBNativeAdManager pOBNativeAdManager, @NonNull POBError pOBError) {
        Trace.endSection();
        a(pOBNativeAdManager);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onFailedToLoad(this, pOBError);
        }
    }

    public void setAdLoaderListener(@Nullable POBNativeAdLoaderListener pOBNativeAdLoaderListener) {
        this.d = pOBNativeAdLoaderListener;
    }

    public void setBidEventListener(@Nullable POBBidEventListener pOBBidEventListener) {
        this.n = pOBBidEventListener;
    }

    public void setNativeCustomAssets(@NonNull List<POBBaseNativeRequestAsset> list) {
        if (!POBNativeTemplateType.CUSTOM.equals(this.b)) {
            POBLog.warn("POBNativeAdLoader", POBNativeLogConstants.STANDARD_TEMPLATE_CUSTOM_ASSETS, new Object[0]);
        } else {
            if (POBUtils.isListNullOrEmpty(list)) {
                return;
            }
            a(list);
        }
    }

    private void b() {
        POBNativeAdEvent pOBNativeAdEvent;
        this.o = POBDataType.POBAdState.LOADING;
        if (this.e == null || (pOBNativeAdEvent = this.c) == null) {
            a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
        } else {
            a(this.e, pOBNativeAdEvent.createNativeAdEventBridge());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.o == POBDataType.POBAdState.LOAD_DEFERRED) {
            for (int i = 0; i < this.i; i++) {
                b();
            }
        }
    }

    public POBNativeAdLoader(@NonNull Context context, @NonNull String str, int i, @NonNull String str2, @NonNull POBNativeTemplateType pOBNativeTemplateType) {
        this(context, str, i, str2, pOBNativeTemplateType, new POBDefaultNativeEventHandler());
    }

    public POBNativeAdLoader(@NonNull Context context) {
        this(context, POBNativeTemplateType.CUSTOM);
        this.c = new POBDefaultNativeEventHandler();
    }

    private void a(POBRequest pOBRequest, POBNativeAdEventBridge pOBNativeAdEventBridge) {
        POBProfileInfo pOBProfileInfo;
        if (this.f != null) {
            pOBProfileInfo = this.f.getProfileInfo(String.valueOf(pOBRequest.getProfileId()));
        } else {
            pOBProfileInfo = null;
        }
        POBNativeAdManager pOBNativeAdManager = new POBNativeAdManager(this.a, this.b, pOBNativeAdEventBridge);
        pOBNativeAdManager.setListener(this);
        POBBidEventListener pOBBidEventListener = this.n;
        if (pOBBidEventListener != null) {
            pOBNativeAdManager.setBidEventListener(pOBBidEventListener);
            pOBNativeAdManager.a(this);
        }
        this.h.add(pOBNativeAdManager);
        pOBNativeAdManager.loadAd(pOBRequest, pOBProfileInfo);
    }

    private POBNativeAdLoader(Context context, POBNativeTemplateType pOBNativeTemplateType) {
        this.j = false;
        this.k = false;
        this.o = POBDataType.POBAdState.DEFAULT;
        this.p = POBBiddingHost.UNKNOWN;
        this.a = context;
        this.b = pOBNativeTemplateType;
        this.l = new POBNativeAdLoaderConfig();
        this.h = Collections.synchronizedSet(new LinkedHashSet(5));
    }

    private void a(Context context, String str, int i, String str2, POBNativeTemplateType pOBNativeTemplateType, POBNativeAdEvent pOBNativeAdEvent) {
        if (POBAdsHelper.validate(context, str, str2, pOBNativeAdEvent) && pOBNativeTemplateType != null) {
            if (!this.j) {
                OpenWrapSDK.initialize(context, new OpenWrapSDKConfig.Builder(str, new ArrayList(Collections.singletonList(Integer.valueOf(i)))).build(), new c());
            }
            this.c = pOBNativeAdEvent;
            POBImpression pOBImpression = new POBImpression(getImpressionId(), str2, false, false);
            pOBImpression.setMRAIDAppStatusEnabled(false);
            this.e = POBRequest.createInstance(str, i, POBAdFormat.NATIVE, pOBImpression);
            this.f = POBInstanceProvider.getCacheManager(context.getApplicationContext());
            if (POBNativeTemplateType.CUSTOM.equals(pOBNativeTemplateType)) {
                return;
            }
            a(a(pOBNativeTemplateType));
            return;
        }
        a(new POBError(1001, POBLogConstants.MSG_MISSING_INPUT_PARAMS));
    }

    @RequiresPermission
    @SuppressLint({"UnclosedTrace"})
    public void loadAd(@NonNull String str, @NonNull POBBiddingHost pOBBiddingHost) {
        Trace.beginSection("POB Native Load Ad");
        Trace.beginSection("POB Response Parsing");
        if (POBUtils.isNullOrEmpty(str)) {
            a(new POBError(1007, POBLogConstants.MSG_MISSING_BID_RESPONSE));
            return;
        }
        if (pOBBiddingHost == null) {
            a(new POBError(1006, POBLogConstants.MSG_INVALID_BIDDING_HOST));
            return;
        }
        POBNativeAdEvent pOBNativeAdEvent = this.c;
        if (pOBNativeAdEvent == null) {
            a(new POBError(1006, POBLogConstants.MSG_FAILED_BID_EVENT));
            return;
        }
        this.o = POBDataType.POBAdState.LOADING;
        this.p = pOBBiddingHost;
        POBNativeAdManager pOBNativeAdManager = new POBNativeAdManager(this.a, this.b, pOBNativeAdEvent.createNativeAdEventBridge());
        pOBNativeAdManager.setListener(this);
        POBBidEventListener pOBBidEventListener = this.n;
        if (pOBBidEventListener != null) {
            pOBNativeAdManager.setBidEventListener(pOBBidEventListener);
            pOBNativeAdManager.a(this);
        }
        if (POBBiddingHostKt.isAdMob(pOBBiddingHost)) {
            Object valueFromMap = POBUtils.getValueFromMap(this.q, POBConstants.KEY_POB_ADMOB_WATERMARK);
            if (valueFromMap instanceof String) {
                pOBNativeAdManager.a((String) valueFromMap);
            } else {
                POBLog.warn("POBNativeAdLoader", POBLogConstants.MSG_WATERMARK_PASSED_ERROR, new Object[0]);
            }
        }
        this.h.add(pOBNativeAdManager);
        pOBNativeAdManager.loadAd(str);
    }

    private void a(List list) {
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider(POBCommonConstants.NATIVE_MEASUREMENT_PROVIDER_CLASS) != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        POBNativeBuilder pOBNativeBuilder = new POBNativeBuilder(list, a(), hashSet);
        this.m = pOBNativeBuilder;
        pOBNativeBuilder.setConfig(this.l);
        POBImpression impression = getImpression();
        if (impression != null) {
            impression.setNative(this.m);
        }
    }

    private List a() {
        POBNativeEventType pOBNativeEventType = POBNativeEventType.IMPRESSION;
        POBNativeEventTrackingMethod pOBNativeEventTrackingMethod = POBNativeEventTrackingMethod.JAVASCRIPT;
        return Arrays.asList(new POBNativeRequestEventTracker(pOBNativeEventType, Arrays.asList(POBNativeEventTrackingMethod.IMAGE, pOBNativeEventTrackingMethod)), new POBNativeRequestEventTracker(POBNativeEventType.OMID, Collections.singletonList(pOBNativeEventTrackingMethod)));
    }

    private List a(POBNativeTemplateType pOBNativeTemplateType) {
        int i;
        POBNativeRequestTitleAsset pOBNativeRequestTitleAsset = new POBNativeRequestTitleAsset(25, true);
        POBNativeRequestDataAsset pOBNativeRequestDataAsset = new POBNativeRequestDataAsset(POBNativeDataAssetType.DESCRIPTION, true);
        pOBNativeRequestDataAsset.setLength(90);
        POBNativeTemplateType pOBNativeTemplateType2 = POBNativeTemplateType.SMALL;
        int i2 = 100;
        int i3 = pOBNativeTemplateType == pOBNativeTemplateType2 ? 100 : 50;
        POBNativeRequestImageAsset pOBNativeRequestImageAsset = new POBNativeRequestImageAsset(POBNativeImageAssetType.ICON, true, i3, i3);
        POBNativeRequestDataAsset pOBNativeRequestDataAsset2 = new POBNativeRequestDataAsset(POBNativeDataAssetType.CTA_TEXT, true);
        pOBNativeRequestDataAsset2.setLength(15);
        if (pOBNativeTemplateType == pOBNativeTemplateType2) {
            i = 100;
        } else {
            i2 = 144;
            i = 284;
        }
        POBNativeRequestVideoAsset pOBNativeRequestVideoAsset = new POBNativeRequestVideoAsset(false, 5, 60, POBCommonConstants.VIDEO_PROTOCOLS_DEFAULT, POBVideoPlayer.SupportedMediaType.getStringValues());
        pOBNativeRequestVideoAsset.setWidth(Integer.valueOf(i));
        pOBNativeRequestVideoAsset.setHeight(Integer.valueOf(i2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(pOBNativeRequestTitleAsset);
        arrayList.add(pOBNativeRequestDataAsset);
        arrayList.add(pOBNativeRequestImageAsset);
        arrayList.add(pOBNativeRequestDataAsset2);
        arrayList.add(pOBNativeRequestVideoAsset);
        if (pOBNativeTemplateType == POBNativeTemplateType.MEDIUM) {
            arrayList.add(new POBNativeRequestImageAsset(POBNativeImageAssetType.MAIN, true, 284, 144));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        Trace.endSection();
        Trace.endSection();
        POBLog.error("POBNativeAdLoader", "%s", pOBError);
        POBNativeAdLoaderListener pOBNativeAdLoaderListener = this.d;
        if (pOBNativeAdLoaderListener != null) {
            pOBNativeAdLoaderListener.onFailedToLoad(this, pOBError);
        }
    }

    private void a(POBNativeAdManager pOBNativeAdManager) {
        this.i--;
        this.h.remove(pOBNativeAdManager);
    }
}
