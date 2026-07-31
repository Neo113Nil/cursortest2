package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ns1 {
    public final String a;
    public final List b;
    public final long c;

    public ns1(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns1)) {
            return false;
        }
        ns1 ns1Var = (ns1) obj;
        return Intrinsics.areEqual(this.a, ns1Var.a) && Intrinsics.areEqual(this.b, ns1Var.b) && this.c == ns1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediationPrefetchAdUnitSettings(adUnitId=" + this.a + ", networks=" + this.b + ", loadTimeoutMillis=" + this.c + ")";
    }
}
