package com.mobilefuse.sdk.identity;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EidDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/mobilefuse/sdk/identity/EidSdkData;", "", "mfxRefreshTimestamp", "", "sdkEids", "", "", "mfxPayload", "userPayload", "(JLjava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getMfxPayload", "()Ljava/lang/String;", "getMfxRefreshTimestamp", "()J", "getSdkEids", "()Ljava/util/Map;", "getUserPayload", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* data */ class EidSdkData {

    @Nullable
    private final String mfxPayload;
    private final long mfxRefreshTimestamp;

    @NotNull
    private final Map<String, String> sdkEids;

    @Nullable
    private final String userPayload;

    public EidSdkData() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ EidSdkData copy$default(EidSdkData eidSdkData, long j, Map map, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eidSdkData.mfxRefreshTimestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            map = eidSdkData.sdkEids;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            str = eidSdkData.mfxPayload;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = eidSdkData.userPayload;
        }
        return eidSdkData.copy(j2, map2, str3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMfxRefreshTimestamp() {
        return this.mfxRefreshTimestamp;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.sdkEids;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMfxPayload() {
        return this.mfxPayload;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getUserPayload() {
        return this.userPayload;
    }

    @NotNull
    public final EidSdkData copy(long mfxRefreshTimestamp, @NotNull Map<String, String> sdkEids, @Nullable String mfxPayload, @Nullable String userPayload) {
        Intrinsics.checkNotNullParameter(sdkEids, "sdkEids");
        return new EidSdkData(mfxRefreshTimestamp, sdkEids, mfxPayload, userPayload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EidSdkData)) {
            return false;
        }
        EidSdkData eidSdkData = (EidSdkData) other;
        return this.mfxRefreshTimestamp == eidSdkData.mfxRefreshTimestamp && Intrinsics.areEqual(this.sdkEids, eidSdkData.sdkEids) && Intrinsics.areEqual(this.mfxPayload, eidSdkData.mfxPayload) && Intrinsics.areEqual(this.userPayload, eidSdkData.userPayload);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.mfxRefreshTimestamp) * 31;
        Map<String, String> map = this.sdkEids;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.mfxPayload;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.userPayload;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EidSdkData(mfxRefreshTimestamp=" + this.mfxRefreshTimestamp + ", sdkEids=" + this.sdkEids + ", mfxPayload=" + this.mfxPayload + ", userPayload=" + this.userPayload + ")";
    }

    public EidSdkData(long j, @NotNull Map<String, String> sdkEids, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(sdkEids, "sdkEids");
        this.mfxRefreshTimestamp = j;
        this.sdkEids = sdkEids;
        this.mfxPayload = str;
        this.userPayload = str2;
    }

    public final long getMfxRefreshTimestamp() {
        return this.mfxRefreshTimestamp;
    }

    public /* synthetic */ EidSdkData(long j, Map map, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    @NotNull
    public final Map<String, String> getSdkEids() {
        return this.sdkEids;
    }

    @Nullable
    public final String getMfxPayload() {
        return this.mfxPayload;
    }

    @Nullable
    public final String getUserPayload() {
        return this.userPayload;
    }
}
