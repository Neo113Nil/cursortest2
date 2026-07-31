package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class eh3 extends fh3 {
    public final List a;

    public eh3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh3) && Intrinsics.areEqual(this.a, ((eh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.a + ")";
    }
}
