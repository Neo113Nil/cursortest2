package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Hd {

    @Nullable
    private final Map<String, List<String>> a;

    @Nullable
    private final Map<String, List<String>> b;

    @Nullable
    private final Map<String, List<String>> c;

    @Nullable
    private final Map<String, List<String>> d;

    public Hd() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final Map<String, List<String>> a() {
        return this.a;
    }

    @Nullable
    public final Map<String, List<String>> b() {
        return this.b;
    }

    @Nullable
    public final Map<String, List<String>> c() {
        return this.c;
    }

    @Nullable
    public final Map<String, List<String>> d() {
        return this.d;
    }

    @Nullable
    public final Map<String, List<String>> e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hd)) {
            return false;
        }
        Hd hd = (Hd) obj;
        return Intrinsics.areEqual(this.a, hd.a) && Intrinsics.areEqual(this.b, hd.b) && Intrinsics.areEqual(this.c, hd.c) && Intrinsics.areEqual(this.d, hd.d);
    }

    @Nullable
    public final Map<String, List<String>> f() {
        return this.b;
    }

    @Nullable
    public final Map<String, List<String>> g() {
        return this.d;
    }

    @Nullable
    public final Map<String, List<String>> h() {
        return this.a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.b;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.c;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.d;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProviderOrder2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Hd(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    @NotNull
    public final Hd a(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        return new Hd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Hd a(Hd hd, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = hd.a;
        }
        if ((i & 2) != 0) {
            map2 = hd.b;
        }
        if ((i & 4) != 0) {
            map3 = hd.c;
        }
        if ((i & 8) != 0) {
            map4 = hd.d;
        }
        return hd.a(map, map2, map3, map4);
    }

    public /* synthetic */ Hd(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}
