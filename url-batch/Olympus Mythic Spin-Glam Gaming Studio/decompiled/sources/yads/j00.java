package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class j00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public j00(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return Intrinsics.areEqual(this.a, j00Var.a) && Intrinsics.areEqual(this.b, j00Var.b) && Intrinsics.areEqual(this.c, j00Var.c) && Intrinsics.areEqual(this.d, j00Var.d) && Intrinsics.areEqual(this.e, j00Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "CoreCreative(creativeId=" + this.a + ", campaignId=" + this.b + ", placeId=" + this.c + ", offerId=" + this.d + ", performanceOpeningUrl=" + this.e + ")";
    }
}
