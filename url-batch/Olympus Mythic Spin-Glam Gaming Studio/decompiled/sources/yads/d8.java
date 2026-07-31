package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final Location f;
    public final Map g;
    public final String h;
    public final ip2 i;
    public final boolean j;
    public final String k;
    public final f00 l;

    public d8(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, ip2 ip2Var, boolean z, String str6, f00 f00Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = location;
        this.g = map;
        this.h = str5;
        this.i = ip2Var;
        this.j = z;
        this.k = str6;
        this.l = f00Var;
    }

    public static d8 a(d8 d8Var, Map map, String str, int i) {
        return new d8(d8Var.a, d8Var.b, d8Var.c, d8Var.d, d8Var.e, d8Var.f, (i & 64) != 0 ? d8Var.g : map, d8Var.h, d8Var.i, d8Var.j, (i & 2048) != 0 ? d8Var.k : str, d8Var.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.areEqual(this.a, d8Var.a) && Intrinsics.areEqual(this.b, d8Var.b) && Intrinsics.areEqual(this.c, d8Var.c) && Intrinsics.areEqual(this.d, d8Var.d) && Intrinsics.areEqual(this.e, d8Var.e) && Intrinsics.areEqual(this.f, d8Var.f) && Intrinsics.areEqual(this.g, d8Var.g) && Intrinsics.areEqual(this.h, d8Var.h) && Intrinsics.areEqual((Object) null, (Object) null) && this.i == d8Var.i && this.j == d8Var.j && Intrinsics.areEqual(this.k, d8Var.k) && Intrinsics.areEqual(this.l, d8Var.l);
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
        Location location = this.f;
        int hashCode6 = (hashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.g;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 961;
        ip2 ip2Var = this.i;
        int hashCode9 = (Boolean.hashCode(this.j) + ((hashCode8 + (ip2Var == null ? 0 : ip2Var.hashCode())) * 31)) * 31;
        String str5 = this.k;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        f00 f00Var = this.l;
        return hashCode10 + (f00Var != null ? f00Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdRequestData(adUnitId=" + this.a + ", age=" + this.b + ", gender=" + this.c + ", contextQuery=" + this.d + ", contextTags=" + this.e + ", location=" + this.f + ", parameters=" + this.g + ", openBiddingData=" + this.h + ", readyResponse=" + ((String) null) + ", preferredTheme=" + this.i + ", shouldLoadImagesAutomatically=" + this.j + ", preloadType=" + this.k + ", adapterIdentity=" + this.l + ")";
    }
}
