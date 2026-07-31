package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class u40 {
    public final List a;

    public u40(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u40) && Intrinsics.areEqual(this.a, ((u40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.a + ")";
    }
}
