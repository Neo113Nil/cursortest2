package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dn1 {
    public final ij1 a;
    public final de3 b;
    public final List c;

    public dn1(ij1 ij1Var, de3 de3Var, List list) {
        this.a = ij1Var;
        this.b = de3Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return Intrinsics.areEqual(this.a, dn1Var.a) && Intrinsics.areEqual(this.b, dn1Var.b) && Intrinsics.areEqual(this.c, dn1Var.c);
    }

    public final int hashCode() {
        ij1 ij1Var = this.a;
        int hashCode = (ij1Var == null ? 0 : ij1Var.hashCode()) * 31;
        de3 de3Var = this.b;
        int hashCode2 = (hashCode + (de3Var == null ? 0 : de3Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MediaValue(media=" + this.a + ", video=" + this.b + ", imageValues=" + this.c + ")";
    }
}
