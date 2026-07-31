package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class zw extends bx {
    public final String a;

    public zw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw) && Intrinsics.areEqual(this.a, ((zw) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "PurposeConsents(value=" + this.a + ")";
    }
}
