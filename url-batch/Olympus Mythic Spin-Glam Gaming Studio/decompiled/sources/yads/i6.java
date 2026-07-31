package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i6 {
    public final long a;
    public final j6 b;
    public final k6 c;

    public i6(long j, j6 j6Var, k6 k6Var) {
        this.a = j;
        this.b = j6Var;
        this.c = k6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return this.a == i6Var.a && Intrinsics.areEqual(this.b, i6Var.b) && this.c == i6Var.c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        j6 j6Var = this.b;
        int hashCode2 = (hashCode + (j6Var == null ? 0 : j6Var.hashCode())) * 31;
        k6 k6Var = this.c;
        return hashCode2 + (k6Var != null ? k6Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdPodItem(duration=" + this.a + ", skip=" + this.b + ", transitionPolicy=" + this.c + ")";
    }
}
