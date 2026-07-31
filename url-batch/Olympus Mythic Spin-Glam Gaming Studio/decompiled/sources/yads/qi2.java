package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qi2 {
    public final String a;
    public final j03 b;

    public qi2(String str, j03 j03Var) {
        this.a = str;
        this.b = j03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi2)) {
            return false;
        }
        qi2 qi2Var = (qi2) obj;
        return Intrinsics.areEqual(this.a, qi2Var.a) && Intrinsics.areEqual(this.b, qi2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preview(base64=" + this.a + ", size=" + this.b + ")";
    }
}
