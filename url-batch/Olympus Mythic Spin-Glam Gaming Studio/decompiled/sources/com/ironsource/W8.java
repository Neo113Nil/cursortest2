package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class W8 {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "auctionId";

    @NotNull
    public static final String e = "adUnit";

    @NotNull
    public static final String f = "adFormat";

    @NotNull
    public static final String g = "mediationAdUnitName";

    @NotNull
    public static final String h = "mediationAdUnitId";

    @NotNull
    public static final String i = "country";

    @NotNull
    public static final String j = "ab";

    @NotNull
    public static final String k = "segmentName";

    @NotNull
    public static final String l = "placement";

    @NotNull
    public static final String m = "adNetwork";

    @NotNull
    public static final String n = "instanceName";

    @NotNull
    public static final String o = "instanceId";

    @NotNull
    public static final String p = "revenue";

    @NotNull
    public static final String q = "precision";

    @NotNull
    public static final String r = "encryptedCPM";

    @NotNull
    public static final String s = "creativeId";

    @NotNull
    private final LevelPlayAdInfo a;

    @NotNull
    private final DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public W8(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInfo;
        this.b = new DecimalFormat("#.#####");
    }

    @NotNull
    public final String a() {
        return this.a.getAb();
    }

    @NotNull
    public final String b() {
        return this.a.getAdFormat();
    }

    @NotNull
    public final String c() {
        return this.a.getAdNetwork();
    }

    @NotNull
    public final JSONObject d() {
        return this.a.impressionData$mediationsdk_release();
    }

    @NotNull
    public final String e() {
        return this.a.getAuctionId();
    }

    @NotNull
    public final String f() {
        return this.a.getCountry();
    }

    @NotNull
    public final String g() {
        return this.a.getCreativeId();
    }

    @NotNull
    public final String h() {
        return this.a.getEncryptedCPM();
    }

    @NotNull
    public final String i() {
        return this.a.getInstanceId();
    }

    @NotNull
    public final String j() {
        return this.a.getInstanceName();
    }

    @NotNull
    public final String k() {
        return this.a.getAdUnitId();
    }

    @NotNull
    public final String l() {
        return this.a.getAdUnitName();
    }

    @NotNull
    public final String m() {
        return this.a.getPlacementName();
    }

    @NotNull
    public final String n() {
        return this.a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.a.getImpressionRevenue$mediationsdk_release();
    }

    @NotNull
    public final String p() {
        return this.a.getSegmentName();
    }

    @NotNull
    public String toString() {
        String e2 = e();
        String l2 = l();
        String k2 = k();
        String b = b();
        String f2 = f();
        String a2 = a();
        String p2 = p();
        String m2 = m();
        String c2 = c();
        String j2 = j();
        String i2 = i();
        o();
        return "auctionId: '" + e2 + "', mediationAdUnitName: '" + l2 + "', mediationAdUnitId: '" + k2 + "', adFormat: '" + b + "', country: '" + f2 + "', ab: '" + a2 + "', segmentName: '" + p2 + "', placement: '" + m2 + "', adNetwork: '" + c2 + "', instanceName: '" + j2 + "', instanceId: '" + i2 + "', revenue: " + this.b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}
