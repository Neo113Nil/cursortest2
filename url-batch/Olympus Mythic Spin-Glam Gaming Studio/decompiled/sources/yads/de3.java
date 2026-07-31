package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class de3 {
    public final List a;
    public final kj3 b;
    public final q31 c;

    public de3(List list, kj3 kj3Var, q31 q31Var) {
        this.a = list;
        this.b = kj3Var;
        this.c = q31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de3)) {
            return false;
        }
        de3 de3Var = (de3) obj;
        return Intrinsics.areEqual(this.a, de3Var.a) && Intrinsics.areEqual(this.b, de3Var.b) && Intrinsics.areEqual(this.c, de3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kj3 kj3Var = this.b;
        int hashCode2 = (hashCode + (kj3Var == null ? 0 : kj3Var.hashCode())) * 31;
        q31 q31Var = this.c;
        return hashCode2 + (q31Var != null ? q31Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.a + ", videoSettings=" + this.b + ", preview=" + this.c + ")";
    }
}
