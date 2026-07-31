package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f00 {
    public final String a;
    public final String b;
    public final String c;

    public f00(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return Intrinsics.areEqual(this.a, f00Var.a) && Intrinsics.areEqual(this.b, f00Var.b) && Intrinsics.areEqual(this.c, f00Var.c);
    }

    public final int hashCode() {
        int a = c4.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreAdapterIdentity(adapterNetworkName=" + this.a + ", adapterVersion=" + this.b + ", adapterNetworkVersion=" + this.c + ")";
    }
}
