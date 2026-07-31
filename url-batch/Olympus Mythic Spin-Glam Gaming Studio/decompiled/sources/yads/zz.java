package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class zz {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public zz(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return Intrinsics.areEqual(this.a, zzVar.a) && Intrinsics.areEqual(this.b, zzVar.b) && Intrinsics.areEqual(this.c, zzVar.c) && Intrinsics.areEqual(this.d, zzVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.a + ", extraData=" + this.b + ", additionalText=" + this.c + ", creatives=" + this.d + ")";
    }
}
