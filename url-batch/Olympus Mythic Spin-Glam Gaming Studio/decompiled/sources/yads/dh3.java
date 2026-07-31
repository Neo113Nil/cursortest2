package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dh3 extends fh3 {
    public final le3 a;

    public dh3(le3 le3Var) {
        this.a = le3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh3) && Intrinsics.areEqual(this.a, ((dh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
