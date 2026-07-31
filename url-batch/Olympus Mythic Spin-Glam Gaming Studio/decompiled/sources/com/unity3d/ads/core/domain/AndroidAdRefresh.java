package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh;", "Lcom/unity3d/ads/core/domain/AdRefresh;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "cacheAssets", "Lcom/unity3d/ads/core/domain/CacheAssets;", ToolBar.REFRESH, "Lcom/unity3d/ads/core/domain/Refresh;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/Refresh;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performRefresh", "opportunityId", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canUpdateRefreshData", "", "state", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidAdRefresh implements AdRefresh {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<AdObjectState> NON_UPDATABLE_STATES = SetsKt.setOf((Object[]) new AdObjectState[]{AdObjectState.SHOWING, AdObjectState.COMPLETED, AdObjectState.EXPIRED});

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheAssets cacheAssets;

    @NotNull
    private final Refresh refresh;

    public AndroidAdRefresh(@NotNull AdRepository adRepository, @NotNull CacheAssets cacheAssets, @NotNull Refresh refresh) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(cacheAssets, "cacheAssets");
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        this.adRepository = adRepository;
        this.cacheAssets = cacheAssets;
        this.refresh = refresh;
    }

    @Override // com.unity3d.ads.core.domain.AdRefresh
    @Nullable
    public Object invoke(@NotNull AdObject adObject, @NotNull Continuation continuation) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(adObject.getAdScope().getCoroutineContext().plus(new CoroutineName("Ad_Refresh")));
        final MutableSharedFlow broadcastEventChannel = AdPlayer.INSTANCE.getBroadcastEventChannel();
        final String str = "AD_REFRESH";
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ String receiver$inlined;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2", f = "AndroidAdRefresh.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (this.receiver$inlined.equals(obj)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, str), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, new AndroidAdRefresh$invoke$3(CoroutineScope, adObject, this, null)), CoroutineScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performRefresh(ByteString byteString, Continuation continuation) {
        AndroidAdRefresh$performRefresh$1 androidAdRefresh$performRefresh$1;
        int i;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;
        AdResponseOuterClass.AdResponse adResponse;
        ByteString adDataRefreshToken;
        AdObject adObject;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        AdObject adObject2;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData3;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse2;
        AdObject adObject3;
        AdRefreshState adRefreshState;
        if (continuation instanceof AndroidAdRefresh$performRefresh$1) {
            androidAdRefresh$performRefresh$1 = (AndroidAdRefresh$performRefresh$1) continuation;
            int i2 = androidAdRefresh$performRefresh$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidAdRefresh$performRefresh$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidAdRefresh$performRefresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidAdRefresh$performRefresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AdObject ad = this.adRepository.getAd(byteString);
                    if (ad == null) {
                        throw new IllegalStateException(("No adObject for opportunityId: " + byteString).toString());
                    }
                    webViewLessLoadingRequiredData = ad.getWebViewLessLoadingRequiredData();
                    if (webViewLessLoadingRequiredData == null || (adResponse = webViewLessLoadingRequiredData.getAdResponse()) == null) {
                        return Unit.INSTANCE;
                    }
                    adDataRefreshToken = adResponse.getAdDataRefreshToken();
                    if (adDataRefreshToken != null && !adDataRefreshToken.isEmpty()) {
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(adResponse.getCampaignMetadata().getAdDataRefreshDelayMs(), DurationUnit.MILLISECONDS);
                        androidAdRefresh$performRefresh$1.L$0 = byteString;
                        androidAdRefresh$performRefresh$1.L$1 = ad;
                        androidAdRefresh$performRefresh$1.L$2 = webViewLessLoadingRequiredData;
                        androidAdRefresh$performRefresh$1.L$3 = adDataRefreshToken;
                        androidAdRefresh$performRefresh$1.label = 1;
                        if (DelayKt.m8203delayVtjQ1oo(duration, androidAdRefresh$performRefresh$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        adObject = ad;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i == 2) {
                        webViewLessLoadingRequiredData2 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                        adObject2 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                        if (!adDataRefreshResponse.hasError()) {
                            if (adDataRefreshResponse.getError().getErrorCode() == ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL) {
                                adRefreshState = AdRefreshState.REUSE_NO_FILL;
                            } else {
                                adRefreshState = AdRefreshState.REUSE_ERROR;
                            }
                            webViewLessLoadingRequiredData2.setAdRefreshState(adRefreshState);
                            return Unit.INSTANCE;
                        }
                        if (!adDataRefreshResponse.hasCampaignMetadata() || adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList().isEmpty()) {
                            webViewLessLoadingRequiredData2.setAdRefreshState(AdRefreshState.REUSE_NO_FILL);
                            return Unit.INSTANCE;
                        }
                        CacheAssets cacheAssets = this.cacheAssets;
                        List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adDataRefreshResponse.getCampaignMetadata().getAssetsToCacheList();
                        Intrinsics.checkNotNullExpressionValue(assetsToCacheList, "getAssetsToCacheList(...)");
                        androidAdRefresh$performRefresh$1.L$0 = adObject2;
                        androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData2;
                        androidAdRefresh$performRefresh$1.L$2 = adDataRefreshResponse;
                        androidAdRefresh$performRefresh$1.label = 3;
                        Object invoke = cacheAssets.invoke(adObject2, assetsToCacheList, androidAdRefresh$performRefresh$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        webViewLessLoadingRequiredData3 = webViewLessLoadingRequiredData2;
                        adDataRefreshResponse2 = adDataRefreshResponse;
                        obj = invoke;
                        adObject3 = adObject2;
                        if (!(((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success)) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adDataRefreshResponse2 = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) androidAdRefresh$performRefresh$1.L$2;
                    webViewLessLoadingRequiredData3 = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$1;
                    adObject3 = (AdObject) androidAdRefresh$performRefresh$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!(((CacheAssetsEvent) obj) instanceof CacheAssetsEvent.Success)) {
                        if (canUpdateRefreshData((AdObjectState) adObject3.getState().getValue())) {
                            webViewLessLoadingRequiredData3.setAdRefreshState(AdRefreshState.REUSE_RELOADED);
                            ByteString trackingToken = adDataRefreshResponse2.getTrackingToken();
                            Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                            adObject3.setTrackingToken(trackingToken);
                            AdResponseOuterClass.AdResponse adResponse2 = webViewLessLoadingRequiredData3.getAdResponse();
                            AdResponseKt.Dsl.Companion companion2 = AdResponseKt.Dsl.INSTANCE;
                            AdResponseOuterClass.AdResponse.Builder builder = adResponse2.toBuilder();
                            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
                            AdResponseKt.Dsl _create = companion2._create(builder);
                            ByteString adData = adDataRefreshResponse2.getAdData();
                            Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
                            _create.setAdData(adData);
                            ByteString adDataRefreshToken2 = adDataRefreshResponse2.getAdDataRefreshToken();
                            Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "getAdDataRefreshToken(...)");
                            _create.setAdDataRefreshToken(adDataRefreshToken2);
                            ByteString trackingToken2 = adDataRefreshResponse2.getTrackingToken();
                            Intrinsics.checkNotNullExpressionValue(trackingToken2, "getTrackingToken(...)");
                            _create.setTrackingToken(trackingToken2);
                            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = adDataRefreshResponse2.getCampaignMetadata();
                            Intrinsics.checkNotNullExpressionValue(campaignMetadata, "getCampaignMetadata(...)");
                            _create.setCampaignMetadata(campaignMetadata);
                            webViewLessLoadingRequiredData3.setAdResponse(_create._build());
                        }
                    } else {
                        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData4 = adObject3.getWebViewLessLoadingRequiredData();
                        if (webViewLessLoadingRequiredData4 != null) {
                            webViewLessLoadingRequiredData4.setAdRefreshState(AdRefreshState.REUSE_ERROR);
                        }
                    }
                    return Unit.INSTANCE;
                }
                ByteString byteString2 = (ByteString) androidAdRefresh$performRefresh$1.L$3;
                webViewLessLoadingRequiredData = (AdObject.WebViewLessLoadingRequiredData) androidAdRefresh$performRefresh$1.L$2;
                adObject = (AdObject) androidAdRefresh$performRefresh$1.L$1;
                ByteString byteString3 = (ByteString) androidAdRefresh$performRefresh$1.L$0;
                ResultKt.throwOnFailure(obj);
                adDataRefreshToken = byteString2;
                byteString = byteString3;
                if (canUpdateRefreshData((AdObjectState) adObject.getState().getValue())) {
                    return Unit.INSTANCE;
                }
                Refresh refresh = this.refresh;
                androidAdRefresh$performRefresh$1.L$0 = adObject;
                androidAdRefresh$performRefresh$1.L$1 = webViewLessLoadingRequiredData;
                androidAdRefresh$performRefresh$1.L$2 = null;
                androidAdRefresh$performRefresh$1.L$3 = null;
                androidAdRefresh$performRefresh$1.label = 2;
                obj = refresh.invoke(byteString, adDataRefreshToken, androidAdRefresh$performRefresh$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
                adObject2 = adObject;
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (!adDataRefreshResponse.hasError()) {
                }
            }
        }
        androidAdRefresh$performRefresh$1 = new AndroidAdRefresh$performRefresh$1(this, continuation);
        Object obj2 = androidAdRefresh$performRefresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidAdRefresh$performRefresh$1.label;
        if (i != 0) {
        }
        if (canUpdateRefreshData((AdObjectState) adObject.getState().getValue())) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUpdateRefreshData(AdObjectState state) {
        return !NON_UPDATABLE_STATES.contains(state);
    }

    /* compiled from: AndroidAdRefresh.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidAdRefresh$Companion;", "", "<init>", "()V", "NON_UPDATABLE_STATES", "", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "getNON_UPDATABLE_STATES", "()Ljava/util/Set;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Set<AdObjectState> getNON_UPDATABLE_STATES() {
            return AndroidAdRefresh.NON_UPDATABLE_STATES;
        }
    }
}
