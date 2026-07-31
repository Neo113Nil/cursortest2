package com.unity3d.ads.core.data.repository;

import com.ironsource.X3;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidDeviceInfoRepository.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u000e\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010 \u001a\u0004\u0018\u00010!H\u0096@¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0096@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010#\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0014\u00105\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010%R\u0014\u00107\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010.R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%R\u0014\u0010?\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010%R\u0014\u0010A\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010%R\u0014\u0010C\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0014\u0010E\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "staticDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "dynamicDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;", "privacyDeviceInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/DynamicDeviceInfoDataSource;Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "allowedPii", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPii", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedStaticDeviceInfo", "dynamicDeviceInfo", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "piiData", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getPiiData", "()Lgatewayprotocol/v1/PiiOuterClass$Pii;", "getIdfi", "", "getAuidString", "getAuidByteString", "Lcom/google/protobuf/ByteString;", "getUnityBuildGuid", "analyticsUserId", "getAnalyticsUserId", "()Ljava/lang/String;", "volumeSettingsChange", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "getVolumeSettingsChange", "()Lkotlinx/coroutines/flow/Flow;", "ringerMode", "", "getRingerMode", "()I", "systemBootTime", "", "getSystemBootTime", "()J", X3.i.n, "getOrientation", "connectionTypeStr", "getConnectionTypeStr", "currentUiTheme", "getCurrentUiTheme", "localeList", "", "getLocaleList", "()Ljava/util/List;", "appName", "getAppName", "model", "getModel", CommonUrlParts.MANUFACTURER, "getManufacturer", "osVersion", "getOsVersion", "hasInternet", "", "getHasInternet", "()Z", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {

    @NotNull
    private final MutableStateFlow allowedPii;

    @Nullable
    private final String analyticsUserId;

    @NotNull
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;

    @NotNull
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;

    @NotNull
    private final Flow volumeSettingsChange;

    public AndroidDeviceInfoRepository(@NotNull StaticDeviceInfoDataSource staticDeviceInfoDataSource, @NotNull DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource, @NotNull PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(staticDeviceInfoDataSource, "staticDeviceInfoDataSource");
        Intrinsics.checkNotNullParameter(dynamicDeviceInfoDataSource, "dynamicDeviceInfoDataSource");
        Intrinsics.checkNotNullParameter(privacyDeviceInfoDataSource, "privacyDeviceInfoDataSource");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource;
        this.sessionRepository = sessionRepository;
        this.allowedPii = StateFlowKt.MutableStateFlow(AllowedPiiOuterClass.AllowedPii.getDefaultInstance());
        this.analyticsUserId = staticDeviceInfoDataSource.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource.getVolumeSettingsChange();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public MutableStateFlow getAllowedPii() {
        return this.allowedPii;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object staticDeviceInfo(@NotNull Continuation continuation) {
        StaticDeviceInfoDataSource staticDeviceInfoDataSource = this.staticDeviceInfoDataSource;
        List<String> additionalStorePackagesList = this.sessionRepository.getNativeConfiguration().getAdditionalStorePackagesList();
        Intrinsics.checkNotNullExpressionValue(additionalStorePackagesList, "getAdditionalStorePackagesList(...)");
        return staticDeviceInfoDataSource.fetch(additionalStorePackagesList, continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public PiiOuterClass.Pii getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch((AllowedPiiOuterClass.AllowedPii) getAllowedPii().getValue());
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object getIdfi(@NotNull Continuation continuation) {
        return this.staticDeviceInfoDataSource.getIdfi(continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object getAuidString(@NotNull Continuation continuation) {
        return this.staticDeviceInfoDataSource.getAuid(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuidByteString(@NotNull Continuation continuation) {
        AndroidDeviceInfoRepository$getAuidByteString$1 androidDeviceInfoRepository$getAuidByteString$1;
        int i;
        String str;
        if (continuation instanceof AndroidDeviceInfoRepository$getAuidByteString$1) {
            androidDeviceInfoRepository$getAuidByteString$1 = (AndroidDeviceInfoRepository$getAuidByteString$1) continuation;
            int i2 = androidDeviceInfoRepository$getAuidByteString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidDeviceInfoRepository$getAuidByteString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidDeviceInfoRepository$getAuidByteString$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidDeviceInfoRepository$getAuidByteString$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    androidDeviceInfoRepository$getAuidByteString$1.label = 1;
                    obj = getAuidString(androidDeviceInfoRepository$getAuidByteString$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return null;
                }
                try {
                    UUID fromString = UUID.fromString(str);
                    Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
                    return ProtobufExtensionsKt.toByteString(fromString);
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        androidDeviceInfoRepository$getAuidByteString$1 = new AndroidDeviceInfoRepository$getAuidByteString$1(this, continuation);
        Object obj2 = androidDeviceInfoRepository$getAuidByteString$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidDeviceInfoRepository$getAuidByteString$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public Object getUnityBuildGuid(@NotNull Continuation continuation) {
        return this.staticDeviceInfoDataSource.getUnityBuildGuid(continuation);
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @Nullable
    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public Flow getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public long getSystemBootTime() {
        return this.staticDeviceInfoDataSource.getSystemBootTime();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public int getCurrentUiTheme() {
        return this.dynamicDeviceInfoDataSource.getCurrentUiTheme();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public List<String> getLocaleList() {
        return this.dynamicDeviceInfoDataSource.getLocaleList();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    @NotNull
    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    @Override // com.unity3d.ads.core.data.repository.DeviceInfoRepository
    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }
}
