package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ua {
    public final String a;
    public final String b;
    public final String c;

    public ua(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return Intrinsics.areEqual(this.a, uaVar.a) && Intrinsics.areEqual(this.b, uaVar.b) && Intrinsics.areEqual(this.c, uaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c4.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AdapterIdentityData(adapterNetworkName=" + this.a + ", adapterVersion=" + this.b + ", adapterNetworkVersion=" + this.c + ")";
    }
}
