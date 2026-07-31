package com.revenuecat.purchases.ads.events.types;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdDisplayedData.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdDisplayedData;", "", "networkName", "", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "impressionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getImpressionId", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdDisplayedData {
    private final String adUnitId;
    private final String impressionId;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public /* synthetic */ AdDisplayedData(String str, String str2, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDisplayedData)) {
            return false;
        }
        AdDisplayedData adDisplayedData = (AdDisplayedData) obj;
        return Intrinsics.areEqual(this.networkName, adDisplayedData.networkName) && AdMediatorName.m10556equalsimpl0(this.mediatorName, adDisplayedData.mediatorName) && Intrinsics.areEqual(this.placement, adDisplayedData.placement) && Intrinsics.areEqual(this.adUnitId, adDisplayedData.adUnitId) && Intrinsics.areEqual(this.impressionId, adDisplayedData.impressionId);
    }

    public int hashCode() {
        int hashCode = ((this.networkName.hashCode() * 31) + AdMediatorName.m10557hashCodeimpl(this.mediatorName)) * 31;
        String str = this.placement;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.adUnitId.hashCode()) * 31) + this.impressionId.hashCode();
    }

    public String toString() {
        return "AdDisplayedData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m10558toStringimpl(this.mediatorName)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", impressionId=" + this.impressionId + ')';
    }

    private AdDisplayedData(String networkName, String mediatorName, String str, String adUnitId, String impressionId) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        this.networkName = networkName;
        this.mediatorName = mediatorName;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.impressionId = impressionId;
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
}
