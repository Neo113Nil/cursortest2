package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class fg0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final LinkedHashMap e;

    public fg0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg0)) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return Intrinsics.areEqual(this.a, fg0Var.a) && Intrinsics.areEqual(this.b, fg0Var.b) && Intrinsics.areEqual(this.c, fg0Var.c) && Intrinsics.areEqual(this.d, fg0Var.d) && Intrinsics.areEqual(this.e, fg0Var.e);
    }

    public final int hashCode() {
        int a = c4.a(c4.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int hashCode = (a + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.e;
        return hashCode + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }

    public final String toString() {
        return "Design(type=" + this.a + ", target=" + this.b + ", layout=" + this.c + ", images=" + this.d + ", analyticsParameters=" + this.e + ")";
    }
}
