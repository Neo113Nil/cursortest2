package yads;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s12 {
    public final List a;
    public final List b;
    public final List c;
    public final y4 d;
    public final Map e;
    public final List f;
    public final List g;
    public final String h;
    public final bz2 i;
    public final b6 j;

    public s12(List list, List list2, List list3, y4 y4Var, Map map, List list4, List list5, String str, bz2 bz2Var, b6 b6Var) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = y4Var;
        this.e = map;
        this.f = list4;
        this.g = list5;
        this.h = str;
        this.i = bz2Var;
        this.j = b6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s12)) {
            return false;
        }
        s12 s12Var = (s12) obj;
        return Intrinsics.areEqual(this.a, s12Var.a) && Intrinsics.areEqual(this.b, s12Var.b) && Intrinsics.areEqual(this.c, s12Var.c) && Intrinsics.areEqual(this.d, s12Var.d) && Intrinsics.areEqual(this.e, s12Var.e) && Intrinsics.areEqual(this.f, s12Var.f) && Intrinsics.areEqual(this.g, s12Var.g) && Intrinsics.areEqual(this.h, s12Var.h) && Intrinsics.areEqual(this.i, s12Var.i) && Intrinsics.areEqual(this.j, s12Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        y4 y4Var = this.d;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (y4Var == null ? 0 : y4Var.b.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        bz2 bz2Var = this.i;
        int hashCode4 = (hashCode3 + (bz2Var == null ? 0 : bz2Var.hashCode())) * 31;
        b6 b6Var = this.j;
        return hashCode4 + (b6Var != null ? b6Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.a + ", assets=" + this.b + ", renderTrackingUrls=" + this.c + ", impressionData=" + this.d + ", properties=" + this.e + ", divKitDesigns=" + this.f + ", showNotices=" + this.g + ", version=" + this.h + ", settings=" + this.i + ", adPod=" + this.j + ")";
    }
}
