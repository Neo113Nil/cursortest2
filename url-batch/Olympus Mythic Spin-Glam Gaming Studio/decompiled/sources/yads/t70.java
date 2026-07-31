package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t70 extends x70 {
    public final la0 b;

    public t70(la0 la0Var) {
        super(la0Var.a);
        this.b = la0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t70) && Intrinsics.areEqual(this.b, ((t70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "AdUnitMediationAdapter(adapter=" + this.b + ")";
    }
}
