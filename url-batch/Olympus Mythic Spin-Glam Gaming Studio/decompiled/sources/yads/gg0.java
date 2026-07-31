package yads;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gg0 {
    public static final gg0 b = new gg0(null);
    public final LinkedHashMap a;

    public gg0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg0) && Intrinsics.areEqual(this.a, ((gg0) obj).a);
    }

    public final int hashCode() {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.hashCode();
    }

    public final String toString() {
        return "DesignAnalytics(analyticsParameters=" + this.a + ")";
    }
}
