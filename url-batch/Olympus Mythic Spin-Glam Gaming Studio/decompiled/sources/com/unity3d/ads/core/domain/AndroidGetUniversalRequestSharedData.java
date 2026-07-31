package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetUniversalRequestSharedData.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "developerConsentRepository", "Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/data/repository/DeveloperConsentRepository;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$SharedData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {

    @NotNull
    private final DeveloperConsentRepository developerConsentRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetLimitedSessionToken getLimitedSessionToken;

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(@NotNull GetSharedDataTimestamps getSharedDataTimestamps, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull GetLimitedSessionToken getLimitedSessionToken, @NotNull DeveloperConsentRepository developerConsentRepository) {
        Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        Intrinsics.checkNotNullParameter(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidGetUniversalRequestSharedData$invoke$1 androidGetUniversalRequestSharedData$invoke$1;
        int i;
        UniversalRequestKt.SharedDataKt.Dsl _create;
        UniversalRequestKt.SharedDataKt.Dsl dsl;
        UniversalRequestKt.SharedDataKt.Dsl dsl2;
        UniversalRequestKt.SharedDataKt.Dsl dsl3;
        if (continuation instanceof AndroidGetUniversalRequestSharedData$invoke$1) {
            androidGetUniversalRequestSharedData$invoke$1 = (AndroidGetUniversalRequestSharedData$invoke$1) continuation;
            int i2 = androidGetUniversalRequestSharedData$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetUniversalRequestSharedData$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetUniversalRequestSharedData$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetUniversalRequestSharedData$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.INSTANCE;
                    UniversalRequestOuterClass.UniversalRequest.SharedData.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    ByteString sessionToken = this.sessionRepository.getSessionToken();
                    if (!sessionToken.isEmpty()) {
                        _create.setSessionToken(sessionToken);
                        dsl3 = _create;
                        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
                        _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
                        _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
                        _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
                        _create.setPii(this.deviceInfoRepository.getPiiData());
                        return dsl3._build();
                    }
                    GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                    androidGetUniversalRequestSharedData$invoke$1.L$0 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$1 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.L$2 = _create;
                    androidGetUniversalRequestSharedData$invoke$1.label = 1;
                    Object invoke = getLimitedSessionToken.invoke(androidGetUniversalRequestSharedData$invoke$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dsl = _create;
                    dsl2 = dsl;
                    obj = invoke;
                    dsl3 = dsl2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$2;
                    dsl2 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$1;
                    dsl3 = (UniversalRequestKt.SharedDataKt.Dsl) androidGetUniversalRequestSharedData$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                _create = dsl2;
                _create.setTimestamps(this.getSharedDataTimestamps.invoke());
                _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
                _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
                _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
                _create.setPii(this.deviceInfoRepository.getPiiData());
                return dsl3._build();
            }
        }
        androidGetUniversalRequestSharedData$invoke$1 = new AndroidGetUniversalRequestSharedData$invoke$1(this, continuation);
        Object obj2 = androidGetUniversalRequestSharedData$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetUniversalRequestSharedData$invoke$1.label;
        if (i != 0) {
        }
        dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj2);
        _create = dsl2;
        _create.setTimestamps(this.getSharedDataTimestamps.invoke());
        _create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
        _create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
        _create.setDeveloperConsent(this.developerConsentRepository.getDeveloperConsent());
        _create.setPii(this.deviceInfoRepository.getPiiData());
        return dsl3._build();
    }
}
