package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mg2 {
    public final String a;
    public final String b;
    public final Map c;
    public final Integer d;
    public final nb0 e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public mg2(String str, String str2, Map map, Integer num, nb0 nb0Var, List list, List list2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = num;
        this.e = nb0Var;
        this.f = list;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg2)) {
            return false;
        }
        mg2 mg2Var = (mg2) obj;
        return Intrinsics.areEqual(this.a, mg2Var.a) && Intrinsics.areEqual(this.b, mg2Var.b) && Intrinsics.areEqual(this.c, mg2Var.c) && Intrinsics.areEqual(this.d, mg2Var.d) && this.e == mg2Var.e && Intrinsics.areEqual(this.f, mg2Var.f) && Intrinsics.areEqual(this.g, mg2Var.g) && Intrinsics.areEqual(this.h, mg2Var.h) && Intrinsics.areEqual(this.i, mg2Var.i);
    }

    public final int hashCode() {
        int a = c4.a(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        nb0 nb0Var = this.e;
        int hashCode3 = (hashCode2 + (nb0Var == null ? 0 : nb0Var.hashCode())) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.h;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PreferredPackage(packageName=" + this.a + ", url=" + this.b + ", extras=" + this.c + ", flags=" + this.d + ", launchMode=" + this.e + ", trackingUrls=" + this.f + ", fallbackTrackingUrls=" + this.g + ", deeplinkType=" + this.h + ", className=" + this.i + ")";
    }
}
