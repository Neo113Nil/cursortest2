package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ot0 {
    public final q31 a;

    public ot0(q31 q31Var) {
        this.a = q31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot0) && Intrinsics.areEqual(this.a, ((ot0) obj).a);
    }

    public final int hashCode() {
        q31 q31Var = this.a;
        if (q31Var == null) {
            return 0;
        }
        return q31Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.a + ")";
    }
}
