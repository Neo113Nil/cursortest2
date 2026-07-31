package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class kf1 {
    public final ArrayList a;
    public final hq0 b;
    public final List c;
    public final String d;
    public final long e;
    public final boolean f;

    public kf1(ArrayList arrayList, hq0 hq0Var, List list, String str, long j, boolean z) {
        this.a = arrayList;
        this.b = hq0Var;
        this.c = list;
        this.d = str;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf1)) {
            return false;
        }
        kf1 kf1Var = (kf1) obj;
        return Intrinsics.areEqual(this.a, kf1Var.a) && Intrinsics.areEqual(this.b, kf1Var.b) && Intrinsics.areEqual(this.c, kf1Var.c) && Intrinsics.areEqual(this.d, kf1Var.d) && this.e == kf1Var.e && this.f == kf1Var.f;
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        hq0 hq0Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (hq0Var == null ? 0 : hq0Var.hashCode())) * 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + ((Long.hashCode(this.e) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Link(actions=" + this.a + ", falseClick=" + this.b + ", trackingUrls=" + this.c + ", url=" + this.d + ", clickableDelay=" + this.e + ", isWebViewEnabled=" + this.f + ")";
    }
}
