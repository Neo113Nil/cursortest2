package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uf {
    public final String a;
    public final String b;
    public final String c;

    public uf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return Intrinsics.areEqual(this.a, ufVar.a) && Intrinsics.areEqual(this.b, ufVar.b) && Intrinsics.areEqual(this.c, ufVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AppMetricaStartupParams(uuid=" + this.a + ", deviceId=" + this.b + ", getAdUrl=" + this.c + ")";
    }
}
