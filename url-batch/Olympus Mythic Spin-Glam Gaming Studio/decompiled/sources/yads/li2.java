package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class li2 implements fp0 {
    public final jx0 a;
    public final Object b;
    public final long c;

    public li2(jx0 jx0Var, Object obj, long j) {
        this.a = jx0Var;
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li2)) {
            return false;
        }
        li2 li2Var = (li2) obj;
        return Intrinsics.areEqual(this.a, li2Var.a) && Intrinsics.areEqual(this.b, li2Var.b) && this.c == li2Var.c;
    }

    public final int hashCode() {
        jx0 jx0Var = this.a;
        int hashCode = (jx0Var == null ? 0 : jx0Var.hashCode()) * 31;
        Object obj = this.b;
        return Long.hashCode(this.c) + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CachedItem(params=" + this.a + ", item=" + this.b + ", expiresAtTimestampMillis=" + this.c + ")";
    }
}
