package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes10.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f71;

    ISAdQualityLogLevel(int i) {
        this.f71 = i;
    }

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }

    @Deprecated
    public int getValue() {
        return this.f71;
    }

    @Deprecated
    public boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f71;
        return i != NONE.f71 && i >= iSAdQualityLogLevel.f71;
    }
}
