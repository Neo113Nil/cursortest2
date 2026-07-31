package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class o73 {
    public final String a;
    public final yt2 b;

    public o73(String str, yt2 yt2Var) {
        this.a = str;
        this.b = yt2Var;
    }

    public final String a() {
        return this.a;
    }

    public final yt2 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return Intrinsics.areEqual(this.a, o73Var.a) && this.b == o73Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        yt2 yt2Var = this.b;
        return hashCode + (yt2Var != null ? yt2Var.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult(bidderToken=" + this.a + ", stubReason=" + this.b + ")";
    }
}
