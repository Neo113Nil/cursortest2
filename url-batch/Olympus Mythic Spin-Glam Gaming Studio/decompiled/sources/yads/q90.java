package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q90 implements t90 {
    public final la0 a;

    public q90(la0 la0Var) {
        this.a = la0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q90) && Intrinsics.areEqual(this.a, ((q90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.a + ")";
    }
}
