package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xw extends bx {
    public final String a;

    public xw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw) && Intrinsics.areEqual(this.a, ((xw) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "ConsentString(value=" + this.a + ")";
    }
}
