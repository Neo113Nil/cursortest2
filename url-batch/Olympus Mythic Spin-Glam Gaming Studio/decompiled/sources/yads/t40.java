package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class t40 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final s40 f;

    public t40(String str, String str2, ArrayList arrayList, String str3, String str4, s40 s40Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = s40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return Intrinsics.areEqual(this.a, t40Var.a) && Intrinsics.areEqual(this.b, t40Var.b) && Intrinsics.areEqual(this.c, t40Var.c) && Intrinsics.areEqual(this.d, t40Var.d) && Intrinsics.areEqual(this.e, t40Var.e) && Intrinsics.areEqual(this.f, t40Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + c4.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.a + ", adapterName=" + this.b + ", parameters=" + this.c + ", adUnitId=" + this.d + ", networkAdUnitIdName=" + this.e + ", type=" + this.f + ")";
    }
}
