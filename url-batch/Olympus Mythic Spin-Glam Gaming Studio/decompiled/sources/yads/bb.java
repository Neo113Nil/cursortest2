package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bb(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return Intrinsics.areEqual(this.a, bbVar.a) && Intrinsics.areEqual(this.b, bbVar.b) && Intrinsics.areEqual(this.c, bbVar.c) && Intrinsics.areEqual(this.d, bbVar.d) && Intrinsics.areEqual(this.e, bbVar.e) && Intrinsics.areEqual(this.f, bbVar.f);
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
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInfo(creativeId=" + this.a + ", campaignId=" + this.b + ", placeId=" + this.c + ", offerId=" + this.d + ", additionalText=" + this.e + ", performanceOpeningUrl=" + this.f + ")";
    }
}
