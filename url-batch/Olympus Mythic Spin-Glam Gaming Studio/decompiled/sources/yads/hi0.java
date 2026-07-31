package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class hi0 {
    public final ii0 a;
    public final String b;

    public hi0(ii0 ii0Var, String str) {
        this.a = ii0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return this.a == hi0Var.a && Intrinsics.areEqual(this.b, hi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.a + ", assetName=" + this.b + ")";
    }
}
