package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class oc {
    public final mc a;
    public final mc b;
    public final boolean c;
    public final String d;

    public oc(mc mcVar, mc mcVar2, boolean z, String str) {
        this.a = mcVar;
        this.b = mcVar2;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return Intrinsics.areEqual(this.a, ocVar.a) && Intrinsics.areEqual(this.b, ocVar.b) && this.c == ocVar.c && Intrinsics.areEqual(this.d, ocVar.d);
    }

    public final int hashCode() {
        mc mcVar = this.a;
        int hashCode = (mcVar == null ? 0 : mcVar.hashCode()) * 31;
        mc mcVar2 = this.b;
        int hashCode2 = (Boolean.hashCode(this.c) + ((hashCode + (mcVar2 == null ? 0 : mcVar2.hashCode())) * 31)) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.a + ", hmsAdvertisingInfo=" + this.b + ", gmsAdvertisingReset=" + this.c + ", appSetId=" + this.d + ")";
    }
}
