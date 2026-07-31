package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k40 {
    public final String a;
    public final String b;
    public final String c;
    public final u40 d;

    public k40(String str, String str2, String str3, u40 u40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return Intrinsics.areEqual(this.a, k40Var.a) && Intrinsics.areEqual(this.b, k40Var.b) && Intrinsics.areEqual(this.c, k40Var.c) && Intrinsics.areEqual(this.d, k40Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DebugPanelAdUnitFullData(name=" + this.a + ", format=" + this.b + ", adUnitId=" + this.c + ", mediation=" + this.d + ")";
    }
}
