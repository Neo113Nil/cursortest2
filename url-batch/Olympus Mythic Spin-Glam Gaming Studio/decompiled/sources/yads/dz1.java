package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class dz1 {
    public final s12 a;
    public final t8 b;
    public final v3 c;

    public dz1(v3 v3Var, t8 t8Var, s12 s12Var) {
        this.a = s12Var;
        this.b = t8Var;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz1)) {
            return false;
        }
        dz1 dz1Var = (dz1) obj;
        return Intrinsics.areEqual(this.a, dz1Var.a) && Intrinsics.areEqual(this.b, dz1Var.b) && Intrinsics.areEqual(this.c, dz1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdBlock(nativeAdResponse=" + this.a + ", adResponse=" + this.b + ", adConfiguration=" + this.c + ")";
    }
}
