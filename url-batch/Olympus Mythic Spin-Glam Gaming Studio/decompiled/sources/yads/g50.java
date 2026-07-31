package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class g50 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final f50 g;
    public final ArrayList h;

    public g50(String str, String str2, boolean z, String str3, String str4, String str5, f50 f50Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = f50Var;
        this.h = arrayList;
    }

    public final f50 a() {
        return this.g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return Intrinsics.areEqual(this.a, g50Var.a) && Intrinsics.areEqual(this.b, g50Var.b) && this.c == g50Var.c && Intrinsics.areEqual(this.d, g50Var.d) && Intrinsics.areEqual(this.e, g50Var.e) && Intrinsics.areEqual(this.f, g50Var.f) && Intrinsics.areEqual(this.g, g50Var.g) && Intrinsics.areEqual(this.h, g50Var.h);
    }

    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.a + ", logoUrl=" + this.b + ", adapterIntegrationStatus=" + this.c + ", adapterVersion=" + this.d + ", latestAdapterVersion=" + this.e + ", sdkVersion=" + this.f + ", adapterStatus=" + this.g + ", formats=" + this.h + ")";
    }
}
