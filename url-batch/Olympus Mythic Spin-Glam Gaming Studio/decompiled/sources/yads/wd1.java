package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class wd1 {
    public final Integer a;
    public final Integer b;

    public wd1(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd1)) {
            return false;
        }
        wd1 wd1Var = (wd1) obj;
        return Intrinsics.areEqual(this.a, wd1Var.a) && Intrinsics.areEqual(this.b, wd1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutRestriction(minWidth=" + this.a + ", minHeight=" + this.b + ")";
    }
}
