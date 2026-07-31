package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class y90 implements z90 {
    public final String a;

    public y90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        y90Var.getClass();
        return Intrinsics.areEqual("Warning", "Warning") && Intrinsics.areEqual(this.a, y90Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 562735108;
    }

    public final String toString() {
        return "Warning(title=Warning, message=" + this.a + ")";
    }
}
