package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class la0 extends oa0 {
    public final String a;
    public final String b;
    public final k90 c;
    public final v50 d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final h50 j;
    public final String k;

    public la0(String str, String str2, k90 k90Var, v50 v50Var, String str3, String str4, String str5, ArrayList arrayList, List list, h50 h50Var, String str6, int i) {
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 64) != 0 ? null : str5;
        arrayList = (i & 128) != 0 ? null : arrayList;
        list = (i & 256) != 0 ? null : list;
        h50Var = (i & 512) != 0 ? h50.e : h50Var;
        str6 = (i & 1024) != 0 ? null : str6;
        this.a = str;
        this.b = str2;
        this.c = k90Var;
        this.d = v50Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = arrayList;
        this.i = list;
        this.j = h50Var;
        this.k = str6;
    }

    public final String a() {
        return this.f;
    }

    public final List b() {
        return this.i;
    }

    public final String c() {
        return this.g;
    }

    public final List d() {
        return this.h;
    }

    public final h50 e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0Var = (la0) obj;
        return Intrinsics.areEqual(this.a, la0Var.a) && Intrinsics.areEqual(this.b, la0Var.b) && Intrinsics.areEqual(this.c, la0Var.c) && Intrinsics.areEqual(this.d, la0Var.d) && Intrinsics.areEqual(this.e, la0Var.e) && Intrinsics.areEqual(this.f, la0Var.f) && Intrinsics.areEqual(this.g, la0Var.g) && Intrinsics.areEqual(this.h, la0Var.h) && Intrinsics.areEqual(this.i, la0Var.i) && this.j == la0Var.j && Intrinsics.areEqual(this.k, la0Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        k90 k90Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (k90Var == null ? 0 : k90Var.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.h;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int hashCode8 = (this.j.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.k;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "MediationAdapter(name=" + this.a + ", logoUrl=" + this.b + ", infoFirst=" + this.c + ", infoSecond=" + this.d + ", waringMessage=" + this.e + ", adUnitId=" + this.f + ", networkAdUnitIdName=" + this.g + ", parameters=" + this.h + ", cpmFloors=" + this.i + ", type=" + this.j + ", sdk=" + this.k + ")";
    }
}
