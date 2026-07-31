package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڋ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0654 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1389 = StringFog.decrypt("W0yFPKULkv1xW6knhRCI4l9bjjuXEI7gfGyPJJMKkuo=\n", "Ej7qUvZk548=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0791 f1390;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f1391;

    static {
        StringFog.decrypt("nbYSYME4XdWe/Rln4zlHzp++JGzW\n", "8NN2CaBMNLo=\n");
        StringFog.decrypt("vc2dKBSWAIi+hpotEIMHpKXbjS4YsAyR\n", "0Kj5QXXiaec=\n");
    }

    public C0654(C0791 c0791) {
        this.f1390 = c0791;
        C0664 c0664 = new C0664(this);
        AbstractC0698 m4143 = AbstractC0698.m4143();
        synchronized (m4143) {
            m4143.f1553.add(c0664);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4131(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        return iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB ? StringFog.decrypt("Vsy9rEM=\n", "N6jQwyG9C4E=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID ? StringFog.decrypt("/gDL8WmLEg==\n", "mGGigwvidqo=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM ? StringFog.decrypt("bDuqhe2J\n", "BF7G7Jjk6AA=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY ? StringFog.decrypt("P3kwyQHoTewlbw==\n", "TAxArHObIoI=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX ? StringFog.decrypt("sO7nVal7I20=\n", "0Z6XOcYNSgM=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY ? StringFog.decrypt("LFyI7PwqBWY=\n", "WTLhmIVLYRU=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED ? StringFog.decrypt("UPbjZ/+uWJxC5+pl\n", "I5OPAZLLPPU=\n") : iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER ? StringFog.decrypt("v+C9M6M=\n", "0JTVVtGXX8I=\n") : "";
    }
}
