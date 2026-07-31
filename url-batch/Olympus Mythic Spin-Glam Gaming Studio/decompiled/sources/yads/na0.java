package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class na0 extends oa0 {
    public final boolean a;

    public na0(boolean z) {
        ma0 ma0Var = ma0.b;
        this.a = z;
    }

    @Override // yads.oa0
    public final boolean a(oa0 oa0Var) {
        if (oa0Var instanceof na0) {
            ((na0) oa0Var).getClass();
            if (Intrinsics.areEqual("Debug Error Indicator", "Debug Error Indicator")) {
                ma0 ma0Var = ma0.b;
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        na0Var.getClass();
        if (!Intrinsics.areEqual("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        ma0 ma0Var = ma0.b;
        return this.a == na0Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + ((ma0.b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + ma0.b + ", initialState=" + this.a + ")";
    }
}
