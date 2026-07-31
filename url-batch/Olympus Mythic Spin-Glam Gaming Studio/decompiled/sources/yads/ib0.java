package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class ib0 implements j0 {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public ib0(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    @Override // yads.j0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return Intrinsics.areEqual(this.a, ib0Var.a) && Intrinsics.areEqual(this.b, ib0Var.b) && Intrinsics.areEqual(this.c, ib0Var.c) && Intrinsics.areEqual(this.d, ib0Var.d);
    }

    public final int hashCode() {
        int a = c4.a(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return this.d.hashCode() + ((a + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "DeeplinkAction(actionType=" + this.a + ", fallbackUrl=" + this.b + ", fallbackTrackingUrls=" + this.c + ", preferredPackages=" + this.d + ")";
    }
}
