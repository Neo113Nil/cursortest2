package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jf {
    public final String a;
    public final String b;
    public final String c;

    public jf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return Intrinsics.areEqual(this.a, jfVar.a) && Intrinsics.areEqual(this.b, jfVar.b) && Intrinsics.areEqual(this.c, jfVar.c);
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
        return "AppMetricaIdentifiers(adGetUrl=" + this.a + ", deviceId=" + this.b + ", uuid=" + this.c + ")";
    }
}
