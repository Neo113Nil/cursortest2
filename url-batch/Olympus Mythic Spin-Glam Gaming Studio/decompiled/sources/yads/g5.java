package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g5 {
    public final h5 a;
    public final Map b;

    public g5(h5 h5Var, Map map) {
        this.a = h5Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return this.a == g5Var.a && Intrinsics.areEqual(this.b, g5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.a + ", reportParameters=" + this.b + ")";
    }
}
