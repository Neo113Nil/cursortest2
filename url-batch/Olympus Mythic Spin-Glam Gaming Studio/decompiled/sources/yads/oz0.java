package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oz0 {
    public final boolean a;
    public final pz0 b;

    public oz0(boolean z) {
        this.a = z;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz0)) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return this.a == oz0Var.a && Intrinsics.areEqual(this.b, oz0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        pz0 pz0Var = this.b;
        return hashCode + (pz0Var == null ? 0 : pz0Var.hashCode());
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.a + ", handledDeeplinkRender=" + this.b + ")";
    }

    public oz0(boolean z, pz0 pz0Var) {
        this.a = z;
        this.b = pz0Var;
    }
}
