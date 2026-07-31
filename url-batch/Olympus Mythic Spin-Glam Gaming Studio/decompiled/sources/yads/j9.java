package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j9 {
    public final ij3 a;

    public j9(ij3 ij3Var) {
        this.a = ij3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9) && Intrinsics.areEqual(this.a, ((j9) obj).a);
    }

    public final int hashCode() {
        ij3 ij3Var = this.a;
        if (ij3Var == null) {
            return 0;
        }
        return ij3Var.hashCode();
    }

    public final String toString() {
        return "AdSettings(videoSelection=" + this.a + ")";
    }
}
