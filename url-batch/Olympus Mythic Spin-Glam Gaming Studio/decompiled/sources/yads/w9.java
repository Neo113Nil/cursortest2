package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w9 {
    public final boolean a;
    public final String b;
    public final String c;

    public w9(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9)) {
            return false;
        }
        w9 w9Var = (w9) obj;
        return this.a == w9Var.a && Intrinsics.areEqual(this.b, w9Var.b) && Intrinsics.areEqual(this.c, w9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c4.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.a + ", token=" + this.b + ", advertiserInfo=" + this.c + ")";
    }
}
