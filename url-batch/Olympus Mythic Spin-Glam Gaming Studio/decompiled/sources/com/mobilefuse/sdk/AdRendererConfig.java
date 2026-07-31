package com.mobilefuse.sdk;

import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.state.mute.AdMuteStateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdRendererConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003JÙ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0013\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000fHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010*R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010*R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010*R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010*R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010*R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$¨\u0006H"}, d2 = {"Lcom/mobilefuse/sdk/AdRendererConfig;", "", "sdkName", "", "sdkVersion", "advertisingId", "isLimitTrackingEnabled", "", "isSubjectToCoppa", "isTestMode", "isFullscreenAd", "isCloseButtonEnabled", "isThumbnailSize", "isTransparentBackground", "adWidth", "", "adHeight", "deviceIp", "extendedAdType", "Lcom/mobilefuse/sdk/ExtendedAdType;", "observableConfig", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adInstanceId", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "uiAdm", "adMuteStateManager", "Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZIILjava/lang/String;Lcom/mobilefuse/sdk/ExtendedAdType;Lcom/mobilefuse/sdk/config/ObservableConfig;ILcom/mobilefuse/sdk/CloseConfigResponse;Ljava/lang/String;Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;)V", "getAdHeight", "()I", "getAdInstanceId", "getAdMuteStateManager", "()Lcom/mobilefuse/sdk/state/mute/AdMuteStateManager;", "getAdWidth", "getAdvertisingId", "()Ljava/lang/String;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "getDeviceIp", "getExtendedAdType", "()Lcom/mobilefuse/sdk/ExtendedAdType;", "()Z", "getObservableConfig", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "getSdkName", "getSdkVersion", "getUiAdm", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final /* data */ class AdRendererConfig {
    private final int adHeight;
    private final int adInstanceId;

    @Nullable
    private final AdMuteStateManager adMuteStateManager;
    private final int adWidth;

    @Nullable
    private final String advertisingId;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @Nullable
    private final String deviceIp;

    @Nullable
    private final ExtendedAdType extendedAdType;
    private final boolean isCloseButtonEnabled;
    private final boolean isFullscreenAd;
    private final boolean isLimitTrackingEnabled;
    private final boolean isSubjectToCoppa;
    private final boolean isTestMode;
    private final boolean isThumbnailSize;
    private final boolean isTransparentBackground;

    @Nullable
    private final ObservableConfig observableConfig;

    @Nullable
    private final String sdkName;

    @Nullable
    private final String sdkVersion;

    @Nullable
    private final String uiAdm;

    public AdRendererConfig() {
        this(null, null, null, false, false, false, false, false, false, false, 0, 0, null, null, null, 0, null, null, null, 524287, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getSdkName() {
        return this.sdkName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsTransparentBackground() {
        return this.isTransparentBackground;
    }

    /* renamed from: component11, reason: from getter */
    public final int getAdWidth() {
        return this.adWidth;
    }

    /* renamed from: component12, reason: from getter */
    public final int getAdHeight() {
        return this.adHeight;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getDeviceIp() {
        return this.deviceIp;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final ExtendedAdType getExtendedAdType() {
        return this.extendedAdType;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    /* renamed from: component16, reason: from getter */
    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getUiAdm() {
        return this.uiAdm;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final AdMuteStateManager getAdMuteStateManager() {
        return this.adMuteStateManager;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLimitTrackingEnabled() {
        return this.isLimitTrackingEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSubjectToCoppa() {
        return this.isSubjectToCoppa;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsFullscreenAd() {
        return this.isFullscreenAd;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsCloseButtonEnabled() {
        return this.isCloseButtonEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsThumbnailSize() {
        return this.isThumbnailSize;
    }

    @NotNull
    public final AdRendererConfig copy(@Nullable String sdkName, @Nullable String sdkVersion, @Nullable String advertisingId, boolean isLimitTrackingEnabled, boolean isSubjectToCoppa, boolean isTestMode, boolean isFullscreenAd, boolean isCloseButtonEnabled, boolean isThumbnailSize, boolean isTransparentBackground, int adWidth, int adHeight, @Nullable String deviceIp, @Nullable ExtendedAdType extendedAdType, @Nullable ObservableConfig observableConfig, int adInstanceId, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String uiAdm, @Nullable AdMuteStateManager adMuteStateManager) {
        return new AdRendererConfig(sdkName, sdkVersion, advertisingId, isLimitTrackingEnabled, isSubjectToCoppa, isTestMode, isFullscreenAd, isCloseButtonEnabled, isThumbnailSize, isTransparentBackground, adWidth, adHeight, deviceIp, extendedAdType, observableConfig, adInstanceId, closeConfigResponse, uiAdm, adMuteStateManager);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdRendererConfig)) {
            return false;
        }
        AdRendererConfig adRendererConfig = (AdRendererConfig) other;
        return Intrinsics.areEqual(this.sdkName, adRendererConfig.sdkName) && Intrinsics.areEqual(this.sdkVersion, adRendererConfig.sdkVersion) && Intrinsics.areEqual(this.advertisingId, adRendererConfig.advertisingId) && this.isLimitTrackingEnabled == adRendererConfig.isLimitTrackingEnabled && this.isSubjectToCoppa == adRendererConfig.isSubjectToCoppa && this.isTestMode == adRendererConfig.isTestMode && this.isFullscreenAd == adRendererConfig.isFullscreenAd && this.isCloseButtonEnabled == adRendererConfig.isCloseButtonEnabled && this.isThumbnailSize == adRendererConfig.isThumbnailSize && this.isTransparentBackground == adRendererConfig.isTransparentBackground && this.adWidth == adRendererConfig.adWidth && this.adHeight == adRendererConfig.adHeight && Intrinsics.areEqual(this.deviceIp, adRendererConfig.deviceIp) && Intrinsics.areEqual(this.extendedAdType, adRendererConfig.extendedAdType) && Intrinsics.areEqual(this.observableConfig, adRendererConfig.observableConfig) && this.adInstanceId == adRendererConfig.adInstanceId && Intrinsics.areEqual(this.closeConfigResponse, adRendererConfig.closeConfigResponse) && Intrinsics.areEqual(this.uiAdm, adRendererConfig.uiAdm) && Intrinsics.areEqual(this.adMuteStateManager, adRendererConfig.adMuteStateManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.sdkName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.advertisingId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isLimitTrackingEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.isSubjectToCoppa;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isTestMode;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isFullscreenAd;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.isCloseButtonEnabled;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.isThumbnailSize;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.isTransparentBackground;
        int hashCode4 = (((((i12 + (z7 ? 1 : z7 ? 1 : 0)) * 31) + Integer.hashCode(this.adWidth)) * 31) + Integer.hashCode(this.adHeight)) * 31;
        String str4 = this.deviceIp;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ExtendedAdType extendedAdType = this.extendedAdType;
        int hashCode6 = (hashCode5 + (extendedAdType != null ? extendedAdType.hashCode() : 0)) * 31;
        ObservableConfig observableConfig = this.observableConfig;
        int hashCode7 = (((hashCode6 + (observableConfig != null ? observableConfig.hashCode() : 0)) * 31) + Integer.hashCode(this.adInstanceId)) * 31;
        CloseConfigResponse closeConfigResponse = this.closeConfigResponse;
        int hashCode8 = (hashCode7 + (closeConfigResponse != null ? closeConfigResponse.hashCode() : 0)) * 31;
        String str5 = this.uiAdm;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        AdMuteStateManager adMuteStateManager = this.adMuteStateManager;
        return hashCode9 + (adMuteStateManager != null ? adMuteStateManager.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdRendererConfig(sdkName=" + this.sdkName + ", sdkVersion=" + this.sdkVersion + ", advertisingId=" + this.advertisingId + ", isLimitTrackingEnabled=" + this.isLimitTrackingEnabled + ", isSubjectToCoppa=" + this.isSubjectToCoppa + ", isTestMode=" + this.isTestMode + ", isFullscreenAd=" + this.isFullscreenAd + ", isCloseButtonEnabled=" + this.isCloseButtonEnabled + ", isThumbnailSize=" + this.isThumbnailSize + ", isTransparentBackground=" + this.isTransparentBackground + ", adWidth=" + this.adWidth + ", adHeight=" + this.adHeight + ", deviceIp=" + this.deviceIp + ", extendedAdType=" + this.extendedAdType + ", observableConfig=" + this.observableConfig + ", adInstanceId=" + this.adInstanceId + ", closeConfigResponse=" + this.closeConfigResponse + ", uiAdm=" + this.uiAdm + ", adMuteStateManager=" + this.adMuteStateManager + ")";
    }

    public AdRendererConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, @Nullable String str4, @Nullable ExtendedAdType extendedAdType, @Nullable ObservableConfig observableConfig, int i3, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String str5, @Nullable AdMuteStateManager adMuteStateManager) {
        this.sdkName = str;
        this.sdkVersion = str2;
        this.advertisingId = str3;
        this.isLimitTrackingEnabled = z;
        this.isSubjectToCoppa = z2;
        this.isTestMode = z3;
        this.isFullscreenAd = z4;
        this.isCloseButtonEnabled = z5;
        this.isThumbnailSize = z6;
        this.isTransparentBackground = z7;
        this.adWidth = i;
        this.adHeight = i2;
        this.deviceIp = str4;
        this.extendedAdType = extendedAdType;
        this.observableConfig = observableConfig;
        this.adInstanceId = i3;
        this.closeConfigResponse = closeConfigResponse;
        this.uiAdm = str5;
        this.adMuteStateManager = adMuteStateManager;
    }

    @Nullable
    public final String getSdkName() {
        return this.sdkName;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final boolean isLimitTrackingEnabled() {
        return this.isLimitTrackingEnabled;
    }

    public final boolean isSubjectToCoppa() {
        return this.isSubjectToCoppa;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public final boolean isFullscreenAd() {
        return this.isFullscreenAd;
    }

    public final boolean isCloseButtonEnabled() {
        return this.isCloseButtonEnabled;
    }

    public final boolean isThumbnailSize() {
        return this.isThumbnailSize;
    }

    public final boolean isTransparentBackground() {
        return this.isTransparentBackground;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    public final int getAdHeight() {
        return this.adHeight;
    }

    @Nullable
    public final String getDeviceIp() {
        return this.deviceIp;
    }

    @Nullable
    public final ExtendedAdType getExtendedAdType() {
        return this.extendedAdType;
    }

    @Nullable
    public final ObservableConfig getObservableConfig() {
        return this.observableConfig;
    }

    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @Nullable
    public final String getUiAdm() {
        return this.uiAdm;
    }

    public /* synthetic */ AdRendererConfig(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, String str4, ExtendedAdType extendedAdType, ObservableConfig observableConfig, int i3, CloseConfigResponse closeConfigResponse, String str5, AdMuteStateManager adMuteStateManager, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? false : z5, (i4 & 256) != 0 ? false : z6, (i4 & 512) == 0 ? z7 : false, (i4 & 1024) != 0 ? -1 : i, (i4 & 2048) != 0 ? -1 : i2, (i4 & 4096) != 0 ? null : str4, (i4 & 8192) != 0 ? null : extendedAdType, (i4 & 16384) != 0 ? null : observableConfig, (i4 & 32768) != 0 ? -1 : i3, (i4 & 65536) != 0 ? null : closeConfigResponse, (i4 & 131072) != 0 ? null : str5, (i4 & 262144) != 0 ? null : adMuteStateManager);
    }

    @Nullable
    public final AdMuteStateManager getAdMuteStateManager() {
        return this.adMuteStateManager;
    }
}
