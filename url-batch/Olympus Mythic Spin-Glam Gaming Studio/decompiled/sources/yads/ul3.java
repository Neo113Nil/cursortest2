package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ul3 {
    public final int a;
    public final String b;

    public ul3(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul3)) {
            return false;
        }
        ul3 ul3Var = (ul3) obj;
        return this.a == ul3Var.a && Intrinsics.areEqual(this.b, ul3Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.a + ", description=" + this.b + ")";
    }
}
