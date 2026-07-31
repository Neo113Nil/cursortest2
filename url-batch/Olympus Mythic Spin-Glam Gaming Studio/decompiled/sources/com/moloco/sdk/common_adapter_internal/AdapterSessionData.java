package com.moloco.sdk.common_adapter_internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.moloco.sdk.publisher.bidrequest.Geo;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000e¨\u0006("}, d2 = {"Lcom/moloco/sdk/common_adapter_internal/AdapterSessionData;", "", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", POBConstants.KEY_GEO, "", "bidRequestEndpoint", "appId", "publisherId", "platformId", "<init>", "(Lcom/moloco/sdk/publisher/bidrequest/Geo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/moloco/sdk/publisher/bidrequest/Geo;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/moloco/sdk/publisher/bidrequest/Geo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/moloco/sdk/common_adapter_internal/AdapterSessionData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/moloco/sdk/publisher/bidrequest/Geo;", "getGeo", "b", "Ljava/lang/String;", "getBidRequestEndpoint", "c", "getAppId", "d", "getPublisherId", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getPlatformId", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public final /* data */ class AdapterSessionData {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Geo geo;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String bidRequestEndpoint;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final String appId;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String publisherId;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final String platformId;

    public AdapterSessionData(@NotNull Geo geo, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(geo, "geo");
        this.geo = geo;
        this.bidRequestEndpoint = str;
        this.appId = str2;
        this.publisherId = str3;
        this.platformId = str4;
    }

    public static /* synthetic */ AdapterSessionData copy$default(AdapterSessionData adapterSessionData, Geo geo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            geo = adapterSessionData.geo;
        }
        if ((i & 2) != 0) {
            str = adapterSessionData.bidRequestEndpoint;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = adapterSessionData.appId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = adapterSessionData.publisherId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = adapterSessionData.platformId;
        }
        return adapterSessionData.copy(geo, str5, str6, str7, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Geo getGeo() {
        return this.geo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBidRequestEndpoint() {
        return this.bidRequestEndpoint;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPublisherId() {
        return this.publisherId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPlatformId() {
        return this.platformId;
    }

    @NotNull
    public final AdapterSessionData copy(@NotNull Geo geo, @Nullable String bidRequestEndpoint, @Nullable String appId, @Nullable String publisherId, @Nullable String platformId) {
        Intrinsics.checkNotNullParameter(geo, "geo");
        return new AdapterSessionData(geo, bidRequestEndpoint, appId, publisherId, platformId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdapterSessionData)) {
            return false;
        }
        AdapterSessionData adapterSessionData = (AdapterSessionData) other;
        return Intrinsics.areEqual(this.geo, adapterSessionData.geo) && Intrinsics.areEqual(this.bidRequestEndpoint, adapterSessionData.bidRequestEndpoint) && Intrinsics.areEqual(this.appId, adapterSessionData.appId) && Intrinsics.areEqual(this.publisherId, adapterSessionData.publisherId) && Intrinsics.areEqual(this.platformId, adapterSessionData.platformId);
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getBidRequestEndpoint() {
        return this.bidRequestEndpoint;
    }

    @NotNull
    public final Geo getGeo() {
        return this.geo;
    }

    @Nullable
    public final String getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final String getPublisherId() {
        return this.publisherId;
    }

    public int hashCode() {
        int hashCode = this.geo.hashCode() * 31;
        String str = this.bidRequestEndpoint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publisherId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.platformId;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdapterSessionData(geo=" + this.geo + ", bidRequestEndpoint=" + this.bidRequestEndpoint + ", appId=" + this.appId + ", publisherId=" + this.publisherId + ", platformId=" + this.platformId + ')';
    }
}
