package yads;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class x22 {
    public static final x22 b = new x22(null);
    public final LinkedHashMap a;

    public x22(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x22) && Intrinsics.areEqual(this.a, ((x22) obj).a);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.hashCode();
    }

    public final String toString() {
        return "NativeAnalytics(analyticsParameters=" + this.a + ")";
    }
}
