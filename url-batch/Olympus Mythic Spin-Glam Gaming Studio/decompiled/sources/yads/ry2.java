package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ry2 {
    public final String a;

    public ry2(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry2) && Intrinsics.areEqual(this.a, ((ry2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionParameters(token=" + this.a + ")";
    }
}
