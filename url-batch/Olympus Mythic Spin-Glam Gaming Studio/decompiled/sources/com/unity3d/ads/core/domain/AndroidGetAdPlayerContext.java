package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidGetAdPlayerContext.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0086B¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidGetAdPlayerContext {

    @NotNull
    public static final String KEY_GAME_ID = "gameId";

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetAdPlayerContext(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@NotNull Continuation continuation) {
        AndroidGetAdPlayerContext$invoke$1 androidGetAdPlayerContext$invoke$1;
        int i;
        String gameId;
        if (continuation instanceof AndroidGetAdPlayerContext$invoke$1) {
            androidGetAdPlayerContext$invoke$1 = (AndroidGetAdPlayerContext$invoke$1) continuation;
            int i2 = androidGetAdPlayerContext$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidGetAdPlayerContext$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidGetAdPlayerContext$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidGetAdPlayerContext$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    androidGetAdPlayerContext$invoke$1.label = 1;
                    obj = deviceInfoRepository.staticDeviceInfo(androidGetAdPlayerContext$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj;
                DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
                gameId = this.sessionRepository.getGameId();
                if (gameId == null) {
                    gameId = "";
                }
                return MapsKt.mapOf(TuplesKt.to("bundleId", staticDeviceInfo.getBundleId()), TuplesKt.to("bundleVersion", staticDeviceInfo.getBundleVersion()), TuplesKt.to("webviewHash", "unknown"), TuplesKt.to("sdkVersion", Boxing.boxInt(SdkProperties.getVersionCode())), TuplesKt.to("sdkVersionName", SdkProperties.getVersionName()), TuplesKt.to("osVersion", staticDeviceInfo.getOsVersion()), TuplesKt.to("systemLanguage", Locale.getDefault().toString()), TuplesKt.to("deviceModel", staticDeviceInfo.getDeviceModel()), TuplesKt.to("limitAdTracking", Boxing.boxBoolean(dynamicDeviceInfo.getLimitedTracking())), TuplesKt.to("maxVolume", Boxing.boxDouble(dynamicDeviceInfo.getAndroid().getMaxVolume())), TuplesKt.to(KEY_GAME_ID, gameId));
            }
        }
        androidGetAdPlayerContext$invoke$1 = new AndroidGetAdPlayerContext$invoke$1(this, continuation);
        Object obj2 = androidGetAdPlayerContext$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidGetAdPlayerContext$invoke$1.label;
        if (i != 0) {
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = (StaticDeviceInfoOuterClass.StaticDeviceInfo) obj2;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.deviceInfoRepository.getDynamicDeviceInfo();
        gameId = this.sessionRepository.getGameId();
        if (gameId == null) {
        }
        return MapsKt.mapOf(TuplesKt.to("bundleId", staticDeviceInfo2.getBundleId()), TuplesKt.to("bundleVersion", staticDeviceInfo2.getBundleVersion()), TuplesKt.to("webviewHash", "unknown"), TuplesKt.to("sdkVersion", Boxing.boxInt(SdkProperties.getVersionCode())), TuplesKt.to("sdkVersionName", SdkProperties.getVersionName()), TuplesKt.to("osVersion", staticDeviceInfo2.getOsVersion()), TuplesKt.to("systemLanguage", Locale.getDefault().toString()), TuplesKt.to("deviceModel", staticDeviceInfo2.getDeviceModel()), TuplesKt.to("limitAdTracking", Boxing.boxBoolean(dynamicDeviceInfo2.getLimitedTracking())), TuplesKt.to("maxVolume", Boxing.boxDouble(dynamicDeviceInfo2.getAndroid().getMaxVolume())), TuplesKt.to(KEY_GAME_ID, gameId));
    }
}
