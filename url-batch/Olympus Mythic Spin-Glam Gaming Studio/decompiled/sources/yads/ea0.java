package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ea0 extends oa0 {
    public final String a;
    public final String b;
    public final String c;

    public ea0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return Intrinsics.areEqual(this.a, ea0Var.a) && Intrinsics.areEqual(this.b, ea0Var.b) && Intrinsics.areEqual(this.c, ea0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c4.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AdUnit(name=" + this.a + ", format=" + this.b + ", id=" + this.c + ")";
    }
}
