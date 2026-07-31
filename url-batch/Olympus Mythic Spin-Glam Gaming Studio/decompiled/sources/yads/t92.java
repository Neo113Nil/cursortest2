package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class t92 {
    public final s83 a;
    public final bc3 b;

    public t92(s83 s83Var, bc3 bc3Var) {
        this.a = s83Var;
        this.b = bc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t92)) {
            return false;
        }
        t92 t92Var = (t92) obj;
        return Intrinsics.areEqual(this.a, t92Var.a) && Intrinsics.areEqual(this.b, t92Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.a + ", validationResult=" + this.b + ")";
    }
}
