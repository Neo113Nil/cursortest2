package com.revenuecat.purchases.ads.events.types;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdFailedToLoadData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;", "", "networkName", "", "mediatorName", "Lcom/revenuecat/purchases/ads/events/types/AdMediatorName;", "placement", "adUnitId", "mediatorErrorCode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdUnitId", "()Ljava/lang/String;", "getMediatorErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediatorName-GyoM_N4", "Ljava/lang/String;", "getNetworkName", "getPlacement", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdFailedToLoadData {
    private final String adUnitId;
    private final Integer mediatorErrorCode;
    private final String mediatorName;
    private final String networkName;
    private final String placement;

    public /* synthetic */ AdFailedToLoadData(String str, String str2, String str3, String str4, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdFailedToLoadData)) {
            return false;
        }
        AdFailedToLoadData adFailedToLoadData = (AdFailedToLoadData) obj;
        return Intrinsics.areEqual(this.networkName, adFailedToLoadData.networkName) && AdMediatorName.m10556equalsimpl0(this.mediatorName, adFailedToLoadData.mediatorName) && Intrinsics.areEqual(this.placement, adFailedToLoadData.placement) && Intrinsics.areEqual(this.adUnitId, adFailedToLoadData.adUnitId) && Intrinsics.areEqual(this.mediatorErrorCode, adFailedToLoadData.mediatorErrorCode);
    }

    public int hashCode() {
        int hashCode = ((this.networkName.hashCode() * 31) + AdMediatorName.m10557hashCodeimpl(this.mediatorName)) * 31;
        String str = this.placement;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.adUnitId.hashCode()) * 31;
        Integer num = this.mediatorErrorCode;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdFailedToLoadData(networkName=" + this.networkName + ", mediatorName=" + ((Object) AdMediatorName.m10558toStringimpl(this.mediatorName)) + ", placement=" + this.placement + ", adUnitId=" + this.adUnitId + ", mediatorErrorCode=" + this.mediatorErrorCode + ')';
    }

    private AdFailedToLoadData(String networkName, String mediatorName, String str, String adUnitId, Integer num) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(mediatorName, "mediatorName");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.networkName = networkName;
        this.mediatorName = mediatorName;
        this.placement = str;
        this.adUnitId = adUnitId;
        this.mediatorErrorCode = num;
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

    public final Integer getMediatorErrorCode() {
        return this.mediatorErrorCode;
    }
}
