package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j40 {
    public final String a;
    public final String b;
    public final String c;

    public j40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j40)) {
            return false;
        }
        j40 j40Var = (j40) obj;
        return Intrinsics.areEqual(this.a, j40Var.a) && Intrinsics.areEqual(this.b, j40Var.b) && Intrinsics.areEqual(this.c, j40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c4.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DebugPanelAdUnitData(name=" + this.a + ", format=" + this.b + ", adUnitId=" + this.c + ")";
    }
}
