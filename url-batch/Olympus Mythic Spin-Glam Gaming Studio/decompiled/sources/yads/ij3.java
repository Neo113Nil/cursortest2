package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ij3 {
    public final String a;
    public final boolean b;

    public ij3(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij3)) {
            return false;
        }
        ij3 ij3Var = (ij3) obj;
        return Intrinsics.areEqual(this.a, ij3Var.a) && this.b == ij3Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "VideoSelection(preferableMimeType=" + this.a + ", inOrderOfList=" + this.b + ")";
    }
}
