package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.config.ObservableConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdRepositoryDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "", "uid", "", "observable", "Lcom/mobilefuse/sdk/config/ObservableConfig;", "adWidth", "adHeight", "isTestMode", "", "adType", "", "placementId", "adInstanceId", "(ILcom/mobilefuse/sdk/config/ObservableConfig;IIZLjava/lang/String;Ljava/lang/String;I)V", "getAdHeight", "()I", "getAdInstanceId", "getAdType", "()Ljava/lang/String;", "getAdWidth", "()Z", "getObservable", "()Lcom/mobilefuse/sdk/config/ObservableConfig;", "getPlacementId", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final /* data */ class AdLoadingConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int configUid = 1;
    private final int adHeight;
    private final int adInstanceId;

    @NotNull
    private final String adType;
    private final int adWidth;
    private final boolean isTestMode;

    @NotNull
    private final ObservableConfig observable;

    @NotNull
    private final String placementId;
    private final int uid;

    /* renamed from: component1, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ObservableConfig getObservable() {
        return this.observable;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAdWidth() {
        return this.adWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAdHeight() {
        return this.adHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    @NotNull
    public final AdLoadingConfig copy(int uid, @NotNull ObservableConfig observable, int adWidth, int adHeight, boolean isTestMode, @NotNull String adType, @NotNull String placementId, int adInstanceId) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new AdLoadingConfig(uid, observable, adWidth, adHeight, isTestMode, adType, placementId, adInstanceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdLoadingConfig)) {
            return false;
        }
        AdLoadingConfig adLoadingConfig = (AdLoadingConfig) other;
        return this.uid == adLoadingConfig.uid && Intrinsics.areEqual(this.observable, adLoadingConfig.observable) && this.adWidth == adLoadingConfig.adWidth && this.adHeight == adLoadingConfig.adHeight && this.isTestMode == adLoadingConfig.isTestMode && Intrinsics.areEqual(this.adType, adLoadingConfig.adType) && Intrinsics.areEqual(this.placementId, adLoadingConfig.placementId) && this.adInstanceId == adLoadingConfig.adInstanceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.uid) * 31;
        ObservableConfig observableConfig = this.observable;
        int hashCode2 = (((((hashCode + (observableConfig != null ? observableConfig.hashCode() : 0)) * 31) + Integer.hashCode(this.adWidth)) * 31) + Integer.hashCode(this.adHeight)) * 31;
        boolean z = this.isTestMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.adType;
        int hashCode3 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.placementId;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.adInstanceId);
    }

    @NotNull
    public String toString() {
        return "AdLoadingConfig(uid=" + this.uid + ", observable=" + this.observable + ", adWidth=" + this.adWidth + ", adHeight=" + this.adHeight + ", isTestMode=" + this.isTestMode + ", adType=" + this.adType + ", placementId=" + this.placementId + ", adInstanceId=" + this.adInstanceId + ")";
    }

    public AdLoadingConfig(int i, @NotNull ObservableConfig observable, int i2, int i3, boolean z, @NotNull String adType, @NotNull String placementId, int i4) {
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.uid = i;
        this.observable = observable;
        this.adWidth = i2;
        this.adHeight = i3;
        this.isTestMode = z;
        this.adType = adType;
        this.placementId = placementId;
        this.adInstanceId = i4;
    }

    public /* synthetic */ AdLoadingConfig(int i, ObservableConfig observableConfig, int i2, int i3, boolean z, String str, String str2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? INSTANCE.nextConfigUid() : i, observableConfig, (i5 & 4) != 0 ? 1 : i2, (i5 & 8) != 0 ? 1 : i3, z, str, str2, i4);
    }

    public final int getUid() {
        return this.uid;
    }

    @NotNull
    public final ObservableConfig getObservable() {
        return this.observable;
    }

    public final int getAdWidth() {
        return this.adWidth;
    }

    public final int getAdHeight() {
        return this.adHeight;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    public final int getAdInstanceId() {
        return this.adInstanceId;
    }

    /* compiled from: AdRepositoryDataModel.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig$Companion;", "", "()V", "configUid", "", "nextConfigUid", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int nextConfigUid() {
            int i = AdLoadingConfig.configUid;
            AdLoadingConfig.configUid = i + 1;
            return i;
        }
    }
}
