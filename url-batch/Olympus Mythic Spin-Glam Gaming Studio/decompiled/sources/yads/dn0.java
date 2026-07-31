package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dn0 {
    public final en0 a;
    public final String b;

    public dn0(en0 en0Var, String str) {
        this.a = en0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn0)) {
            return false;
        }
        dn0 dn0Var = (dn0) obj;
        return this.a == dn0Var.a && Intrinsics.areEqual(this.b, dn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExclusionRule(type=" + this.a + ", value=" + this.b + ")";
    }
}
