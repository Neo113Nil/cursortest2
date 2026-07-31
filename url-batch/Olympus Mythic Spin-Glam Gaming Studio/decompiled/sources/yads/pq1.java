package yads;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pq1 {
    public final Long a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;

    public pq1(Long l, Map map, Map map2, Map map3, Map map4, Map map5) {
        this.a = l;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
    }

    public final String a() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        Long l = this.a;
        if (l != null) {
            createMapBuilder.put("default_timeout", Long.valueOf(l.longValue()));
        }
        Map map = this.b;
        if (map != null) {
            createMapBuilder.put("banner", map);
        }
        Map map2 = this.c;
        if (map2 != null) {
            createMapBuilder.put("interstitial", map2);
        }
        Map map3 = this.d;
        if (map3 != null) {
            createMapBuilder.put("rewarded", map3);
        }
        Map map4 = this.e;
        if (map4 != null) {
            createMapBuilder.put("native", map4);
        }
        Map map5 = this.f;
        if (map5 != null) {
            createMapBuilder.put("appOpenAd", map5);
        }
        return new JSONObject(MapsKt.build(createMapBuilder)).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq1)) {
            return false;
        }
        pq1 pq1Var = (pq1) obj;
        return Intrinsics.areEqual(this.a, pq1Var.a) && Intrinsics.areEqual(this.b, pq1Var.b) && Intrinsics.areEqual(this.c, pq1Var.c) && Intrinsics.areEqual(this.d, pq1Var.d) && Intrinsics.areEqual(this.e, pq1Var.e) && Intrinsics.areEqual(this.f, pq1Var.f);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.c;
        int hashCode3 = (hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.d;
        int hashCode4 = (hashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map map4 = this.e;
        int hashCode5 = (hashCode4 + (map4 != null ? map4.hashCode() : 0)) * 31;
        Map map5 = this.f;
        return hashCode5 + (map5 != null ? map5.hashCode() : 0);
    }
}
