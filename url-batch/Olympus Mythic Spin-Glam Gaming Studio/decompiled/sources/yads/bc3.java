package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class bc3 implements ec3 {
    public final ac3 a;
    public final String b;
    public final String c;

    public bc3(ac3 ac3Var, String str, String str2) {
        this.a = ac3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc3)) {
            return false;
        }
        bc3 bc3Var = (bc3) obj;
        return this.a == bc3Var.a && Intrinsics.areEqual(this.b, bc3Var.b) && Intrinsics.areEqual(this.c, bc3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Failure(status=" + this.a + ", assetName=" + this.b + ", description=" + this.c + ")";
    }
}
