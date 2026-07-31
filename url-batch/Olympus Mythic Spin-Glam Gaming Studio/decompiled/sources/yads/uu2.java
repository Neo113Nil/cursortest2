package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class uu2 implements wu2 {
    public final hm3 a;
    public final uy b;

    public uu2(hm3 hm3Var, uy uyVar) {
        this.a = hm3Var;
        this.b = uyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu2)) {
            return false;
        }
        uu2 uu2Var = (uu2) obj;
        return Intrinsics.areEqual(this.a, uu2Var.a) && this.b == uu2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(error=" + this.a + ", configurationSource=" + this.b + ")";
    }
}
