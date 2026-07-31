package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a41 implements b41 {
    public final Map a;

    public a41(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a41) && Intrinsics.areEqual(this.a, ((a41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.a + ")";
    }
}
