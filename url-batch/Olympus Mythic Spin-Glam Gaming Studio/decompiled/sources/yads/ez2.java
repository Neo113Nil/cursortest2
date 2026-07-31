package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ez2 {
    public final long a;
    public final String b;
    public final int c;
    public final fz2 d;

    public ez2(int i, long j, String str, fz2 fz2Var) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = fz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        return this.a == ez2Var.a && Intrinsics.areEqual(this.b, ez2Var.b) && this.c == ez2Var.c && this.d == ez2Var.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + yd3.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.a + ", url=" + this.b + ", visibilityPercent=" + this.c + ", type=" + this.d + ")";
    }
}
