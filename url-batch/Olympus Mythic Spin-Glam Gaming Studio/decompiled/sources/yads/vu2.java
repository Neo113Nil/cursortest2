package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class vu2 implements wu2 {
    public final bu2 a;
    public final uy b;

    public vu2(bu2 bu2Var, uy uyVar) {
        this.a = bu2Var;
        this.b = uyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu2)) {
            return false;
        }
        vu2 vu2Var = (vu2) obj;
        return Intrinsics.areEqual(this.a, vu2Var.a) && this.b == vu2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.a + ", configurationSource=" + this.b + ")";
    }
}
