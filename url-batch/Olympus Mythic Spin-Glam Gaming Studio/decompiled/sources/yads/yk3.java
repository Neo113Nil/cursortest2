package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yk3 {
    public final xk3 a;
    public final vd1 b;
    public final dj1 c;
    public final Map d;

    public yk3(xk3 xk3Var, vd1 vd1Var, dj1 dj1Var, Map map) {
        this.a = xk3Var;
        this.b = vd1Var;
        this.c = dj1Var;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk3)) {
            return false;
        }
        yk3 yk3Var = (yk3) obj;
        return Intrinsics.areEqual(this.a, yk3Var.a) && Intrinsics.areEqual(this.b, yk3Var.b) && Intrinsics.areEqual(this.c, yk3Var.c) && Intrinsics.areEqual(this.d, yk3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.a + ", layoutParams=" + this.b + ", measured=" + this.c + ", additionalInfo=" + this.d + ")";
    }
}
