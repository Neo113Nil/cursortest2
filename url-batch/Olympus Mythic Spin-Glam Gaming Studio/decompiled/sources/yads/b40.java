package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b40 {
    public final String a;
    public final String b;
    public final String c;

    public b40(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return Intrinsics.areEqual(this.a, b40Var.a) && Intrinsics.areEqual(this.b, b40Var.b) && Intrinsics.areEqual(this.c, b40Var.c);
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
        return "DebugPanelAdNetworkSettingsData(pageId=" + this.a + ", appReviewStatus=" + this.b + ", appAdsTxt=" + this.c + ")";
    }
}
