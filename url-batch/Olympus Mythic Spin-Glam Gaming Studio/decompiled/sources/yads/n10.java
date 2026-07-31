package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class n10 {
    public final m10 a;
    public final String b;

    public n10(m10 m10Var, String str) {
        this.a = m10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n10)) {
            return false;
        }
        n10 n10Var = (n10) obj;
        return this.a == n10Var.a && Intrinsics.areEqual(this.b, n10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.a + ", text=" + this.b + ")";
    }
}
