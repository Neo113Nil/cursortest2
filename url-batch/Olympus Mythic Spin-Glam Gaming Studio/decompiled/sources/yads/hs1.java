package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hs1 {
    public final String a;
    public final gs1 b;

    public hs1(String str, gs1 gs1Var) {
        this.a = str;
        this.b = gs1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        return Intrinsics.areEqual(this.a, hs1Var.a) && this.b == hs1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationNetworkMessage(message=" + this.a + ", type=" + this.b + ")";
    }
}
