package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes3.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f58;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final double f59;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f60;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ISAdQualityMediationNetwork f61;

    @Deprecated
    public static class Builder {

        /* renamed from: ﻛ, reason: contains not printable characters */
        public String f62;

        /* renamed from: ｋ, reason: contains not printable characters */
        public double f63;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public ISAdQualityMediationNetwork f65 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public ISAdQualityAdType f64 = ISAdQualityAdType.UNKNOWN;

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f65, this.f64, this.f63, this.f62);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f64 = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f65 = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f62 = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d) {
            this.f63 = d;
            return this;
        }
    }

    public ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f61 = iSAdQualityMediationNetwork;
        this.f60 = iSAdQualityAdType;
        this.f59 = d;
        this.f58 = str;
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f60;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f61;
    }

    @Deprecated
    public String getPlacement() {
        return this.f58;
    }

    @Deprecated
    public double getRevenue() {
        return this.f59;
    }
}
