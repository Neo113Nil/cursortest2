package com.revenuecat.purchases.ads.events.types;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRevenueData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\f\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;", "", "networkName", "", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "revenueMicros", "", "currency", "precision", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getCurrency", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "getPrecision-rAcPn4k", "getRevenueMicros", "()J", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdRevenueData {
    private final String adUnitId;
    private final String currency;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;
    private final String precision;
    private final long revenueMicros;

    public /* synthetic */ AdRevenueData(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) obj;
        return Intrinsics.areEqual(this.networkName, adRevenueData.networkName) && AdMediatorName.m10556equalsimpl0(this.mediatorName, adRevenueData.mediatorName) && Intrinsics.areEqual(this.placement, adRevenueData.placement) && Intrinsics.areEqual(this.adUnitId, adRevenueData.adUnitId) && Intrinsics.areEqual(this.impressionId, adRevenueData.impressionId) && this.revenueMicros == adRevenueData.revenueMicros && Intrinsics.areEqual(this.currency, adRevenueData.currency) && AdRevenuePrecision.m10569equalsimpl0(this.precision, adRevenueData.precision);
    }

    public int hashCode() {
        int hashCode = ((this.networkName.hashCode() * 31) + AdMediatorName.m10557hashCodeimpl(this.mediatorName)) * 31;
        String str = this.placement;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.adUnitId.hashCode()) * 31) + this.impressionId.hashCode()) * 31) + Long.hashCode(this.revenueMicros)) * 31) + this.currency.hashCode()) * 31) + AdRevenuePrecision.m10570hashCodeimpl(this.precision);
    }

    public String toString() {
        return "AdRevenueData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m10558toStringimpl(this.mediatorName)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ", revenueMicros=" + this.revenueMicros + ", currency=" + this.currency + ", precision=" + ((Object) AdRevenuePrecision.m10571toStringimpl(this.precision)) + ')';
    }

    private AdRevenueData(String networkName, String mediatorName, String str, String adUnitId, String impressionId, long j, String currency, String precision) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.networkName = networkName;
        this.mediatorName = mediatorName;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
        this.revenueMicros = j;
        this.currency = currency;
        this.precision = precision;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: getMediatorName-GyoM_N4, reason: not valid java name and from getter */
    public final String getMediatorName() {
        return this.mediatorName;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getRevenueMicros() {
        return this.revenueMicros;
    }

    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: getPrecision-rAcPn4k, reason: not valid java name and from getter */
    public final String getPrecision() {
        return this.precision;
    }
}
