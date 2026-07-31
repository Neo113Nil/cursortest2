package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ha0 extends oa0 {
    public ha0() {
        ga0 ga0Var = ga0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ((ha0) obj).getClass();
        if (!Intrinsics.areEqual("Enable Test mode", "Enable Test mode")) {
            return false;
        }
        ga0 ga0Var = ga0.b;
        return true;
    }

    public final int hashCode() {
        return ga0.b.hashCode() - 120198036;
    }

    public final String toString() {
        return "Button(text=Enable Test mode, actionType=" + ga0.b + ")";
    }
}
