package yads;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class jx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final LinkedHashMap f;
    public final ip2 g;

    public jx0(String str, String str2, String str3, String str4, List list, LinkedHashMap linkedHashMap, ip2 ip2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = linkedHashMap;
        this.g = ip2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx0)) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return Intrinsics.areEqual(this.a, jx0Var.a) && Intrinsics.areEqual(this.b, jx0Var.b) && Intrinsics.areEqual(this.c, jx0Var.c) && Intrinsics.areEqual(this.d, jx0Var.d) && Intrinsics.areEqual(this.e, jx0Var.e) && Intrinsics.areEqual(this.f, jx0Var.f) && this.g == jx0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.f;
        int hashCode6 = (hashCode5 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        ip2 ip2Var = this.g;
        return hashCode6 + (ip2Var != null ? ip2Var.hashCode() : 0);
    }

    public final String toString() {
        return "FullscreenCacheParams(adUnitId=" + this.a + ", age=" + this.b + ", gender=" + this.c + ", contextQuery=" + this.d + ", contextTags=" + this.e + ", parameters=" + this.f + ", preferredTheme=" + this.g + ")";
    }
}
