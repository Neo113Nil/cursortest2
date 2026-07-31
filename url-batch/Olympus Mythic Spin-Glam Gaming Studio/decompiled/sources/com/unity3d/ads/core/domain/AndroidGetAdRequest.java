package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetAdRequest.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096B¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "webViewConfigurationDataSource", "Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/datasource/WebviewConfigurationDataSource;Lcom/unity3d/ads/core/data/repository/TcfRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", "size", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "loadConfiguration", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AndroidGetAdRequest implements GetAdRequest {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TcfRepository tcfRepository;

    @NotNull
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    public AndroidGetAdRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull CampaignRepository campaignRepository, @NotNull WebviewConfigurationDataSource webViewConfigurationDataSource, @NotNull TcfRepository tcfRepository) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(webViewConfigurationDataSource, "webViewConfigurationDataSource");
        Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webViewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0170 A[PHI: r1
      0x0170: PHI (r1v28 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x016d, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull String str, @NotNull ByteString byteString, @Nullable AdRequestOuterClass.BannerSize bannerSize, @Nullable LoadConfigurationInternal loadConfigurationInternal, @NotNull Continuation continuation) {
        AndroidGetAdRequest$invoke$1 androidGetAdRequest$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AdRequestKt.Dsl _create;
        String str2;
        ByteString byteString2;
        AdRequestOuterClass.BannerSize bannerSize2;
        LoadConfigurationInternal loadConfigurationInternal2;
        AdRequestKt.Dsl dsl;
        AdRequestKt.Dsl dsl2;
        AdRequestOuterClass.BannerSize bannerSize3;
        LoadConfigurationInternal loadConfigurationInternal3;
        AdRequestKt.Dsl dsl3;
        final AdRequestKt.Dsl dsl4;
        AdRequestKt.Dsl dsl5;
        String tcfString;
        if (continuation instanceof AndroidGetAdRequest$invoke$1) {
            androidGetAdRequest$invoke$1 = (AndroidGetAdRequest$invoke$1) continuation;
            int i2 = androidGetAdRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = androidGetAdRequest$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdRequest$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.INSTANCE;
                    AdRequestOuterClass.AdRequest.Builder newBuilder = AdRequestOuterClass.AdRequest.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    str2 = str;
                    androidGetAdRequest$invoke$1.L$0 = str2;
                    byteString2 = byteString;
                    androidGetAdRequest$invoke$1.L$1 = byteString2;
                    bannerSize2 = bannerSize;
                    androidGetAdRequest$invoke$1.L$2 = bannerSize2;
                    loadConfigurationInternal2 = loadConfigurationInternal;
                    androidGetAdRequest$invoke$1.L$3 = loadConfigurationInternal2;
                    androidGetAdRequest$invoke$1.L$4 = _create;
                    androidGetAdRequest$invoke$1.L$5 = _create;
                    androidGetAdRequest$invoke$1.L$6 = _create;
                    androidGetAdRequest$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdRequest$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dsl3 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                        dsl4 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$3;
                        dsl5 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$2;
                        loadConfigurationInternal3 = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$1;
                        bannerSize3 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
                        dsl4.setCampaignState(this.campaignRepository.getCampaignState());
                        if (bannerSize3 != null) {
                            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                        } else {
                            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                            dsl4.setBannerSize(bannerSize3);
                        }
                        tcfString = this.tcfRepository.getTcfString();
                        if (tcfString != null) {
                            dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                        }
                        if (loadConfigurationInternal3 != null) {
                            String mediationAdUnitId = loadConfigurationInternal3.getMediationAdUnitId();
                            if (mediationAdUnitId != null) {
                                new MutablePropertyReference0Impl(dsl4) { // from class: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$request$1$2$2
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((AdRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj2) {
                                        ((AdRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj2);
                                    }
                                }.set(mediationAdUnitId);
                            }
                            dsl4.putAllExtras(dsl4.getExtrasMap(), loadConfigurationInternal3.getExtras());
                        }
                        AdRequestOuterClass.AdRequest _build = dsl5._build();
                        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                        _create2.setAdRequest(_build);
                        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                        androidGetAdRequest$invoke$1.L$0 = null;
                        androidGetAdRequest$invoke$1.L$1 = null;
                        androidGetAdRequest$invoke$1.L$2 = null;
                        androidGetAdRequest$invoke$1.L$3 = null;
                        androidGetAdRequest$invoke$1.L$4 = null;
                        androidGetAdRequest$invoke$1.label = 3;
                        obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdRequest$invoke$1);
                        return obj != coroutine_suspended ? coroutine_suspended : obj;
                    }
                    _create = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$6;
                    AdRequestKt.Dsl dsl6 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$5;
                    AdRequestKt.Dsl dsl7 = (AdRequestKt.Dsl) androidGetAdRequest$invoke$1.L$4;
                    LoadConfigurationInternal loadConfigurationInternal4 = (LoadConfigurationInternal) androidGetAdRequest$invoke$1.L$3;
                    AdRequestOuterClass.BannerSize bannerSize4 = (AdRequestOuterClass.BannerSize) androidGetAdRequest$invoke$1.L$2;
                    ByteString byteString3 = (ByteString) androidGetAdRequest$invoke$1.L$1;
                    String str3 = (String) androidGetAdRequest$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dsl = dsl6;
                    str2 = str3;
                    dsl2 = dsl7;
                    byteString2 = byteString3;
                    loadConfigurationInternal2 = loadConfigurationInternal4;
                    bannerSize2 = bannerSize4;
                }
                _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl.setImpressionOpportunityId(byteString2);
                dsl.setPlacementId(str2);
                dsl.setRequestImpressionConfiguration(true);
                WebviewConfigurationDataSource webviewConfigurationDataSource = this.webViewConfigurationDataSource;
                androidGetAdRequest$invoke$1.L$0 = bannerSize2;
                androidGetAdRequest$invoke$1.L$1 = loadConfigurationInternal2;
                androidGetAdRequest$invoke$1.L$2 = dsl2;
                androidGetAdRequest$invoke$1.L$3 = dsl;
                androidGetAdRequest$invoke$1.L$4 = dsl;
                androidGetAdRequest$invoke$1.L$5 = null;
                androidGetAdRequest$invoke$1.L$6 = null;
                androidGetAdRequest$invoke$1.label = 2;
                obj = webviewConfigurationDataSource.get(androidGetAdRequest$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                bannerSize3 = bannerSize2;
                loadConfigurationInternal3 = loadConfigurationInternal2;
                dsl3 = dsl;
                dsl4 = dsl3;
                dsl5 = dsl2;
                dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) obj).getVersion());
                dsl4.setCampaignState(this.campaignRepository.getCampaignState());
                if (bannerSize3 != null) {
                }
                tcfString = this.tcfRepository.getTcfString();
                if (tcfString != null) {
                }
                if (loadConfigurationInternal3 != null) {
                }
                AdRequestOuterClass.AdRequest _build3 = dsl5._build();
                UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
                _create22.setAdRequest(_build3);
                UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
                androidGetAdRequest$invoke$1.L$0 = null;
                androidGetAdRequest$invoke$1.L$1 = null;
                androidGetAdRequest$invoke$1.L$2 = null;
                androidGetAdRequest$invoke$1.L$3 = null;
                androidGetAdRequest$invoke$1.L$4 = null;
                androidGetAdRequest$invoke$1.label = 3;
                obj = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdRequest$invoke$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        androidGetAdRequest$invoke$1 = new AndroidGetAdRequest$invoke$1(this, continuation);
        obj = androidGetAdRequest$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdRequest$invoke$1.label;
        if (i != 0) {
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setImpressionOpportunityId(byteString2);
        dsl.setPlacementId(str2);
        dsl.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource2 = this.webViewConfigurationDataSource;
        androidGetAdRequest$invoke$1.L$0 = bannerSize2;
        androidGetAdRequest$invoke$1.L$1 = loadConfigurationInternal2;
        androidGetAdRequest$invoke$1.L$2 = dsl2;
        androidGetAdRequest$invoke$1.L$3 = dsl;
        androidGetAdRequest$invoke$1.L$4 = dsl;
        androidGetAdRequest$invoke$1.L$5 = null;
        androidGetAdRequest$invoke$1.L$6 = null;
        androidGetAdRequest$invoke$1.label = 2;
        obj = webviewConfigurationDataSource2.get(androidGetAdRequest$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
