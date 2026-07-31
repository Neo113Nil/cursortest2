package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r40 implements s40 {
    public final xa0 a;
    public final List b;

    public r40(xa0 xa0Var, List list) {
        this.a = xa0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r40)) {
            return false;
        }
        r40 r40Var = (r40) obj;
        return Intrinsics.areEqual(this.a, r40Var.a) && Intrinsics.areEqual(this.b, r40Var.b);
    }

    public final int hashCode() {
        xa0 xa0Var = this.a;
        return this.b.hashCode() + ((xa0Var == null ? 0 : xa0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.a + ", cpmFloors=" + this.b + ")";
    }
}
