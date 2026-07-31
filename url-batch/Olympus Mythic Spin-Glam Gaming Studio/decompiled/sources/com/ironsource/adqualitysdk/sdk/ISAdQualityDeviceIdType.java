package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes15.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f67;

    ISAdQualityDeviceIdType(int i) {
        this.f67 = i;
    }

    @Deprecated
    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }

    @Deprecated
    public int getValue() {
        return this.f67;
    }
}
