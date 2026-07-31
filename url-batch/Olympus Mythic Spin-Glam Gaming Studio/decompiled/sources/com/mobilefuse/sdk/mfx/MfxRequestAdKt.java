package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.LocationService;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.SensorService;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.device.DeviceType;
import com.mobilefuse.sdk.device.LocationData;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.identity.EidServiceKt;
import com.mobilefuse.sdk.identity.GetEidSourceKt;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.network.client.HttpParamsPostBody;
import com.mobilefuse.sdk.network.client.HttpPostRequest;
import com.mobilefuse.sdk.network.model.MfxBidRequest;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.privacy.PrivacyCenter;
import com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.telemetry.Telemetry;
import com.mobilefuse.sdk.user.Gender;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MfxRequestAd.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011\u001a2\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00132\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u001c\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"defaultPrivacyPreferencesFactory", "Lkotlin/Function0;", "Lcom/mobilefuse/sdk/privacy/MobileFusePrivacyPreferences;", "createBidRequest", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "placementId", "", "bannerWidth", "", "bannerHeight", "privacyPreferencesFactory", "testMode", "", "bidFloor", "", "(Ljava/lang/String;IILkotlin/jvm/functions/Function0;ZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "createMfxBidRequest", "(Ljava/lang/String;IIZLjava/lang/Float;)Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "requestMfxAd", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "request", "Lcom/mobilefuse/sdk/network/client/HttpPostRequest;", "Lcom/mobilefuse/sdk/network/client/HttpParamsPostBody;", "Lcom/mobilefuse/sdk/mfx/MfxPostRequest;", "httpClient", "Lcom/mobilefuse/sdk/network/client/HttpClient;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes8.dex */
public final class MfxRequestAdKt {
    private static final Function0 defaultPrivacyPreferencesFactory = new Function0() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt$defaultPrivacyPreferencesFactory$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final MobileFusePrivacyPreferences mo4828invoke() {
            PrivacyPrefsDefaultsResolver.resolveDefaults();
            return MobileFuse.INSTANCE.getPrivacyPreferences();
        }
    };

    @NotNull
    public static final Flow<Either<BaseError, MfxBidResponse>> requestMfxAd(@NotNull HttpPostRequest<HttpParamsPostBody> request, @NotNull HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        return MfxService.INSTANCE.getHttpBidRequestFlow(request, httpClient, MfxRequestAdKt$requestMfxAd$1.INSTANCE);
    }

    @NotNull
    public static final MfxBidRequest createMfxBidRequest(@NotNull String placementId, int i, int i2, boolean z, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return createBidRequest(placementId, i, i2, defaultPrivacyPreferencesFactory, z, f);
    }

    public static /* synthetic */ MfxBidRequest createBidRequest$default(String str, int i, int i2, Function0 function0, boolean z, Float f, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            f = null;
        }
        return createBidRequest(str, i, i2, function0, z, f);
    }

    @NotNull
    public static final MfxBidRequest createBidRequest(@NotNull String placementId, int i, int i2, @NotNull Function0 privacyPreferencesFactory, boolean z, @Nullable Float f) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(privacyPreferencesFactory, "privacyPreferencesFactory");
        int[] deviceScreenSize = Utils.getDeviceScreenSize();
        final MobileFusePrivacyPreferences mobileFusePrivacyPreferences = (MobileFusePrivacyPreferences) privacyPreferencesFactory.mo4828invoke();
        final boolean isSdkLimitedToSendUserData = PrivacyCenter.isSdkLimitedToSendUserData(new Function0() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt$createBidRequest$limitedUserDataProcessing$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                return MobileFusePrivacyPreferences.this.isDoNotTrack();
            }
        });
        LocationData lastKnownLocationData = !isSdkLimitedToSendUserData ? LocationService.INSTANCE.getLastKnownLocationData() : null;
        String appVersionName = MobileFuseSettings.getAppVersionName();
        String advertisingId = MobileFuseSettings.getAdvertisingId();
        boolean isLimitTrackingEnabled = MobileFuseSettings.isLimitTrackingEnabled();
        boolean isDoNotTrack = mobileFusePrivacyPreferences.isDoNotTrack();
        String userAgent = MobileFuseSettings.getUserAgent();
        String deviceLanguage = MobileFuseSettings.getDeviceLanguage();
        DeviceType deviceType = MobileFuseSettings.isTabletDevice() ? DeviceType.TABLET : DeviceType.PHONE;
        int i5 = deviceScreenSize[0];
        int i6 = deviceScreenSize[1];
        Double valueOf = lastKnownLocationData != null ? Double.valueOf(lastKnownLocationData.getLatitude()) : null;
        Double valueOf2 = lastKnownLocationData != null ? Double.valueOf(lastKnownLocationData.getLongitude()) : null;
        Double altitude = lastKnownLocationData != null ? lastKnownLocationData.getAltitude() : null;
        Integer accuracy = lastKnownLocationData != null ? lastKnownLocationData.getAccuracy() : null;
        Integer valueOf3 = lastKnownLocationData != null ? Integer.valueOf(lastKnownLocationData.getLastFixSeconds()) : null;
        Float lastPressure = SensorService.getLastPressure();
        boolean isSubjectToCoppa = mobileFusePrivacyPreferences.isSubjectToCoppa();
        String gppConsentString = mobileFusePrivacyPreferences.getGppConsentString();
        String usPrivacyConsentString = mobileFusePrivacyPreferences.getUsPrivacyConsentString();
        Map<String, String> eidsAsHttpQueryParams = EidServiceKt.getEidService().getEidsAsHttpQueryParams();
        String eidSource$default = GetEidSourceKt.getEidSource$default(EidServiceKt.getEidService(), null, new Function0() { // from class: com.mobilefuse.sdk.mfx.MfxRequestAdKt$createBidRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                return isSdkLimitedToSendUserData;
            }
        }, null, null, null, 29, null);
        MobileFuseTargetingData.Companion companion = MobileFuseTargetingData.INSTANCE;
        Integer valueOf4 = Integer.valueOf(companion.getYearOfBirth());
        Gender gender = companion.getGender();
        if (i == -1) {
            i4 = i2;
            i3 = 1;
        } else {
            i3 = i;
            i4 = i2;
        }
        int i7 = i4 == -1 ? 1 : i4;
        String sdkVersion = MobileFuse.INSTANCE.getSdkVersion();
        Telemetry.Companion companion2 = Telemetry.INSTANCE;
        String sessionId = companion2.getSessionId();
        MobileFuseSettings mobileFuseSettings = MobileFuseSettings.INSTANCE;
        String appSetId$mobilefuse_sdk_core_release = mobileFuseSettings.getAppSetId$mobilefuse_sdk_core_release();
        String deviceIp$mobilefuse_sdk_core_release = mobileFuseSettings.getDeviceIp$mobilefuse_sdk_core_release();
        String currentOsVersion = Utils.getCurrentOsVersion();
        Intrinsics.checkNotNullExpressionValue(currentOsVersion, "Utils.getCurrentOsVersion()");
        return new MfxBidRequest(placementId, appVersionName, z, advertisingId, isLimitTrackingEnabled, isDoNotTrack, userAgent, deviceLanguage, deviceType, i5, i6, valueOf, valueOf2, valueOf3, accuracy, altitude, lastPressure, eidsAsHttpQueryParams, eidSource$default, valueOf4, gender, isSubjectToCoppa, gppConsentString, usPrivacyConsentString, i3, i7, sdkVersion, sessionId, appSetId$mobilefuse_sdk_core_release, f, deviceIp$mobilefuse_sdk_core_release, currentOsVersion, companion2.getDeviceLogsSessionId());
    }
}
