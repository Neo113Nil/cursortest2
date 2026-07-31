package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k10 {
    public final String a;
    public final float b;

    public k10(String str) {
        this.a = str;
        this.b = 0.12f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k10)) {
            return false;
        }
        k10 k10Var = (k10) obj;
        return Intrinsics.areEqual(this.a, k10Var.a) && Float.compare(this.b, k10Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoreNativeAdWarning(value=" + this.a + ", minimumRequiredArea=" + this.b + ")";
    }

    public k10(String str, float f) {
        this.a = str;
        this.b = f;
    }
}
