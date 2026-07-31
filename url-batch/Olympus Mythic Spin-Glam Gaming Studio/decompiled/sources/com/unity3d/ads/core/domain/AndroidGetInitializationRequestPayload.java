package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.datasource.GoogleAppIdDataSource;
import com.unity3d.ads.core.data.datasource.InstallReferrerDataSource;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096B¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequestPayload;", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "legacyUserConsentRepository", "Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;", "mediationInitBlobMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;", "installReferrerDataSource", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "googleAppIdDataSource", "Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;", "<init>", "(Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/LegacyUserConsentRepository;Lcom/unity3d/ads/core/configuration/MediationInitBlobMetadataReader;Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;Lcom/unity3d/ads/core/data/datasource/GoogleAppIdDataSource;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {

    @NotNull
    private static final String BLOB_EXTRA_KEY = "uads_init_blob";

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final GoogleAppIdDataSource googleAppIdDataSource;

    @NotNull
    private final InstallReferrerDataSource installReferrerDataSource;

    @NotNull
    private final LegacyUserConsentRepository legacyUserConsentRepository;

    @NotNull
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(@NotNull GetClientInfo getClientInfo, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LegacyUserConsentRepository legacyUserConsentRepository, @NotNull MediationInitBlobMetadataReader mediationInitBlobMetadataReader, @NotNull InstallReferrerDataSource installReferrerDataSource, @NotNull GoogleAppIdDataSource googleAppIdDataSource) {
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        Intrinsics.checkNotNullParameter(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        Intrinsics.checkNotNullParameter(installReferrerDataSource, "installReferrerDataSource");
        Intrinsics.checkNotNullParameter(googleAppIdDataSource, "googleAppIdDataSource");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
        this.installReferrerDataSource = installReferrerDataSource;
        this.googleAppIdDataSource = googleAppIdDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a7  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull Continuation continuation) {
        AndroidGetInitializationRequestPayload$invoke$1 androidGetInitializationRequestPayload$invoke$1;
        InitializationRequestKt.Dsl _create;
        boolean z;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl _create2;
        InitializationDeviceInfoKt.Dsl dsl4;
        InitializationRequestKt.Dsl dsl5;
        InitializationRequestKt.Dsl dsl6;
        InitializationDeviceInfoKt.Dsl dsl7;
        InitializationDeviceInfoKt.Dsl dsl8;
        final InitializationRequestKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        ByteString byteString;
        String str;
        ByteString byteString2;
        ByteString byteString3;
        String legacyFlowUserConsent;
        String unityInstallationId;
        String unityMegaSessionId;
        String str2;
        String str3;
        InitializationConfigurationInternal initializationConfiguration;
        InitializationRequestKt.Dsl dsl11;
        InitializationRequestKt.Dsl dsl12;
        ByteString byteStringUtf8;
        Map<String, String> extras;
        Map mutableMap;
        String str4;
        ByteString byteStringUtf82;
        String userIdentifier;
        String googleAppId;
        InitializationRequestOuterClass.InstallReferrer installReferrer;
        if (continuation instanceof AndroidGetInitializationRequestPayload$invoke$1) {
            androidGetInitializationRequestPayload$invoke$1 = (AndroidGetInitializationRequestPayload$invoke$1) continuation;
            int i = androidGetInitializationRequestPayload$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidGetInitializationRequestPayload$invoke$1.label = i - Integer.MIN_VALUE;
                Object obj = androidGetInitializationRequestPayload$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                switch (androidGetInitializationRequestPayload$invoke$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationRequest.Builder newBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
                        _create = companion._create(newBuilder);
                        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                        if (storage.readStorage()) {
                            Object obj3 = storage.get("configuration.hasInitialized");
                            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                                _create.setIsFirstInit(!z);
                                GetClientInfo getClientInfo = this.getClientInfo;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                                androidGetInitializationRequestPayload$invoke$1.label = 1;
                                obj = getClientInfo.invoke(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl = _create;
                                dsl2 = dsl;
                                _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                                DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.label = 2;
                                obj = deviceInfoRepository.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl3 = dsl;
                                dsl3.setIdfi((String) obj);
                                analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                                if (analyticsUserId != null) {
                                    dsl.setAnalyticsUserId(analyticsUserId);
                                }
                                dsl.setSessionId(this.sessionRepository.getSessionId());
                                InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                                InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
                                _create2 = companion2._create(newBuilder2);
                                _create2.setBundleId(this.deviceInfoRepository.getAppName());
                                _create2.setDeviceModel(this.deviceInfoRepository.getModel());
                                _create2.setDeviceMake(this.deviceInfoRepository.getManufacturer());
                                _create2.setOsVersion(this.deviceInfoRepository.getOsVersion());
                                DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                                androidGetInitializationRequestPayload$invoke$1.label = 3;
                                obj = deviceInfoRepository2.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl4 = _create2;
                                dsl5 = dsl;
                                dsl6 = dsl2;
                                dsl7 = dsl4;
                                _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                                DeviceInfoRepository deviceInfoRepository3 = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = dsl4;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = dsl4;
                                androidGetInitializationRequestPayload$invoke$1.label = 4;
                                obj = deviceInfoRepository3.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl8 = dsl4;
                                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                                dsl4.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                                String networkOperator = this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                                Intrinsics.checkNotNullExpressionValue(networkOperator, "getNetworkOperator(...)");
                                dsl4.setNetworkOperator(networkOperator);
                                dsl4.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                                dsl4.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                                dsl4.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                                String language = this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                                Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                                dsl4.setLanguage(language);
                                dsl4.setLocalList(CollectionsKt.joinToString$default(this.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                                dsl4.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                                String bundleVersion = this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion();
                                Intrinsics.checkNotNullExpressionValue(bundleVersion, "getBundleVersion(...)");
                                dsl4.setBundleVersion(bundleVersion);
                                dsl.setDeviceInfo(dsl7._build());
                                DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                                androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                                androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                                androidGetInitializationRequestPayload$invoke$1.label = 5;
                                obj = deviceInfoRepository4.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dsl9 = dsl5;
                                dsl10 = dsl6;
                                byteString = (ByteString) obj;
                                if (byteString != null) {
                                    dsl9.setAuid(byteString);
                                }
                                DeviceInfoRepository deviceInfoRepository5 = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 6;
                                obj = deviceInfoRepository5.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = (String) obj;
                                if (!(str != null || str.length() == 0)) {
                                    dsl9.setAuidString(str);
                                }
                                SessionRepository sessionRepository = this.sessionRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 7;
                                obj = sessionRepository.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteString2 = (ByteString) obj;
                                if (!byteString2.isEmpty()) {
                                    dsl9.setPrivacy(byteString2);
                                }
                                SessionRepository sessionRepository2 = this.sessionRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 8;
                                obj = sessionRepository2.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteString3 = (ByteString) obj;
                                if (!byteString3.isEmpty()) {
                                    dsl9.setCache(byteString3);
                                }
                                legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                                if (legacyFlowUserConsent != null) {
                                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                                }
                                unityInstallationId = this.sessionRepository.getUnityInstallationId();
                                if (unityInstallationId != null) {
                                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                                }
                                unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                                if (unityMegaSessionId != null) {
                                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                                }
                                DeviceInfoRepository deviceInfoRepository6 = this.deviceInfoRepository;
                                androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                androidGetInitializationRequestPayload$invoke$1.label = 9;
                                obj = deviceInfoRepository6.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str2 = (String) obj;
                                if (str2 != null || str2.length() == 0) {
                                    obj = null;
                                }
                                str3 = (String) obj;
                                if (str3 != null) {
                                    dsl9.setUnityBuildGuid(str3);
                                }
                                initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                                if (initializationConfiguration != null && (extras = initializationConfiguration.getExtras()) != null && (mutableMap = MapsKt.toMutableMap(extras)) != null) {
                                    str4 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                                    if (str4 != null && (byteStringUtf82 = ByteStringsKt.toByteStringUtf8(str4)) != null) {
                                        new MutablePropertyReference0Impl(dsl9) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                            public void set(Object obj4) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj4);
                                            }
                                        }.set(byteStringUtf82);
                                    }
                                    dsl9.putAllExtras(dsl9.getExtrasMap(), mutableMap);
                                }
                                if (!dsl9.hasUadsInitBlob()) {
                                    MediationInitBlobMetadataReader mediationInitBlobMetadataReader = this.mediationInitBlobMetadataReader;
                                    Object obj4 = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                                    if (obj4 != null) {
                                        if (!(obj4 instanceof String)) {
                                            obj4 = null;
                                        }
                                        if (obj4 != null) {
                                            obj2 = obj4;
                                        }
                                    }
                                    String str5 = (String) obj2;
                                    if (str5 != null && (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(str5)) != null) {
                                        new MutablePropertyReference0Impl(dsl9) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$11
                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                            public Object get() {
                                                return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                            }

                                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                            public void set(Object obj5) {
                                                ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj5);
                                            }
                                        }.set(byteStringUtf8);
                                    }
                                }
                                if (dsl9.getIsFirstInit()) {
                                    InstallReferrerDataSource installReferrerDataSource = this.installReferrerDataSource;
                                    androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                                    androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                                    androidGetInitializationRequestPayload$invoke$1.label = 10;
                                    obj = installReferrerDataSource.invoke(androidGetInitializationRequestPayload$invoke$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dsl11 = dsl9;
                                    dsl12 = dsl10;
                                    installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                                    if (installReferrer != null) {
                                        dsl11.setInstallReferrer(installReferrer);
                                    }
                                    dsl10 = dsl12;
                                    dsl9 = dsl11;
                                }
                                userIdentifier = UnityAds.getUserIdentifier();
                                if (userIdentifier != null) {
                                    dsl9.setExternalUserIdentifier(userIdentifier);
                                }
                                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId() && (googleAppId = this.googleAppIdDataSource.getGoogleAppId()) != null) {
                                    dsl9.setGoogleAppId(googleAppId);
                                }
                                return dsl10._build();
                            }
                        }
                        z = false;
                        _create.setIsFirstInit(!z);
                        GetClientInfo getClientInfo2 = this.getClientInfo;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = _create;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create;
                        androidGetInitializationRequestPayload$invoke$1.label = 1;
                        obj = getClientInfo2.invoke(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 1:
                        _create = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        _create.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                        DeviceInfoRepository deviceInfoRepository7 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.label = 2;
                        obj = deviceInfoRepository7.getIdfi(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 2:
                        dsl3 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl2 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        dsl3.setIdfi((String) obj);
                        analyticsUserId = this.deviceInfoRepository.getAnalyticsUserId();
                        if (analyticsUserId != null) {
                        }
                        dsl.setSessionId(this.sessionRepository.getSessionId());
                        InitializationDeviceInfoKt.Dsl.Companion companion22 = InitializationDeviceInfoKt.Dsl.INSTANCE;
                        InitializationRequestOuterClass.InitializationDeviceInfo.Builder newBuilder22 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                        Intrinsics.checkNotNullExpressionValue(newBuilder22, "newBuilder(...)");
                        _create2 = companion22._create(newBuilder22);
                        _create2.setBundleId(this.deviceInfoRepository.getAppName());
                        _create2.setDeviceModel(this.deviceInfoRepository.getModel());
                        _create2.setDeviceMake(this.deviceInfoRepository.getManufacturer());
                        _create2.setOsVersion(this.deviceInfoRepository.getOsVersion());
                        DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl2;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = _create2;
                        androidGetInitializationRequestPayload$invoke$1.label = 3;
                        obj = deviceInfoRepository22.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 3:
                        _create2 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        _create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalDiskSpace());
                        DeviceInfoRepository deviceInfoRepository32 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = dsl7;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = dsl;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = dsl4;
                        androidGetInitializationRequestPayload$invoke$1.label = 4;
                        obj = deviceInfoRepository32.staticDeviceInfo(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 4:
                        dsl8 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$5;
                        dsl4 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$4;
                        dsl = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$3;
                        dsl7 = (InitializationDeviceInfoKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$2;
                        dsl5 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl6 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj).getTotalRamMemory());
                        dsl4.setCurrentUiTheme(this.deviceInfoRepository.getCurrentUiTheme());
                        String networkOperator2 = this.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                        Intrinsics.checkNotNullExpressionValue(networkOperator2, "getNetworkOperator(...)");
                        dsl4.setNetworkOperator(networkOperator2);
                        dsl4.setBatteryLevel(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                        dsl4.setBatteryStatus(this.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                        dsl4.setSystemBootTime(this.deviceInfoRepository.getSystemBootTime());
                        String language2 = this.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
                        dsl4.setLanguage(language2);
                        dsl4.setLocalList(CollectionsKt.joinToString$default(this.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                        dsl4.setConnectionType(this.deviceInfoRepository.getConnectionTypeStr());
                        String bundleVersion2 = this.deviceInfoRepository.cachedStaticDeviceInfo().getBundleVersion();
                        Intrinsics.checkNotNullExpressionValue(bundleVersion2, "getBundleVersion(...)");
                        dsl4.setBundleVersion(bundleVersion2);
                        dsl.setDeviceInfo(dsl7._build());
                        DeviceInfoRepository deviceInfoRepository42 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl6;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl5;
                        androidGetInitializationRequestPayload$invoke$1.L$2 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$3 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$4 = null;
                        androidGetInitializationRequestPayload$invoke$1.L$5 = null;
                        androidGetInitializationRequestPayload$invoke$1.label = 5;
                        obj = deviceInfoRepository42.getAuidByteString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj != coroutine_suspended) {
                        }
                        break;
                    case 5:
                        dsl9 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteString = (ByteString) obj;
                        if (byteString != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository52 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 6;
                        obj = deviceInfoRepository52.getAuidString(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        str = (String) obj;
                        if (str != null) {
                            break;
                        }
                        if (!(str != null || str.length() == 0)) {
                        }
                        SessionRepository sessionRepository3 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj = sessionRepository3.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        byteString2 = (ByteString) obj;
                        if (!byteString2.isEmpty()) {
                        }
                        SessionRepository sessionRepository22 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj = sessionRepository22.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                        }
                        legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = this.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository62 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository62.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        str2 = (String) obj;
                        if (str2 != null) {
                            break;
                        }
                        if (str2 != null || str2.length() == 0) {
                        }
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                        initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                            str4 = (String) mutableMap.remove(BLOB_EXTRA_KEY);
                            if (str4 != null) {
                                new MutablePropertyReference0Impl(dsl9) { // from class: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$2$9$2
                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                    public Object get() {
                                        return ((InitializationRequestKt.Dsl) this.receiver).getUadsInitBlob();
                                    }

                                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                    public void set(Object obj42) {
                                        ((InitializationRequestKt.Dsl) this.receiver).setUadsInitBlob((ByteString) obj42);
                                    }
                                }.set(byteStringUtf82);
                                break;
                            }
                            dsl9.putAllExtras(dsl9.getExtrasMap(), mutableMap);
                            break;
                        }
                        if (!dsl9.hasUadsInitBlob()) {
                        }
                        if (dsl9.getIsFirstInit()) {
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                            dsl9.setGoogleAppId(googleAppId);
                            break;
                        }
                        return dsl10._build();
                    case 6:
                        dsl9 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (!(str != null || str.length() == 0)) {
                        }
                        SessionRepository sessionRepository32 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 7;
                        obj = sessionRepository32.getPrivacy(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        byteString2 = (ByteString) obj;
                        if (!byteString2.isEmpty()) {
                        }
                        SessionRepository sessionRepository222 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj = sessionRepository222.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                        }
                        legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = this.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository622 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository622.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        str2 = (String) obj;
                        if (str2 != null || str2.length() == 0) {
                        }
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                        initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                        }
                        if (!dsl9.hasUadsInitBlob()) {
                        }
                        if (dsl9.getIsFirstInit()) {
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                        }
                        return dsl10._build();
                    case 7:
                        dsl9 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteString2 = (ByteString) obj;
                        if (!byteString2.isEmpty()) {
                        }
                        SessionRepository sessionRepository2222 = this.sessionRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 8;
                        obj = sessionRepository2222.getGatewayCache(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                        }
                        legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = this.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository6222 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository6222.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        str2 = (String) obj;
                        if (str2 != null || str2.length() == 0) {
                        }
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                        initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                        }
                        if (!dsl9.hasUadsInitBlob()) {
                        }
                        if (dsl9.getIsFirstInit()) {
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                        }
                        return dsl10._build();
                    case 8:
                        dsl9 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteString3 = (ByteString) obj;
                        if (!byteString3.isEmpty()) {
                        }
                        legacyFlowUserConsent = this.legacyUserConsentRepository.getLegacyFlowUserConsent();
                        if (legacyFlowUserConsent != null) {
                        }
                        unityInstallationId = this.sessionRepository.getUnityInstallationId();
                        if (unityInstallationId != null) {
                        }
                        unityMegaSessionId = this.sessionRepository.getUnityMegaSessionId();
                        if (unityMegaSessionId != null) {
                        }
                        DeviceInfoRepository deviceInfoRepository62222 = this.deviceInfoRepository;
                        androidGetInitializationRequestPayload$invoke$1.L$0 = dsl10;
                        androidGetInitializationRequestPayload$invoke$1.L$1 = dsl9;
                        androidGetInitializationRequestPayload$invoke$1.label = 9;
                        obj = deviceInfoRepository62222.getUnityBuildGuid(androidGetInitializationRequestPayload$invoke$1);
                        if (obj == coroutine_suspended) {
                        }
                        str2 = (String) obj;
                        if (str2 != null || str2.length() == 0) {
                        }
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                        initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                        }
                        if (!dsl9.hasUadsInitBlob()) {
                        }
                        if (dsl9.getIsFirstInit()) {
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                        }
                        return dsl10._build();
                    case 9:
                        dsl9 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl10 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str2 = (String) obj;
                        if (str2 != null || str2.length() == 0) {
                        }
                        str3 = (String) obj;
                        if (str3 != null) {
                        }
                        initializationConfiguration = this.sessionRepository.getInitializationConfiguration();
                        if (initializationConfiguration != null) {
                        }
                        if (!dsl9.hasUadsInitBlob()) {
                        }
                        if (dsl9.getIsFirstInit()) {
                        }
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                        }
                        return dsl10._build();
                    case 10:
                        dsl11 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$1;
                        dsl12 = (InitializationRequestKt.Dsl) androidGetInitializationRequestPayload$invoke$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        installReferrer = (InitializationRequestOuterClass.InstallReferrer) obj;
                        if (installReferrer != null) {
                        }
                        dsl10 = dsl12;
                        dsl9 = dsl11;
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                        }
                        if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getCollectGoogleAppId()) {
                        }
                        return dsl10._build();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        androidGetInitializationRequestPayload$invoke$1 = new AndroidGetInitializationRequestPayload$invoke$1(this, continuation);
        Object obj5 = androidGetInitializationRequestPayload$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object obj22 = null;
        switch (androidGetInitializationRequestPayload$invoke$1.label) {
        }
    }
}
