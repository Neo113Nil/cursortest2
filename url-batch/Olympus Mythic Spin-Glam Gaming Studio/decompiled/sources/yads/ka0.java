package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ka0 extends oa0 {
    public final String a;
    public final k90 b;
    public final v50 c;

    public ka0(String str, k90 k90Var) {
        this.a = str;
        this.b = k90Var;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return Intrinsics.areEqual(this.a, ka0Var.a) && Intrinsics.areEqual(this.b, ka0Var.b) && Intrinsics.areEqual(this.c, ka0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        k90 k90Var = this.b;
        int hashCode2 = (hashCode + (k90Var == null ? 0 : k90Var.hashCode())) * 31;
        v50 v50Var = this.c;
        return hashCode2 + (v50Var != null ? v50Var.hashCode() : 0);
    }

    public final String toString() {
        return "KeyValue(title=" + this.a + ", subtitle=" + this.b + ", text=" + this.c + ")";
    }

    public ka0(String str, k90 k90Var, v50 v50Var) {
        this.a = str;
        this.b = k90Var;
        this.c = v50Var;
    }

    public ka0(String str, String str2) {
        this(str, new k90(str2, 0, null, 0, 14));
    }
}
