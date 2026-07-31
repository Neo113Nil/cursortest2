package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class dj1 {
    public final ej1 a;
    public final ej1 b;

    public dj1(ej1 ej1Var, ej1 ej1Var2) {
        this.a = ej1Var;
        this.b = ej1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj1)) {
            return false;
        }
        dj1 dj1Var = (dj1) obj;
        return Intrinsics.areEqual(this.a, dj1Var.a) && Intrinsics.areEqual(this.b, dj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.a + ", height=" + this.b + ")";
    }
}
