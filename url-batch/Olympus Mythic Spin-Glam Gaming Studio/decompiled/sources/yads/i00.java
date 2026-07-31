package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i00 {
    public final l03 a;

    public i00(l03 l03Var) {
        this.a = l03Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i00) && Intrinsics.areEqual(((i00) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
