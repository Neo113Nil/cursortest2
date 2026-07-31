package com.unity3d.mediation;

import com.ironsource.Ab;
import com.ironsource.C4782n4;
import com.ironsource.C4834q2;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class LevelPlayAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @Nullable
    private final C4834q2 d;

    @Nullable
    private final LevelPlayAdSize e;

    @Nullable
    private final String f;

    @NotNull
    private final Map<String, Object> g;

    public LevelPlayAdInfo(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable C4834q2 c4834q2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str, @NotNull Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.a = adId;
        this.b = adUnitId;
        this.c = adFormat;
        this.d = c4834q2;
        this.e = levelPlayAdSize;
        this.f = str;
        this.g = adapterData;
    }

    private final String a() {
        return this.a;
    }

    private final String b() {
        return this.b;
    }

    private final String c() {
        return this.c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4834q2 c4834q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            c4834q2 = levelPlayAdInfo.d;
        }
        C4834q2 c4834q22 = c4834q2;
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.e;
        }
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i & 32) != 0) {
            str4 = levelPlayAdInfo.f;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            map = levelPlayAdInfo.g;
        }
        return levelPlayAdInfo.copy(str, str5, str6, c4834q22, levelPlayAdSize2, str7, map);
    }

    private final C4834q2 d() {
        return this.d;
    }

    private final LevelPlayAdSize e() {
        return this.e;
    }

    private final String f() {
        return this.f;
    }

    private final Map<String, Object> g() {
        return this.g;
    }

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String adId, @NotNull String adUnitId, @NotNull String adFormat, @Nullable C4834q2 c4834q2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str, @NotNull Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c4834q2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.areEqual(this.a, levelPlayAdInfo.a) && Intrinsics.areEqual(this.b, levelPlayAdInfo.b) && Intrinsics.areEqual(this.c, levelPlayAdInfo.c) && Intrinsics.areEqual(this.d, levelPlayAdInfo.d) && Intrinsics.areEqual(this.e, levelPlayAdInfo.e) && Intrinsics.areEqual(this.f, levelPlayAdInfo.f) && Intrinsics.areEqual(this.g, levelPlayAdInfo.g);
    }

    @NotNull
    public final String getAdId() {
        return this.a;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.e;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Double valueOf = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : Double.valueOf(m.optDouble("revenue"));
        if (Intrinsics.areEqual(valueOf, Double.NaN) || valueOf == null) {
            return 0.0d;
        }
        return valueOf.doubleValue();
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        Ab d;
        String c;
        C4834q2 c4834q2 = this.d;
        return (c4834q2 == null || (d = c4834q2.d()) == null || (c = d.c()) == null) ? getImpressionPrecision$mediationsdk_release() : c;
    }

    public final double getRevenue() {
        Ab d;
        C4834q2 c4834q2 = this.d;
        return (c4834q2 == null || (d = c4834q2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : d.d();
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        C4834q2 c4834q2 = this.d;
        int hashCode2 = (hashCode + (c4834q2 == null ? 0 : c4834q2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.e;
        int hashCode3 = (hashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    @NotNull
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject m;
        try {
            C4834q2 c4834q2 = this.d;
            if (c4834q2 == null || (m = c4834q2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> keys = m.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "it.keys()");
                jSONObject = new JSONObject(m, (String[]) SequencesKt.toList(SequencesKt.asSequence(keys)).toArray(new String[0]));
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C4782n4.d().a(e);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            Intrinsics.checkNotNullExpressionValue(placement, "placement");
            if (placement.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", StringsKt.replace$default(placement, d.r, str, false, 4, (Object) null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C4782n4.d().a(e2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        T t = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : (T) m.opt(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C4834q2 c4834q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : c4834q2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo adInfo, @Nullable String str) {
        this(adInfo.a, adInfo.b, adInfo.c, adInfo.d, adInfo.e, str, adInfo.g);
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    @NotNull
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("precision");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCreativeId() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("creativeId");
        if (!(opt instanceof String)) {
            opt = null;
        }
        String str = (String) opt;
        if (str != null) {
            return str;
        }
        Object obj = this.g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    @NotNull
    public final String getEncryptedCPM() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("encryptedCPM");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceId() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("instanceId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceName() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("instanceName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdNetwork() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("adNetwork");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getSegmentName() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("segmentName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAb() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("ab");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCountry() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("country");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAuctionId() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("auctionId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdFormat() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("adFormat");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.c : str;
    }

    @NotNull
    public final String getAdUnitName() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("mediationAdUnitName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdUnitId() {
        JSONObject m;
        C4834q2 c4834q2 = this.d;
        Object opt = (c4834q2 == null || (m = c4834q2.m()) == null) ? null : m.opt("mediationAdUnitId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.b : str;
    }
}
