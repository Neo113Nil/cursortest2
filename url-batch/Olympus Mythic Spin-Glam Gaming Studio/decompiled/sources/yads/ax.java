package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ax extends bx {
    public final String a;

    public ax(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax) && Intrinsics.areEqual(this.a, ((ax) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "VendorConsents(value=" + this.a + ")";
    }
}
