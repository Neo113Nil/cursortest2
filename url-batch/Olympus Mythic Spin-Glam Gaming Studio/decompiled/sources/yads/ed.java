package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ed {
    public final oc a;

    public ed(oc ocVar) {
        this.a = ocVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed) && Intrinsics.areEqual(this.a, ((ed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(advertisingInfoHolder=" + this.a + ")";
    }
}
