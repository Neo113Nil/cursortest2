package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class j90 {
    public final i90 a;
    public final List b;

    public j90(i90 i90Var, List list) {
        this.a = i90Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return this.a == j90Var.a && Intrinsics.areEqual(this.b, j90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.a + ", messages=" + this.b + ")";
    }
}
