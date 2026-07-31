package com.monetization.ads.mediation.base.prefetch.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchAdapterData;", "", "Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchNetworkWinner;", "networkWinner", "Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;", "revenue", "", "networkAdInfo", "<init>", "(Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchNetworkWinner;Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;Ljava/lang/String;)V", "component1", "()Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchNetworkWinner;", "component2", "()Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchNetworkWinner;Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;Ljava/lang/String;)Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchAdapterData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchNetworkWinner;", "getNetworkWinner", "b", "Lcom/monetization/ads/mediation/base/prefetch/model/MediatedPrefetchRevenue;", "getRevenue", "c", "Ljava/lang/String;", "getNetworkAdInfo", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediatedPrefetchAdapterData {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final MediatedPrefetchNetworkWinner networkWinner;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final MediatedPrefetchRevenue revenue;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final String networkAdInfo;

    public MediatedPrefetchAdapterData(@NotNull MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, @NotNull MediatedPrefetchRevenue mediatedPrefetchRevenue, @NotNull String str) {
        this.networkWinner = mediatedPrefetchNetworkWinner;
        this.revenue = mediatedPrefetchRevenue;
        this.networkAdInfo = str;
    }

    public static /* synthetic */ MediatedPrefetchAdapterData copy$default(MediatedPrefetchAdapterData mediatedPrefetchAdapterData, MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, MediatedPrefetchRevenue mediatedPrefetchRevenue, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mediatedPrefetchNetworkWinner = mediatedPrefetchAdapterData.networkWinner;
        }
        if ((i & 2) != 0) {
            mediatedPrefetchRevenue = mediatedPrefetchAdapterData.revenue;
        }
        if ((i & 4) != 0) {
            str = mediatedPrefetchAdapterData.networkAdInfo;
        }
        return mediatedPrefetchAdapterData.copy(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.networkWinner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MediatedPrefetchRevenue getRevenue() {
        return this.revenue;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getNetworkAdInfo() {
        return this.networkAdInfo;
    }

    @NotNull
    public final MediatedPrefetchAdapterData copy(@NotNull MediatedPrefetchNetworkWinner networkWinner, @NotNull MediatedPrefetchRevenue revenue, @NotNull String networkAdInfo) {
        return new MediatedPrefetchAdapterData(networkWinner, revenue, networkAdInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediatedPrefetchAdapterData)) {
            return false;
        }
        MediatedPrefetchAdapterData mediatedPrefetchAdapterData = (MediatedPrefetchAdapterData) other;
        return Intrinsics.areEqual(this.networkWinner, mediatedPrefetchAdapterData.networkWinner) && Intrinsics.areEqual(this.revenue, mediatedPrefetchAdapterData.revenue) && Intrinsics.areEqual(this.networkAdInfo, mediatedPrefetchAdapterData.networkAdInfo);
    }

    @NotNull
    public final String getNetworkAdInfo() {
        return this.networkAdInfo;
    }

    @NotNull
    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.networkWinner;
    }

    @NotNull
    public final MediatedPrefetchRevenue getRevenue() {
        return this.revenue;
    }

    public int hashCode() {
        return this.networkAdInfo.hashCode() + ((this.revenue.hashCode() + (this.networkWinner.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "MediatedPrefetchAdapterData(networkWinner=" + this.networkWinner + ", revenue=" + this.revenue + ", networkAdInfo=" + this.networkAdInfo + ")";
    }
}
