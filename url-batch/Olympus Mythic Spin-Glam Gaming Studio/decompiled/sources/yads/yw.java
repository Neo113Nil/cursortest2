package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yw extends bx {
    public final String a;

    public yw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw) && Intrinsics.areEqual(this.a, ((yw) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Gdpr(value=" + this.a + ")";
    }
}
