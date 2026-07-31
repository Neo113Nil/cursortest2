package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetAdDataRefreshRequest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "opportunityId", "Lcom/google/protobuf/ByteString;", "refreshToken", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetAdDataRefreshRequest(@NotNull GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull CampaignRepository campaignRepository) {
        Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6 A[PHI: r10
      0x00d6: PHI (r10v10 java.lang.Object) = (r10v9 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x00d3, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull Continuation continuation) {
        AndroidGetAdDataRefreshRequest$invoke$1 androidGetAdDataRefreshRequest$invoke$1;
        int i;
        ByteString byteString3;
        ByteString byteString4;
        AdDataRefreshRequestKt.Dsl dsl;
        AdDataRefreshRequestKt.Dsl dsl2;
        AdDataRefreshRequestKt.Dsl dsl3;
        if (continuation instanceof AndroidGetAdDataRefreshRequest$invoke$1) {
            androidGetAdDataRefreshRequest$invoke$1 = (AndroidGetAdDataRefreshRequest$invoke$1) continuation;
            int i2 = androidGetAdDataRefreshRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdDataRefreshRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdDataRefreshRequest$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdDataRefreshRequest$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.INSTANCE;
                    AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    AdDataRefreshRequestKt.Dsl _create = companion._create(newBuilder);
                    _create.setSessionCounters(this.sessionRepository.getSessionCounters());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdDataRefreshRequest$invoke$1.L$0 = byteString;
                    androidGetAdDataRefreshRequest$invoke$1.L$1 = byteString2;
                    androidGetAdDataRefreshRequest$invoke$1.L$2 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$3 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.L$4 = _create;
                    androidGetAdDataRefreshRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(androidGetAdDataRefreshRequest$invoke$1);
                    if (staticDeviceInfo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    byteString3 = byteString;
                    byteString4 = byteString2;
                    dsl = _create;
                    dsl2 = dsl;
                    obj = staticDeviceInfo;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$4;
                    dsl2 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$3;
                    dsl3 = (AdDataRefreshRequestKt.Dsl) androidGetAdDataRefreshRequest$invoke$1.L$2;
                    byteString4 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$1;
                    byteString3 = (ByteString) androidGetAdDataRefreshRequest$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl2.setImpressionOpportunityId(byteString3);
                dsl2.setCampaignState(this.campaignRepository.getCampaignState());
                if (!byteString4.isEmpty()) {
                    dsl2.setAdDataRefreshToken(byteString4);
                }
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build = dsl3._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setAdDataRefreshRequest(_build);
                UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
                androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
                androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
                androidGetAdDataRefreshRequest$invoke$1.label = 2;
                obj = getUniversalRequestForPayLoad.invoke(_build2, androidGetAdDataRefreshRequest$invoke$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        androidGetAdDataRefreshRequest$invoke$1 = new AndroidGetAdDataRefreshRequest$invoke$1(this, continuation);
        Object obj2 = androidGetAdDataRefreshRequest$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdDataRefreshRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2);
        dsl2.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString3);
        dsl2.setCampaignState(this.campaignRepository.getCampaignState());
        if (!byteString4.isEmpty()) {
        }
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build3 = dsl3._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion22 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder22 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create22 = companion22._create(newBuilder22);
        _create22.setAdDataRefreshRequest(_build3);
        UniversalRequestOuterClass.UniversalRequest.Payload _build22 = _create22._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = this.getUniversalRequestForPayLoad;
        androidGetAdDataRefreshRequest$invoke$1.L$0 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$1 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$2 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$3 = null;
        androidGetAdDataRefreshRequest$invoke$1.L$4 = null;
        androidGetAdDataRefreshRequest$invoke$1.label = 2;
        obj2 = getUniversalRequestForPayLoad2.invoke(_build22, androidGetAdDataRefreshRequest$invoke$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}
