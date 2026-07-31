package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class fe3 implements sj3 {
    public final boolean a;
    public final ArrayList b;
    public final LinkedHashMap c;
    public final ne3 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ll3 j;
    public final Integer k;
    public final String l;
    public final jp3 m;
    public final ArrayList n;
    public final Map o;

    public fe3(boolean z, ArrayList arrayList, LinkedHashMap linkedHashMap, ne3 ne3Var, String str, String str2, String str3, String str4, String str5, ll3 ll3Var, Integer num, String str6, jp3 jp3Var, ArrayList arrayList2, Map map) {
        this.a = z;
        this.b = arrayList;
        this.c = linkedHashMap;
        this.d = ne3Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = ll3Var;
        this.k = num;
        this.l = str6;
        this.m = jp3Var;
        this.n = arrayList2;
        this.o = map;
    }

    @Override // yads.sj3
    public final Map a() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe3)) {
            return false;
        }
        fe3 fe3Var = (fe3) obj;
        return this.a == fe3Var.a && Intrinsics.areEqual(this.b, fe3Var.b) && Intrinsics.areEqual(this.c, fe3Var.c) && Intrinsics.areEqual(this.d, fe3Var.d) && Intrinsics.areEqual(this.e, fe3Var.e) && Intrinsics.areEqual(this.f, fe3Var.f) && Intrinsics.areEqual(this.g, fe3Var.g) && Intrinsics.areEqual(this.h, fe3Var.h) && Intrinsics.areEqual(this.i, fe3Var.i) && Intrinsics.areEqual(this.j, fe3Var.j) && Intrinsics.areEqual(this.k, fe3Var.k) && Intrinsics.areEqual(this.l, fe3Var.l) && Intrinsics.areEqual(this.m, fe3Var.m) && Intrinsics.areEqual(this.n, fe3Var.n) && Intrinsics.areEqual(this.o, fe3Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ll3 ll3Var = this.j;
        int hashCode7 = (hashCode6 + (ll3Var == null ? 0 : ll3Var.a.hashCode())) * 31;
        Integer num = this.k;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        jp3 jp3Var = this.m;
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode9 + (jp3Var != null ? jp3Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.a + ", creatives=" + this.b + ", rawTrackingEvents=" + this.c + ", videoAdExtensions=" + this.d + ", adSystem=" + this.e + ", adTitle=" + this.f + ", description=" + this.g + ", survey=" + this.h + ", vastAdTagUri=" + this.i + ", viewableImpression=" + this.j + ", sequence=" + this.k + ", id=" + this.l + ", wrapperConfiguration=" + this.m + ", adVerifications=" + this.n + ", trackingEvents=" + this.o + ")";
    }
}
