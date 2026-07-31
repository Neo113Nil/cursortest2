package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.BannerSize;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidBuildHeaderBiddingToken.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096B¢\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "generateId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getInitializationData", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "tcfRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "testDataInfo", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "offerwallManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "mediationInfoConverter", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "<init>", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/domain/GetInitializationData;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/repository/TcfRepository;Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "invoke", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetByteStringId generateId;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final GetInitializationData getInitializationData;

    @NotNull
    private final GetLimitedSessionToken getLimitedSessionToken;

    @NotNull
    private final GetSharedDataTimestamps getTimestamps;

    @NotNull
    private final MediationInfoConverter mediationInfoConverter;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TcfRepository tcfRepository;

    @NotNull
    private final AndroidTestDataInfo testDataInfo;

    public AndroidBuildHeaderBiddingToken(@NotNull GetByteStringId generateId, @NotNull GetClientInfo getClientInfo, @NotNull GetSharedDataTimestamps getTimestamps, @NotNull GetLimitedSessionToken getLimitedSessionToken, @NotNull GetInitializationData getInitializationData, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CampaignRepository campaignRepository, @NotNull TcfRepository tcfRepository, @NotNull AndroidTestDataInfo testDataInfo, @NotNull OfferwallManager offerwallManager, @NotNull MediationInfoConverter mediationInfoConverter) {
        Intrinsics.checkNotNullParameter(generateId, "generateId");
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(getTimestamps, "getTimestamps");
        Intrinsics.checkNotNullParameter(getLimitedSessionToken, "getLimitedSessionToken");
        Intrinsics.checkNotNullParameter(getInitializationData, "getInitializationData");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        Intrinsics.checkNotNullParameter(tcfRepository, "tcfRepository");
        Intrinsics.checkNotNullParameter(testDataInfo, "testDataInfo");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(mediationInfoConverter, "mediationInfoConverter");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @NotNull Continuation continuation) {
        AndroidBuildHeaderBiddingToken$invoke$1 androidBuildHeaderBiddingToken$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i2;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl _create;
        TokenConfiguration tokenConfiguration2;
        ByteString byteString;
        HeaderBiddingTokenKt.Dsl dsl;
        HeaderBiddingTokenKt.Dsl dsl2;
        String tcfString;
        HeaderBiddingTokenKt.Dsl dsl3;
        ByteString byteString2;
        TokenCounters tokenCounters2;
        String userIdentifier;
        HeaderBiddingTokenKt.Dsl dsl4;
        TokenCounters tokenCounters3;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        HeaderBiddingTokenKt.Dsl dsl7;
        TokenCounters tokenCounters4;
        TestDataOuterClass.TestData invoke;
        if (continuation instanceof AndroidBuildHeaderBiddingToken$invoke$1) {
            androidBuildHeaderBiddingToken$invoke$1 = (AndroidBuildHeaderBiddingToken$invoke$1) continuation;
            int i3 = androidBuildHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                androidBuildHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                obj = androidBuildHeaderBiddingToken$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = androidBuildHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    tokenCounters = this.sessionRepository.getTokenCounters();
                    ByteString sessionToken = this.sessionRepository.getSessionToken();
                    this.sessionRepository.incrementTokenSequenceNumber();
                    HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
                    HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
                    Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                    _create = companion._create(newBuilder);
                    _create.setTokenId(this.generateId.invoke());
                    _create.setTokenNumber(i);
                    GetClientInfo getClientInfo = this.getClientInfo;
                    androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenConfiguration;
                    androidBuildHeaderBiddingToken$invoke$1.L$1 = tokenCounters;
                    androidBuildHeaderBiddingToken$invoke$1.L$2 = sessionToken;
                    androidBuildHeaderBiddingToken$invoke$1.L$3 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$4 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$5 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.label = 1;
                    Object invoke2 = getClientInfo.invoke(androidBuildHeaderBiddingToken$invoke$1);
                    if (invoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tokenConfiguration2 = tokenConfiguration;
                    byteString = sessionToken;
                    dsl = _create;
                    obj = invoke2;
                    dsl2 = dsl;
                } else if (i2 == 1) {
                    dsl2 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$5;
                    dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                    _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                    byteString = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$2;
                    tokenCounters = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$1;
                    tokenConfiguration2 = (TokenConfiguration) androidBuildHeaderBiddingToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i2 == 2) {
                    dsl3 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                    dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                    _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                    byteString2 = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$1;
                    tokenCounters2 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                        dsl.setExternalUserIdentifier(userIdentifier);
                    }
                    if (byteString2.isEmpty()) {
                        dsl.setSessionToken(this.sessionRepository.getSessionToken());
                        dsl.setStaticDeviceInfo(this.deviceInfoRepository.cachedStaticDeviceInfo());
                        invoke = this.testDataInfo.invoke();
                        if (invoke != null) {
                        }
                        TokenCountersKt.Dsl.Companion companion2 = TokenCountersKt.Dsl.INSTANCE;
                        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder2 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                        TokenCountersKt.Dsl _create2 = companion2._create(newBuilder2);
                        _create2.setSeq(tokenCounters2.getSeq());
                        _create2.setWins(tokenCounters2.getWins());
                        _create2.setStarts(tokenCounters2.getStarts());
                        dsl.setTokenCounters(_create2._build());
                        return _create._build();
                    }
                    String gameId = this.sessionRepository.getGameId();
                    if (gameId == null || gameId.length() <= 0) {
                        GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters2;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$4 = null;
                        androidBuildHeaderBiddingToken$invoke$1.label = 4;
                        obj = getLimitedSessionToken.invoke(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dsl4 = dsl;
                        tokenCounters3 = tokenCounters2;
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                        dsl6 = dsl;
                        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.label = 5;
                        obj = deviceInfoRepository.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                    } else {
                        GetInitializationData getInitializationData = this.getInitializationData;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters2;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$4 = null;
                        androidBuildHeaderBiddingToken$invoke$1.label = 3;
                        obj = getInitializationData.invoke(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dsl5 = dsl;
                        tokenCounters3 = tokenCounters2;
                        dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                        dsl6 = dsl;
                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.label = 5;
                        obj = deviceInfoRepository2.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dsl6 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                            dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                            dsl7 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                            tokenCounters4 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                            tokenCounters2 = tokenCounters4;
                            _create = dsl7;
                            invoke = this.testDataInfo.invoke();
                            if (invoke != null) {
                                dsl.setTestData(invoke);
                            }
                            TokenCountersKt.Dsl.Companion companion22 = TokenCountersKt.Dsl.INSTANCE;
                            HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder22 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                            Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder(...)");
                            TokenCountersKt.Dsl _create22 = companion22._create(newBuilder22);
                            _create22.setSeq(tokenCounters2.getSeq());
                            _create22.setWins(tokenCounters2.getWins());
                            _create22.setStarts(tokenCounters2.getStarts());
                            dsl.setTokenCounters(_create22._build());
                            return _create._build();
                        }
                        dsl4 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                        dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                        _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                        tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                        dsl6 = dsl;
                        DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.label = 5;
                        obj = deviceInfoRepository22.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dsl = dsl6;
                        dsl7 = _create;
                        tokenCounters4 = tokenCounters3;
                        dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                        tokenCounters2 = tokenCounters4;
                        _create = dsl7;
                        invoke = this.testDataInfo.invoke();
                        if (invoke != null) {
                        }
                        TokenCountersKt.Dsl.Companion companion222 = TokenCountersKt.Dsl.INSTANCE;
                        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder222 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder222, "newBuilder(...)");
                        TokenCountersKt.Dsl _create222 = companion222._create(newBuilder222);
                        _create222.setSeq(tokenCounters2.getSeq());
                        _create222.setWins(tokenCounters2.getWins());
                        _create222.setStarts(tokenCounters2.getStarts());
                        dsl.setTokenCounters(_create222._build());
                        return _create._build();
                    }
                    dsl5 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                    dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                    _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                    tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                    dsl6 = dsl;
                    DeviceInfoRepository deviceInfoRepository222 = this.deviceInfoRepository;
                    androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                    androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                    androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                    androidBuildHeaderBiddingToken$invoke$1.label = 5;
                    obj = deviceInfoRepository222.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                    if (obj != coroutine_suspended) {
                    }
                }
                dsl2.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                dsl.setTimestamps(this.getTimestamps.invoke());
                if (tokenConfiguration2 != null) {
                    dsl.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
                    dsl.putAllExtras(dsl.getExtrasMap(), tokenConfiguration2.getExtras());
                    MediationInfo mediationInfo = tokenConfiguration2.get_mediationInfo();
                    if (mediationInfo != null) {
                        dsl.setMediationInfo(this.mediationInfoConverter.invoke(mediationInfo));
                    }
                    String str = tokenConfiguration2.get_placementId();
                    if (str != null) {
                        dsl.setPlacementId(str);
                    }
                    String str2 = tokenConfiguration2.get_mediationAdUnitId();
                    if (str2 != null) {
                        dsl.setMediationAdUnitId(str2);
                    }
                    BannerSize bannerSize = tokenConfiguration2.get_bannerSize();
                    if (bannerSize != null) {
                        BannerSizeKt.Dsl.Companion companion3 = BannerSizeKt.Dsl.INSTANCE;
                        AdRequestOuterClass.BannerSize.Builder newBuilder3 = AdRequestOuterClass.BannerSize.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder3, "newBuilder(...)");
                        BannerSizeKt.Dsl _create3 = companion3._create(newBuilder3);
                        _create3.setWidth(bannerSize.getWidth());
                        _create3.setHeight(bannerSize.getHeight());
                        dsl.setBannerSize(_create3._build());
                    }
                }
                dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl.setPii(this.deviceInfoRepository.getPiiData());
                dsl.setCampaignState(this.campaignRepository.getCampaignState());
                tcfString = this.tcfRepository.getTcfString();
                if (tcfString != null) {
                    dsl.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                }
                OfferwallManager offerwallManager = this.offerwallManager;
                androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters;
                androidBuildHeaderBiddingToken$invoke$1.L$1 = byteString;
                androidBuildHeaderBiddingToken$invoke$1.L$2 = _create;
                androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                androidBuildHeaderBiddingToken$invoke$1.L$4 = dsl;
                androidBuildHeaderBiddingToken$invoke$1.L$5 = null;
                androidBuildHeaderBiddingToken$invoke$1.label = 2;
                obj = offerwallManager.isConnected(androidBuildHeaderBiddingToken$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsl3 = dsl;
                byteString2 = byteString;
                tokenCounters2 = tokenCounters;
                dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                userIdentifier = UnityAds.getUserIdentifier();
                if (userIdentifier != null) {
                }
                if (byteString2.isEmpty()) {
                }
            }
        }
        androidBuildHeaderBiddingToken$invoke$1 = new AndroidBuildHeaderBiddingToken$invoke$1(this, continuation);
        obj = androidBuildHeaderBiddingToken$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = androidBuildHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        dsl2.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
        dsl.setTimestamps(this.getTimestamps.invoke());
        if (tokenConfiguration2 != null) {
        }
        dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setPii(this.deviceInfoRepository.getPiiData());
        dsl.setCampaignState(this.campaignRepository.getCampaignState());
        tcfString = this.tcfRepository.getTcfString();
        if (tcfString != null) {
        }
        OfferwallManager offerwallManager2 = this.offerwallManager;
        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters;
        androidBuildHeaderBiddingToken$invoke$1.L$1 = byteString;
        androidBuildHeaderBiddingToken$invoke$1.L$2 = _create;
        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
        androidBuildHeaderBiddingToken$invoke$1.L$4 = dsl;
        androidBuildHeaderBiddingToken$invoke$1.L$5 = null;
        androidBuildHeaderBiddingToken$invoke$1.label = 2;
        obj = offerwallManager2.isConnected(androidBuildHeaderBiddingToken$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
