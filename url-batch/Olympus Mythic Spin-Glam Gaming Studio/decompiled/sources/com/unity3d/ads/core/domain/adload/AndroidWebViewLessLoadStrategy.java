package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AdRefresh;
import com.unity3d.ads.core.domain.CacheAssets;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: AndroidWebViewLessLoadStrategy.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0096B¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/domain/adload/AndroidWebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "cacheAssets", "Lcom/unity3d/ads/core/domain/CacheAssets;", "adRefresh", "Lcom/unity3d/ads/core/domain/AdRefresh;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/CacheAssets;Lcom/unity3d/ads/core/domain/AdRefresh;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "webViewUrl", "", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunityId", "Lcom/google/protobuf/ByteString;", "response", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "placementId", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AndroidWebViewLessLoadStrategy implements WebViewLessLoadStrategy {

    @NotNull
    private final AdRefresh adRefresh;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheAssets cacheAssets;

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidWebViewLessLoadStrategy(@NotNull AdRepository adRepository, @NotNull CampaignRepository campaignRepository, @NotNull CacheAssets cacheAssets, @NotNull AdRefresh adRefresh, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(cacheAssets, "cacheAssets");
        Intrinsics.checkNotNullParameter(adRefresh, "adRefresh");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.adRepository = adRepository;
        this.campaignRepository = campaignRepository;
        this.cacheAssets = cacheAssets;
        this.adRefresh = adRefresh;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull String str2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, @NotNull Continuation continuation) {
        AndroidWebViewLessLoadStrategy$invoke$1 androidWebViewLessLoadStrategy$invoke$1;
        int i;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        ByteString byteString2;
        boolean z2;
        String str3;
        AdObject adObject;
        CacheAssetsEvent cacheAssetsEvent;
        String str4;
        String str5;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        ByteString byteString3;
        boolean z3;
        String objectId;
        JSONObject data;
        if (continuation instanceof AndroidWebViewLessLoadStrategy$invoke$1) {
            androidWebViewLessLoadStrategy$invoke$1 = (AndroidWebViewLessLoadStrategy$invoke$1) continuation;
            int i2 = androidWebViewLessLoadStrategy$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidWebViewLessLoadStrategy$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidWebViewLessLoadStrategy$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidWebViewLessLoadStrategy$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteString trackingToken = adResponse.getTrackingToken();
                    Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                    AdObject adObject2 = new AdObject(coroutineScope, byteString, str2, trackingToken, false, null, null, null, unityAdsLoadOptions, z, diagnosticAdType, null, null, null, null, null, new AdObject.WebViewLessLoadingRequiredData(str, adResponse, null, 4, null), 63728, null);
                    CacheAssets cacheAssets = this.cacheAssets;
                    List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = adResponse.getCampaignMetadata().getAssetsToCacheList();
                    Intrinsics.checkNotNullExpressionValue(assetsToCacheList, "getAssetsToCacheList(...)");
                    unityAdsLoadOptions2 = unityAdsLoadOptions;
                    androidWebViewLessLoadStrategy$invoke$1.L$0 = unityAdsLoadOptions2;
                    byteString2 = byteString;
                    androidWebViewLessLoadStrategy$invoke$1.L$1 = byteString2;
                    androidWebViewLessLoadStrategy$invoke$1.L$2 = str2;
                    androidWebViewLessLoadStrategy$invoke$1.L$3 = adObject2;
                    z2 = z;
                    androidWebViewLessLoadStrategy$invoke$1.Z$0 = z2;
                    androidWebViewLessLoadStrategy$invoke$1.label = 1;
                    Object invoke = cacheAssets.invoke(adObject2, assetsToCacheList, androidWebViewLessLoadStrategy$invoke$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = str2;
                    adObject = adObject2;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = androidWebViewLessLoadStrategy$invoke$1.Z$0;
                        adObject = (AdObject) androidWebViewLessLoadStrategy$invoke$1.L$3;
                        str5 = (String) androidWebViewLessLoadStrategy$invoke$1.L$2;
                        byteString3 = (ByteString) androidWebViewLessLoadStrategy$invoke$1.L$1;
                        unityAdsLoadOptions3 = (UnityAdsLoadOptions) androidWebViewLessLoadStrategy$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        objectId = unityAdsLoadOptions3.getObjectId();
                        if ((objectId != null || StringsKt.isBlank(objectId)) && (data = unityAdsLoadOptions3.getData()) != null && !data.has("adMarkup")) {
                            this.adRepository.enqueueOpportunityForPlacement(str5, byteString3);
                        }
                        if (z3) {
                            this.sessionRepository.incrementTokenWinsCount();
                        }
                        return new LoadResult.Success(adObject);
                    }
                    boolean z4 = androidWebViewLessLoadStrategy$invoke$1.Z$0;
                    AdObject adObject3 = (AdObject) androidWebViewLessLoadStrategy$invoke$1.L$3;
                    str3 = (String) androidWebViewLessLoadStrategy$invoke$1.L$2;
                    ByteString byteString4 = (ByteString) androidWebViewLessLoadStrategy$invoke$1.L$1;
                    UnityAdsLoadOptions unityAdsLoadOptions4 = (UnityAdsLoadOptions) androidWebViewLessLoadStrategy$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z4;
                    adObject = adObject3;
                    byteString2 = byteString4;
                    unityAdsLoadOptions2 = unityAdsLoadOptions4;
                }
                cacheAssetsEvent = (CacheAssetsEvent) obj;
                if (!(cacheAssetsEvent instanceof CacheAssetsEvent.Success)) {
                    this.campaignRepository.setLoadTimestamp(byteString2);
                    this.adRepository.addAd(byteString2, adObject);
                    AdRefresh adRefresh = this.adRefresh;
                    androidWebViewLessLoadStrategy$invoke$1.L$0 = unityAdsLoadOptions2;
                    androidWebViewLessLoadStrategy$invoke$1.L$1 = byteString2;
                    androidWebViewLessLoadStrategy$invoke$1.L$2 = str3;
                    androidWebViewLessLoadStrategy$invoke$1.L$3 = adObject;
                    androidWebViewLessLoadStrategy$invoke$1.Z$0 = z2;
                    androidWebViewLessLoadStrategy$invoke$1.label = 2;
                    if (adRefresh.invoke(adObject, androidWebViewLessLoadStrategy$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str5 = str3;
                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                    byteString3 = byteString2;
                    z3 = z2;
                    objectId = unityAdsLoadOptions3.getObjectId();
                    if (objectId != null) {
                    }
                    this.adRepository.enqueueOpportunityForPlacement(str5, byteString3);
                    if (z3) {
                    }
                    return new LoadResult.Success(adObject);
                }
                ErrorOuterClass.PublicErrorCode publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM;
                CacheAssetsEvent.Failure failure = cacheAssetsEvent instanceof CacheAssetsEvent.Failure ? (CacheAssetsEvent.Failure) cacheAssetsEvent : null;
                if (failure == null || (str4 = failure.getMessage()) == null) {
                    str4 = "";
                }
                return new LoadResult.Failure(publicErrorCode, null, null, str4, null, null, 54, null);
            }
        }
        androidWebViewLessLoadStrategy$invoke$1 = new AndroidWebViewLessLoadStrategy$invoke$1(this, continuation);
        Object obj2 = androidWebViewLessLoadStrategy$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidWebViewLessLoadStrategy$invoke$1.label;
        if (i != 0) {
        }
        cacheAssetsEvent = (CacheAssetsEvent) obj2;
        if (!(cacheAssetsEvent instanceof CacheAssetsEvent.Success)) {
        }
    }
}
