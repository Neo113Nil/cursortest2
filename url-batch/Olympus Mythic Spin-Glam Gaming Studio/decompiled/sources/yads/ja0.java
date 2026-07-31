package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ja0 extends oa0 {
    public final String a;

    public ja0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja0) && Intrinsics.areEqual(this.a, ((ja0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(text=" + this.a + ")";
    }
}
