package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vd1 {
    public final Integer a;
    public final Integer b;

    public vd1(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return Intrinsics.areEqual(this.a, vd1Var.a) && Intrinsics.areEqual(this.b, vd1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
