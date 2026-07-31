package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Ab;
import com.ironsource.C4782n4;
import com.ironsource.W8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AdInfo {

    @Nullable
    private final W8 impressionData;

    @Nullable
    private final Ab loadArmData;

    public AdInfo(@Nullable W8 w8, @Nullable Ab ab) {
        this.impressionData = w8;
        this.loadArmData = ab;
    }

    @NotNull
    public final String getAb() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.a() == null) ? "" : this.impressionData.a();
    }

    @NotNull
    public final String getAdNetwork() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.c() == null) ? "" : this.impressionData.c();
    }

    @NotNull
    public final String getAuctionId() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.e() == null) ? "" : this.impressionData.e();
    }

    @NotNull
    public final String getCountry() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.f() == null) ? "" : this.impressionData.f();
    }

    @NotNull
    public final String getEncryptedCPM() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.h() == null) ? "" : this.impressionData.h();
    }

    @NotNull
    public final String getInstanceId() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.i() == null) ? "" : this.impressionData.i();
    }

    @NotNull
    public final String getInstanceName() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.j() == null) ? "" : this.impressionData.j();
    }

    @NotNull
    public final String getPrecision() {
        Ab ab = this.loadArmData;
        if (ab != null) {
            return ab.c();
        }
        W8 w8 = this.impressionData;
        return (w8 == null || w8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Ab ab = this.loadArmData;
        if (ab != null) {
            return ab.d();
        }
        W8 w8 = this.impressionData;
        if (w8 == null) {
            return 0.0d;
        }
        w8.o();
        return this.impressionData.o();
    }

    @NotNull
    public final String getSegmentName() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.p() == null) ? "" : this.impressionData.p();
    }

    @NotNull
    public String toString() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("auctionId", getAuctionId());
            jsonObjectInit.put("country", getCountry());
            jsonObjectInit.put("ab", getAb());
            jsonObjectInit.put("segmentName", getSegmentName());
            jsonObjectInit.put("adNetwork", getAdNetwork());
            jsonObjectInit.put("instanceName", getInstanceName());
            jsonObjectInit.put("instanceId", getInstanceId());
            jsonObjectInit.put("revenue", getRevenue());
            jsonObjectInit.put("precision", getPrecision());
            jsonObjectInit.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String jSONObject = jsonObjectInit.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "adInfoData.toString()");
        return jSONObject;
    }
}
