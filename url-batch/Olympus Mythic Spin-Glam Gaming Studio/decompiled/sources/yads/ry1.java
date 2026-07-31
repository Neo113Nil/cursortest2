package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ry1 {
    public final dq2 a;
    public List b;
    public final String c;
    public final String d;
    public final String e;
    public final kf1 f;
    public final y4 g;
    public final List h;
    public final List i;
    public final j00 j;
    public final x22 k;

    public ry1(dq2 dq2Var, List list, String str, String str2, String str3, kf1 kf1Var, y4 y4Var, List list2, List list3, j00 j00Var, x22 x22Var) {
        this.a = dq2Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = kf1Var;
        this.g = y4Var;
        this.h = list2;
        this.i = list3;
        this.j = j00Var;
        this.k = x22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry1)) {
            return false;
        }
        ry1 ry1Var = (ry1) obj;
        return this.a == ry1Var.a && Intrinsics.areEqual(this.b, ry1Var.b) && Intrinsics.areEqual(this.c, ry1Var.c) && Intrinsics.areEqual(this.d, ry1Var.d) && Intrinsics.areEqual(this.e, ry1Var.e) && Intrinsics.areEqual(this.f, ry1Var.f) && Intrinsics.areEqual(this.g, ry1Var.g) && Intrinsics.areEqual(this.h, ry1Var.h) && Intrinsics.areEqual(this.i, ry1Var.i) && Intrinsics.areEqual(this.j, ry1Var.j) && Intrinsics.areEqual(this.k, ry1Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        kf1 kf1Var = this.f;
        int hashCode5 = (hashCode4 + (kf1Var == null ? 0 : kf1Var.hashCode())) * 31;
        y4 y4Var = this.g;
        int hashCode6 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode5 + (y4Var == null ? 0 : y4Var.b.hashCode())) * 31)) * 31)) * 31;
        j00 j00Var = this.j;
        return this.k.hashCode() + ((hashCode6 + (j00Var != null ? j00Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Native(responseNativeType=" + this.a + ", assets=" + this.b + ", adId=" + this.c + ", info=" + this.d + ", additionalText=" + this.e + ", link=" + this.f + ", impressionData=" + this.g + ", renderTrackingUrls=" + this.h + ", showNotices=" + this.i + ", creative=" + this.j + ", nativeAnalytics=" + this.k + ")";
    }
}
