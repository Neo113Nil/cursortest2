package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cl3 {
    public final String a;
    public final int b;

    public cl3(int i, String str) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl3)) {
            return false;
        }
        cl3 cl3Var = (cl3) obj;
        return Intrinsics.areEqual(this.a, cl3Var.a) && this.b == cl3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.a + ", screenOrientation=" + this.b + ")";
    }
}
