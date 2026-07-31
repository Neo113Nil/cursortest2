package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class p12 {
    public final d8 a;
    public final e52 b;
    public final q12 c;
    public final int d;

    public p12(d8 d8Var, e52 e52Var, q12 q12Var, int i) {
        this.a = d8Var;
        this.b = e52Var;
        this.c = q12Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p12)) {
            return false;
        }
        p12 p12Var = (p12) obj;
        return Intrinsics.areEqual(this.a, p12Var.a) && this.b == p12Var.b && Intrinsics.areEqual(this.c, p12Var.c) && this.d == p12Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.a + ", nativeResponseType=" + this.b + ", requestPolicy=" + this.c + ", adsCount=" + this.d + ")";
    }
}
