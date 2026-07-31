package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zk1 extends al1 {
    public final String a;

    public zk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zk1) && Intrinsics.areEqual(this.a, ((zk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Url(url=" + this.a + ")";
    }
}
