package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class cr1 {
    public final String a;
    public final String b;

    public cr1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr1)) {
            return false;
        }
        cr1 cr1Var = (cr1) obj;
        return Intrinsics.areEqual(this.a, cr1Var.a) && Intrinsics.areEqual(this.b, cr1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediationAdapterSignature(format=" + this.a + ", className=" + this.b + ")";
    }
}
