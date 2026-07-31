package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class cv2 implements dv2 {
    public final ic a;
    public final om0 b;

    public cv2(ic icVar, om0 om0Var) {
        this.a = icVar;
        this.b = om0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv2)) {
            return false;
        }
        cv2 cv2Var = (cv2) obj;
        return Intrinsics.areEqual(this.a, cv2Var.a) && Intrinsics.areEqual(this.b, cv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(advertisingConfiguration=" + this.a + ", environmentConfiguration=" + this.b + ")";
    }
}
